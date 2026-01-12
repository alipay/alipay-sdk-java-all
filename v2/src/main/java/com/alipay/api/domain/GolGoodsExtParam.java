package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 跨境营销线上电商商品扩展参数
 *
 * @author auto create
 * @since 1.0, 2022-01-19 14:33:55
 */
public class GolGoodsExtParam extends AlipayObject {

	private static final long serialVersionUID = 2417756846815742523L;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 商品描述文案
	 */
	@ApiField("description")
	private String description;

	/**
	 * 商品优惠文案
	 */
	@ApiField("discount_content")
	private String discountContent;

	/**
	 * 是否包税。
Y - 包税
N - 不包税
	 */
	@ApiField("is_tax_free")
	private String isTaxFree;

	/**
	 * 规格
	 */
	@ApiListField("specifications")
	@ApiField("string")
	private List<String> specifications;

	/**
	 * 库存状态。
库存充裕：STOCK_SUFFICIENT
库存紧张：STOCK_INSUFFICIENT
库存为零：OUT_OF_STOCK
	 */
	@ApiField("stock_status")
	private String stockStatus;

	/**
	 * 率百分比数字，按照百分比传字符串。不包税的商品必填。精度：小数点后2位。
	 */
	@ApiField("tax_rate")
	private String taxRate;

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDiscountContent() {
		return this.discountContent;
	}
	public void setDiscountContent(String discountContent) {
		this.discountContent = discountContent;
	}

	public String getIsTaxFree() {
		return this.isTaxFree;
	}
	public void setIsTaxFree(String isTaxFree) {
		this.isTaxFree = isTaxFree;
	}

	public List<String> getSpecifications() {
		return this.specifications;
	}
	public void setSpecifications(List<String> specifications) {
		this.specifications = specifications;
	}

	public String getStockStatus() {
		return this.stockStatus;
	}
	public void setStockStatus(String stockStatus) {
		this.stockStatus = stockStatus;
	}

	public String getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

}
