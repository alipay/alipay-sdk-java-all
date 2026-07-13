package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SaleForceAmountConvertResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.sfamountconvert.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-23 14:27:58
 */
public class AnttechOceanbaseObglobalSfamountconvertQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5817568327471972817L;

	/** 
	 * 结果对象
	 */
	@ApiField("result")
	private SaleForceAmountConvertResponse result;

	public void setResult(SaleForceAmountConvertResponse result) {
		this.result = result;
	}
	public SaleForceAmountConvertResponse getResult( ) {
		return this.result;
	}

}
