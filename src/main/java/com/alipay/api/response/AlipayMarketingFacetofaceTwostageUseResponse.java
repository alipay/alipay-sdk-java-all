package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.facetoface.twostage.use response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-20 18:41:10
 */
public class AlipayMarketingFacetofaceTwostageUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 3233633346753919782L;

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
