package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账户基本信息
 *
 * @author auto create
 * @since 1.0, 2022-02-25 14:40:37
 */
public class AccountBaseInfoVO extends AlipayObject {

	private static final long serialVersionUID = 7627833813465732597L;

	/**
	 * 账户号
	 */
	@ApiField("act_no")
	private String actNo;

	/**
	 * 账户状态:A-开户成功，N-未开户，F-账户异常
	 */
	@ApiField("act_status")
	private String actStatus;

	/**
	 * 账户类型
	 */
	@ApiField("act_type")
	private String actType;

	public String getActNo() {
		return this.actNo;
	}
	public void setActNo(String actNo) {
		this.actNo = actNo;
	}

	public String getActStatus() {
		return this.actStatus;
	}
	public void setActStatus(String actStatus) {
		this.actStatus = actStatus;
	}

	public String getActType() {
		return this.actType;
	}
	public void setActType(String actType) {
		this.actType = actType;
	}

}
