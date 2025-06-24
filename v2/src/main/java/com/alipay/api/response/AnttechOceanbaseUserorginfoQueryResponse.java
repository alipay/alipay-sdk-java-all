package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserInfoDetailDTO;
import com.alipay.api.domain.UserOrganizationDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.userorginfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-19 17:12:04
 */
public class AnttechOceanbaseUserorginfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4571918173451396784L;

	/** 
	 * 用户基本信息
	 */
	@ApiField("basic_info")
	private UserInfoDetailDTO basicInfo;

	/** 
	 * 组织信息列表
	 */
	@ApiListField("org_info_list")
	@ApiField("user_organization_d_t_o")
	private List<UserOrganizationDTO> orgInfoList;

	public void setBasicInfo(UserInfoDetailDTO basicInfo) {
		this.basicInfo = basicInfo;
	}
	public UserInfoDetailDTO getBasicInfo( ) {
		return this.basicInfo;
	}

	public void setOrgInfoList(List<UserOrganizationDTO> orgInfoList) {
		this.orgInfoList = orgInfoList;
	}
	public List<UserOrganizationDTO> getOrgInfoList( ) {
		return this.orgInfoList;
	}

}
