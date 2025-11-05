package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * CreateContactRequest
 *
 * @author auto create
 * @since 1.0, 2023-10-19 09:48:02
 */
public class CreateContactRequest extends AlipayObject {

	private static final long serialVersionUID = 4799263912955677517L;

	/**
	 * 联系人邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 联系人职位
	 */
	@ApiField("job_title")
	private String jobTitle;

	/**
	 * 联系人姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 操作人
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 联系人手机号
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	/**
	 * 角色id
	 */
	@ApiField("role_id")
	private String roleId;

	/**
	 * 角色类型
	 */
	@ApiField("role_type")
	private String roleType;

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getRoleId() {
		return this.roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleType() {
		return this.roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

}
