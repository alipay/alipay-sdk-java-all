package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券包售卖信息轻量版
 *
 * @author auto create
 * @since 1.0, 2022-07-13 19:58:53
 */
public class VoucherPackageSalesLiteInfo extends AlipayObject {

	private static final long serialVersionUID = 6535268343359776399L;

	/**
	 * 券包预算，单位是份数
	 */
	@ApiField("budget")
	private Long budget;

	/**
	 * 券包售卖价格，单位是元
	 */
	@ApiField("sale_price")
	private String salePrice;

	public Long getBudget() {
		return this.budget;
	}
	public void setBudget(Long budget) {
		this.budget = budget;
	}

	public String getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

}
