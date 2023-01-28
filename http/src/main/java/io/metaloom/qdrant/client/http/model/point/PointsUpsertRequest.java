package io.metaloom.qdrant.client.http.model.point;

import java.util.List;

import io.metaloom.qdrant.client.http.model.RestRequestModel;

public class PointsUpsertRequest implements RestRequestModel {

	private PointsBatch batch;

	private List<PointStruct> points;

	public PointsBatch getBatch() {
		return batch;
	}

	public List<PointStruct> getPoints() {
		return points;
	}

}
