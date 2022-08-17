package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 特价券详情
 *
 * @author auto create
 * @since 1.0, 2022-07-28 14:17:16
 */
public class SpecialVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 1187652234919227183L;

	/**
	 * 门槛金额。 限制： 币种为人民币，单位为元； 小数点以后最多保留两位； 取值范围:0.1<=x<= 50000; 说明： 该字段可不填，认为无门槛;
	 */
	@ApiField("floor_amount")
	private String floorAmount;

	/**
	 * 特价，即：原价-特价=优惠金额。 限制： 币种为人民币，单位为元。小数点以后最多保留两位; 取值范围:0<=x<=999; 原价必须大于特价，即:origin_amount>special_amount;
	 */
	@ApiField("special_amount")
	private String specialAmount;

	public String getFloorAmount() {
		return this.floorAmount;
	}
	public void setFloorAmount(String floorAmount) {
		this.floorAmount = floorAmount;
	}

	public String getSpecialAmount() {
		return this.specialAmount;
	}
	public void setSpecialAmount(String specialAmount) {
		this.specialAmount = specialAmount;
	}

}
