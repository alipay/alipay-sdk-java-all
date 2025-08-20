package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 非接口新增商品通知厂商的sku信息实体
 *
 * @author auto create
 * @since 1.0, 2025-02-13 20:09:42
 */
public class OmsItemSkuInfoReq extends AlipayObject {

	private static final long serialVersionUID = 8691284263422164859L;

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
	 * OMS厂商sku编码, 厂商自行维护
	 */
	@ApiField("sku_code")
	private String skuCode;

	/**
	 * 平台用于定位sku的唯一标识，由支付宝返回
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * sku售卖规格，有0.25g*20粒/盒、200ml*1瓶/盒等，具体规格大小、单位由具体商品决定
	 */
	@ApiField("spec")
	private String spec;

	/**
	 * sku销售状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 销售规格的库存，单位：个
	 */
	@ApiField("stock")
	private Long stock;

	/**
	 * sku的条码编号
	 */
	@ApiField("upc")
	private String upc;

	/**
	 * 体积高度，单位mm
	 */
	@ApiField("volume_high")
	private Long volumeHigh;

	/**
	 * 体积长度，单位mm
	 */
	@ApiField("volume_length")
	private Long volumeLength;

	/**
	 * 体积宽度，单位mm
	 */
	@ApiField("volume_width")
	private Long volumeWidth;

	/**
	 * 重量信息, 内容需要为纯数字, 精度支持小数点后三位. 重量单位为weight_unit字段的值
	 */
	@ApiField("weight")
	private String weight;

	/**
	 * 销售规格的重量单位，g或ml
	 */
	@ApiField("weight_unit")
	private String weightUnit;

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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
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
