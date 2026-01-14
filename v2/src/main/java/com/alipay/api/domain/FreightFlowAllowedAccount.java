package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-01-06 11:42:42
 */
public class FreightFlowAllowedAccount extends AlipayObject {

	private static final long serialVersionUID = 5316625438583584345L;

	/**
	 * 入金通知场景下代表付款方的户名
	 */
	@ApiField("allowed_account_name")
	private String allowedAccountName;

	/**
	 * 入金通知场景下代表付款方的卡号
	 */
	@ApiField("allowed_account_no")
	private String allowedAccountNo;

	/**
	 * 白名单中的单个元素类型
当业务场景为'入金通知'时白名单的账户类型为:PAYER(付款方)
	 */
	@ApiField("allowed_account_type")
	private String allowedAccountType;

	/**
	 * 到期时间(如果不填,代表一直有效,直到重新调用更新接口)，格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("expire_date")
	private String expireDate;

	public String getAllowedAccountName() {
		return this.allowedAccountName;
	}
	public void setAllowedAccountName(String allowedAccountName) {
		this.allowedAccountName = allowedAccountName;
	}

	public String getAllowedAccountNo() {
		return this.allowedAccountNo;
	}
	public void setAllowedAccountNo(String allowedAccountNo) {
		this.allowedAccountNo = allowedAccountNo;
	}

	public String getAllowedAccountType() {
		return this.allowedAccountType;
	}
	public void setAllowedAccountType(String allowedAccountType) {
		this.allowedAccountType = allowedAccountType;
	}

	public String getExpireDate() {
		return this.expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

}
