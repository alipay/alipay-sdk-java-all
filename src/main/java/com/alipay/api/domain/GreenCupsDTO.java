package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 环保杯列表，有环保杯时，必填。
 *
 * @author auto create
 * @since 1.0, 2022-05-17 16:45:26
 */
public class GreenCupsDTO extends AlipayObject {

	private static final long serialVersionUID = 2675361728998388575L;

	/**
	 * 环保二级类目；字典值: 
自带杯:zidaibei;
马克杯:makebei;
直饮杯:zhiyinbei;
	 */
	@ApiField("cup_type")
	private String cupType;

	/**
	 * 杯数; 本次购买的环保杯数量; 只有环保杯类型时,该字段必填;
	 */
	@ApiField("cups_amount")
	private String cupsAmount;

	public String getCupType() {
		return this.cupType;
	}
	public void setCupType(String cupType) {
		this.cupType = cupType;
	}

	public String getCupsAmount() {
		return this.cupsAmount;
	}
	public void setCupsAmount(String cupsAmount) {
		this.cupsAmount = cupsAmount;
	}

}
