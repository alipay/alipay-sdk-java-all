package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 付费外卡连续售卖配置
 *
 * @author auto create
 * @since 1.0, 2023-07-03 13:55:26
 */
public class PaidOuterCardCycleSellConfDTO extends AlipayObject {

	private static final long serialVersionUID = 4165653292793234742L;

	/**
	 * 用户开通连续购买地址
	 */
	@ApiField("cycle_selling_url")
	private String cycleSellingUrl;

	/**
	 * 周期购买类型。
	 */
	@ApiListField("cycle_type")
	@ApiField("string")
	private List<String> cycleType;

	/**
	 * 是否支持用户连续购买
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
