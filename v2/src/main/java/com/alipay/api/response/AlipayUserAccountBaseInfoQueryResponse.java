package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.base.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-09 10:42:40
 */
public class AlipayUserAccountBaseInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7334538235194475363L;

	/** 
	 * 明文手机号，内部接口，对接入方实施管控
	 */
	@ApiField("bind_mobile")
	private String bindMobile;

	/** 
	 * long时间戳，精确到毫秒
	 */
	@ApiField("bind_mobile_time")
	private String bindMobileTime;

	/** 
	 * 二次放号打分阈值，业务方自己判断是否为二次放号
	 */
	@ApiField("phone_release_sign")
	private String phoneReleaseSign;

	public void setBindMobile(String bindMobile) {
		this.bindMobile = bindMobile;
	}
	public String getBindMobile( ) {
		return this.bindMobile;
	}

	public void setBindMobileTime(String bindMobileTime) {
		this.bindMobileTime = bindMobileTime;
	}
	public String getBindMobileTime( ) {
		return this.bindMobileTime;
	}

	public void setPhoneReleaseSign(String phoneReleaseSign) {
		this.phoneReleaseSign = phoneReleaseSign;
	}
	public String getPhoneReleaseSign( ) {
		return this.phoneReleaseSign;
	}

}
