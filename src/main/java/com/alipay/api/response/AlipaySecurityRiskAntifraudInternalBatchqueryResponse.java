package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.antifraud.internal.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySecurityRiskAntifraudInternalBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7429256644998965865L;

	/** 
	 * 供应商和供应商之间的风险关系，分为高中低三种风险
	 */
	@ApiListField("company_relation_list")
	@ApiField("string")
	private List<String> companyRelationList;

	/** 
	 * 员工和供应商之间的风险关系，分为高中低三种风险
	 */
	@ApiListField("staff_company_relation_list")
	@ApiField("string")
	private List<String> staffCompanyRelationList;

	public void setCompanyRelationList(List<String> companyRelationList) {
		this.companyRelationList = companyRelationList;
	}
	public List<String> getCompanyRelationList( ) {
		return this.companyRelationList;
	}

	public void setStaffCompanyRelationList(List<String> staffCompanyRelationList) {
		this.staffCompanyRelationList = staffCompanyRelationList;
	}
	public List<String> getStaffCompanyRelationList( ) {
		return this.staffCompanyRelationList;
	}

}
