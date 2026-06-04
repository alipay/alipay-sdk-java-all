package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量更新商品, 商品信息
 *
 * @author auto create
 * @since 1.0, 2026-04-20 16:18:35
 */
public class SkuUpdateInfoParam extends AlipayObject {

	private static final long serialVersionUID = 5755373611651228188L;

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
	 * OMS厂商商品sku编码, 厂商自行维护
	 */
	@ApiField("sku_code")
	private String skuCode;

	/**
	 * upc编码
	 */
	@ApiField("upc")
	private String upc;

	/**
	 * 体积高度, 单位毫米
	 */
	@ApiField("volume_high")
	private Long volumeHigh;

	/**
	 * 体积长度, 单位毫米
	 */
	@ApiField("volume_length")
	private Long volumeLength;

	/**
	 * 体积宽度, 单位毫米
	 */
	@ApiField("volume_width")
	private Long volumeWidth;

	/**
	 * 商品重量, 重量单位为weight_unit的值(g/ml), 支持小数点后最多三位
	 */
	@ApiField("weight")
	private String weight;

	/**
	 * 重量单位,
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
