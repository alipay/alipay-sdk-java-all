package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收结易扩展字段
 *
 * @author auto create
 * @since 1.0, 2025-08-13 14:26:39
 */
public class UnifiedSettleExtendParams extends AlipayObject {

	private static final long serialVersionUID = 7589817613617781882L;

	/**
	 * 提现到银行卡备注
	 */
	@ApiField("bank_memo")
	private String bankMemo;

	/**
	 * 表示机构打款单号，一个 inst_serial_no 对应用户的一次打款。回传来账明细查询接口返回的 order_id 字段即可。
	 */
	@ApiField("inst_order_id")
	private String instOrderId;

	/**
	 * 备注 当前字段已废弃(不需要该参数了不需要该参数了)
	 */
	@ApiField("memo")
	@Deprecated
	private String memo;

	/**
	 * 原始订单金额，单位元
	 */
	@ApiField("original_order_amount")
	private String originalOrderAmount;

	/**
	 * 退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 直付通结算模式，账期，请款，自动，详情参考直付通接入文档
	 */
	@ApiField("settle_mode")
	private String settleMode;

	/**
	 * 用于指定收结易订单的附言，可用于对账
	 */
	@ApiField("trans_memo")
	private String transMemo;

	public String getBankMemo() {
		return this.bankMemo;
	}
	public void setBankMemo(String bankMemo) {
		this.bankMemo = bankMemo;
	}

	public String getInstOrderId() {
		return this.instOrderId;
	}
	public void setInstOrderId(String instOrderId) {
		this.instOrderId = instOrderId;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOriginalOrderAmount() {
		return this.originalOrderAmount;
	}
	public void setOriginalOrderAmount(String originalOrderAmount) {
		this.originalOrderAmount = originalOrderAmount;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getSettleMode() {
		return this.settleMode;
	}
	public void setSettleMode(String settleMode) {
		this.settleMode = settleMode;
	}

	public String getTransMemo() {
		return this.transMemo;
	}
	public void setTransMemo(String transMemo) {
		this.transMemo = transMemo;
	}

}
