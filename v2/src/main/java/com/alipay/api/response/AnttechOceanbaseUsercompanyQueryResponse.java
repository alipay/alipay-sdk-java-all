package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserCompanyDTO;
import com.alipay.api.domain.UserOrganizationDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.usercompany.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:09
 */
public class AnttechOceanbaseUsercompanyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5459427153695648522L;

	/** 
	 * 用户所属企业列表
	 */
	@ApiListField("user_company_list")
	@ApiField("user_company_d_t_o")
	private List<UserCompanyDTO> userCompanyList;

	/** 
	 * 用户组织列表
	 */
	@ApiListField("user_organization_list")
	@ApiField("user_organization_d_t_o")
	private List<UserOrganizationDTO> userOrganizationList;

	public void setUserCompanyList(List<UserCompanyDTO> userCompanyList) {
		this.userCompanyList = userCompanyList;
	}
	public List<UserCompanyDTO> getUserCompanyList( ) {
		return this.userCompanyList;
	}

	public void setUserOrganizationList(List<UserOrganizationDTO> userOrganizationList) {
		this.userOrganizationList = userOrganizationList;
	}
	public List<UserOrganizationDTO> getUserOrganizationList( ) {
		return this.userOrganizationList;
	}

}
