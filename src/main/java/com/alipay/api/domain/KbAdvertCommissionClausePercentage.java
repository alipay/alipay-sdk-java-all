package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑广告系统分佣规则(比例)
 *
 * @author auto create
 * @since 1.0, 2016-11-21 17:14:39
 */
public class KbAdvertCommissionClausePercentage extends AlipayObject {

	private static final long serialVersionUID = 2859336151567416765L;

	/**
	 * 分佣比例结束范围(100以内精度2位的非负小数)
	 */
	@ApiField("commission_rate_end")
	private String commissionRateEnd;

	/**
	 * 分佣比例开始范围(100以内精度2位的非负小数)
	 */
	@ApiField("commission_rate_start")
	private String commissionRateStart;

	/**
	 * 封顶金额结束范围(精度2位的非负小数)
	 */
	@ApiField("max_limit_end")
	private String maxLimitEnd;

	/**
	 * 封顶金额开始范围(精度2位的非负小数)
	 */
	@ApiField("max_limit_start")
	private String maxLimitStart;

	public String getCommissionRateEnd() {
		return this.commissionRateEnd;
	}
	public void setCommissionRateEnd(String commissionRateEnd) {
		this.commissionRateEnd = commissionRateEnd;
	}

	public String getCommissionRateStart() {
		return this.commissionRateStart;
	}
	public void setCommissionRateStart(String commissionRateStart) {
		this.commissionRateStart = commissionRateStart;
	}

	public String getMaxLimitEnd() {
		return this.maxLimitEnd;
	}
	public void setMaxLimitEnd(String maxLimitEnd) {
		this.maxLimitEnd = maxLimitEnd;
	}

	public String getMaxLimitStart() {
		return this.maxLimitStart;
	}
	public void setMaxLimitStart(String maxLimitStart) {
		this.maxLimitStart = maxLimitStart;
	}

}
