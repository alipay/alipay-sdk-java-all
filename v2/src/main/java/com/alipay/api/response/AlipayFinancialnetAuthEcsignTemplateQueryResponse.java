package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ContractTemplateOpenVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.ecsign.template.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-18 15:31:50
 */
public class AlipayFinancialnetAuthEcsignTemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8389926175771648831L;

	/** 
	 * 合同模板开放视图，注意如果是列表返回的是用于展示的精简值，详情请查询详情接口。
	 */
	@ApiField("contract_template_open_vo")
	private ContractTemplateOpenVO contractTemplateOpenVo;

	public void setContractTemplateOpenVo(ContractTemplateOpenVO contractTemplateOpenVo) {
		this.contractTemplateOpenVo = contractTemplateOpenVo;
	}
	public ContractTemplateOpenVO getContractTemplateOpenVo( ) {
		return this.contractTemplateOpenVo;
	}

}
