package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务扩展参数
 *
 * @author auto create
 * @since 1.0, 2020-07-17 20:39:46
 */
public class ExtraParams extends AlipayObject {

	private static final long serialVersionUID = 1362988557758858746L;

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

	/**
	 * 用户主动意愿退出：USER_CANCEL_QUIT; 商户结算退出：SETTLE_APPLY_QUIT; 默认值为SETTLE_APPLY_QUIT；这个字段会影响用户在芝麻信用合约的状态
	 */
	@ApiField("quit_type")
	private String quitType;

	/**
	 * 代扣期数，周期扣场景PERIOD_SETTLE下需要传递
	 */
	@ApiField("withhold_index")
	private String withholdIndex;

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

	public String getQuitType() {
		return this.quitType;
	}
	public void setQuitType(String quitType) {
		this.quitType = quitType;
	}

	public String getWithholdIndex() {
		return this.withholdIndex;
	}
	public void setWithholdIndex(String withholdIndex) {
		this.withholdIndex = withholdIndex;
	}

}
