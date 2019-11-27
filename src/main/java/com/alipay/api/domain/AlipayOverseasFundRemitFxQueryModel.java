package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汇款汇率查询接口
 *
 * @author auto create
 * @since 1.0, 2017-06-21 08:17:00
 */
public class AlipayOverseasFundRemitFxQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1385274338258889633L;

	/**
	 * base_currency, 汇率计算中的基准币种，3字符的ISO币种代码。
	 */
	@ApiField("base_currency")
	private String baseCurrency;

	/**
	 * product_code用来确定汇款产品，汇款机构签约时确定。
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * target_currency, 汇率计算中的目标币种, 采用3字符的ISO币种编码。
	 */
	@ApiField("target_currency")
	private String targetCurrency;

	public String getBaseCurrency() {
		return this.baseCurrency;
	}
	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getTargetCurrency() {
		return this.targetCurrency;
	}
	public void setTargetCurrency(String targetCurrency) {
		this.targetCurrency = targetCurrency;
	}

}
