package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设置额度明细
 *
 * @author auto create
 * @since 1.0, 2022-04-21 11:06:16
 */
public class ModifyQuotaDetails extends AlipayObject {

	private static final long serialVersionUID = 7439386991428796744L;

	/**
	 * 具体额度，单位：元。如金额为空，表示删除已有的额度设置，无已有额度设置则忽略。
	 */
	@ApiField("quota_amount")
	private String quotaAmount;

	/**
	 * 额度维度
MONTH/DAY/SINGLE
分别代表月、日、单次
	 */
	@ApiField("quota_dimension")
	private String quotaDimension;

	/**
	 * PAYER/PAYEE
额度管控的角色，收or付款方，目前只支持付款方
	 */
	@ApiField("role")
	private String role;

	public String getQuotaAmount() {
		return this.quotaAmount;
	}
	public void setQuotaAmount(String quotaAmount) {
		this.quotaAmount = quotaAmount;
	}

	public String getQuotaDimension() {
		return this.quotaDimension;
	}
	public void setQuotaDimension(String quotaDimension) {
		this.quotaDimension = quotaDimension;
	}

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
