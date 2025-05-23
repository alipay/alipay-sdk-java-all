package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票回传
 *
 * @author auto create
 * @since 1.0, 2022-11-08 13:21:15
 */
public class AlipayEbppInvoiceApplyInvUploadModel extends AlipayObject {

	private static final long serialVersionUID = 7256552417293293191L;

	/**
	 * 发票防伪码/密码
	 */
	@ApiField("anti_fake_code")
	private String antiFakeCode;

	/**
	 * 发票申请ID, 由阿里发票平台生成。 拆单开票后一笔申请可能对应多张发票。 source=apply时必填，其他source可为空
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 开票失败错误码， 开票失败(create_result=fail)时必填
	 */
	@ApiField("biz_error_code")
	private String bizErrorCode;

	/**
	 * 开票失败错误信息， 开票失败(create_result=fail)时必填
	 */
	@ApiField("biz_error_msg")
	private String bizErrorMsg;

	/**
	 * 抬头类型。可选值： 0：个人 1：企业
	 */
	@ApiField("business_type")
	private Long businessType;

	/**
	 * 校验码
	 */
	@ApiField("check_code")
	private String checkCode;

	/**
	 * 开票结果，枚举值： success: 发票开具成功； fail: 开票失败； source=async时必填，传实际的开票结果。其他source可不传，默认为success
	 */
	@ApiField("create_result")
	private String createResult;

	/**
	 * 开票分机号/机器编号
	 */
	@ApiField("device_no")
	private String deviceNo;

	/**
	 * 合计含税金额（开票金额），格式为2位小数。 当开红票时，该字段为负数。 开票成功时(create_result=success)必填
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/**
	 * 发票代码。 开票成功时(create_result=success)必填
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 开票日期，格式 yyyy-MM-dd. 开票成功时(create_result=success)必填
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 发票版式文件数据，base64化的字符串； 电子发票必填
	 */
	@ApiField("invoice_file_content")
	private String invoiceFileContent;

	/**
	 * 发票板式文件类型。可选值： PDF, OFD。 开电票且开票成功时(create_result=success)必填
	 */
	@ApiField("invoice_file_type")
	private String invoiceFileType;

	/**
	 * 电子发票明细。 source=apply时必填，其他source可为空
	 */
	@ApiField("invoice_items")
	private InvoiceItem invoiceItems;

	/**
	 * 开票发票类型 可选值： 0: 电票； 1：纸质普票； 2：纸质专票； 开票成功时(create_result=success)必填
	 */
	@ApiField("invoice_kind")
	private Long invoiceKind;

	/**
	 * 发票备注，会显示在票面
	 */
	@ApiField("invoice_memo")
	private String invoiceMemo;

	/**
	 * 发票号码。 开票成功时(create_result=success)必填
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 发票(开票)类型，可选值： blue: 蓝票； red: 红票； 开票成功时(create_result=success)必填
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 征税方式，0普通征收，1减按征收，2差额征收
	 */
	@ApiField("levy_type")
	private String levyType;

	/**
	 * 原发票代码。 冲红且开票成功时(create_result=success)必填
	 */
	@ApiField("normal_invoice_code")
	private String normalInvoiceCode;

	/**
	 * 原发票号码。 冲红且开票成功时(create_result=success)必填
	 */
	@ApiField("normal_invoice_no")
	private String normalInvoiceNo;

	/**
	 * 销方地址。 开票成功时(create_result=success)必填
	 */
	@ApiField("payee_address")
	private String payeeAddress;

	/**
	 * 销方银行账号
	 */
	@ApiField("payee_bank_account_id")
	private String payeeBankAccountId;

	/**
	 * 销方开户行名称
	 */
	@ApiField("payee_bank_name")
	private String payeeBankName;

	/**
	 * 复核人
	 */
	@ApiField("payee_checker")
	private String payeeChecker;

	/**
	 * 销方名称。 开票成功时(create_result=success)必填
	 */
	@ApiField("payee_name")
	private String payeeName;

	/**
	 * 开票人。 开票成功时(create_result=success)必填
	 */
	@ApiField("payee_operator")
	private String payeeOperator;

	/**
	 * 销方联系电话。 开票成功时(create_result=success)必填
	 */
	@ApiField("payee_phone")
	private String payeePhone;

	/**
	 * 收款人
	 */
	@ApiField("payee_receiver")
	private String payeeReceiver;

	/**
	 * 销方税务登记证号。由大写字母或数字组成，长度要求15~20位。 开票成功时(create_result=success)必填
	 */
	@ApiField("payee_register_no")
	private String payeeRegisterNo;

	/**
	 * 购方地址， 专票且开票成功时(create_result=success)必填
	 */
	@ApiField("payer_address")
	private String payerAddress;

	/**
	 * 购方银行账号， 专票且开票成功时(create_result=success)必填
	 */
	@ApiField("payer_bank_account_id")
	private String payerBankAccountId;

	/**
	 * 购方开户行名称， 专票且开票成功时(create_result=success)必填
	 */
	@ApiField("payer_bank_name")
	private String payerBankName;

	/**
	 * 购方电子邮箱，需满足邮箱格式。 格式要求：\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*
	 */
	@ApiField("payer_email")
	private String payerEmail;

	/**
	 * 购方抬头。 开票成功时(create_result=success)必填
	 */
	@ApiField("payer_name")
	private String payerName;

