package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iot房间设备上报事件
 *
 * @author auto create
 * @since 1.0, 2022-05-07 10:51:14
 */
public class AlipayOpenIotroomdeviceEventSendModel extends AlipayObject {

	private static final long serialVersionUID = 4735952835289654199L;

	/**
	 * 设备ID
	 */
	@ApiField("biztid")
	private String biztid;

	/**
	 * 人脸ID
	 */
	@ApiField("face_id")
	private String faceId;

	public String getBiztid() {
		return this.biztid;
	}
	public void setBiztid(String biztid) {
		this.biztid = biztid;
	}

	public String getFaceId() {
		return this.faceId;
	}
	public void setFaceId(String faceId) {
		this.faceId = faceId;
	}

}
