package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票受理单据
 *
 * @author auto create
 * @since 1.0, 2024-06-11 19:03:36
 */
public class InvoiceApplyOpenApi extends AlipayObject {

	private static final long serialVersionUID = 7448673199347814417L;

	/**
	 * 金额
	 */
	@ApiField("amount")
	private MultiCurrencyMoneyOpenApi amount;

	/**
	 * 合约号
	 */
	@ApiField("arrangement_no")
	private String arrangementNo;

	/**
	 * 免税类型，当为免税时此字段应该有值
	 */
	@ApiField("duty_free_type")
	private String dutyFreeType;

	/**
	 * 票面展示的费用期间
	 */
	@ApiField("fee_interval_format_str")
	private String feeIntervalFormatStr;

	/**
	 * 机构号
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 外部指定的展示在票面的开票时间 格式为yyyyMMdd
	 */
	@ApiField("inv_dt")
	private String invDt;

	/**
	 * 开票时间、账单月 格式为yyyyMM
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 单位
	 */
	@ApiField("invoice_line_measurement_unit")
	private String invoiceLineMeasurementUnit;

	/**
	 * 数量
	 */
	@ApiField("invoice_line_quantity")
	private String invoiceLineQuantity;

	/**
	 * 单价
	 */
	@ApiField("invoice_line_unit_amount")
	private String invoiceLineUnitAmount;

	/**
	 * 发票备注
	 */
	@ApiField("invoice_note")
	private String invoiceNote;

	/**
	 * 货物名称
	 */
	@ApiField("invoice_product_name")
	private String invoiceProductName;

	/**
	 * 外部指定的发票行内容后缀
	 */
	@ApiField("invoice_product_name_suffix")
	private String invoiceProductNameSuffix;

	/**
	 * 规格型号，可为空
	 */
	@ApiField("invoice_specification")
	private String invoiceSpecification;

	/**
	 * 此属性可以用作发票的拆分KEY
	 */
	@ApiField("invoice_split_key")
	private String invoiceSplitKey;

	/**
	 * 开票类型
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 商户MID
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 结算对象参与者角色标识
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 外部单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 详见OutputInvoiceReceiptOutBizTypeEnum
	 */
	@ApiField("out_biz_type")
	private String outBizType;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 是否全部回款
	 */
	@ApiField("received")
	private String received;

	/**
	 * 注册地区域码 如：新加坡（SG）,香港（HK）
	 */
	@ApiField("register_country")
	private String registerCountry;

	/**
	 * 服务月份
	 */
	@ApiField("service_mth")
	private String serviceMth;

	/**
	 * 外部单据来源系统标识和开票时一致
	 */
	@ApiField("source")
	private String source;

	/**
	 * 税收分类编码，非必填
	 */
	@ApiField("tax_classification_code")
	private String taxClassificationCode;

	/**
	 * 税率
	 */
	@ApiField("tax_rate")
	private String taxRate;

	/**
	 * 免税标识（无发票：NO_INVOICE，零税率：ZERO_TAX_RATE，免税：EXEMPTION，无税收监管：NO_TAX_REGULATION）
	 */
	@ApiField("tax_rate_tags")
	private String taxRateTags;

	/**
	 * 税收类型 02 营业税;01 增值税;00 无税
	 */
	@ApiField("tax_type")
	private String taxType;

	public MultiCurrencyMoneyOpenApi getAmount() {
		return this.amount;
	}
	public void setAmount(MultiCurrencyMoneyOpenApi amount) {
		this.amount = amount;
	}

	public String getArrangementNo() {
		return this.arrangementNo;
	}
	public void setArrangementNo(String arrangementNo) {
		this.arrangementNo = arrangementNo;
	}

	public String getDutyFreeType() {
		return this.dutyFreeType;
	}
	public void setDutyFreeType(String dutyFreeType) {
		this.dutyFreeType = dutyFreeType;
	}

	public String getFeeIntervalFormatStr() {
		return this.feeIntervalFormatStr;
	}
	public void setFeeIntervalFormatStr(String feeIntervalFormatStr) {
		this.feeIntervalFormatStr = feeIntervalFormatStr;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getInvDt() {
		return this.invDt;
	}
	public void setInvDt(String invDt) {
		this.invDt = invDt;
	}

	public String getInvoiceDate() {
		return this.invoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getInvoiceLineMeasurementUnit() {
		return this.invoiceLineMeasurementUnit;
	}
	public void setInvoiceLineMeasurementUnit(String invoiceLineMeasurementUnit) {
		this.invoiceLineMeasurementUnit = invoiceLineMeasurementUnit;
	}

	public String getInvoiceLineQuantity() {
		return this.invoiceLineQuantity;
	}
	public void setInvoiceLineQuantity(String invoiceLineQuantity) {
		this.invoiceLineQuantity = invoiceLineQuantity;
	}

	public String getInvoiceLineUnitAmount() {
		return this.invoiceLineUnitAmount;
	}
	public void setInvoiceLineUnitAmount(String invoiceLineUnitAmount) {
		this.invoiceLineUnitAmount = invoiceLineUnitAmount;
	}

	public String getInvoiceNote() {
		return this.invoiceNote;
	}
	public void setInvoiceNote(String invoiceNote) {
		this.invoiceNote = invoiceNote;
	}

	public String getInvoiceProductName() {
		return this.invoiceProductName;
	}
	public void setInvoiceProductName(String invoiceProductName) {
		this.invoiceProductName = invoiceProductName;
	}

	public String getInvoiceProductNameSuffix() {
		return this.invoiceProductNameSuffix;
	}
	public void setInvoiceProductNameSuffix(String invoiceProductNameSuffix) {
		this.invoiceProductNameSuffix = invoiceProductNameSuffix;
	}

	public String getInvoiceSpecification() {
		return this.invoiceSpecification;
	}
	public void setInvoiceSpecification(String invoiceSpecification) {
		this.invoiceSpecification = invoiceSpecification;
	}

	public String getInvoiceSplitKey() {
		return this.invoiceSplitKey;
	}
	public void setInvoiceSplitKey(String invoiceSplitKey) {
		this.invoiceSplitKey = invoiceSplitKey;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getIpId() {
		return this.ipId;
	}
	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutBizType() {
		return this.outBizType;
	}
	public void setOutBizType(String outBizType) {
		this.outBizType = outBizType;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getReceived() {
		return this.received;
	}
	public void setReceived(String received) {
		this.received = received;
	}

	public String getRegisterCountry() {
		return this.registerCountry;
	}
	public void setRegisterCountry(String registerCountry) {
		this.registerCountry = registerCountry;
	}

	public String getServiceMth() {
		return this.serviceMth;
	}
	public void setServiceMth(String serviceMth) {
		this.serviceMth = serviceMth;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTaxClassificationCode() {
		return this.taxClassificationCode;
	}
	public void setTaxClassificationCode(String taxClassificationCode) {
		this.taxClassificationCode = taxClassificationCode;
	}

	public String getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

	public String getTaxRateTags() {
		return this.taxRateTags;
	}
	public void setTaxRateTags(String taxRateTags) {
		this.taxRateTags = taxRateTags;
	}

	public String getTaxType() {
		return this.taxType;
	}
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

}
