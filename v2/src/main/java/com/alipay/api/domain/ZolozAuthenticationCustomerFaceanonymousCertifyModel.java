package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 匿名用户人脸验证接口
 *
 * @author auto create
 * @since 1.0, 2026-05-15 10:22:45
 */
public class ZolozAuthenticationCustomerFaceanonymousCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 2559496236218958365L;

	/**
	 * 活体照片的二进制内容，然后做base64编码
	 */
	@ApiField("auth_img")
	private String authImg;

	/**
	 * 活体图片采集方式，例如C0代表手机端采集的人脸图片 。C1代表机具端采集的人脸图片
	 */
	@ApiField("auth_img_source")
	private String authImgSource;

	/**
	 * 只允许数字加字母，商户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务方使用的账户唯一标示
	 */
	@ApiField("merchant_uid")
	private String merchantUid;

	public String getAuthImg() {
		return this.authImg;
	}
	public void setAuthImg(String authImg) {
		this.authImg = authImg;
	}

	public String getAuthImgSource() {
		return this.authImgSource;
	}
	public void setAuthImgSource(String authImgSource) {
		this.authImgSource = authImgSource;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getMerchantUid() {
		return this.merchantUid;
	}
	public void setMerchantUid(String merchantUid) {
		this.merchantUid = merchantUid;
	}

}
