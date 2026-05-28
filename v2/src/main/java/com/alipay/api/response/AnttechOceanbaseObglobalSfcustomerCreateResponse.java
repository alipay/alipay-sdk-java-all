package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SaleForceCreateCustomerResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.sfcustomer.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-13 15:42:45
 */
public class AnttechOceanbaseObglobalSfcustomerCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1389491349939987833L;

	/** 
	 * 创建客户结果
	 */
	@ApiField("result")
	private SaleForceCreateCustomerResponse result;

	public void setResult(SaleForceCreateCustomerResponse result) {
		this.result = result;
	}
	public SaleForceCreateCustomerResponse getResult( ) {
		return this.result;
	}

}
