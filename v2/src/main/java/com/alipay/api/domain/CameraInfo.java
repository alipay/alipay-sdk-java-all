package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-06-01 19:12:50
 */
public class CameraInfo extends AlipayObject {

	private static final long serialVersionUID = 3464179518449813257L;

	/**
	 * 验证码,用于兜底
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 摄像头ID, 同一个门店下id唯一
	 */
	@ApiField("camera_id")
	private String cameraId;

	/**
	 * 完整的rtsp信息
	 */
	@ApiField("rtsp")
	private String rtsp;

	/**
	 * 萤石
	 */
	@ApiField("vendor")
	private String vendor;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getCameraId() {
		return this.cameraId;
	}
	public void setCameraId(String cameraId) {
		this.cameraId = cameraId;
	}

	public String getRtsp() {
		return this.rtsp;
	}
	public void setRtsp(String rtsp) {
		this.rtsp = rtsp;
	}

	public String getVendor() {
		return this.vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

}
