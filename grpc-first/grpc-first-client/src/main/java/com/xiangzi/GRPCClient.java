package com.xiangzi;

import com.xiangzi.service.HelloServiceApi;
import com.xiangzi.service.HelloServiceGrpc;
import com.xiangzi.service.RpcDateRequest;
import com.xiangzi.service.RpcDateResponse;
import com.xiangzi.service.RpcDateServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GRPCClient {

	private static final String host = "localhost";
	private static final int serverPort = 9999;

	public static void main(String[] args) throws Exception {
		ManagedChannel managedChannel = ManagedChannelBuilder.forAddress(host, serverPort).usePlaintext().build();
		try {
			RpcDateServiceGrpc.RpcDateServiceBlockingStub rpcDateService = RpcDateServiceGrpc
					.newBlockingStub(managedChannel);
			RpcDateRequest rpcDateRequest = RpcDateRequest.newBuilder().setUserName("xiangzi").build();
			RpcDateResponse rpcDateResponse = rpcDateService.getDate(rpcDateRequest);
			System.out.println(rpcDateResponse.getServerDate());

			HelloServiceGrpc.HelloServiceBlockingStub helloService = HelloServiceGrpc.newBlockingStub(managedChannel);
			HelloServiceApi.LookupRequest lookupRequest = HelloServiceApi.LookupRequest.newBuilder().setName("中国深圳")
					.build();
			HelloServiceApi.Coordinate coordinateResponse = helloService.lookup(lookupRequest);
			System.out.println(lookupRequest.getName() + " 位于：" + coordinateResponse.getLongitude() + ","
					+ coordinateResponse.getLatitude());
			
		} finally {
			managedChannel.shutdown();
		}
	}

}
