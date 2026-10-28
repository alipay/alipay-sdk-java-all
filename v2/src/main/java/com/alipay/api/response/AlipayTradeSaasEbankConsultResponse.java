package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SaasEbankInstInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.saas.ebank.consult response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-19 13:22:59
 */
public class AlipayTradeSaasEbankConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4643953411842339789L;

	/** 
	 * null
	 */
	@ApiListField("bank_code_list")
	@ApiField("string")
	private List<String> bankCodeList;

	/** 
	 * null
	 */
	@ApiListField("inst_id_list")
	@ApiField("string")
	private List<String> instIdList;

	/** 
	 * null
	 */
	@ApiListField("inst_info_list")
	@ApiField("saas_ebank_inst_info")
	private List<SaasEbankInstInfo> instInfoList;

	public void setBankCodeList(List<String> bankCodeList) {
		this.bankCodeList = bankCodeList;
	}
	public List<String> getBankCodeList( ) {
		return this.bankCodeList;
	}

	public void setInstIdList(List<String> instIdList) {
		this.instIdList = instIdList;
	}
	public List<String> getInstIdList( ) {
		return this.instIdList;
	}

	public void setInstInfoList(List<SaasEbankInstInfo> instInfoList) {
		this.instInfoList = instInfoList;
	}
	public List<SaasEbankInstInfo> getInstInfoList( ) {
		return this.instInfoList;
	}

}
