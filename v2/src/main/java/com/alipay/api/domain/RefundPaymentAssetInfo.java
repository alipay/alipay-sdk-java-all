package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收款资产明细
 *
 * @author auto create
 * @since 1.0, 2023-03-07 10:26:38
 */
public class RefundPaymentAssetInfo extends AlipayObject {

	private static final long serialVersionUID = 6225272627816296589L;

	/**
	 * 银行卡结构id
	 */
	@ApiField("bank_inst_id")
	private String bankInstId;

	/**
	 * 原充值单号
	 */
	@ApiField("origin_order_id")
	private String originOrderId;

	/**
	 * 收款资产类型
	 */
	@ApiField("receiver_asset_code")
	private String receiverAssetCode;

	/**
	 * 收款资产账号
	 */
	@ApiField("receiver_asset_no")
	private String receiverAssetNo;

	/**
	 * 登录账号
	 */
	@ApiField("receiver_logon_id")
	private String receiverLogonId;

	/**
	 * 单据退款金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	public String getBankInstId() {
		return this.bankInstId;
	}
	public void setBankInstId(String bankInstId) {
		this.bankInstId = bankInstId;
	}

	public String getOriginOrderId() {
		return this.originOrderId;
	}
	public void setOriginOrderId(String originOrderId) {
		this.originOrderId = originOrderId;
	}

	public String getReceiverAssetCode() {
		return this.receiverAssetCode;
	}
	public void setReceiverAssetCode(String receiverAssetCode) {
		this.receiverAssetCode = receiverAssetCode;
	}

	public String getReceiverAssetNo() {
		return this.receiverAssetNo;
	}
	public void setReceiverAssetNo(String receiverAssetNo) {
		this.receiverAssetNo = receiverAssetNo;
	}

	public String getReceiverLogonId() {
		return this.receiverLogonId;
	}
	public void setReceiverLogonId(String receiverLogonId) {
		this.receiverLogonId = receiverLogonId;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

}
