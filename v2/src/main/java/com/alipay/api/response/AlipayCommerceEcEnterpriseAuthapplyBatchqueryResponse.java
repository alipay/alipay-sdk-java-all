package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EnterpriseAuthApplyDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.enterprise.authapply.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-08 14:02:00
 */
public class AlipayCommerceEcEnterpriseAuthapplyBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4358495596584751139L;

	/** 
	 * 企业认证申请记录列表
	 */
	@ApiListField("auth_apply_list")
	@ApiField("enterprise_auth_apply_d_t_o")
	private List<EnterpriseAuthApplyDTO> authApplyList;

	public void setAuthApplyList(List<EnterpriseAuthApplyDTO> authApplyList) {
		this.authApplyList = authApplyList;
	}
	public List<EnterpriseAuthApplyDTO> getAuthApplyList( ) {
		return this.authApplyList;
	}

}
