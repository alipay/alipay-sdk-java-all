package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易请求
 *
 * @author auto create
 * @since 1.0, 2021-07-28 12:10:29
 */
public class TransactionRequest extends AlipayObject {

	private static final long serialVersionUID = 2384496395492586183L;

	/**
	 * 业务透传字段
	 */
	@ApiField("biz_extend_info")
	private String bizExtendInfo;

	/**
	 * 下游唯一单号
	 */
	@ApiField("ref_transfer_id")
	private String refTransferId;

	/**
	 * 结算金额
	 */
	@ApiField("settle_amount")
	private TransferAmount settleAmount;

	public String getBizExtendInfo() {
		return this.bizExtendInfo;
	}
	public void setBizExtendInfo(String bizExtendInfo) {
		this.bizExtendInfo = bizExtendInfo;
	}

	public String getRefTransferId() {
		return this.refTransferId;
	}
	public void setRefTransferId(String refTransferId) {
		this.refTransferId = refTransferId;
	}

	public TransferAmount getSettleAmount() {
		return this.settleAmount;
	}
	public void setSettleAmount(TransferAmount settleAmount) {
		this.settleAmount = settleAmount;
	}

}