	/**
	 * 购方联系电话， 专票且开票成功时(create_result=success)必填
	 */
	@ApiField("payer_phone")
	private String payerPhone;

	/**
	 * 购方税务登记证号，由大写字母或数字组成，长度要求15~20位。 开企业抬头时必填， 专票且开票成功时(create_result=success)必填
	 */
	@ApiField("payer_register_no")
	private String payerRegisterNo;

	/**
	 * 业务平台Code, 由发票中台分配。 用于标识需交付发票的业务平台，source=upload时必填，其他source可为空
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 业务平台发票申请对应的订单号。 用于区分业务平台订单号，source=upload时必填，其他source可为空
	 */
	@ApiField("platform_tid")
	private String platformTid;

	/**
	 * 业务平台发票申请对应的订单号。 用于区分业务平台订单号，source=upload时必填，其他source可为空
	 */
	@ApiField("platform_user_id")
	private String platformUserId;

	/**
	 * 二维码
	 */
	@ApiField("qr_code")
	private String qrCode;

	/**
	 * 购方手机号码，用于收票
	 */
	@ApiField("receive_mobile")
	private String receiveMobile;

	/**
	 * 红字通知单号； 专票冲红且开票成功时(create_result=success)必填
	 */
	@ApiField("red_notice_no")
	private String redNoticeNo;

	/**
	 * 开票流水号/序列号，唯一标志一笔开票请求，由于阿里发票中台生成。 source=async时必填，其他source可为空
	 */
	@ApiField("serial_no")
	private String serialNo;

	/**
	 * 发票来源，可选值： apply: 间连开票模式，ISV回传商家基于申请开具的发票； async：直连开票模式，ISV回传开票结果； upload：直接回传，进行归集与交付的发票
	 */
	@ApiField("source")
	private String source;

	/**
	 * 特殊票种标识，可选值： “00”非特殊票种 （默认值） “02”农产品收购 “06”抵扣通行费 “07”其它通行费 “08”成品油销售 “18”成品油专票负数发票
	 */
	@ApiField("special_flag")
	private String specialFlag;

	/**
	 * 合计金额（不含税），格式为2位小数。 当开红票时，该字段为负数。 开票成功时(create_result=success)必填
	 */
	@ApiField("sum_price")
	private String sumPrice;

	/**
	 * 合计税额，格式为2位小数。 当开红票时，该字段为0或负数。 开票成功时(create_result=success)必填
	 */
	@ApiField("sum_tax")
	private String sumTax;

	public String getAntiFakeCode() {
		return this.antiFakeCode;
	}
	public void setAntiFakeCode(String antiFakeCode) {
		this.antiFakeCode = antiFakeCode;
	}

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getBizErrorCode() {
		return this.bizErrorCode;
	}
	public void setBizErrorCode(String bizErrorCode) {
		this.bizErrorCode = bizErrorCode;
	}

	public String getBizErrorMsg() {
		return this.bizErrorMsg;
	}
	public void setBizErrorMsg(String bizErrorMsg) {
		this.bizErrorMsg = bizErrorMsg;
	}

	public Long getBusinessType() {
		return this.businessType;
	}
	public void setBusinessType(Long businessType) {
		this.businessType = businessType;
	}

	public String getCheckCode() {
		return this.checkCode;
	}
	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}

	public String getCreateResult() {
		return this.createResult;
	}
	public void setCreateResult(String createResult) {
		this.createResult = createResult;
	}

	public String getDeviceNo() {
		return this.deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
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

	public String getInvoiceDate() {
		return this.invoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getInvoiceFileContent() {
		return this.invoiceFileContent;
	}
	public void setInvoiceFileContent(String invoiceFileContent) {
		this.invoiceFileContent = invoiceFileContent;
	}

	public String getInvoiceFileType() {
		return this.invoiceFileType;
	}
	public void setInvoiceFileType(String invoiceFileType) {
		this.invoiceFileType = invoiceFileType;
	}

	public InvoiceItem getInvoiceItems() {
		return this.invoiceItems;
	}
	public void setInvoiceItems(InvoiceItem invoiceItems) {
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

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getLevyType() {
		return this.levyType;
	}
	public void setLevyType(String levyType) {
		this.levyType = levyType;
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

	public String getPayerEmail() {
		return this.payerEmail;
	}
	public void setPayerEmail(String payerEmail) {
		this.payerEmail = payerEmail;
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

	public String getPlatformTid() {
		return this.platformTid;
	}
	public void setPlatformTid(String platformTid) {
		this.platformTid = platformTid;
	}

	public String getPlatformUserId() {
		return this.platformUserId;
	}
	public void setPlatformUserId(String platformUserId) {
		this.platformUserId = platformUserId;
	}

	public String getQrCode() {
		return this.qrCode;
	}
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public String getReceiveMobile() {
		return this.receiveMobile;
	}
	public void setReceiveMobile(String receiveMobile) {
		this.receiveMobile = receiveMobile;
	}

	public String getRedNoticeNo() {
		return this.redNoticeNo;
	}
	public void setRedNoticeNo(String redNoticeNo) {
		this.redNoticeNo = redNoticeNo;
	}

	public String getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getSpecialFlag() {
		return this.specialFlag;
	}
	public void setSpecialFlag(String specialFlag) {
		this.specialFlag = specialFlag;
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
