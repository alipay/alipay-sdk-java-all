package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 多云发票明细行
 *
 * @author auto create
 * @since 1.0, 2025-08-12 16:14:50
 */
public class ObcInvoiceApplyLineRequest extends AlipayObject {

	private static final long serialVersionUID = 3652835884394714712L;

	/**
	 * 货币单位，必填
	 */
	@ApiField("currency_code")
	private String currencyCode;

	/**
	 * 开票对象明细列表
	 */
	@ApiListField("details")
	@ApiField("obc_invoice_object_request")
	private List<ObcInvoiceObjectRequest> details;

	/**
	 * 金额的String类型，CNY币种下单位为元
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/**
	 * 具体服务或货物的规则型号
	 */
	@ApiField("invoice_specification")
	private String invoiceSpecification;

	/**
	 * 金额的String类型，CNY币种下单位为元，单价*数量=金额
	 */
	@ApiField("price")
	private String price;

	/**
	 * 开票明细行的货物或服务名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 数量，小数点后最多保留4位，单价*数量=金额，数量的单位由接入方根据票面展示效果指定，不使用枚举
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 金额的String类型，单位元，必填
	 */
	@ApiField("tax_amount")
	private String taxAmount;

	/**
	 * 国内税率一般为6%，13%，这里是百分号前的部分
	 */
	@ApiField("tax_rate")
	private String taxRate;

	/**
	 * 提供服务或商品的单位，个/位，等具体单位由发票开具票面想展示的为准
	 */
	@ApiField("unit")
	private String unit;

	public String getCurrencyCode() {
		return this.currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public List<ObcInvoiceObjectRequest> getDetails() {
		return this.details;
	}
	public void setDetails(List<ObcInvoiceObjectRequest> details) {
		this.details = details;
	}

	public String getInvoiceAmount() {
		return this.invoiceAmount;
	}
	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getInvoiceSpecification() {
		return this.invoiceSpecification;
	}
	public void setInvoiceSpecification(String invoiceSpecification) {
		this.invoiceSpecification = invoiceSpecification;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getTaxAmount() {
		return this.taxAmount;
	}
	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}

	public String getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
