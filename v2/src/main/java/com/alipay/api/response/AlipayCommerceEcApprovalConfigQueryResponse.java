package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ApprovalConfigDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.approval.config.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-04 13:32:27
 */
public class AlipayCommerceEcApprovalConfigQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3573715835683673999L;

	/** 
	 * 审批单配置列表
	 */
	@ApiListField("config_list")
	@ApiField("approval_config_d_t_o")
	private List<ApprovalConfigDTO> configList;

	public void setConfigList(List<ApprovalConfigDTO> configList) {
		this.configList = configList;
	}
	public List<ApprovalConfigDTO> getConfigList( ) {
		return this.configList;
	}

}
