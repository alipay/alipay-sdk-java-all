package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserOrganizationDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.company.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-19 17:07:03
 */
public class AnttechOceanbaseCompanyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1658363695999248388L;

	/** 
	 * 组织信息列表
	 */
	@ApiListField("org_info_list")
	@ApiField("user_organization_d_t_o")
	private List<UserOrganizationDTO> orgInfoList;

	public void setOrgInfoList(List<UserOrganizationDTO> orgInfoList) {
		this.orgInfoList = orgInfoList;
	}
	public List<UserOrganizationDTO> getOrgInfoList( ) {
		return this.orgInfoList;
	}

}
