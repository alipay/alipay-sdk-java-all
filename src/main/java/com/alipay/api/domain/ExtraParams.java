package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务扩展参数
 *
 * @author auto create
 * @since 1.0, 2019-03-19 19:01:37
 */
public class ExtraParams extends AlipayObject {

	private static final long serialVersionUID = 1186575566164974338L;

	/**
	 * 轻会员场景下协议结算周期，由协议生效日期到失效日期拼接(yyyyMMddHHmmss-yyyyMMddHHmmss)，精确到秒。
	 */
	@ApiField("period")
	private String period;

	/**
	 * 轻会员费用结算原始信息。详细字段说明：total_real_pay_amount轻会员周期内累计支付宝支付金额， total_pay_count轻会员周期内累计支付宝支付次数，total_discount_amount轻会员周期内累计享受的轻会员优惠。（上面金额字段单位为元，精确小数点后两位）
	 */
	@ApiField("period_summary_info")
	private String periodSummaryInfo;

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public String getPeriodSummaryInfo() {
		return this.periodSummaryInfo;
	}
	public void setPeriodSummaryInfo(String periodSummaryInfo) {
		this.periodSummaryInfo = periodSummaryInfo;
	}

}
