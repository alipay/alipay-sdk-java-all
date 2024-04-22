package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.facetoface.twostage.use response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-01 14:31:03
 */
public class AlipayMarketingFacetofaceTwostageUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 2896852158264845521L;

	/** 
	 * 业务扩展数据
	 */
	@ApiField("biz_data")
	private String bizData;

	/** 
	 * 淘宝会员ID
	 */
	@ApiField("havana_id")
	private String havanaId;

	/** 
	 * openId
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * otp校验结果
	 */
	@ApiField("otp_verify")
	private String otpVerify;

	/** 
	 * 用户userId
	 */
	@ApiField("user_id")
	private String userId;

	public void setBizData(String bizData) {
		this.bizData = bizData;
	}
	public String getBizData( ) {
		return this.bizData;
	}

	public void setHavanaId(String havanaId) {
		this.havanaId = havanaId;
	}
	public String getHavanaId( ) {
		return this.havanaId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOtpVerify(String otpVerify) {
		this.otpVerify = otpVerify;
	}
	public String getOtpVerify( ) {
		return this.otpVerify;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
