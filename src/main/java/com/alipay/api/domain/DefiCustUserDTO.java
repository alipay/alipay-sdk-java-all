package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 智能科技同一客户平台用户模型
 *
 * @author auto create
 * @since 1.0, 2020-12-15 15:13:18
 */
public class DefiCustUserDTO extends AlipayObject {

	private static final long serialVersionUID = 5223176636238117866L;

	/**
	 * 管理员名称
	 */
	@ApiField("admin_name")
	private String adminName;

	/**
	 * 会员信息
	 */
	@ApiField("member_info")
	private DefiCustMemberDTO memberInfo;

	/**
	 * 角色
	 */
	@ApiListField("role_types")
	@ApiField("string")
	private List<String> roleTypes;

	/**
	 * ACTIVE("ACTIVE", "激活状态"), FROZEN("FROZEN", "冻结状态"), DISABLED("DISABLED", "禁用状态"),;
	 */
	@ApiField("status")
	private String status;

	/**
	 * 用户邮箱
	 */
	@ApiField("user_email")
	private String userEmail;

	/**
	 * user id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户手机
	 */
	@ApiField("user_mobile")
	private String userMobile;

	/**
	 * 用户名
	 */
	@ApiField("user_name")
	private String userName;

	public String getAdminName() {
		return this.adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public DefiCustMemberDTO getMemberInfo() {
		return this.memberInfo;
	}
	public void setMemberInfo(DefiCustMemberDTO memberInfo) {
		this.memberInfo = memberInfo;
	}

	public List<String> getRoleTypes() {
		return this.roleTypes;
	}
	public void setRoleTypes(List<String> roleTypes) {
		this.roleTypes = roleTypes;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserEmail() {
		return this.userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserMobile() {
		return this.userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
