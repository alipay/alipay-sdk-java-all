package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单支付成功
 *
 * @author auto create
 * @since 1.0, 2025-04-08 16:22:26
 */
public class AlipayOfflineSmddTradeSuccessNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 7244537839164544325L;

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
	 * 支付成功信息
	 */
	@ApiField("pay_info")
	private PayInfoBean payInfo;

	/**
	 * 店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

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

	public PayInfoBean getPayInfo() {
		return this.payInfo;
	}
	public void setPayInfo(PayInfoBean payInfo) {
		this.payInfo = payInfo;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
