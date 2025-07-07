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
 * @since 1.0, 2024-11-08 15:30:46
 */
public class AlipayBossBaseAntauthorizeRoleuserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5665927252231422897L;

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
