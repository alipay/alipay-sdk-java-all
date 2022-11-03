package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.title.fuzzy.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-24 15:31:50
 */
public class AlipayEbppInvoiceTitleFuzzyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1358693447126479817L;

	/** 
	 * 企业名称列表
	 */
	@ApiListField("enterprise_name")
	@ApiField("string")
	private List<String> enterpriseName;

	public void setEnterpriseName(List<String> enterpriseName) {
		this.enterpriseName = enterpriseName;
	}
	public List<String> getEnterpriseName( ) {
		return this.enterpriseName;
	}

}
