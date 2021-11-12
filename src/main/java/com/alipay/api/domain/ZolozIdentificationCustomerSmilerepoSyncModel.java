package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸本地比对结果同步汇报
 *
 * @author auto create
 * @since 1.0, 2019-07-09 20:13:41
 */
public class ZolozIdentificationCustomerSmilerepoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5737669631627889344L;

	/**
	 * 活体图片encode base64 String
	 */
	@ApiField("auth_img")
	private String authImg;

	/**
	 * 商户的机具编码
	 */
	@ApiField("device_num")
	private String deviceNum;

	/**
	 * 人脸定制分配的场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 人脸相关的比对结果信
	 */
	@ApiField("zface_info")
	private String zfaceInfo;

	public String getAuthImg() {
		return this.authImg;
	}
	public void setAuthImg(String authImg) {
		this.authImg = authImg;
	}

	public String getDeviceNum() {
		return this.deviceNum;
	}
	public void setDeviceNum(String deviceNum) {
		this.deviceNum = deviceNum;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getZfaceInfo() {
		return this.zfaceInfo;
	}
	public void setZfaceInfo(String zfaceInfo) {
		this.zfaceInfo = zfaceInfo;
	}

}
