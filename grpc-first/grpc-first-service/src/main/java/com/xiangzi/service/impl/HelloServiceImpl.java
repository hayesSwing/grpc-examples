package com.xiangzi.service.impl;

import com.xiangzi.service.HelloServiceApi.Coordinate;
import com.xiangzi.service.HelloServiceApi.LookupRequest;
import com.xiangzi.service.HelloServiceGrpc.HelloServiceImplBase;

import io.grpc.stub.StreamObserver;

public class HelloServiceImpl extends HelloServiceImplBase {

	@Override
	public void lookup(LookupRequest request, StreamObserver<Coordinate> responseObserver) {
		Coordinate response = null;
		String name = request.getName();
		try {
			response = Coordinate.newBuilder().setLongitude(114.03D).setLatitude(22.32D).build();
			System.out.println(name + " 位于：经度" + response.getLongitude() + "，维度：" + response.getLatitude());
		} catch (Exception e) {
			responseObserver.onError(e);
		} finally {
			responseObserver.onNext(response);
		}
		responseObserver.onCompleted();
	}

}
