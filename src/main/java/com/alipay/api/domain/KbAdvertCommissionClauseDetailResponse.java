package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分佣条款详情信息
 *
 * @author auto create
 * @since 1.0, 2017-07-05 15:28:06
 */
public class KbAdvertCommissionClauseDetailResponse extends AlipayObject {

	private static final long serialVersionUID = 4438983641637333597L;

	/**
	 * 分佣比例(100以内精度2位的非负小数，例如5%，则输出为5)
当type=PERCENTAGE_CLAUSE时，该值有效
	 */
	@ApiField("commission_rate")
	private String commissionRate;

	/**
	 * 封顶金额(精度2位的非负小数)
当type=PERCENTAGE_CLAUSE时，该值有效
	 */
	@ApiField("max_limit")
	private String maxLimit;

	/**
	 * 分佣定额(精度2位的非负小数)
当type=QUOTA_CLAUSE时，该值有效
	 */
	@ApiField("quota_amount")
	private String quotaAmount;

	/**
	 * 分佣规则类型
PERCENTAGE_CLAUSE-比例
QUOTA_CLAUSE-定额
	 */
	@ApiField("type")
	private String type;

	public String getCommissionRate() {
		return this.commissionRate;
	}
	public void setCommissionRate(String commissionRate) {
		this.commissionRate = commissionRate;
	}

	public String getMaxLimit() {
		return this.maxLimit;
	}
	public void setMaxLimit(String maxLimit) {
		this.maxLimit = maxLimit;
	}

	public String getQuotaAmount() {
		return this.quotaAmount;
	}
	public void setQuotaAmount(String quotaAmount) {
		this.quotaAmount = quotaAmount;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
