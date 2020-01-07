package com.xiangzi.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.xiangzi.service.RpcDateRequest;
import com.xiangzi.service.RpcDateResponse;
import com.xiangzi.service.RpcDateServiceGrpc;

import io.grpc.stub.StreamObserver;

public class RpcDateServiceImpl extends RpcDateServiceGrpc.RpcDateServiceImplBase {

	@Override
	public void getDate(RpcDateRequest request, StreamObserver<RpcDateResponse> responseObserver) {
		RpcDateResponse rpcDateResponse = null;
		Date now = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("今天是" + "yyyy年MM月dd日 E kk点mm分");
		String nowTime = simpleDateFormat.format(now);
		try {
			rpcDateResponse = RpcDateResponse.newBuilder()
					.setServerDate("Welcome " + request.getUserName() + ", " + nowTime).build();
		} catch (Exception e) {
			responseObserver.onError(e);
		} finally {
			responseObserver.onNext(rpcDateResponse);
		}
		responseObserver.onCompleted();
	}

}
