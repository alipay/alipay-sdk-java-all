package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户创建开票申请接口
 *
 * @author auto create
 * @since 1.0, 2020-07-10 21:12:55
 */
public class AlipayEbppInvoiceOpenRedCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3838559147935412664L;

	/**
	 * 用户申请开具的蓝票冲红时必须提供，用于交付用户发票，来自用户开票通知
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 是否自动填充开票信息；
当为invoice_type=red且auto_fill_info=true时：
购买方信息(payer_)，
销方信息（payee_),
发票明细项，发票金额将以发票平台原始蓝票为准开出红票；
为空或者为非true时，则按本接口请求参数为准
	 */
	@ApiField("auto_fill_info")
	private Boolean autoFillInfo;

	/**
	 * 是否需要预处理发票，当为true时发票即根据发票明细项invoice_item进行计算加税合计金额
	 */
	@ApiField("auto_preprocess")
	private Boolean autoPreprocess;

	/**
	 * 合计含税金额（开票金额），格式为2位小数，单位元；
当开红票时，该字段为负数。
invoice_type=blue时必须填写
invoice_type=red 并且 auto_fill_info=false时必填
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/**
	 * 电子发票明细
当invoice_type=red且auto_fill_info=true时可不填，其他情况必须要填写
	 */
	@ApiListField("invoice_items")
	@ApiField("general_invoice_item")
	private List<GeneralInvoiceItem> invoiceItems;

	/**
	 * 税控产品发票类型
可选值：
0: 电票
1：纸质普票
2：纸质专票
	 */
	@ApiField("invoice_kind")
	private Long invoiceKind;

	/**
	 * 开票备注信息，
若invoice_type=red 并且 auto_fill_info=false时，此处填写原始蓝票代码+原始蓝票号码
	 */
	@ApiField("invoice_memo")
	private String invoiceMemo;

	/**
	 * 发票(开票)类型，
可选值：蓝票blue,
红票red
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 原发票代码(冲红时必须)
	 */
	@ApiField("normal_invoice_code")
	private String normalInvoiceCode;

	/**
	 * 原发票号码(冲红时必须)
	 */
	@ApiField("normal_invoice_no")
	private String normalInvoiceNo;

	/**
	 * 开票申请id
	 */
	@ApiField("outer_id")
	private String outerId;

	/**
	 * 销方地址
销方电话加地址不超出100字符
auto_fill_info=false时必填
	 */
	@ApiField("payee_address")
	private String payeeAddress;

	/**
	 * 销售方银行账户id
	 */
	@ApiField("payee_bank_account_id")
	private String payeeBankAccountId;

	/**
	 * 销售方银行账户开户行名称
开户行账号加名称不超出100字符
	 */
	@ApiField("payee_bank_name")
	private String payeeBankName;

	/**
	 * 复核人
	 */
	@ApiField("payee_checker")
	private String payeeChecker;

	/**
	 * 销方名称，公司名(如:XX商城)
	 */
	@ApiField("payee_name")
	private String payeeName;

	/**
	 * 开票人
auto_fill_info=false时必填
	 */
	@ApiField("payee_operator")
	private String payeeOperator;

	/**
	 * 销售方电话
	 */
	@ApiField("payee_phone")
	private String payeePhone;

	/**
	 * 收款人
	 */
	@ApiField("payee_receiver")
	private String payeeReceiver;

	/**
	 * 销方税务登记证号，auto_fill_info=false时必填
	 */
	@ApiField("payee_register_no")
	private String payeeRegisterNo;

	/**
	 * 购买方地址
	 */
	@ApiField("payer_address")
	private String payerAddress;

	/**
	 * 购买方银行账户
	 */
	@ApiField("payer_bank_account_id")
	private String payerBankAccountId;

	/**
	 * 购方开户行名称，开户行账号加名称不超出100字符
	 */
	@ApiField("payer_bank_name")
	private String payerBankName;

	/**
	 * 购买方名称
	 */
	@ApiField("payer_name")
	private String payerName;

	/**
	 * 购买方电话
	 */
	@ApiField("payer_phone")
	private String payerPhone;

	/**
	 * 购方方税务登记证号。
开企业抬头时必填。
	 */
	@ApiField("payer_register_no")
	private String payerRegisterNo;

	/**
	 * 业务平台编码，由发票平台分配
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 商户在业务平台的唯一标志
	 */
	@ApiField("platform_user_id")
	private String platformUserId;

	/**
	 * 税控产品Code，由中台定义的产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 合计金额，格式为2位小数，单位元。
当开红票时，该字段为负数
	 */
	@ApiField("sum_price")
	private String sumPrice;

	/**
	 * 合计税额，格式为2位小数。
当开红票时，该字段为负数
	 */
	@ApiField("sum_tax")
	private String sumTax;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public Boolean getAutoFillInfo() {
		return this.autoFillInfo;
	}
	public void setAutoFillInfo(Boolean autoFillInfo) {
		this.autoFillInfo = autoFillInfo;
	}

	public Boolean getAutoPreprocess() {
		return this.autoPreprocess;
	}
	public void setAutoPreprocess(Boolean autoPreprocess) {
		this.autoPreprocess = autoPreprocess;
	}

	public String getInvoiceAmount() {
		return this.invoiceAmount;
	}
	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public List<GeneralInvoiceItem> getInvoiceItems() {
		return this.invoiceItems;
	}
	public void setInvoiceItems(List<GeneralInvoiceItem> invoiceItems) {
		this.invoiceItems = invoiceItems;
	}

	public Long getInvoiceKind() {
		return this.invoiceKind;
	}
	public void setInvoiceKind(Long invoiceKind) {
		this.invoiceKind = invoiceKind;
	}

	public String getInvoiceMemo() {
		return this.invoiceMemo;
	}
	public void setInvoiceMemo(String invoiceMemo) {
		this.invoiceMemo = invoiceMemo;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getNormalInvoiceCode() {
		return this.normalInvoiceCode;
	}
	public void setNormalInvoiceCode(String normalInvoiceCode) {
		this.normalInvoiceCode = normalInvoiceCode;
	}

	public String getNormalInvoiceNo() {
		return this.normalInvoiceNo;
	}
	public void setNormalInvoiceNo(String normalInvoiceNo) {
		this.normalInvoiceNo = normalInvoiceNo;
	}

	public String getOuterId() {
		return this.outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getPayeeAddress() {
		return this.payeeAddress;
	}
	public void setPayeeAddress(String payeeAddress) {
		this.payeeAddress = payeeAddress;
	}

	public String getPayeeBankAccountId() {
		return this.payeeBankAccountId;
	}
	public void setPayeeBankAccountId(String payeeBankAccountId) {
		this.payeeBankAccountId = payeeBankAccountId;
	}

	public String getPayeeBankName() {
		return this.payeeBankName;
	}
	public void setPayeeBankName(String payeeBankName) {
		this.payeeBankName = payeeBankName;
	}

	public String getPayeeChecker() {
		return this.payeeChecker;
	}
	public void setPayeeChecker(String payeeChecker) {
		this.payeeChecker = payeeChecker;
	}

	public String getPayeeName() {
		return this.payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public String getPayeeOperator() {
		return this.payeeOperator;
	}
	public void setPayeeOperator(String payeeOperator) {
		this.payeeOperator = payeeOperator;
	}

	public String getPayeePhone() {
		return this.payeePhone;
	}
	public void setPayeePhone(String payeePhone) {
		this.payeePhone = payeePhone;
	}

	public String getPayeeReceiver() {
		return this.payeeReceiver;
	}
	public void setPayeeReceiver(String payeeReceiver) {
		this.payeeReceiver = payeeReceiver;
	}

	public String getPayeeRegisterNo() {
		return this.payeeRegisterNo;
	}
	public void setPayeeRegisterNo(String payeeRegisterNo) {
		this.payeeRegisterNo = payeeRegisterNo;
	}

	public String getPayerAddress() {
		return this.payerAddress;
	}
	public void setPayerAddress(String payerAddress) {
		this.payerAddress = payerAddress;
	}

	public String getPayerBankAccountId() {
		return this.payerBankAccountId;
	}
	public void setPayerBankAccountId(String payerBankAccountId) {
		this.payerBankAccountId = payerBankAccountId;
	}

	public String getPayerBankName() {
		return this.payerBankName;
	}
	public void setPayerBankName(String payerBankName) {
		this.payerBankName = payerBankName;
	}

	public String getPayerName() {
		return this.payerName;
	}
	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	public String getPayerPhone() {
		return this.payerPhone;
	}
	public void setPayerPhone(String payerPhone) {
		this.payerPhone = payerPhone;
	}

	public String getPayerRegisterNo() {
		return this.payerRegisterNo;
	}
	public void setPayerRegisterNo(String payerRegisterNo) {
		this.payerRegisterNo = payerRegisterNo;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getPlatformUserId() {
		return this.platformUserId;
	}
	public void setPlatformUserId(String platformUserId) {
		this.platformUserId = platformUserId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSumPrice() {
		return this.sumPrice;
	}
	public void setSumPrice(String sumPrice) {
		this.sumPrice = sumPrice;
	}

	public String getSumTax() {
		return this.sumTax;
	}
	public void setSumTax(String sumTax) {
		this.sumTax = sumTax;
	}

}
