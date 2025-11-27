package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * sku的部分信息实体，包括店内码，价格，货架码，重量，体积
 *
 * @author auto create
 * @since 1.0, 2025-02-13 23:23:32
 */
public class SkuSimpleInfoParam extends AlipayObject {

	private static final long serialVersionUID = 6334738979483488574L;

	/**
	 * 店内货架码, 厂商自行维护
	 */
	@ApiField("shelf_code")
	private String shelfCode;

	/**
	 * OMS厂商sku编码, 厂商自行维护
	 */
	@ApiField("sku_code")
	private String skuCode;

	/**
	 * 体积, 高度, 单位毫米mm
	 */
	@ApiField("volume_high")
	private Long volumeHigh;

	/**
	 * 体积, 长度, 单位毫米mm
	 */
	@ApiField("volume_length")
	private Long volumeLength;

	/**
	 * 体积, 宽度, 单位毫米mm
	 */
	@ApiField("volume_width")
	private Long volumeWidth;

	/**
	 * 重量信息, 内容需要为纯数字, 精度支持小数点后三位. 重量单位为weight_unit字段的值
	 */
	@ApiField("weight")
	private String weight;

	/**
	 * 重量单位
	 */
	@ApiField("weight_unit")
	private String weightUnit;

	public String getShelfCode() {
		return this.shelfCode;
	}
	public void setShelfCode(String shelfCode) {
		this.shelfCode = shelfCode;
	}

	public String getSkuCode() {
		return this.skuCode;
	}
	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
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
