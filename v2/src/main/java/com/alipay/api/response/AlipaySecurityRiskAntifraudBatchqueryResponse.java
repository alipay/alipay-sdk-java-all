package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.antifraud.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 02:49:47
 */
public class AlipaySecurityRiskAntifraudBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7532117786775248736L;

	/** 
	 * 供应商关系列表+company_list是两个有关系的供应商，detail字段描述了具体的关系，detail为jsonArray表示两者之间可能的多种关系
	 */
	@ApiListField("company_relation_list")
	@ApiField("string")
	private List<String> companyRelationList;

	/** 
	 * 员工供应商关系列表+staff字段为员工姓名，company字段为供应商，detail描述了员工和供应商的关系详情,detail为jsonArray表示两者之间可能的多种关系
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
