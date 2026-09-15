package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.saas.ebank.consult response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-07 16:52:50
 */
public class AlipayTradeSaasEbankConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6283632562781658781L;

	/** 
	 * null
	 */
	@ApiListField("bank_code_list")
	@ApiField("string")
	private List<String> bankCodeList;

	public void setBankCodeList(List<String> bankCodeList) {
		this.bankCodeList = bankCodeList;
	}
	public List<String> getBankCodeList( ) {
		return this.bankCodeList;
	}

}
