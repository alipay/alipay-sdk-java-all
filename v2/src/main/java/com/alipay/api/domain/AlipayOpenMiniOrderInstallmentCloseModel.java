package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单分期关闭
 *
 * @author auto create
 * @since 1.0, 2024-04-22 19:08:30
 */
public class AlipayOpenMiniOrderInstallmentCloseModel extends AlipayObject {

	private static final long serialVersionUID = 1599825624863663715L;

	/**
	 * 分期单号。在代扣等场景下使用
	 */
	@ApiField("installment_order_id")
	private String installmentOrderId;

	/**
	 * 用户openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 平台订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 分期单外部请求号，由商家自定义。通过外部分期单号关闭分期单，需传入业务主单号
	 */
	@ApiField("out_installment_order_id")
	private String outInstallmentOrderId;

	/**
	 * 商家自定义订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getInstallmentOrderId() {
		return this.installmentOrderId;
	}
	public void setInstallmentOrderId(String installmentOrderId) {
		this.installmentOrderId = installmentOrderId;
	}

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

	public String getOutInstallmentOrderId() {
		return this.outInstallmentOrderId;
	}
	public void setOutInstallmentOrderId(String outInstallmentOrderId) {
		this.outInstallmentOrderId = outInstallmentOrderId;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
