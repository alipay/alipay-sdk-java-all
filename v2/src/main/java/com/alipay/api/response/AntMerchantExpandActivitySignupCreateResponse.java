package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.activity.signup.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:12
 */
public class AntMerchantExpandActivitySignupCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3783869499539913358L;

	/** 
	 * 接口返回描述：e.g.报名失败:没有报名资格/报名成功/报名确认
	 */
	@ApiField("desc")
	private String desc;

	/** 
	 * 支付宝商户id
	 */
	@ApiField("pid")
	private String pid;

	/** 
	 * 报名接口状态，SUCCESS成功，FAIL失败
	 */
	@ApiField("status")
	private String status;

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc( ) {
		return this.desc;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPid( ) {
		return this.pid;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
