package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票申请模型
 *
 * @author auto create
 * @since 1.0, 2020-09-15 15:06:30
 */
public class InvoiceApplyOpenModel extends AlipayObject {

	private static final long serialVersionUID = 3699112555821462621L;

	/**
	 * 复核人
	 */
	@ApiField("checker")
	private String checker;

	/**
	 * 操作员
	 */
	@ApiField("clerk")
	private String clerk;

	/**
	 * 不含税金额
	 */
	@ApiField("ex_tax_amount")
	private String exTaxAmount;

	/**
	 * 发票金额（加税合计）
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/**
	 * 发票内容项
	 */
	@ApiListField("invoice_content")
	@ApiField("invoice_item_apply_open_model")
	private List<InvoiceItemApplyOpenModel> invoiceContent;

	/**
	 * 发票类型：
增值税普通电子发票(PLAIN)
	 */
	@ApiField("invoice_kind")
	private String invoiceKind;

	/**
	 * 发票备注
	 */
	@ApiField("invoice_memo")
	private String invoiceMemo;

	/**
	 * 发票抬头
	 */
	@ApiField("invoice_title")
	private InvoiceTitleApplyOpenModel invoiceTitle;

	/**
	 * 仅用于红冲，对应红冲对应的原始蓝票的发票代码，红冲时该字段必填，开蓝票时该字段不需填
	 */
	@ApiField("ori_blue_inv_code")
	private String oriBlueInvCode;

	/**
	 * 仅用于红冲，对应红冲对应的原始蓝票的发票号码，红冲时该字段必填，开蓝票时该字段不需填
	 */
	@ApiField("ori_blue_inv_no")
	private String oriBlueInvNo;

	/**
	 * 发起方生成的开票申请唯一id，要求发起方全局唯一，支付宝依据其进行幂等控制。
	 */
	@ApiField("out_apply_id")
	private String outApplyId;

	/**
	 * 为外部系统提供的扩展信息透传字段，可在开票申请中传入，开票成功后从发票信息中取回。
格式：key1=value2|key2=value2
	 */
	@ApiField("out_extends")
	private String outExtends;

	/**
	 * 申请开票对应的商户交易流水号，该流水号必须保证在同商户范围内全局唯一。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 收款人
	 */
	@ApiField("payee")
	private String payee;

	/**
	 * 销售方地址
	 */
	@ApiField("payee_address")
	private String payeeAddress;

	/**
	 * 销售方开户账户
	 */
	@ApiField("payee_bank_account")
	private String payeeBankAccount;

	/**
	 * 销售方开户行
	 */
	@ApiField("payee_bank_name")
	private String payeeBankName;

	/**
	 * 销售方名称，对应于销售方纳税人识别号的名称
	 */
	@ApiField("payee_register_name")
	private String payeeRegisterName;

	/**
	 * 销售方纳税人识别号
	 */
	@ApiField("payee_register_no")
	private String payeeRegisterNo;

	/**
	 * 销售方电话
	 */
	@ApiField("payee_tel")
	private String payeeTel;

	/**
	 * 购买方联系方式-邮箱，商家开蓝票时，该字段必填，使用该邮箱向购买方发送发票pdf文件。其它情况均可不传
	 */
	@ApiField("payer_contact_email")
	private String payerContactEmail;

	/**
	 * 购买方联系方式，依据税控厂商的要求，如若底层税控对接的是浙江航信，该字段必传，其它情况可不传
	 */
	@ApiField("payer_contact_mobile")
	private String payerContactMobile;

	/**
	 * 合计税额
	 */
	@ApiField("sum_tax_amount")
	private String sumTaxAmount;

	/**
	 * 商户在税控服务开通后，税控厂商会向商户分配秘钥并提供token的生成方法，商户或ISV利用该方法生成token以获得此次调用的操作权限。目前对于阿里平台来说，不需要校验该权限，如果底层税控对接的是阿里平台的话，该字段可不填，其它的税控厂商该字段为必填
	 */
	@ApiField("tax_token")
	private String taxToken;

	/**
	 * 交易发生时间,依据税控厂商要求，目前底层税控对接的是浙江航信的话，该字段必填
	 */
	@ApiField("trade_date")
	private String tradeDate;

