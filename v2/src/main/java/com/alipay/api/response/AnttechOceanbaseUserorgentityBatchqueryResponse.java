package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserOrgEntityInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.userorgentity.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-16 20:27:40
 */
public class AnttechOceanbaseUserorgentityBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3627334719714921482L;

	/** 
	 * 用户组织信息列表
	 */
	@ApiListField("user_org_entity_info_list")
	@ApiField("user_org_entity_info_d_t_o")
	private List<UserOrgEntityInfoDTO> userOrgEntityInfoList;

	public void setUserOrgEntityInfoList(List<UserOrgEntityInfoDTO> userOrgEntityInfoList) {
		this.userOrgEntityInfoList = userOrgEntityInfoList;
	}
	public List<UserOrgEntityInfoDTO> getUserOrgEntityInfoList( ) {
		return this.userOrgEntityInfoList;
	}

}
