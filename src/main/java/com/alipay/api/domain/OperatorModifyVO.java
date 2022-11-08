package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蚂蚁操作员信息修改参数
 *
 * @author auto create
 * @since 1.0, 2022-08-26 10:25:50
 */
public class OperatorModifyVO extends AlipayObject {

	private static final long serialVersionUID = 4256465449131949426L;

	/**
	 * 操作员联系方式，不填则不修改。会替换操作员原有全部联系方式
	 */
	@ApiListField("contacts")
	@ApiField("operator_contact_v_o")
	private List<OperatorContactVO> contacts;

	/**
	 * 操作员名称。不填则不修改
	 */
	@ApiField("name")
	private String name;

	/**
	 * 角色列表。如果为空，则不会进行角色变更；
如果不为空，则会替换操作员已有的全部角色；
	 */
	@ApiListField("role_codes")
	@ApiField("string")
	private List<String> roleCodes;

	public List<OperatorContactVO> getContacts() {
		return this.contacts;
	}
	public void setContacts(List<OperatorContactVO> contacts) {
		this.contacts = contacts;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<String> getRoleCodes() {
		return this.roleCodes;
	}
	public void setRoleCodes(List<String> roleCodes) {
		this.roleCodes = roleCodes;
	}

}
