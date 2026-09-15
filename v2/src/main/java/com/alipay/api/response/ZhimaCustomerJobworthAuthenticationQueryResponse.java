package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.jobworth.authentication.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-26 17:27:51
 */
public class ZhimaCustomerJobworthAuthenticationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3538798756463764994L;

	/** 
	 * SUCCESS代表可信，FAILED代表不可信，WAITING_VERIFY代表未知需要等待结果
	 */
	@ApiField("identity_result")
	private String identityResult;

	/** 
	 * 身份认证查询结果页面的小程序链接，有芝麻提供，用户在端内可直接访问
	 */
	@ApiField("identity_result_skip_url")
	private String identityResultSkipUrl;

	/** 
	 * 表示在商户下已经发起过验证的用户唯一标志，如果用户已经发起过验证，那么这个标志会相同返回
	 */
	@ApiField("merchant_identity_id")
	private String merchantIdentityId;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 代表订单状态
	 */
	@ApiField("token_status")
	private String tokenStatus;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setIdentityResult(String identityResult) {
		this.identityResult = identityResult;
	}
	public String getIdentityResult( ) {
		return this.identityResult;
	}

	public void setIdentityResultSkipUrl(String identityResultSkipUrl) {
		this.identityResultSkipUrl = identityResultSkipUrl;
	}
	public String getIdentityResultSkipUrl( ) {
		return this.identityResultSkipUrl;
	}

	public void setMerchantIdentityId(String merchantIdentityId) {
		this.merchantIdentityId = merchantIdentityId;
	}
	public String getMerchantIdentityId( ) {
		return this.merchantIdentityId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setTokenStatus(String tokenStatus) {
		this.tokenStatus = tokenStatus;
	}
	public String getTokenStatus( ) {
		return this.tokenStatus;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
