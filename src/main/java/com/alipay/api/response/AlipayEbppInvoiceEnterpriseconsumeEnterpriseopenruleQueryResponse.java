package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EnterpriseOpenRuleInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.enterpriseconsume.enterpriseopenrule.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 15:12:35
 */
public class AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1158384473521721168L;

	/** 
	 * 开票规则信息
	 */
	@ApiField("enterprise_open_rule_info")
	private EnterpriseOpenRuleInfo enterpriseOpenRuleInfo;

	public void setEnterpriseOpenRuleInfo(EnterpriseOpenRuleInfo enterpriseOpenRuleInfo) {
		this.enterpriseOpenRuleInfo = enterpriseOpenRuleInfo;
	}
	public EnterpriseOpenRuleInfo getEnterpriseOpenRuleInfo( ) {
		return this.enterpriseOpenRuleInfo;
	}

}
