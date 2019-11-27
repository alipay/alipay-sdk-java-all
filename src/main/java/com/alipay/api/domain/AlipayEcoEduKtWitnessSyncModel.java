package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 教育缴费与网商见证平台信息同步接口
 *
 * @author auto create
 * @since 1.0, 2017-08-08 10:05:29
 */
public class AlipayEcoEduKtWitnessSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3489678914115528683L;

	/**
	 * 预留字段，可不填
	 */
	@ApiField("account_identity")
	private String accountIdentity;

	/**
	 * 充值账户类型
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 充值金额 (可空,支付方式不 为空时，不能为空)
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 手续费信息，json 格式{"sellerFee":"0.5","bu yerFee":"0.3"}
说明: 如果只收买家手续费则卖 家不填，如: {"buyerFee":"0.3"}
sellerFee:卖家手续费 buyerFee:买家手续费 {"sellerFee":"0.5","bu yerFee":"0.3"}
说明: sellerFee:卖家手续费 buyerFee:买家手续费
	 */
	@ApiField("fee_info")
	private String feeInfo;

	/**
	 * 预留字段，可不填
	 */
	@ApiField("go_cashier")
	private String goCashier;

	/**
	 * 用户在业务平台下单的时候的 ip 地址，公 网 IP，不是内网 IP
用于风控校验
	 */
	@ApiField("ip")
	private String ip;

	/**
	 * 预留字段，可不填
	 */
	@ApiField("is_web_access")
	private String isWebAccess;

	/**
	 * 预留字段，可不填
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 合作方业务平台订单号
	 */
	@ApiField("outer_trade_no")
	private String outerTradeNo;

	/**
	 * 支付方支付方式，如果不设置，默认识别为余额 支付式，如果不设置，默认识别为余额 支付
	 */
	@ApiField("pay_method")
	private String payMethod;

	/**
	 * 预留字段，可不填
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 合作方业务平台用户 ID(UID)
	 */
	@ApiField("uid")
	private String uid;

	/**
	 * 异步回调地址
	 */
	@ApiField("witness_notify_url")
	private String witnessNotifyUrl;

	public String getAccountIdentity() {
		return this.accountIdentity;
	}
	public void setAccountIdentity(String accountIdentity) {
		this.accountIdentity = accountIdentity;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getFeeInfo() {
		return this.feeInfo;
	}
	public void setFeeInfo(String feeInfo) {
		this.feeInfo = feeInfo;
	}

	public String getGoCashier() {
		return this.goCashier;
	}
	public void setGoCashier(String goCashier) {
		this.goCashier = goCashier;
	}

	public String getIp() {
		return this.ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getIsWebAccess() {
		return this.isWebAccess;
	}
	public void setIsWebAccess(String isWebAccess) {
		this.isWebAccess = isWebAccess;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOuterTradeNo() {
		return this.outerTradeNo;
	}
	public void setOuterTradeNo(String outerTradeNo) {
		this.outerTradeNo = outerTradeNo;
	}

	public String getPayMethod() {
		return this.payMethod;
	}
	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getWitnessNotifyUrl() {
		return this.witnessNotifyUrl;
	}
	public void setWitnessNotifyUrl(String witnessNotifyUrl) {
		this.witnessNotifyUrl = witnessNotifyUrl;
	}

}
