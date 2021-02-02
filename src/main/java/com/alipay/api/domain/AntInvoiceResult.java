package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票详细信息
 *
 * @author auto create
 * @since 1.0, 2020-06-18 21:09:08
 */
public class AntInvoiceResult extends AlipayObject {

	private static final long serialVersionUID = 8695866154388849316L;

	/**
	 * 防伪码
	 */
	@ApiField("anti_fake_code")
	private String antiFakeCode;

	/**
	 * 错误编码

开票失败时返回
	 */
	@ApiField("biz_error_code")
	private String bizErrorCode;

	/**
	 * 错误信息
开票失败时返回
	 */
	@ApiField("biz_error_msg")
	private String bizErrorMsg;

	/**
	 * 发票密文，密码区的字符串
	 */
	@ApiField("ciphertext")
	private String ciphertext;

	/**
	 * 税控设备编号(新版电子发票有)
	 */
	@ApiField("device_no")
	private String deviceNo;

	/**
	 * 文件类型(pdf,ofd,jpg,png等等)
	 */
	@ApiField("file_data_type")
	private String fileDataType;

	/**
	 * 发票板式文件的下载地址。电票开票成功时必须。
下载链接是一次性的，有效期7天，如果需要再次下载的话需要重新调用接口获取。
	 */
	@ApiField("file_path")
	private String filePath;

	/**
	 * 发票代码
开票成功时必须
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 开票日期

开票成功时必须
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 电子发票明细
	 */
	@ApiListField("invoice_items")
	@ApiField("ant_invoice_item")
	private List<AntInvoiceItem> invoiceItems;

	/**
	 * 发票种类，0=电子发票，1=纸质发票，2=纸质专票
	 */
	@ApiField("invoice_kind")
	private Long invoiceKind;

	/**
	 * 发票号码
开票成功时必须
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 开票时间，时分秒格式（注意：2019-04-11之后开具的发票才返回）
	 */
	@ApiField("invoice_time")
	private String invoiceTime;

	/**
	 * 发票类型，blue=蓝票，red=红票
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 原蓝票发票代码，invoiceType=red时有值
	 */
	@ApiField("normal_invoice_code")
	private String normalInvoiceCode;

	/**
	 * 原蓝票发票号码，invoiceType=red时有值
	 */
	@ApiField("normal_invoice_no")
	private String normalInvoiceNo;

	/**
	 * 开票金额
开票成功时必须
	 */
	@ApiField("nvoice_amount")
	private String nvoiceAmount;

	/**
	 * 复核人
	 */
	@ApiField("payee_checker")
	private String payeeChecker;

	/**
	 * 销方企业名称
	 */
	@ApiField("payee_name")
	private String payeeName;

	/**
	 * 开票人
	 */
	@ApiField("payee_operator")
	private String payeeOperator;

	/**
	 * 收款人
	 */
	@ApiField("payee_receive")
	private String payeeReceive;

	/**
	 * 销售方税号
	 */
	@ApiField("payee_register_no")
	private String payeeRegisterNo;

	/**
	 * 购买方企业地址
	 */
	@ApiField("payer_address")
	private String payerAddress;

	/**
	 * 购买方企业银行及账号
	 */
	@ApiField("payer_bankaccount")
	private String payerBankaccount;

	/**
	 * 购买方抬头
	 */
	@ApiField("payer_name")
	private String payerName;

	/**
	 * 购买方企业电话
	 */
	@ApiField("payer_phone")
	private String payerPhone;

	/**
	 * 购买方税号
	 */
	@ApiField("payer_register_no")
	private String payerRegisterNo;

	/**
	 * 业务平台code
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 业务平台对应的订单号
	 */
	@ApiField("platform_tid")
	private String platformTid;

	/**
	 * 仅开票失败时返回此字段。

当retrying==true调用方不需要关心，阿里发票中台会自动重试。

当retrying==false调用方需要处理之后重试。这两类错误阿里发票中台是不会自动重试的：

(1)业务错误，比如折扣率计算错误之类的，需要修改报文。
(2)税盘错误，比如盘没票了，月初未抄报税等。
	 */
	@ApiField("retrying")
	private Boolean retrying;

	/**
	 * 开票流水号，唯一标志开票请求。如果两次请求流水号相同，则表示重复请求。
	 */
	@ApiField("serial_no")
	private String serialNo;

	/**
	 * 开票状态：
waiting = 等待开票中，processing = 开票中，create_success = 开票成功，create_failed = 开票失败
	 */
	@ApiField("status")
	private String status;

	/**
	 * 合计不含税金额，当开红票时，该字段为负数
	 */
	@ApiField("sum_price")
	private String sumPrice;

	/**
	 * 合计税额，当开红票时，该字段为负数
	 */
	@ApiField("sum_tax")
	private String sumTax;

	public String getAntiFakeCode() {
		return this.antiFakeCode;
	}
	public void setAntiFakeCode(String antiFakeCode) {
		this.antiFakeCode = antiFakeCode;
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

	public String getCiphertext() {
		return this.ciphertext;
	}
	public void setCiphertext(String ciphertext) {
		this.ciphertext = ciphertext;
	}

	public String getDeviceNo() {
		return this.deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}

	public String getFileDataType() {
		return this.fileDataType;
	}
	public void setFileDataType(String fileDataType) {
		this.fileDataType = fileDataType;
	}

	public String getFilePath() {
		return this.filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
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

	public List<AntInvoiceItem> getInvoiceItems() {
		return this.invoiceItems;
	}
	public void setInvoiceItems(List<AntInvoiceItem> invoiceItems) {
		this.invoiceItems = invoiceItems;
	}

	public Long getInvoiceKind() {
		return this.invoiceKind;
	}
	public void setInvoiceKind(Long invoiceKind) {
		this.invoiceKind = invoiceKind;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getInvoiceTime() {
		return this.invoiceTime;
	}
	public void setInvoiceTime(String invoiceTime) {
		this.invoiceTime = invoiceTime;
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

	public String getNvoiceAmount() {
		return this.nvoiceAmount;
	}
	public void setNvoiceAmount(String nvoiceAmount) {
		this.nvoiceAmount = nvoiceAmount;
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

	public String getPayeeReceive() {
		return this.payeeReceive;
	}
	public void setPayeeReceive(String payeeReceive) {
		this.payeeReceive = payeeReceive;
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

	public String getPayerBankaccount() {
		return this.payerBankaccount;
	}
	public void setPayerBankaccount(String payerBankaccount) {
		this.payerBankaccount = payerBankaccount;
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

	public Boolean getRetrying() {
		return this.retrying;
	}
	public void setRetrying(Boolean retrying) {
		this.retrying = retrying;
	}

	public String getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
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
