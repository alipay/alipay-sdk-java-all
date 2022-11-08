package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业财受理外部计税明细信息
 *
 * @author auto create
 * @since 1.0, 2022-06-29 14:07:20
 */
public class GFAOpenAPIOuterTaxInfoDetail extends AlipayObject {

	private static final long serialVersionUID = 8324721594834992562L;

	/**
	 * 外部计税传入高精度税金。 需要处理为税金所属币种的最小单位。如人民币需要处理为分，日币需要处理最小单位元
	 */
	@ApiField("hd_tax_amount")
	private String hdTaxAmount;

	/**
	 * 外部计税传入税额
	 */
	@ApiField("tax_amount")
	private MultiCurrencyMoneyOpenApi taxAmount;

	/**
	 * 外部计税传入税率
	 */
	@ApiField("tax_rate")
	private String taxRate;

	/**
	 * 税种。 支持，增值税：01，营业税：02，消费税：03等等
	 */
	@ApiField("tax_type")
	private String taxType;

	public String getHdTaxAmount() {
		return this.hdTaxAmount;
	}
	public void setHdTaxAmount(String hdTaxAmount) {
		this.hdTaxAmount = hdTaxAmount;
	}

	public MultiCurrencyMoneyOpenApi getTaxAmount() {
		return this.taxAmount;
	}
	public void setTaxAmount(MultiCurrencyMoneyOpenApi taxAmount) {
		this.taxAmount = taxAmount;
	}

	public String getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

	public String getTaxType() {
		return this.taxType;
	}
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

}
