package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合同人员model
 *
 * @author auto create
 * @since 1.0, 2021-11-12 14:33:20
 */
public class ContractPeople extends AlipayObject {

	private static final long serialVersionUID = 6583367118375849919L;

	/**
	 * 域账号
	 */
	@ApiField("login_name")
	private String loginName;

	/**
	 * 花名
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 真实姓名
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 合同用户是否传递的域账号表示 true 是 false 否
	 */
	@ApiField("type_is_login_name")
	private Boolean typeIsLoginName;

	/**
	 * 工号
	 */
	@ApiField("work_no")
	private String workNo;

	public String getLoginName() {
		return this.loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

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

	public Boolean getTypeIsLoginName() {
		return this.typeIsLoginName;
	}
	public void setTypeIsLoginName(Boolean typeIsLoginName) {
		this.typeIsLoginName = typeIsLoginName;
	}

	public String getWorkNo() {
		return this.workNo;
	}
	public void setWorkNo(String workNo) {
		this.workNo = workNo;
	}

}
