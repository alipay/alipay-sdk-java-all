package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV申请凭证结果
 *
 * @author auto create
 * @since 1.0, 2023-08-24 13:51:13
 */
public class IndrISVReceiptApplyResultDTO extends AlipayObject {

	private static final long serialVersionUID = 7729129786774371163L;

	/**
	 * SUCCESS: 申请成功
PROCESS_FAIL: 申请失败
ORDER_NOT_EXIST: 订单不存在
ORDER_STATE_INVALID: 当前订单状态不支持申请该类型凭证
UNKNOWN_EXCEPTION: 系统异常
	 */
	@ApiField("apply_result_code")
	private String applyResultCode;

	/**
	 * 申请结果描述
	 */
	@ApiField("apply_result_message")
	private String applyResultMessage;

	/**
	 * 发送凭证的邮箱地址
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

	public String getApplyResultCode() {
		return this.applyResultCode;
	}
	public void setApplyResultCode(String applyResultCode) {
		this.applyResultCode = applyResultCode;
	}

	public String getApplyResultMessage() {
		return this.applyResultMessage;
	}
	public void setApplyResultMessage(String applyResultMessage) {
		this.applyResultMessage = applyResultMessage;
	}

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