	public String getChecker() {
		return this.checker;
	}
	public void setChecker(String checker) {
		this.checker = checker;
	}

	public String getClerk() {
		return this.clerk;
	}
	public void setClerk(String clerk) {
		this.clerk = clerk;
	}

	public String getExTaxAmount() {
		return this.exTaxAmount;
	}
	public void setExTaxAmount(String exTaxAmount) {
		this.exTaxAmount = exTaxAmount;
	}

	public String getInvoiceAmount() {
		return this.invoiceAmount;
	}
	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public List<InvoiceItemApplyOpenModel> getInvoiceContent() {
		return this.invoiceContent;
	}
	public void setInvoiceContent(List<InvoiceItemApplyOpenModel> invoiceContent) {
		this.invoiceContent = invoiceContent;
	}

	public String getInvoiceKind() {
		return this.invoiceKind;
	}
	public void setInvoiceKind(String invoiceKind) {
		this.invoiceKind = invoiceKind;
	}

	public String getInvoiceMemo() {
		return this.invoiceMemo;
	}
	public void setInvoiceMemo(String invoiceMemo) {
		this.invoiceMemo = invoiceMemo;
	}

	public InvoiceTitleApplyOpenModel getInvoiceTitle() {
		return this.invoiceTitle;
	}
	public void setInvoiceTitle(InvoiceTitleApplyOpenModel invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
	}

	public String getOriBlueInvCode() {
		return this.oriBlueInvCode;
	}
	public void setOriBlueInvCode(String oriBlueInvCode) {
		this.oriBlueInvCode = oriBlueInvCode;
	}

	public String getOriBlueInvNo() {
		return this.oriBlueInvNo;
	}
	public void setOriBlueInvNo(String oriBlueInvNo) {
		this.oriBlueInvNo = oriBlueInvNo;
	}

	public String getOutApplyId() {
		return this.outApplyId;
	}
	public void setOutApplyId(String outApplyId) {
		this.outApplyId = outApplyId;
	}

	public String getOutExtends() {
		return this.outExtends;
	}
	public void setOutExtends(String outExtends) {
		this.outExtends = outExtends;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getPayee() {
		return this.payee;
	}
	public void setPayee(String payee) {
		this.payee = payee;
	}

	public String getPayeeAddress() {
		return this.payeeAddress;
	}
	public void setPayeeAddress(String payeeAddress) {
		this.payeeAddress = payeeAddress;
	}

	public String getPayeeBankAccount() {
		return this.payeeBankAccount;
	}
	public void setPayeeBankAccount(String payeeBankAccount) {
		this.payeeBankAccount = payeeBankAccount;
	}

	public String getPayeeBankName() {
		return this.payeeBankName;
	}
	public void setPayeeBankName(String payeeBankName) {
		this.payeeBankName = payeeBankName;
	}

	public String getPayeeRegisterName() {
		return this.payeeRegisterName;
	}
	public void setPayeeRegisterName(String payeeRegisterName) {
		this.payeeRegisterName = payeeRegisterName;
	}

	public String getPayeeRegisterNo() {
		return this.payeeRegisterNo;
	}
	public void setPayeeRegisterNo(String payeeRegisterNo) {
		this.payeeRegisterNo = payeeRegisterNo;
	}

	public String getPayeeTel() {
		return this.payeeTel;
	}
	public void setPayeeTel(String payeeTel) {
		this.payeeTel = payeeTel;
	}

	public String getPayerContactEmail() {
		return this.payerContactEmail;
	}
	public void setPayerContactEmail(String payerContactEmail) {
		this.payerContactEmail = payerContactEmail;
	}

	public String getPayerContactMobile() {
		return this.payerContactMobile;
	}
	public void setPayerContactMobile(String payerContactMobile) {
		this.payerContactMobile = payerContactMobile;
	}

	public String getSumTaxAmount() {
		return this.sumTaxAmount;
	}
	public void setSumTaxAmount(String sumTaxAmount) {
		this.sumTaxAmount = sumTaxAmount;
	}

	public String getTaxToken() {
		return this.taxToken;
	}
	public void setTaxToken(String taxToken) {
		this.taxToken = taxToken;
	}

	public String getTradeDate() {
		return this.tradeDate;
	}
	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}

}
