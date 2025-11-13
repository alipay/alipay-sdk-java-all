package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 产品信息
 *
 * @author auto create
 * @since 1.0, 2025-09-23 14:02:40
 */
public class RecycleQcReportProductInfo extends AlipayObject {

	private static final long serialVersionUID = 6229931192653467611L;

	/**
	 * 用户下单前的预估价格，单位为元，最多两位小数
	 */
	@ApiField("estimated_price")
	private String estimatedPrice;

	/**
	 * 3C设备的IMEI码
	 */
	@ApiField("imei")
	private String imei;

	/**
	 * 物品是否符合回收标准。为true时需要给出报价信息
	 */
	@ApiField("is_recycle")
	private Boolean isRecycle;

	/**
	 * 产品编码，支付宝商品库定义，并在下单时回传给服务商。用户实际寄出的商品，可能和问卷不一致，需要按传入收到商品的产品编码，可能和用户下单的编码不一致。
- 品一致，传下单的product_code
- 品不一致且在支付宝商品库，传实际product_code
- 品不在支付宝商品库，传 UNDEFINED
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 产品logo图片id。当产品不在支付宝产品库时，需要传入
	 */
	@ApiField("product_image_id")
	private String productImageId;

	/**
	 * 产品名称。
- 品在支付宝商品库，传code对应的product_name
- 品不在支付宝商品库，传实际product_name和product_image_id
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 质检之后最终报价，单位为元，最多两位小数
	 */
	@ApiField("real_price")
	private String realPrice;

	/**
	 * sku_id。支付宝下单时传给商户，每件商品一个id。多件场景下，每件商品一份报告； 非多件场景，无需传入
	 */
	@ApiField("sku_id")
	private String skuId;

	public String getEstimatedPrice() {
		return this.estimatedPrice;
	}
	public void setEstimatedPrice(String estimatedPrice) {
		this.estimatedPrice = estimatedPrice;
	}

	public String getImei() {
		return this.imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}

	public Boolean getIsRecycle() {
		return this.isRecycle;
	}
	public void setIsRecycle(Boolean isRecycle) {
		this.isRecycle = isRecycle;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductImageId() {
		return this.productImageId;
	}
	public void setProductImageId(String productImageId) {
		this.productImageId = productImageId;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getRealPrice() {
		return this.realPrice;
	}
	public void setRealPrice(String realPrice) {
		this.realPrice = realPrice;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
