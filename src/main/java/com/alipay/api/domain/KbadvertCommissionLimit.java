package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分佣配置
 *
 * @author auto create
 * @since 1.0, 2017-03-03 10:41:20
 */
public class KbadvertCommissionLimit extends AlipayObject {

	private static final long serialVersionUID = 4693289913154972657L;

	/**
	 * 推广者类型
	 */
	@ApiField("commission_user_type")
	private String commissionUserType;

	/**
	 * 层级
	 */
	@ApiField("level")
	private Long level;

	/**
	 * 比例分佣的最大金额
	 */
	@ApiField("max_max_amount")
	private String maxMaxAmount;

	/**
	 * 固定金额上限
	 */
	@ApiField("max_quota_amount")
	private String maxQuotaAmount;

	/**
	 * 最小分佣比例
	 */
	@ApiField("min_commission_percentage")
	private String minCommissionPercentage;

	/**
	 * 最小固定金额
	 */
	@ApiField("min_quota_amount")
	private String minQuotaAmount;

	public String getCommissionUserType() {
		return this.commissionUserType;
	}
	public void setCommissionUserType(String commissionUserType) {
		this.commissionUserType = commissionUserType;
	}

	public Long getLevel() {
		return this.level;
	}
	public void setLevel(Long level) {
		this.level = level;
	}

	public String getMaxMaxAmount() {
		return this.maxMaxAmount;
	}
	public void setMaxMaxAmount(String maxMaxAmount) {
		this.maxMaxAmount = maxMaxAmount;
	}

	public String getMaxQuotaAmount() {
		return this.maxQuotaAmount;
	}
	public void setMaxQuotaAmount(String maxQuotaAmount) {
		this.maxQuotaAmount = maxQuotaAmount;
	}

	public String getMinCommissionPercentage() {
		return this.minCommissionPercentage;
	}
	public void setMinCommissionPercentage(String minCommissionPercentage) {
		this.minCommissionPercentage = minCommissionPercentage;
	}

	public String getMinQuotaAmount() {
		return this.minQuotaAmount;
	}
	public void setMinQuotaAmount(String minQuotaAmount) {
		this.minQuotaAmount = minQuotaAmount;
	}

}
