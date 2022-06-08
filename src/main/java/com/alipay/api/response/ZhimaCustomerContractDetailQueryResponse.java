package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ApiContractDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.contract.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-05-17 10:40:08
 */
public class ZhimaCustomerContractDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2746841954726416489L;

	/** 
	 * 合约详情
	 */
	@ApiField("contract_detail")
	private ApiContractDetail contractDetail;

	public void setContractDetail(ApiContractDetail contractDetail) {
		this.contractDetail = contractDetail;
	}
	public ApiContractDetail getContractDetail( ) {
		return this.contractDetail;
	}

}
