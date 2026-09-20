package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字人民币查询回款结果
 *
 * @author auto create
 * @since 1.0, 2026-09-18 11:32:56
 */
public class MybankEcnyFundRepaymentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6166992941692196653L;

	/**
	 * 调用方编码
	 */
	@ApiField("out_request_from")
	private String outRequestFrom;

	/**
	 * 外部平台全局唯一流水号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 预付回款业务的回款方钱包，对应专户发薪收款钱包
	 */
	@ApiField("payer_wallet_id")
	private String payerWalletId;

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
