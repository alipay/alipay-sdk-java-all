package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人员信息
 *
 * @author auto create
 * @since 1.0, 2023-11-06 14:46:08
 */
public class OpenApiPersonSaDTO extends AlipayObject {

	private static final long serialVersionUID = 4334758737568727414L;

	/**
	 * 花名
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 人员真名
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 用户角色
	 */
	@ApiField("role_type")
	private String roleType;

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

	public String getRoleType() {
		return this.roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public String getWorkNo() {
		return this.workNo;
	}
	public void setWorkNo(String workNo) {
		this.workNo = workNo;
	}

}
