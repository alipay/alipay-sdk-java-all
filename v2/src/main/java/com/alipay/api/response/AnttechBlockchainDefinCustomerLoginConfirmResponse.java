package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DefiCustUserDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.customer.login.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 13:29:37
 */
public class AnttechBlockchainDefinCustomerLoginConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 4679187211253737689L;

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
