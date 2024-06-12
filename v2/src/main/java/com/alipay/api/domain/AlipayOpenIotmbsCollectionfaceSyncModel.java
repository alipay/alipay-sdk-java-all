package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iot设备人脸采集结果同步
 *
 * @author auto create
 * @since 1.0, 2022-05-07 10:51:33
 */
public class AlipayOpenIotmbsCollectionfaceSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7587232115692586185L;

	/**
	 * IOT设备唯一标识
	 */
	@ApiField("biztid")
	private String biztid;

	/**
	 * succeed or failed
	 */
	@ApiField("collection_state")
	private String collectionState;

	/**
	 * 人脸id
	 */
	@ApiField("face_id")
	private String faceId;

	/**
	 * ISV请求ID
	 */
	@ApiField("out_request_id")
	private String outRequestId;

	public String getBiztid() {
		return this.biztid;
	}
	public void setBiztid(String biztid) {
		this.biztid = biztid;
	}

	public String getCollectionState() {
		return this.collectionState;
	}
	public void setCollectionState(String collectionState) {
		this.collectionState = collectionState;
	}

	public String getFaceId() {
		return this.faceId;
	}
	public void setFaceId(String faceId) {
		this.faceId = faceId;
	}

	public String getOutRequestId() {
		return this.outRequestId;
	}
	public void setOutRequestId(String outRequestId) {
		this.outRequestId = outRequestId;
	}

}
