package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DefiCustUserDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.customer.login.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-27 09:23:40
 */
public class AnttechBlockchainDefinCustomerLoginConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 3848628767714755189L;

	/** 
	 * 用户信息
	 */
	@ApiField("user_info")
	private DefiCustUserDTO userInfo;

	public void setUserInfo(DefiCustUserDTO userInfo) {
		this.userInfo = userInfo;
	}
	public DefiCustUserDTO getUserInfo( ) {
		return this.userInfo;
	}

}
