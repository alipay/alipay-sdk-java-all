package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SalesForcePartnerQueryResponseDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.sfpartner.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-02 17:37:50
 */
public class AnttechOceanbaseObglobalSfpartnerQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3325875577932945219L;

	/** 
	 * 结果对象
	 */
	@ApiField("result")
	private SalesForcePartnerQueryResponseDTO result;

	public void setResult(SalesForcePartnerQueryResponseDTO result) {
		this.result = result;
	}
	public SalesForcePartnerQueryResponseDTO getResult( ) {
		return this.result;
	}

}
