package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 初始化用户信息接口
 *
 * @author auto create
 * @since 1.0, 2024-03-20 10:50:00
 */
public class AlipayDigitalmgmtHrhealthEntryUserInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 4333964342878231281L;

	/**
	 * 账号，候选人登陆爱康系统的账号，由供应商系统生成传回，用于给候选人发送邮件时带入，让候选人可以登陆供应商系统
	 */
	@ApiField("account")
	private String account;

	/**
	 * data_key用于校验供应商的权限，每一个接入系统的供应商只有一个该参数，供应商来对接时蚂蚁生成唯一参数线下给到供应商侧
	 */
	@ApiField("data_key")
	private String dataKey;

	/**
	 * form_no，唯一，用于确定唯一的候选人，是通过蚂蚁入职体检系统的数据库id加盐生成，字符串类型，用来确定唯一的候选人，代表该候选人的账号密码已经生成，可以进行下一步操作
	 */
	@ApiField("form_no")
	private String formNo;

	/**
	 * 密码，候选人登陆供应商系统的密码，字符串类型，由供应商系统生成并传入，蚂蚁系统发送邮件给候选人时带入，候选人凭借此密码登陆供应商系统
	 */
	@ApiField("password")
	private String password;

	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public String getDataKey() {
		return this.dataKey;
	}
	public void setDataKey(String dataKey) {
		this.dataKey = dataKey;
	}

	public String getFormNo() {
		return this.formNo;
	}
	public void setFormNo(String formNo) {
		this.formNo = formNo;
	}

	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
