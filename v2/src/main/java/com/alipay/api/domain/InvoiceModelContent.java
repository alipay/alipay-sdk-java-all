package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票详情模型
 *
 * @author auto create
 * @since 1.0, 2023-02-20 16:02:46
 */
public class InvoiceModelContent extends AlipayObject {

	private static final long serialVersionUID = 6681959253267833857L;

	/**
	 * 支付宝端的申请id。如果在开票过程中，是通过支付宝提交的申请到机构端，支付宝会带上开票申请在支付宝生成的申请id，机构在回传发票的时候只需要回传这个申请id，不用获取用户的uid，支付宝可以根据申请id将发票归集到对应的用户名下
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * key=value，每组键值对以回车分割
	 */
	@ApiField("extend_fields")
	private String extendFields;

	/**
	 * 下载的发票文件类型，可选值：
pdf（发票原文件）
ofd（发票原文件）
jpg（发票原文件缩略图）
	 */
	@ApiField("file_download_type")
	private String fileDownloadType;

	/**
	 * 发票原文件下载地址
1.当tax_type=PLAIN、ALL_ELECTRONIC_GENERAL或ALL_ELECTRONIC_SPECIAL时，
file_download_url必传
且file_download_type取值范围为pdf或ofd；
2.当tax_type=SPECIAL时，
file_download_url必传
file_download_type可以传入pdf，ofd，jpg
3.当其他票种时，file_download_url可以不传
	 */
	@ApiField("file_download_url")
	private String fileDownloadUrl;

	/**
	 * 财政电子票据子类型，当tax_type=FINANCIAL_ELECTRONIC_BILL时要求必填
可选值如下：
01:非税收入通用票据 
02:非税收入专用票据
03:非税收入一般缴款书
04:资金往来结算票据
05:公益事业捐赠票据
06:医疗收费票据
07:社会团体会费票据
08:社会保险基金票据
09:工会经费收入票据
99:其他财政票据
	 */
	@ApiField("financial_electronic_type")
	private String financialElectronicType;

	/**
	 * 发票金额，大于0且精确到小数点两位，以元为单位
需要传入税价合计金额
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/**
	 * 发票代码，为国税局生成的唯一值，全电票时为空，其他情况不可为空
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 发票内容项
	 */
	@ApiListField("invoice_content")
	@ApiField("invoice_item_content")
	private List<InvoiceItemContent> invoiceContent;

	/**
	 * 发票日期，用户填写，目前精确到日
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 发票防伪码
	 */
	@ApiField("invoice_fake_code")
	private String invoiceFakeCode;

	/**
	 * 原始发票PDF/OFD文件流
	 */
	@ApiField("invoice_file_data")
	private String invoiceFileData;

	/**
	 * 发票原始文件jpg文件地址
	 */
	@ApiField("invoice_img_url")
	private String invoiceImgUrl;

	/**
	 * 发票号码，国税局生成的唯一号码，不可为空串；
使用时请注意，invoice_no+invoice_code唯一，不能重复
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 发票开具操作人
	 */
	@ApiField("invoice_operator")
	private String invoiceOperator;

	/**
	 * 发票title
	 */
	@ApiField("invoice_title")
	private InvoiceTitleModel invoiceTitle;

	/**
	 * 发票类型，按照可选值只传入英文部分，该字段严格要求大小写
可选值:
blue（蓝票）
red（红票）
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 支付宝用户id，支付宝端的申请id存在的时候也不需要传，其他情况下，当同步的是蓝票时，必传，红票时不需传。
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 仅用于同步红票，原始蓝票发票代码，同步红票时必传（全电票时为空）
	 */
	@ApiField("original_blue_invoice_code")
	private String originalBlueInvoiceCode;

	/**
	 * 仅用于同步红票，原始蓝票发票号码，同步红票时必传
	 */
	@ApiField("original_blue_invoice_no")
	private String originalBlueInvoiceNo;

	/**
	 * 商户交易流水号，不可为空串;
传入红票时请注意，此字段的值要和蓝票保持一致
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商户唯一开票申请业务流水号，同一个isv下不能重复
	 */
	@ApiField("out_invoice_id")
	private String outInvoiceId;

	/**
	 * 开票单位地址
	 */
	@ApiField("register_address")
	private String registerAddress;

	/**
	 * 开票单位开户行账号
	 */
	@ApiField("register_bank_account")
	private String registerBankAccount;

	/**
	 * 开票单位开户行名称
	 */
	@ApiField("register_bank_name")
	private String registerBankName;

	/**
	 * 开票单位
	 */
	@ApiField("register_name")
	private String registerName;

	/**
	 * 纳税人识别号，不可为空串
	 */
	@ApiField("register_no")
	private String registerNo;

	/**
	 * 开票人电话，支持座机和手机两种格式
	 */
	@ApiField("register_phone_no")
	private String registerPhoneNo;

	/**
	 * 价税合计
	 */
	@ApiField("sum_amount")
	private String sumAmount;

