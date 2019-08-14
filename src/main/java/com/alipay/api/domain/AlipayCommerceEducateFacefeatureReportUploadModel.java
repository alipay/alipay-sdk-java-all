package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸特征报告上传
 *
 * @author auto create
 * @since 1.0, 2019-07-23 10:19:36
 */
public class AlipayCommerceEducateFacefeatureReportUploadModel extends AlipayObject {

	private static final long serialVersionUID = 4443632389823112151L;

	/**
	 * 图片encode base64 String
	 */
	@ApiField("auth_img")
	private String authImg;

	/**
	 * 学校团餐
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 商户机具编码
	 */
	@ApiField("device_num")
	private String deviceNum;

	/**
	 * 机构ID
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 合作商户简称
	 */
	@ApiField("isv_name")
	private String isvName;

	/**
	 * 场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 商户透传人脸客户端信息
	 */
	@ApiField("z_face_info")
	private String zFaceInfo;

	public String getAuthImg() {
		return this.authImg;
	}
	public void setAuthImg(String authImg) {
		this.authImg = authImg;
	}

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getDeviceNum() {
		return this.deviceNum;
	}
	public void setDeviceNum(String deviceNum) {
		this.deviceNum = deviceNum;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getIsvName() {
		return this.isvName;
	}
	public void setIsvName(String isvName) {
		this.isvName = isvName;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getzFaceInfo() {
		return this.zFaceInfo;
	}
	public void setzFaceInfo(String zFaceInfo) {
		this.zFaceInfo = zFaceInfo;
	}

}
