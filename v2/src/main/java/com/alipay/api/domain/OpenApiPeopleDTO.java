package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合同干系人
 *
 * @author auto create
 * @since 1.0, 2022-12-12 11:58:13
 */
public class OpenApiPeopleDTO extends AlipayObject {

	private static final long serialVersionUID = 2279441819743436392L;

	/**
	 * 花名
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 真名
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 合同相关角色
	 */
	@ApiField("role")
	private String role;

	/**
	 * 工号
	 */
	@ApiField("work_no")
	private String workNo;

	public String getNickName() {
		return this.nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public String getWorkNo() {
		return this.workNo;
	}
	public void setWorkNo(String workNo) {
		this.workNo = workNo;
	}

}
