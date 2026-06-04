package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-20 21:02:50
 */
public class ExaminationSpuInfo extends AlipayObject {

	private static final long serialVersionUID = 4453314689558955434L;

	/**
	 * 组合品标识
	 */
	@ApiField("combination_product")
	private String combinationProduct;

	/**
	 * 描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 履约方描述
	 */
	@ApiField("fulfillment_desc")
	private String fulfillmentDesc;

	/**
	 * 履约方类型
	 */
	@ApiField("fulfillment_type")
	private String fulfillmentType;

	/**
	 * 主要指标
	 */
	@ApiField("indicators")
	private String indicators;

	/**
	 * 最高价格 单位人民币元
	 */
	@ApiField("max_price")
	private String maxPrice;

	/**
	 * 最低价格 单位人民币元
	 */
	@ApiField("min_price")
	private String minPrice;

	/**
	 * 注意事项
	 */
	@ApiField("notice_info")
	private String noticeInfo;

	/**
	 * null
	 */
	@ApiListField("package_items")
	@ApiField("examination_package_item")
	private List<ExaminationPackageItem> packageItems;

	/**
	 * 价格 单位人民币元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 项目说明
	 */
	@ApiField("specification")
	private String specification;

	/**
	 * 标品ID
	 */
	@ApiField("spu_id")
	private String spuId;

	/**
	 * 标品标题
	 */
	@ApiField("spu_title")
	private String spuTitle;

	/**
	 * 履约方编码
	 */
	@ApiField("vendor_code")
	private String vendorCode;

	public String getCombinationProduct() {
		return this.combinationProduct;
	}
	public void setCombinationProduct(String combinationProduct) {
		this.combinationProduct = combinationProduct;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getFulfillmentDesc() {
		return this.fulfillmentDesc;
	}
	public void setFulfillmentDesc(String fulfillmentDesc) {
		this.fulfillmentDesc = fulfillmentDesc;
	}

	public String getFulfillmentType() {
		return this.fulfillmentType;
	}
	public void setFulfillmentType(String fulfillmentType) {
		this.fulfillmentType = fulfillmentType;
	}

	public String getIndicators() {
		return this.indicators;
	}
	public void setIndicators(String indicators) {
		this.indicators = indicators;
	}

	public String getMaxPrice() {
		return this.maxPrice;
	}
	public void setMaxPrice(String maxPrice) {
		this.maxPrice = maxPrice;
	}

	public String getMinPrice() {
		return this.minPrice;
	}
	public void setMinPrice(String minPrice) {
		this.minPrice = minPrice;
	}

	public String getNoticeInfo() {
		return this.noticeInfo;
	}
	public void setNoticeInfo(String noticeInfo) {
		this.noticeInfo = noticeInfo;
	}

	public List<ExaminationPackageItem> getPackageItems() {
		return this.packageItems;
	}
	public void setPackageItems(List<ExaminationPackageItem> packageItems) {
		this.packageItems = packageItems;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getSpecification() {
		return this.specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public String getSpuId() {
		return this.spuId;
	}
	public void setSpuId(String spuId) {
		this.spuId = spuId;
	}

	public String getSpuTitle() {
		return this.spuTitle;
	}
	public void setSpuTitle(String spuTitle) {
		this.spuTitle = spuTitle;
	}

	public String getVendorCode() {
		return this.vendorCode;
	}
	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}

}
