package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建监管专户
 *
 * @author auto create
 * @since 1.0, 2023-04-12 10:50:45
 */
public class AlipayCommerceEducateTuitioncodeMonitorCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1552178712158113463L;

	/**
	 * 银行类型(浙江网商：ZJWS)
	 */
	@ApiField("bank_type")
	private String bankType;

	/**
	 * 支付宝登录账号
	 */
	@ApiField("login_account")
	private String loginAccount;

	/**
	 * ISV的申请监管户编号
	 */
	@ApiField("out_apply_id")
	private String outApplyId;

	/**
	 * 商户在网商的西进户
	 */
	@ApiField("parent_no")
	private String parentNo;

	public String getBankType() {
		return this.bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	public String getLoginAccount() {
		return this.loginAccount;
	}
	public void setLoginAccount(String loginAccount) {
		this.loginAccount = loginAccount;
	}

	public String getOutApplyId() {
		return this.outApplyId;
	}
	public void setOutApplyId(String outApplyId) {
		this.outApplyId = outApplyId;
	}

	public String getParentNo() {
		return this.parentNo;
	}
	public void setParentNo(String parentNo) {
		this.parentNo = parentNo;
	}

}
