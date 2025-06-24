package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserOrgAndRoleDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.userorgandrole.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-23 15:17:30
 */
public class AnttechOceanbaseUserorgandroleBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8736298265425246414L;

	/** 
	 * 用户组织角色列表
	 */
	@ApiListField("user_org_and_role_list")
	@ApiField("user_org_and_role_d_t_o")
	private List<UserOrgAndRoleDTO> userOrgAndRoleList;

	public void setUserOrgAndRoleList(List<UserOrgAndRoleDTO> userOrgAndRoleList) {
		this.userOrgAndRoleList = userOrgAndRoleList;
	}
	public List<UserOrgAndRoleDTO> getUserOrgAndRoleList( ) {
		return this.userOrgAndRoleList;
	}

}
