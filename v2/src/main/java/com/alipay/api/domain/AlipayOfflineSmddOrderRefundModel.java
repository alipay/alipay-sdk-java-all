package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单退款成功
 *
 * @author auto create
 * @since 1.0, 2025-04-08 16:22:21
 */
public class AlipayOfflineSmddOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 5522737127633962644L;

	/**
	 * 买家用户唯一标识
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 桌码拓展对象
	 */
	@ApiField("code_ext")
	private CodeExtBean codeExt;

	/**
	 * 创建订单时支付宝侧返回的订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 退款交易信息留存
	 */
	@ApiField("refund_info")
	private RefundInfoBean refundInfo;

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

	public RefundInfoBean getRefundInfo() {
		return this.refundInfo;
	}
	public void setRefundInfo(RefundInfoBean refundInfo) {
		this.refundInfo = refundInfo;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
