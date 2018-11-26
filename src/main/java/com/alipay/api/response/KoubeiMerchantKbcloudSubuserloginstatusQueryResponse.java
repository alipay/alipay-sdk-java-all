package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.UserLoginStatusDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.kbcloud.subuserloginstatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2018-11-19 18:09:27
 */
public class KoubeiMerchantKbcloudSubuserloginstatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1794633281778385387L;

	/** 
	 * 口碑云登录的子账号信息；如果未登录则返回null
	 */
	@ApiField("user_login_status")
	private UserLoginStatusDetail userLoginStatus;

	public void setUserLoginStatus(UserLoginStatusDetail userLoginStatus) {
		this.userLoginStatus = userLoginStatus;
	}
	public UserLoginStatusDetail getUserLoginStatus( ) {
		return this.userLoginStatus;
	}

}
