package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 对应商品有环保类型时，需要返回;一个商品可能有多个环保类型
 *
 * @author auto create
 * @since 1.0, 2022-06-07 09:57:35
 */
public class Environmental extends AlipayObject {

	private static final long serialVersionUID = 3534559681542929938L;

	/**
	 * 对应环保类型，可以发放的能量数
	 */
	@ApiField("energy_amount")
	private String energyAmount;

	/**
	 * 商品对应的环保类型; 字典值:
临时商品:
替换装:
FSC:
	 */
	@ApiField("environmental")
	private String environmental;

	public String getEnergyAmount() {
		return this.energyAmount;
	}
	public void setEnergyAmount(String energyAmount) {
		this.energyAmount = energyAmount;
	}

	public String getEnvironmental() {
		return this.environmental;
	}
	public void setEnvironmental(String environmental) {
		this.environmental = environmental;
	}

}
