package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 基金净值的值对象
 *
 * @author auto create
 * @since 1.0, 2017-11-16 22:31:51
 */
public class NetValueVO extends AlipayObject {

	private static final long serialVersionUID = 1195317614564687919L;

	/**
	 * 基金单位净值，含4位小数
	 */
	@ApiField("net_value")
	private String netValue;

	/**
	 * 基金净值日期
	 */
	@ApiField("net_value_date")
	private String netValueDate;

	/**
	 * 七日年化收益率，含5位小数，可以为负
	 */
	@ApiField("profit_seven_days")
	private String profitSevenDays;

	/**
	 * 万份收益，含5位小数，可以为负
	 */
	@ApiField("profit_ten_thousand")
	private String profitTenThousand;

	public String getNetValue() {
		return this.netValue;
	}
	public void setNetValue(String netValue) {
		this.netValue = netValue;
	}

	public String getNetValueDate() {
		return this.netValueDate;
	}
	public void setNetValueDate(String netValueDate) {
		this.netValueDate = netValueDate;
	}

	public String getProfitSevenDays() {
		return this.profitSevenDays;
	}
	public void setProfitSevenDays(String profitSevenDays) {
		this.profitSevenDays = profitSevenDays;
	}

	public String getProfitTenThousand() {
		return this.profitTenThousand;
	}
	public void setProfitTenThousand(String profitTenThousand) {
		this.profitTenThousand = profitTenThousand;
	}

}
