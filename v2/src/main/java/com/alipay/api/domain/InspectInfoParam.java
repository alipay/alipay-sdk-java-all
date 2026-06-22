package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 检查检验类商品信息
 *
 * @author auto create
 * @since 1.0, 2026-04-20 16:12:11
 */
public class InspectInfoParam extends AlipayObject {

	private static final long serialVersionUID = 6432834562739145563L;

	/**
	 * 耗材费用，单位元。币种 ：人民币。
	 */
	@ApiField("consumables_price")
	private String consumablesPrice;

	/**
	 * 额外药品费用，单位元。币种 ：人民币。
	 */
	@ApiField("drug_price")
	private String drugPrice;

	public String getConsumablesPrice() {
		return this.consumablesPrice;
	}
	public void setConsumablesPrice(String consumablesPrice) {
		this.consumablesPrice = consumablesPrice;
	}

	public String getDrugPrice() {
		return this.drugPrice;
	}
	public void setDrugPrice(String drugPrice) {
		this.drugPrice = drugPrice;
	}

}
