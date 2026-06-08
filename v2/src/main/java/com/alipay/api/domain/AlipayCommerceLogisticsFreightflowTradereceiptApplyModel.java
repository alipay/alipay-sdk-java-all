package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 货运企业支付单笔交易凭证下载申请
 *
 * @author auto create
 * @since 1.0, 2026-05-12 10:05:22
 */
public class AlipayCommerceLogisticsFreightflowTradereceiptApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3439898598248313657L;

	/**
	 * 账户编号
当mode为MY_BANK时按照账户类型填写;
当mode为SPDB时填写监管账户.
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 当mode为MY_BANK时必填：
结算户:SETTLE_ACCOUNT
子户:SUB_ACCOUNT
收款外标:PAYEE_CARD_NO

当mode为SPDB时不填
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 物流公司编码
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 银行管理模式。
本期：
ANT_MYBANK(网商银行模式)
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 网商银行应用id,当mode为ANT_MYBANK时由网商提供给商户
	 */
	@ApiField("mybank_app_id")
	private String mybankAppId;

	/**
	 * 外部订单请求流水号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 如果mode为网商银行，则为网商银行分配
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 当mode为MY_BANK时必填
申请交易凭证类型
单笔交易凭证：
STANDARD_TRADE_RECEIPT
当mode为SPDB时不需要填
	 */
	@ApiField("receipt_type")
	private String receiptType;

	/**
	 * 浦发银行特定场景参数
	 */
	@ApiField("spdb_spec_params")
	private FreightFlowSpdbSpecParams spdbSpecParams;

	/**
	 * 交易单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 当mode为MY_BANK时：
授权代付:ENTRUST_AUTH_PAY
授权划转:ENTRUST_ALLOCATE
转账:TRANSFER
充值收款/退款/退汇:SETTLE_ACCOUNT_RECEIPT
收银支付:CASHIER_PAY
调拨：ALLOCATE

当mode为SPDB时：
05-入金单笔回单
06-出金单笔回单
07-子账户互转单笔回单
	 */
	@ApiField("trade_type")
	private String tradeType;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getMode() {
		return this.mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getMybankAppId() {
		return this.mybankAppId;
	}
	public void setMybankAppId(String mybankAppId) {
		this.mybankAppId = mybankAppId;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getReceiptType() {
		return this.receiptType;
	}
	public void setReceiptType(String receiptType) {
		this.receiptType = receiptType;
	}

	public FreightFlowSpdbSpecParams getSpdbSpecParams() {
		return this.spdbSpecParams;
	}
	public void setSpdbSpecParams(FreightFlowSpdbSpecParams spdbSpecParams) {
		this.spdbSpecParams = spdbSpecParams;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

}
