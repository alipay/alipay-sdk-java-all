package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SaleForceCreateCustomerResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.sfcustomer.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-16 19:17:44
 */
public class AnttechOceanbaseObglobalSfcustomerCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5712611872443894284L;

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
