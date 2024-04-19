package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OrgRoleDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.base.antauthorize.roleuser.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-11 16:35:01
 */
public class AlipayBossBaseAntauthorizeRoleuserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4299457415833921129L;

	/** 
	 * 查询queryUserlist返回结果封装
	 */
	@ApiListField("role_user_list")
	@ApiField("org_role_d_t_o")
	private List<OrgRoleDTO> roleUserList;

	public void setRoleUserList(List<OrgRoleDTO> roleUserList) {
		this.roleUserList = roleUserList;
	}
	public List<OrgRoleDTO> getRoleUserList( ) {
		return this.roleUserList;
	}

}
