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
 * @since 1.0, 2023-12-15 15:31:56
 */
public class AlipayBossBaseAntauthorizeRoleuserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7753365238335254877L;

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