	/**
	 * 税额
	 */
	@ApiField("tax_amount")
	private String taxAmount;

	/**
	 * 税种
可选值：
PLAIN：增值税电子普通发票
ALL_ELECTRONIC_GENERAL：电子发票（普通发票）
ALL_ELECTRONIC_SPECIAL：电子发票（增值税专用发票）
SPECIAL：增值税专用发票
PLAIN_INVOICE:增值税普通发票
FINANCIAL_ELECTRONIC_BILL:财政电子票据
	 */
	@ApiField("tax_type")
	private String taxType;

	/**
	 * 支付宝用户id，支付宝端的申请id存在的时候也不需要传，其他情况下，当同步的是蓝票时，必传，红票时不需传。
	 */
	@ApiField("user_id")
	private String userId;

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getExtendFields() {
		return this.extendFields;
	}
	public void setExtendFields(String extendFields) {
		this.extendFields = extendFields;
	}

	public String getFileDownloadType() {
		return this.fileDownloadType;
	}
	public void setFileDownloadType(String fileDownloadType) {
		this.fileDownloadType = fileDownloadType;
	}

	public String getFileDownloadUrl() {
		return this.fileDownloadUrl;
	}
	public void setFileDownloadUrl(String fileDownloadUrl) {
		this.fileDownloadUrl = fileDownloadUrl;
	}

	public String getFinancialElectronicType() {
		return this.financialElectronicType;
	}
	public void setFinancialElectronicType(String financialElectronicType) {
		this.financialElectronicType = financialElectronicType;
	}

	public String getInvoiceAmount() {
		return this.invoiceAmount;
	}
	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getInvoiceCode() {
		return this.invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public List<InvoiceItemContent> getInvoiceContent() {
		return this.invoiceContent;
	}
	public void setInvoiceContent(List<InvoiceItemContent> invoiceContent) {
		this.invoiceContent = invoiceContent;
	}

	public String getInvoiceDate() {
		return this.invoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getInvoiceFakeCode() {
		return this.invoiceFakeCode;
	}
	public void setInvoiceFakeCode(String invoiceFakeCode) {
		this.invoiceFakeCode = invoiceFakeCode;
	}

	public String getInvoiceFileData() {
		return this.invoiceFileData;
	}
	public void setInvoiceFileData(String invoiceFileData) {
		this.invoiceFileData = invoiceFileData;
	}

	public String getInvoiceImgUrl() {
		return this.invoiceImgUrl;
	}
	public void setInvoiceImgUrl(String invoiceImgUrl) {
		this.invoiceImgUrl = invoiceImgUrl;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getInvoiceOperator() {
		return this.invoiceOperator;
	}
	public void setInvoiceOperator(String invoiceOperator) {
		this.invoiceOperator = invoiceOperator;
	}

	public InvoiceTitleModel getInvoiceTitle() {
		return this.invoiceTitle;
	}
	public void setInvoiceTitle(InvoiceTitleModel invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOriginalBlueInvoiceCode() {
		return this.originalBlueInvoiceCode;
	}
	public void setOriginalBlueInvoiceCode(String originalBlueInvoiceCode) {
		this.originalBlueInvoiceCode = originalBlueInvoiceCode;
	}

	public String getOriginalBlueInvoiceNo() {
		return this.originalBlueInvoiceNo;
	}
	public void setOriginalBlueInvoiceNo(String originalBlueInvoiceNo) {
		this.originalBlueInvoiceNo = originalBlueInvoiceNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutInvoiceId() {
		return this.outInvoiceId;
	}
	public void setOutInvoiceId(String outInvoiceId) {
		this.outInvoiceId = outInvoiceId;
	}

	public String getRegisterAddress() {
		return this.registerAddress;
	}
	public void setRegisterAddress(String registerAddress) {
		this.registerAddress = registerAddress;
	}

	public String getRegisterBankAccount() {
		return this.registerBankAccount;
	}
	public void setRegisterBankAccount(String registerBankAccount) {
		this.registerBankAccount = registerBankAccount;
	}

	public String getRegisterBankName() {
		return this.registerBankName;
	}
	public void setRegisterBankName(String registerBankName) {
		this.registerBankName = registerBankName;
	}

	public String getRegisterName() {
		return this.registerName;
	}
	public void setRegisterName(String registerName) {
		this.registerName = registerName;
	}

	public String getRegisterNo() {
		return this.registerNo;
	}
	public void setRegisterNo(String registerNo) {
		this.registerNo = registerNo;
	}

	public String getRegisterPhoneNo() {
		return this.registerPhoneNo;
	}
	public void setRegisterPhoneNo(String registerPhoneNo) {
		this.registerPhoneNo = registerPhoneNo;
	}

	public String getSumAmount() {
		return this.sumAmount;
	}
	public void setSumAmount(String sumAmount) {
		this.sumAmount = sumAmount;
	}

	public String getTaxAmount() {
		return this.taxAmount;
	}
	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}

	public String getTaxType() {
		return this.taxType;
	}
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
