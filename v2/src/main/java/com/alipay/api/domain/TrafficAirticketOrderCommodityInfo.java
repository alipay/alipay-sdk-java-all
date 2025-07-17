package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出行机票订单数据同步-商品信息
 *
 * @author auto create
 * @since 1.0, 2024-09-26 20:34:18
 */
public class TrafficAirticketOrderCommodityInfo extends AlipayObject {

	private static final long serialVersionUID = 1136226757419731256L;

	/**
	 * 商品唯一编号，建议按照如下规则：
1. 机票类：传入机票票号
2. 其他辅营类：商家自定义的uuid
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品名称，如：
1. 机票类：「飞猪机票」
2. 其他辅营类（商户自定义，或提前跟支付宝约定）：「接送机服务服务」、「航班延误险」
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商品数量，单位：个
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 商品状态，默认无需传入，如需使用请与支付宝约定
	 */
	@ApiField("status")
	private String status;

	/**
	 * 商品状态描述，默认无需传入，如需使用请与支付宝约定
	 */
	@ApiField("status_desc")
	private String statusDesc;

	/**
	 * 商品总价，币种：人民币，单位：元
	 */
	@ApiField("total_price")
	private String totalPrice;

	/**
	 * 商品单价，币种：人民币，单位：元
	 */
	@ApiField("unit_price")
	private String unitPrice;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusDesc() {
		return this.statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

	public String getTotalPrice() {
		return this.totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getUnitPrice() {
		return this.unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

}
