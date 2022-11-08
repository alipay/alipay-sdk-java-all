package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户管理-组织视角DTO
 *
 * @author auto create
 * @since 1.0, 2022-02-23 21:16:19
 */
public class OrgRoleDTO extends AlipayObject {

	private static final long serialVersionUID = 7371313487359854698L;

	/**
	 * 树节点
	 */
	@ApiField("node")
	private OrgNodeDTO node;

	/**
	 * 角色
	 */
	@ApiField("role")
	private String role;

	/**
	 * 用户列表
	 */
	@ApiListField("user_list")
	@ApiField("user_d_t_o")
	private List<UserDTO> userList;

	public OrgNodeDTO getNode() {
		return this.node;
	}
	public void setNode(OrgNodeDTO node) {
		this.node = node;
	}

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public List<UserDTO> getUserList() {
		return this.userList;
	}
	public void setUserList(List<UserDTO> userList) {
		this.userList = userList;
	}

}
