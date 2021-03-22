package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸支付验证接口
 *
 * @author auto create
 * @since 1.0, 2020-12-18 15:27:19
 */
public class AlipaySecurityProdFacepayVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 2185584187976883121L;

	/**
	 * 用户输入的扫脸付邀请码
	 */
	@ApiField("check_code")
	private String checkCode;

	/**
	 * Base64编码的人脸图片。与ftoken参数二选一，当商户先前未调用人脸识别接口时使用此参数。
	 */
	@ApiField("face_image")
	private String faceImage;

	/**
	 * 商户调用人脸上传接口时获得的ftoken。与face_image参数二选一，当商户先前调用了人脸识别接口并获得了ftoken时使用此参数
	 */
	@ApiField("ftoken")
	private String ftoken;

	/**
	 * 商户门店编号
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 用户认证标识。传入完整的用户标识（例如用户输入的完整的11位用户手机号码,13800138000）或部分信息脱敏的用户标识（例如138****8000）。当热点人脸库命中成功时，可以使用部分信息脱敏的用户标识
	 */
	@ApiField("user_auth_id")
	private String userAuthId;

	/**
	 * 用户标识类型。目前支持手机号码，即mobile
	 */
	@ApiField("user_auth_type")
	private String userAuthType;

	public String getCheckCode() {
		return this.checkCode;
	}
	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}

	public String getFaceImage() {
		return this.faceImage;
	}
	public void setFaceImage(String faceImage) {
		this.faceImage = faceImage;
	}

	public String getFtoken() {
		return this.ftoken;
	}
	public void setFtoken(String ftoken) {
		this.ftoken = ftoken;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getUserAuthId() {
		return this.userAuthId;
	}
	public void setUserAuthId(String userAuthId) {
		this.userAuthId = userAuthId;
	}

	public String getUserAuthType() {
		return this.userAuthType;
	}
	public void setUserAuthType(String userAuthType) {
		this.userAuthType = userAuthType;
	}

}
