package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过sku编码修改商品信息
 *
 * @author auto create
 * @since 1.0, 2025-05-20 16:54:19
 */
public class SkuUpdateByCodeParam extends AlipayObject {

	private static final long serialVersionUID = 2395986447423768584L;

	/**
	 * 店内货架码, 厂商自行维护
	 */
	@ApiField("shelf_code")
	private String shelfCode;

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
