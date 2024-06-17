package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云订单返回结果结构
 *
 * @author auto create
 * @since 1.0, 2024-06-04 20:14:14
 */
public class MpcOrderLineResult extends AlipayObject {

	private static final long serialVersionUID = 2216422592624619623L;

	/**
	 * 物流状态
	 */
	@ApiField("logistics_status")
	private String logisticsStatus;

	/**
	 * 数量
	 */
	@ApiField("number")
	private String number;

	/**
	 * 订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 子订单id
	 */
	@ApiField("order_line_id")
	private String orderLineId;

	/**
	 * 子订单状态
	 */
	@ApiField("order_line_status")
	private String orderLineStatus;

	/**
	 * 子订单应付金额(单位：分)
	 */
	@ApiField("pay_fee")
	private Long payFee;

	/**
	 * 商品id
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 商品图片链接
	 */
	@ApiField("product_pic")
	private String productPic;

	/**
	 * 商品名称
	 */
	@ApiField("product_title")
	private String productTitle;

	/**
	 * SKUID
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * sku名称
	 */
	@ApiField("sku_title")
	private String skuTitle;

	public String getLogisticsStatus() {
		return this.logisticsStatus;
	}
	public void setLogisticsStatus(String logisticsStatus) {
		this.logisticsStatus = logisticsStatus;
	}

	public String getNumber() {
		return this.number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderLineId() {
		return this.orderLineId;
	}
	public void setOrderLineId(String orderLineId) {
		this.orderLineId = orderLineId;
	}

	public String getOrderLineStatus() {
		return this.orderLineStatus;
	}
	public void setOrderLineStatus(String orderLineStatus) {
		this.orderLineStatus = orderLineStatus;
	}

	public Long getPayFee() {
		return this.payFee;
	}
	public void setPayFee(Long payFee) {
		this.payFee = payFee;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductPic() {
		return this.productPic;
	}
	public void setProductPic(String productPic) {
		this.productPic = productPic;
	}

	public String getProductTitle() {
		return this.productTitle;
	}
	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getSkuTitle() {
		return this.skuTitle;
	}
	public void setSkuTitle(String skuTitle) {
		this.skuTitle = skuTitle;
	}

}
