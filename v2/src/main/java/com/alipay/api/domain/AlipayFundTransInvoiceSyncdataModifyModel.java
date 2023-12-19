package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 票据平台票据信息归集接口
 *
 * @author auto create
 * @since 1.0, 2022-08-24 17:59:16
 */
public class AlipayFundTransInvoiceSyncdataModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7824768786616558773L;

	/**
	 * 票据总金额（元）
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 所属地区，用于区分不同地区票据应用
	 */
	@ApiField("area")
	private String area;

	/**
	 * 票据文件格式(PDF,JPG等) 目前只支持PDF
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * 票据代码
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 票据名称
	 */
	@ApiField("invoice_name")
	private String invoiceName;

	/**
	 * 票据号码
	 */
	@ApiField("invoice_number")
	private String invoiceNumber;

	/**
	 * 发票类型(person：个人，enterprise：企业)
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 1 是区块链 0 非区块链
	 */
	@ApiField("is_block")
	private String isBlock;

	/**
	 * 默认0，是否是历史数据同步。历史数据不发蚂蚁森林能量  0 非历史数据 1 是历史数据
	 */
	@ApiField("is_old_data_sync")
	private String isOldDataSync;

	/**
	 * 支付宝开票流水号，可空。核对使用
	 */
	@ApiField("open_biz_no")
	private String openBizNo;

	/**
	 * 票据开具单位代码
	 */
	@ApiField("party_code")
	private String partyCode;

	/**
	 * 票据开具单位名称
	 */
	@ApiField("party_name")
	private String partyName;

	/**
	 * 付款人统一信用代码
	 */
	@ApiField("payer_id")
	private String payerId;

	/**
	 * 当user_id不传值时payer_id_type必须传值，含义为用户身份标识类型
1 身份证
	 */
	@ApiField("payer_id_type")
	private String payerIdType;

	/**
	 * 当user_id为空时，payer_id_value必须传值，内容为与payer_id_type对应的标识值，如身份证号130xxx
	 */
	@ApiField("payer_id_value")
	private String payerIdValue;

	/**
	 * 付款人姓名
	 */
	@ApiField("payer_name")
	private String payerName;

	/**
	 * 票据状态: 1正常，2作废，3已报销，4已换开 5红冲
	 */
	@ApiField("status")
	private String status;

	/**
	 * 开票时间(UTC时间戳精确到秒)
	 */
	@ApiField("time")
	private String time;

	/**
	 * 票据状态: 1医疗，2捐赠，3教育，4罚没，5其他
	 */
	@ApiField("type")
	private String type;

	/**
	 * PDF票据URL(目前不支持传图片URL)
	 */
	@ApiField("url")
	private String url;

	/**
	 * 支付宝用户id,若为空，则payer_id_type,payer_id_valuey用户身份标识内容必填
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 校验码
	 */
	@ApiField("verify")
	private String verify;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getArea() {
		return this.area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getInvoiceCode() {
		return this.invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getInvoiceName() {
		return this.invoiceName;
	}
	public void setInvoiceName(String invoiceName) {
		this.invoiceName = invoiceName;
	}

	public String getInvoiceNumber() {
		return this.invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getIsBlock() {
		return this.isBlock;
	}
	public void setIsBlock(String isBlock) {
		this.isBlock = isBlock;
	}

	public String getIsOldDataSync() {
		return this.isOldDataSync;
	}
	public void setIsOldDataSync(String isOldDataSync) {
		this.isOldDataSync = isOldDataSync;
	}

	public String getOpenBizNo() {
		return this.openBizNo;
	}
	public void setOpenBizNo(String openBizNo) {
		this.openBizNo = openBizNo;
	}

	public String getPartyCode() {
		return this.partyCode;
	}
	public void setPartyCode(String partyCode) {
		this.partyCode = partyCode;
	}

	public String getPartyName() {
		return this.partyName;
	}
	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getPayerId() {
		return this.payerId;
	}
	public void setPayerId(String payerId) {
		this.payerId = payerId;
	}

	public String getPayerIdType() {
		return this.payerIdType;
	}
	public void setPayerIdType(String payerIdType) {
		this.payerIdType = payerIdType;
	}

	public String getPayerIdValue() {
		return this.payerIdValue;
	}
	public void setPayerIdValue(String payerIdValue) {
		this.payerIdValue = payerIdValue;
	}

	public String getPayerName() {
		return this.payerName;
	}
	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTime() {
		return this.time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVerify() {
		return this.verify;
	}
	public void setVerify(String verify) {
		this.verify = verify;
	}

}
