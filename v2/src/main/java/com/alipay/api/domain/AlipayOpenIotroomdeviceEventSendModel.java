package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iot房间设备上报事件
 *
 * @author auto create
 * @since 1.0, 2022-08-29 16:10:14
 */
public class AlipayOpenIotroomdeviceEventSendModel extends AlipayObject {

	private static final long serialVersionUID = 6645553367983515882L;

	/**
	 * 设备ID
	 */
	@ApiField("biztid")
	private String biztid;

	/**
	 * 是否操作开门，true：操作开门，false：不开门
	 */
	@ApiField("door_state")
	private Boolean doorState;

	/**
	 * 人脸ID
	 */
	@ApiField("face_id")
	private String faceId;

	/**
	 * 开门失败原因描述
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 单次刷脸请求唯一请求id
	 */
	@ApiField("request_id")
	private String requestId;

	public String getBiztid() {
		return this.biztid;
	}
	public void setBiztid(String biztid) {
		this.biztid = biztid;
	}

	public Boolean getDoorState() {
		return this.doorState;
	}
	public void setDoorState(Boolean doorState) {
		this.doorState = doorState;
	}

	public String getFaceId() {
		return this.faceId;
	}
	public void setFaceId(String faceId) {
		this.faceId = faceId;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
