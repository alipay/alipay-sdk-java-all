package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量创建商品接口, sku信息
 *
 * @author auto create
 * @since 1.0, 2026-04-20 16:12:11
 */
public class SkuCreateInfoParam extends AlipayObject {

	private static final long serialVersionUID = 7611666289311775428L;

	/**
	 * 仅支持问诊商品, 唯一key用于打破spu商品唯一性, 创建后不可更新
	 */
	@ApiField("external_key")
	private String externalKey;

	/**
	 * 问诊类商品信息
	 */
	@ApiField("inquiry_info")
	private InquiryInfoParam inquiryInfo;

	/**
	 * 检查检验类商品信息
	 */
	@ApiField("inspect_info")
	private InspectInfoParam inspectInfo;

	/**
	 * SKU名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 原价，单位元。币种 ：人民币。
	 */
	@ApiField("origin_price")
	private String originPrice;

	/**
	 * 价格，单位元。币种 ：人民币。
	 */
	@ApiField("price")
	private String price;

	/**
	 * 店内货架码, 厂商自行维护
	 */
	@ApiField("shelf_code")
	private String shelfCode;

	/**
	 * 是否对用户展示
	 */
	@ApiField("show_to_customer")
	private String showToCustomer;

	/**
	 * OMS厂商sku编码, 厂商自行维护
	 */
	@ApiField("sku_code")
	private String skuCode;

	/**
	 * 库存数量，单位：个
	 */
	@ApiField("stock")
	private Long stock;

	/**
	 * upc编码
	 */
	@ApiField("upc")
	private String upc;

	/**
	 * 体积, 高, 单位毫米mm
	 */
	@ApiField("volume_high")
	private Long volumeHigh;

	/**
	 * 体积, 长度, 单位毫米mm
	 */
	@ApiField("volume_length")
	private Long volumeLength;

	/**
	 * 体积, 宽, 单位毫米mm
	 */
	@ApiField("volume_width")
	private Long volumeWidth;

	/**
	 * 重量信息, 重量单位为weight_unit字段的值
	 */
	@ApiField("weight")
	private String weight;

	/**
	 * 重量单位
	 */
	@ApiField("weight_unit")
	private String weightUnit;

	public String getExternalKey() {
		return this.externalKey;
	}
	public void setExternalKey(String externalKey) {
		this.externalKey = externalKey;
	}

	public InquiryInfoParam getInquiryInfo() {
		return this.inquiryInfo;
	}
	public void setInquiryInfo(InquiryInfoParam inquiryInfo) {
		this.inquiryInfo = inquiryInfo;
	}

	public InspectInfoParam getInspectInfo() {
		return this.inspectInfo;
	}
	public void setInspectInfo(InspectInfoParam inspectInfo) {
		this.inspectInfo = inspectInfo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOriginPrice() {
		return this.originPrice;
	}
	public void setOriginPrice(String originPrice) {
		this.originPrice = originPrice;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getShelfCode() {
		return this.shelfCode;
	}
	public void setShelfCode(String shelfCode) {
		this.shelfCode = shelfCode;
	}

	public String getShowToCustomer() {
		return this.showToCustomer;
	}
	public void setShowToCustomer(String showToCustomer) {
		this.showToCustomer = showToCustomer;
	}

	public String getSkuCode() {
		return this.skuCode;
	}
	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public Long getStock() {
		return this.stock;
	}
	public void setStock(Long stock) {
		this.stock = stock;
	}

	public String getUpc() {
		return this.upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}

	public Long getVolumeHigh() {
		return this.volumeHigh;
	}
	public void setVolumeHigh(Long volumeHigh) {
		this.volumeHigh = volumeHigh;
	}

	public Long getVolumeLength() {
		return this.volumeLength;
	}
	public void setVolumeLength(Long volumeLength) {
		this.volumeLength = volumeLength;
	}

	public Long getVolumeWidth() {
		return this.volumeWidth;
	}
	public void setVolumeWidth(Long volumeWidth) {
		this.volumeWidth = volumeWidth;
	}

	public String getWeight() {
		return this.weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getWeightUnit() {
		return this.weightUnit;
	}
	public void setWeightUnit(String weightUnit) {
		this.weightUnit = weightUnit;
	}

}
