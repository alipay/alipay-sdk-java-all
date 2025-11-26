package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单取消
 *
 * @author auto create
 * @since 1.0, 2025-04-08 16:22:27
 */
public class AlipayOfflineSmddOrderCancelNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 5777881956517477625L;

	/**
	 * 买家唯一标识
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 桌码拓展对象
	 */
	@ApiField("code_ext")
	private CodeExtBean codeExt;

	/**
	 * 订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 取消类型，取消订单有两种，一种是用户主动取消，一种是超时取消
	 */
	@ApiField("type")
	private String type;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public CodeExtBean getCodeExt() {
		return this.codeExt;
	}
	public void setCodeExt(CodeExtBean codeExt) {
		this.codeExt = codeExt;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
