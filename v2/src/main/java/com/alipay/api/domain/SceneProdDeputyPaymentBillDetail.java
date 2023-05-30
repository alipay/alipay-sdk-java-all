package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景金融银行直投代客还款账单操作明细
 *
 * @author auto create
 * @since 1.0, 2019-08-27 14:15:41
 */
public class SceneProdDeputyPaymentBillDetail extends AlipayObject {

	private static final long serialVersionUID = 2578231674777586583L;

	/**
	 * 代客还款的网商银行结算户信息
	 */
	@ApiField("deputy_account")
	private String deputyAccount;

	/**
	 * 代客还款操作类型，VALID 代客还款， INVALID 取消代客还款
	 */
	@ApiField("deputy_type")
	private String deputyType;

	/**
	 * 期数
	 */
	@ApiField("term")
	private String term;

	public String getDeputyAccount() {
		return this.deputyAccount;
	}
	public void setDeputyAccount(String deputyAccount) {
		this.deputyAccount = deputyAccount;
	}

	public String getDeputyType() {
		return this.deputyType;
	}
	public void setDeputyType(String deputyType) {
		this.deputyType = deputyType;
	}

	public String getTerm() {
		return this.term;
	}
	public void setTerm(String term) {
		this.term = term;
	}

}
