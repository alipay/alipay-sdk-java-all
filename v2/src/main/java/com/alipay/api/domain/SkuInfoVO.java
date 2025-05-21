package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * sku信息
 *
 * @author auto create
 * @since 1.0, 2025-04-23 10:42:56
 */
public class SkuInfoVO extends AlipayObject {

	private static final long serialVersionUID = 6196678293842566362L;

	/**
	 * sku价格, 单位元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 枚举值：0上架 -1售罄
	 */
	@ApiField("sale_status")
	private String saleStatus;

	/**
	 * sku的货架码/位置
	 */
	@ApiField("shelf_code")
	private String shelfCode;

	/**
	 * app方商品sku编码
	 */
	@ApiField("sku_code")
	private String skuCode;

	/**
	 * 平台skuId
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 商品包装规格描述, 例如10g*9袋/盒
	 */
	@ApiField("spec")
	private String spec;

	/**
	 * sku的条码编号
	 */
	@ApiField("upc")
	private String upc;

	/**
	 * 整数，单位：mm
	 */
	@ApiField("volume_high")
	private Long volumeHigh;

	/**
	 * 整数，单位：mm
	 */
	@ApiField("volume_length")
	private Long volumeLength;

	/**
	 * 整数，单位：mm
	 */
	@ApiField("volume_width")
	private Long volumeWidth;

	/**
	 * 保留三位小数，单位g/ml 当前字段已废弃(和其他接口定义保持一致, 使用字符串类型. 此字段不再返回值, 请使用weight_v_2)
	 */
	@ApiField("weight")
	@Deprecated
	private Long weight;

	/**
	 * 重量单位-固定 ml 或者 g
	 */
	@ApiField("weight_unit")
	private String weightUnit;

	/**
	 * 重量信息, 内容需要为纯数字, 精度支持小数点后三位. 重量单位为weight_unit字段的值
	 */
	@ApiField("weight_v_2")
	private String weightV2;

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getSaleStatus() {
		return this.saleStatus;
	}
	public void setSaleStatus(String saleStatus) {
		this.saleStatus = saleStatus;
	}

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

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getSpec() {
		return this.spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
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

	public Long getWeight() {
		return this.weight;
	}
	public void setWeight(Long weight) {
		this.weight = weight;
	}

	public String getWeightUnit() {
		return this.weightUnit;
	}
	public void setWeightUnit(String weightUnit) {
		this.weightUnit = weightUnit;
	}

	public String getWeightV2() {
		return this.weightV2;
	}
	public void setWeightV2(String weightV2) {
		this.weightV2 = weightV2;
	}

}
