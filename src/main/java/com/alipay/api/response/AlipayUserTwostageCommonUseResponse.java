package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.UserIdentityInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.twostage.common.use response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-20 18:41:37
 */
public class AlipayUserTwostageCommonUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 6393119635714869248L;

	/** 
	 * 支付宝用户userId信息，因为用户已经在客户端给商户的小程序授权了，并且商户要通过userId信息挂接优惠券信息，所以可以无需脱敏返回给商户。
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 从码值解析出来的用户身份信息
	 */
	@ApiField("user_identity_info")
	private UserIdentityInfo userIdentityInfo;

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setUserIdentityInfo(UserIdentityInfo userIdentityInfo) {
		this.userIdentityInfo = userIdentityInfo;
	}
	public UserIdentityInfo getUserIdentityInfo( ) {
		return this.userIdentityInfo;
	}

}
