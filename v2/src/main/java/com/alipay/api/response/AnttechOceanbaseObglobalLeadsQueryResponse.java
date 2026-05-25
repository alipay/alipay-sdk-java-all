package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.LeadsDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.leads.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-18 17:40:19
 */
public class AnttechOceanbaseObglobalLeadsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5622899214252778257L;

	/** 
	 * 海图商机详情
	 */
	@ApiField("result")
	private LeadsDTO result;

	public void setResult(LeadsDTO result) {
		this.result = result;
	}
	public LeadsDTO getResult( ) {
		return this.result;
	}

}
