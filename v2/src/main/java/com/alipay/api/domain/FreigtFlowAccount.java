package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 货运账户信息模型
 *
 * @author auto create
 * @since 1.0, 2026-02-26 15:09:33
 */
public class FreigtFlowAccount extends AlipayObject {

	private static final long serialVersionUID = 5311854394311171217L;

	/**
	 * 银行类型
	 */
	@ApiField("bank_id")
	private String bankId;

	/**
	 * 银行名字
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * mode为网商银行时网商结算户账号,
mode为浦发银行为对应的监管账户
	 */
	@ApiField("parent_id")
	private String parentId;

	/**
	 * 商户名称
	 */
	@ApiField("parent_name")
	private String parentName;

	public String getBankId() {
		return this.bankId;
	}
	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return this.bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getParentId() {
		return this.parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getParentName() {
		return this.parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

}
