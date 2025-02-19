package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.job.healthcert.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-27 16:07:13
 */
public class AlipayEbppIndustryJobHealthcertQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8764479927123647755L;

	/** 
	 * 是否有证，有证返回true，无证返回false
	 */
	@ApiField("has_cert")
	private Boolean hasCert;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 从业类别
	 */
	@ApiField("scope")
	private String scope;

	/** 
	 * 支付宝uid
	 */
	@ApiField("uid")
	private String uid;

	/** 
	 * 健康证有效期，
枚举值:
距过期时间>30天，
距过期时间≤30天，
已过期
	 */
	@ApiField("valid_period")
	private String validPeriod;

	public void setHasCert(Boolean hasCert) {
		this.hasCert = hasCert;
	}
	public Boolean getHasCert( ) {
		return this.hasCert;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}
	public String getScope( ) {
		return this.scope;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUid( ) {
		return this.uid;
	}

	public void setValidPeriod(String validPeriod) {
		this.validPeriod = validPeriod;
	}
	public String getValidPeriod( ) {
		return this.validPeriod;
	}

}
