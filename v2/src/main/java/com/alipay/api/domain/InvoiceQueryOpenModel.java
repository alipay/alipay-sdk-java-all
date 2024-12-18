package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票查询输出模型
 *
 * @author auto create
 * @since 1.0, 2022-10-24 19:28:27
 */
public class InvoiceQueryOpenModel extends AlipayObject {

	private static final long serialVersionUID = 4218531758411348794L;

	/**
	 * 申请发起方，
描述开票申请的发起角色，由销售方（PAYEE）或购买方（PAYER）发起。
	 */
	@ApiField("apply_from")
	private String applyFrom;

	/**
	 * 校验码
	 */
	@ApiField("check_code")
	private String checkCode;

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
	 * 发票代码
	 */
	@ApiField("einv_code")
	private String einvCode;

	/**
	 * 发票号码
	 */
	@ApiField("einv_no")
	private String einvNo;

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
	 * 发票明细项
	 */
	@ApiListField("invoice_content")
	@ApiField("invoice_item_query_open_model")
	private List<InvoiceItemQueryOpenModel> invoiceContent;

	/**
	 * 发票日期
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 支付宝发票id，全局唯一
	 */
	@ApiField("invoice_id")
	private String invoiceId;

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
	 * 购买方发票抬头信息
	 */
	@ApiField("invoice_title")
	private InvoiceTitleQueryOpenModel invoiceTitle;

	/**
	 * 发票类型：蓝票/红票
BLUE（蓝票）/RED（红票）
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 定义商户的一级简称,用于标识商户品牌，对应于商户入驻时填写的"商户品牌简称"。
如：肯德基：KFC
	 */
	@ApiField("m_short_name")
	private String mShortName;

	/**
	 * 仅用于红冲，仅用于红冲，对应红冲对应的原始蓝票的发票号码
	 */
	@ApiField("ori_blue_inv_code")
	private String oriBlueInvCode;

	/**
	 * 仅用于红冲，仅用于红冲，对应红冲对应的原始蓝票的发票号码
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
	 * 发票文件预览图
	 */
	@ApiField("preview_image_url")
	private String previewImageUrl;

	/**
	 * 定义商户的二级简称,用于标识商户品牌下的分支机构，如门店，对应于商户入驻时填写的"商户门店简称"。
如：肯德基-杭州西湖区文一西路店：KFC-HZ-19003
要求："商户品牌简称+商户门店简称"作为确定商户及其下属机构的唯一标识，不可重复。
	 */
	@ApiField("sub_m_short_name")
	private String subMShortName;

	/**
	 * 合计税额
	 */
	@ApiField("sum_tax_amount")
	private String sumTaxAmount;

	/**
	 * 交易发生时间
	 */
	@ApiField("trade_date")
	private String tradeDate;

	/**
	 * 支付宝用户id，支付宝用户的唯一标识。
	 */
	@ApiField("user_id")
	private String userId;

	public String getApplyFrom() {
		return this.applyFrom;
	}
	public void setApplyFrom(String applyFrom) {
		this.applyFrom = applyFrom;
	}

	public String getCheckCode() {
		return this.checkCode;
	}
	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}

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

	public String getEinvCode() {
		return this.einvCode;
	}
	public void setEinvCode(String einvCode) {
		this.einvCode = einvCode;
	}

	public String getEinvNo() {
		return this.einvNo;
	}
	public void setEinvNo(String einvNo) {
		this.einvNo = einvNo;
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

	public List<InvoiceItemQueryOpenModel> getInvoiceContent() {
		return this.invoiceContent;
	}
	public void setInvoiceContent(List<InvoiceItemQueryOpenModel> invoiceContent) {
		this.invoiceContent = invoiceContent;
	}

	public String getInvoiceDate() {
		return this.invoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getInvoiceId() {
		return this.invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
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

	public InvoiceTitleQueryOpenModel getInvoiceTitle() {
		return this.invoiceTitle;
	}
	public void setInvoiceTitle(InvoiceTitleQueryOpenModel invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getmShortName() {
		return this.mShortName;
	}
	public void setmShortName(String mShortName) {
		this.mShortName = mShortName;
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

	public String getPreviewImageUrl() {
		return this.previewImageUrl;
	}
	public void setPreviewImageUrl(String previewImageUrl) {
		this.previewImageUrl = previewImageUrl;
	}

	public String getSubMShortName() {
		return this.subMShortName;
	}
	public void setSubMShortName(String subMShortName) {
		this.subMShortName = subMShortName;
	}

	public String getSumTaxAmount() {
		return this.sumTaxAmount;
	}
	public void setSumTaxAmount(String sumTaxAmount) {
		this.sumTaxAmount = sumTaxAmount;
	}

	public String getTradeDate() {
		return this.tradeDate;
	}
	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
