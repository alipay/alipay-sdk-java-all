package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.creditinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-28 17:02:37
 */
public class ZhimaCustomerCreditinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8149614195589415194L;

	/** 
	 * 当auth=true时，才会返回credit_level_code
	 */
	@ApiField("auth")
	private Boolean auth;

	/** 
	 * 当can_auth=true时，auth_award才会有值，如果用户之前因为授权获得过奖励，则auth_award为false
	 */
	@ApiField("auth_award")
	private Boolean authAward;

	/** 
	 * auth_award=false，该值不存在；auth_award=true，该值为1~100（进度值）
	 */
	@ApiField("award")
	private String award;

	/** 
	 * 当auth=false时，can_auth才会有值
	 */
	@ApiField("can_auth")
	private Boolean canAuth;

	/** 
	 * 根据用户芝麻分所在区间返回命中的信用等级
	 */
	@ApiField("credit_level_code")
	private String creditLevelCode;

	/** 
	 * 高德侧可保存该字段进行核对，当auth=true时，才会返回
	 */
	@ApiField("sign_id")
	private String signId;

	public void setAuth(Boolean auth) {
		this.auth = auth;
	}
	public Boolean getAuth( ) {
		return this.auth;
	}

	public void setAuthAward(Boolean authAward) {
		this.authAward = authAward;
	}
	public Boolean getAuthAward( ) {
		return this.authAward;
	}

	public void setAward(String award) {
		this.award = award;
	}
	public String getAward( ) {
		return this.award;
	}

	public void setCanAuth(Boolean canAuth) {
		this.canAuth = canAuth;
	}
	public Boolean getCanAuth( ) {
		return this.canAuth;
	}

	public void setCreditLevelCode(String creditLevelCode) {
		this.creditLevelCode = creditLevelCode;
	}
	public String getCreditLevelCode( ) {
		return this.creditLevelCode;
	}

	public void setSignId(String signId) {
		this.signId = signId;
	}
	public String getSignId( ) {
		return this.signId;
	}

}
