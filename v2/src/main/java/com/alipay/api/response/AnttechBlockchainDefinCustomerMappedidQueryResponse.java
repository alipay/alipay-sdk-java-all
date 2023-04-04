package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DefiCustUserDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.customer.mappedid.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 00:57:49
 */
public class AnttechBlockchainDefinCustomerMappedidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5623816625248744831L;

	/** 
	 * 会员信息
	 */
	@ApiListField("user_info_list")
	@ApiField("defi_cust_user_d_t_o")
	private List<DefiCustUserDTO> userInfoList;

	public void setUserInfoList(List<DefiCustUserDTO> userInfoList) {
		this.userInfoList = userInfoList;
	}
	public List<DefiCustUserDTO> getUserInfoList( ) {
		return this.userInfoList;
	}

}
