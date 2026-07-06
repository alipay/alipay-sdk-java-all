package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量代发查询接口
 *
 * @author auto create
 * @since 1.0, 2026-05-14 10:17:45
 */
public class MybankEcnyFundBatchtransferQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2644593852438438314L;

	/**
	 * 网商银行订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 由双方约定分配值
	 */
	@ApiField("out_request_from")
	private String outRequestFrom;

	/**
	 * 仅支持字母、数字，作为幂等字段，需保证在调用方内部不重复
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 数字人民币钱包编号
	 */
	@ApiField("payer_wallet_id")
	private String payerWalletId;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutRequestFrom() {
		return this.outRequestFrom;
	}
	public void setOutRequestFrom(String outRequestFrom) {
		this.outRequestFrom = outRequestFrom;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getPayerWalletId() {
		return this.payerWalletId;
	}
	public void setPayerWalletId(String payerWalletId) {
		this.payerWalletId = payerWalletId;
	}

}
