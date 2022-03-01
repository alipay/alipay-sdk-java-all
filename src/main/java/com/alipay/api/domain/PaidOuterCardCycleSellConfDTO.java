package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 付费外卡连续售卖配置
 *
 * @author auto create
 * @since 1.0, 2022-02-21 15:46:35
 */
public class PaidOuterCardCycleSellConfDTO extends AlipayObject {

	private static final long serialVersionUID = 4718474861936312966L;

	/**
	 * 用户开通连续购买地址
	 */
	@ApiField("cycle_selling_url")
	private String cycleSellingUrl;

	/**
	 * 周期购买类型。枚举如下：
YEAR 年
QUARTER 季度
MONTH 月
	 */
	@ApiListField("cycle_type")
	@ApiField("string")
	private List<String> cycleType;

	/**
	 * 是否支持用户连续购买。true代表支持，false代表不支持。
	 */
	@ApiField("support_cycle_sell")
	private Boolean supportCycleSell;

	public String getCycleSellingUrl() {
		return this.cycleSellingUrl;
	}
	public void setCycleSellingUrl(String cycleSellingUrl) {
		this.cycleSellingUrl = cycleSellingUrl;
	}

	public List<String> getCycleType() {
		return this.cycleType;
	}
	public void setCycleType(List<String> cycleType) {
		this.cycleType = cycleType;
	}

	public Boolean getSupportCycleSell() {
		return this.supportCycleSell;
	}
	public void setSupportCycleSell(Boolean supportCycleSell) {
		this.supportCycleSell = supportCycleSell;
	}

}
