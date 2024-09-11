package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账务明细
 *
 * @author auto create
 * @since 1.0, 2022-04-24 16:37:20
 */
public class AccountLogItemResult extends AlipayObject {

	private static final long serialVersionUID = 3729688596644862742L;

	/**
	 * 支付宝账务流水号。对账使用，不脱敏
	 */
	@ApiField("account_log_id")
	private String accountLogId;

	/**
	 * 支付宝订单号。对账使用，不脱敏
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/**
	 * 余额，仅供参考。由于架构原因，余额变动并不保证连续。也就是余额不一定等于上一笔余额减去当笔金额。但是会保证最终一致。
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 业务账单来源，资金收支对应的上游业务订单数据来源，确认业务订单出处。此字段供商户对账使用，不脱敏。
	 */
	@ApiField("bill_source")
	private String billSource;

	/**
	 * 业务描述，资金收支对应的详细业务场景信息。此字段供商户对账使用，不脱敏。
	 */
	@ApiField("biz_desc")
	private String bizDesc;

	/**
	 * 业务订单号，资金收支相关的业务场景订单号明细，字母大写；M：平台交易主单号，S：平台交易子单号，O：业务系统单据号（如退款订单号）。此字段供商户对账使用，不脱敏。
	 */
	@ApiField("biz_nos")
	private String bizNos;

	/**
	 * 业务基础订单号，资金收支对应的原始业务订单唯一识别编号。此字段供商户对账使用，不脱敏。
	 */
	@ApiField("biz_orig_no")
	private String bizOrigNo;

	/**
	 * 账单的补全信息，用于特殊场景，普通商户不需要传值，对账时可忽略。
	 */
	@ApiField("complement_info")
	private String complementInfo;

	/**
	 * 收入/支出。表示收支。amount是正数，返回“收入”。amount是负数，返回“支出”
	 */
	@ApiField("direction")
	private String direction;

	/**
	 * 商户订单号，创建支付宝交易时传入的信息。对账使用，不脱敏
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 支付宝交易商户退款请求号。对应商户在调用收单退款接口openApi请求传入的outRequestNo参数值
	 */
	@ApiField("merchant_out_refund_no")
	private String merchantOutRefundNo;

	/**
	 * 对方账户
	 */
	@ApiField("other_account")
	private String otherAccount;

	/**
	 * 门店信息
	 */
	@ApiField("store_name")
	private String storeName;

	/**
	 * 金额
	 */
	@ApiField("trans_amount")
	private String transAmount;

	/**
	 * 入账时间
	 */
	@ApiField("trans_dt")
	private String transDt;

	/**
	 * 账务备注。由上游业务决定，不可依赖此字段进行对账
	 */
	@ApiField("trans_memo")
	private String transMemo;

	/**
	 * 账务记录的类型，仅供参考
	 */
	@ApiField("type")
	private String type;

	public String getAccountLogId() {
		return this.accountLogId;
	}
	public void setAccountLogId(String accountLogId) {
		this.accountLogId = accountLogId;
	}

	public String getAlipayOrderNo() {
		return this.alipayOrderNo;
	}
	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}

	public String getBalance() {
		return this.balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getBillSource() {
		return this.billSource;
	}
	public void setBillSource(String billSource) {
		this.billSource = billSource;
	}

	public String getBizDesc() {
		return this.bizDesc;
	}
	public void setBizDesc(String bizDesc) {
		this.bizDesc = bizDesc;
	}

	public String getBizNos() {
		return this.bizNos;
	}
	public void setBizNos(String bizNos) {
		this.bizNos = bizNos;
	}

	public String getBizOrigNo() {
		return this.bizOrigNo;
	}
	public void setBizOrigNo(String bizOrigNo) {
		this.bizOrigNo = bizOrigNo;
	}

	public String getComplementInfo() {
		return this.complementInfo;
	}
	public void setComplementInfo(String complementInfo) {
		this.complementInfo = complementInfo;
	}

	public String getDirection() {
		return this.direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getMerchantOutRefundNo() {
		return this.merchantOutRefundNo;
	}
	public void setMerchantOutRefundNo(String merchantOutRefundNo) {
		this.merchantOutRefundNo = merchantOutRefundNo;
	}

	public String getOtherAccount() {
		return this.otherAccount;
	}
	public void setOtherAccount(String otherAccount) {
		this.otherAccount = otherAccount;
	}

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getTransAmount() {
		return this.transAmount;
	}
	public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}

	public String getTransDt() {
		return this.transDt;
	}
	public void setTransDt(String transDt) {
		this.transDt = transDt;
	}

	public String getTransMemo() {
		return this.transMemo;
	}
	public void setTransMemo(String transMemo) {
		this.transMemo = transMemo;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
