package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OBCompanyDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.company.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-15 19:32:00
 */
public class AnttechOceanbaseCompanyBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2888218665434173324L;

	/** 
	 * 企业列表
	 */
	@ApiListField("company_list")
	@ApiField("o_b_company_d_t_o")
	private List<OBCompanyDTO> companyList;

	public void setCompanyList(List<OBCompanyDTO> companyList) {
		this.companyList = companyList;
	}
	public List<OBCompanyDTO> getCompanyList( ) {
		return this.companyList;
	}

}
