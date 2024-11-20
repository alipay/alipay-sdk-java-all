package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RentContractViewVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.contract.form.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-23 19:52:20
 */
public class AlipayCloudCloudpromoContractFormQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2193829536996998936L;

	/** 
	 * 合同数据
	 */
	@ApiField("data")
	private RentContractViewVO data;

	public void setData(RentContractViewVO data) {
		this.data = data;
	}
	public RentContractViewVO getData( ) {
		return this.data;
	}

}
