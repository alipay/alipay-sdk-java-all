package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单关闭
 *
 * @author auto create
 * @since 1.0, 2025-04-16 14:11:57
 */
public class AlipayOpenMiniOrderCloseModel extends AlipayObject {

	private static final long serialVersionUID = 6517315783133698963L;

	/**
	 * 买家open_id；open_id和user_id二选一
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 交易组件订单号；order_id和out_order_id二选一
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商户订单号，创建订单请求由商户传入；order_id和out_order_id二选一
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 关闭原因编码对应的描述信息
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 取消订单的原因编码，不同业务的取消原因不同，更多原因编码枚举值请参考：https://xfpzl.yuque.com/dgw58m/apg2ie/howyv43z3piimp48#SaZq
	 */
	@ApiField("reason_code")
	private String reasonCode;

	/**
	 * 买家支付宝用户ID；open_id和user_id二选一
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getReasonCode() {
		return this.reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
