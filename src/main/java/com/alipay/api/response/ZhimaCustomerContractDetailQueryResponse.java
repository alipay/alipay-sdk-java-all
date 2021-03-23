package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ApiContractDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.contract.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-24 11:26:16
 */
public class ZhimaCustomerContractDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7861396574512659954L;

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
