package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账号额度明细
 *
 * @author auto create
 * @since 1.0, 2022-04-21 11:06:28
 */
public class AccountQuotaDetail extends AlipayObject {

	private static final long serialVersionUID = 2631154386336655542L;

	/**
	 * 周期内的额度上限
	 */
	@ApiField("quota_amount")
	private Long quotaAmount;

	/**
	 * 额度周期，有限枚举
	 */
	@ApiField("quota_dimension")
	private String quotaDimension;

	/**
	 * 角色
	 */
	@ApiField("role")
	private String role;

	public Long getQuotaAmount() {
		return this.quotaAmount;
	}
	public void setQuotaAmount(Long quotaAmount) {
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
