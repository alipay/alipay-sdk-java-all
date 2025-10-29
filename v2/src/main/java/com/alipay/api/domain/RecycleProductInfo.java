package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 回收产品模型
 *
 * @author auto create
 * @since 1.0, 2025-07-08 11:35:06
 */
public class RecycleProductInfo extends AlipayObject {

	private static final long serialVersionUID = 7347698364447866729L;

	/**
	 * 品牌code
	 */
	@ApiField("brand_code")
	private String brandCode;

	/**
	 * 品类code
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 实物图片地址（公网图片地址）
	 */
	@ApiListField("entity_image_url_list")
	@ApiField("string")
	private List<String> entityImageUrlList;

	/**
	 * 发票图片地址（公网图片地址）
	 */
	@ApiListField("invoice_image_url_list")
	@ApiField("string")
	private List<String> invoiceImageUrlList;

	/**
	 * 产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 产品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 商品重量/数量。支持两位小数点。默认为1
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 商品最大重量。支持两位小数点。单位为克，在检测结果确认前传入预估克重。
	 */
	@ApiField("quantity_max")
	private String quantityMax;

	/**
	 * 商品最小重量。支持两位小数点。单位为克，在检测结果确认前传入预估克重。
	 */
	@ApiField("quantity_min")
	private String quantityMin;

	/**
	 * 单位，默认为piece
	 */
	@ApiField("unit")
	private String unit;

	/**
	 * 单位价格，支持两位小数点，价格单位为元
	 */
	@ApiField("unit_price")
	private String unitPrice;

	public String getBrandCode() {
		return this.brandCode;
	}
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public List<String> getEntityImageUrlList() {
		return this.entityImageUrlList;
	}
	public void setEntityImageUrlList(List<String> entityImageUrlList) {
		this.entityImageUrlList = entityImageUrlList;
	}

	public List<String> getInvoiceImageUrlList() {
		return this.invoiceImageUrlList;
	}
	public void setInvoiceImageUrlList(List<String> invoiceImageUrlList) {
		this.invoiceImageUrlList = invoiceImageUrlList;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
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

	public String getQuantityMax() {
		return this.quantityMax;
	}
	public void setQuantityMax(String quantityMax) {
		this.quantityMax = quantityMax;
	}

	public String getQuantityMin() {
		return this.quantityMin;
	}
	public void setQuantityMin(String quantityMin) {
		this.quantityMin = quantityMin;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getUnitPrice() {
		return this.unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

}
