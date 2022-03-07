package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 二维码创建
 *
 * @author auto create
 * @since 1.0, 2021-09-27 10:07:44
 */
public class MybankPaymentTradeQrcodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8863524768376657258L;

	/**
	 * 账户分类
对私 private；对公 public
	 */
	@ApiField("account_category")
	private String accountCategory;

	/**
	 * 账户类型
外部卡：OUT_BANK，云资金账号：CLOUND_ACCOUNT

网商银行卡：

MYBANK
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 订单金额
动态码场景必填，金额分
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 收款银行名称
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 业务订单单号	
动态码场景必填
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 开户行的联行号
	 */
	@ApiField("branch_inst_code")
	private String branchInstCode;

	/**
	 * 支行名称
	 */
	@ApiField("branch_name")
	private String branchName;

	/**
	 * 渠道
开放平台openPlatform
金蝉平台 jinChan
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 币种
默认是CNY，动态码场景选填
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 企业方案合约号
	 */
	@ApiField("enterprise_scheme_ar_no")
	private String enterpriseSchemeArNo;

	/**
	 * 总行联行号
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 失效时间	
yyyy-MM-dd HH:mm:ss格式的
	 */
	@ApiField("invalid_date")
	private String invalidDate;

	/**
	 * 订单扩展字段
JSON格式，UTF-8编码
	 */
	@ApiField("order_ext")
	private String orderExt;

	/**
	 * 个人方案合约号
	 */
	@ApiField("personal_scheme_ar_no")
	private String personalSchemeArNo;

	/**
	 * 二维码类型
DYNAMIC_CODE
STATIC_COD
	 */
	@ApiField("qr_code_type")
	private String qrCodeType;

	/**
	 * 收款银行账户的名称
	 */
	@ApiField("receipt_account_name")
	private String receiptAccountName;

	/**
	 * 收款银行卡号
	 */
	@ApiField("receipt_account_no")
	private String receiptAccountNo;

	public String getAccountCategory() {
		return this.accountCategory;
	}
	public void setAccountCategory(String accountCategory) {
		this.accountCategory = accountCategory;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBankName() {
		return this.bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getBranchInstCode() {
		return this.branchInstCode;
	}
	public void setBranchInstCode(String branchInstCode) {
		this.branchInstCode = branchInstCode;
	}

	public String getBranchName() {
		return this.branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getEnterpriseSchemeArNo() {
		return this.enterpriseSchemeArNo;
	}
	public void setEnterpriseSchemeArNo(String enterpriseSchemeArNo) {
		this.enterpriseSchemeArNo = enterpriseSchemeArNo;
	}

	public String getInstCode() {
		return this.instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}

	public String getInvalidDate() {
		return this.invalidDate;
	}
	public void setInvalidDate(String invalidDate) {
		this.invalidDate = invalidDate;
	}

	public String getOrderExt() {
		return this.orderExt;
	}
	public void setOrderExt(String orderExt) {
		this.orderExt = orderExt;
	}

	public String getPersonalSchemeArNo() {
		return this.personalSchemeArNo;
	}
	public void setPersonalSchemeArNo(String personalSchemeArNo) {
		this.personalSchemeArNo = personalSchemeArNo;
	}

	public String getQrCodeType() {
		return this.qrCodeType;
	}
	public void setQrCodeType(String qrCodeType) {
		this.qrCodeType = qrCodeType;
	}

	public String getReceiptAccountName() {
		return this.receiptAccountName;
	}
	public void setReceiptAccountName(String receiptAccountName) {
		this.receiptAccountName = receiptAccountName;
	}

	public String getReceiptAccountNo() {
		return this.receiptAccountNo;
	}
	public void setReceiptAccountNo(String receiptAccountNo) {
		this.receiptAccountNo = receiptAccountNo;
	}

}
