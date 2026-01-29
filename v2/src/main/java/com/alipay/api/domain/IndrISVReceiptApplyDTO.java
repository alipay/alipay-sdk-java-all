package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV申请凭证请求
 *
 * @author auto create
 * @since 1.0, 2023-08-24 13:51:13
 */
public class IndrISVReceiptApplyDTO extends AlipayObject {

	private static final long serialVersionUID = 1894718538768332966L;

	/**
	 * 需发送的邮箱地址
	 */
	@ApiField("email")
	private String email;

	/**
	 * 预订单号
	 */
	@ApiField("pre_order_id")
	private String preOrderId;

	/**
	 * 凭证类型：PAYMENT支付凭证，REMIT缴费凭证
	 */
	@ApiField("receipt_type")
	private String receiptType;

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPreOrderId() {
		return this.preOrderId;
	}
	public void setPreOrderId(String preOrderId) {
		this.preOrderId = preOrderId;
	}

	public String getReceiptType() {
		return this.receiptType;
	}
	public void setReceiptType(String receiptType) {
		this.receiptType = receiptType;
	}

}
