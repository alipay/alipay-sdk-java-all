package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品信息OpenApiOrder
 *
 * @author auto create
 * @since 1.0, 2025-11-12 16:35:55
 */
public class OpenApiProductInfoOrder extends AlipayObject {

	private static final long serialVersionUID = 6855492161514664753L;

	/**
	 * 含税金额, 等于 不含税金额 * ( 1 + 税率 )
与不含税金额二选一必填, 推荐填含税金额
	 */
	@ApiField("amt")
	private MultiCurrencyMoneyOpenApi amt;

	/**
	 * 货物或劳务名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 不含税金额, 等于 含税金额 / ( 1 + 税率 )
与含税金额二选一必填, 推荐填写含税金额
	 */
	@ApiField("tax_exclusive_amt")
	private MultiCurrencyMoneyOpenApi taxExclusiveAmt;

	public MultiCurrencyMoneyOpenApi getAmt() {
		return this.amt;
	}
	public void setAmt(MultiCurrencyMoneyOpenApi amt) {
		this.amt = amt;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public MultiCurrencyMoneyOpenApi getTaxExclusiveAmt() {
		return this.taxExclusiveAmt;
	}
	public void setTaxExclusiveAmt(MultiCurrencyMoneyOpenApi taxExclusiveAmt) {
		this.taxExclusiveAmt = taxExclusiveAmt;
	}

}
