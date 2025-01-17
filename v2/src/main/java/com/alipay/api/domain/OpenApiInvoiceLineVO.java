package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票行模型
 *
 * @author auto create
 * @since 1.0, 2024-06-12 10:22:17
 */
public class OpenApiInvoiceLineVO extends AlipayObject {

	private static final long serialVersionUID = 4579826148359194691L;

	/**
	 * 含税金额
	 */
	@ApiField("amt")
	private MultiCurrencyMoneyOpenApi amt;

	/**
	 * 创建人
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 免税标识
	 */
	@ApiField("duty_free_flag")
	private String dutyFreeFlag;

	/**
	 * 免税类型，当为免税时此字段应该有值见ArInvoiceDutyFreeTypeEnum枚举
	 */
	@ApiField("duty_free_type")
	private String dutyFreeType;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 发票id
	 */
	@ApiField("invoice_id")
	private String invoiceId;

	/**
	 * 发票行唯一id
	 */
	@ApiField("invoice_line_id")
	private String invoiceLineId;

	/**
	 * 最后一次修改人
	 */
	@ApiField("last_moder")
	private String lastModer;

	/**
	 * 计量单位
	 */
	@ApiField("measurement_unit")
	private String measurementUnit;

	/**
	 * 软件服务费
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 货物或劳务名称后缀
	 */
	@ApiField("product_name_suffix")
	private String productNameSuffix;

	/**
	 * 规格型号
	 */
	@ApiField("product_specification")
	private String productSpecification;

	/**
	 * 数量
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 税额
	 */
	@ApiField("tax_amt")
	private MultiCurrencyMoneyOpenApi taxAmt;

	/**
	 * 税收分类编码
	 */
	@ApiField("tax_classification_code")
	private String taxClassificationCode;

	/**
	 * 税收分类简称
	 */
	@ApiField("tax_classification_short_name")
	private String taxClassificationShortName;

	/**
	 * 不含税金额
	 */
	@ApiField("tax_exclusive_amt")
	private MultiCurrencyMoneyOpenApi taxExclusiveAmt;

	/**
	 * 税率
	 */
	@ApiField("tax_rate")
	private String taxRate;

	/**
	 * 租户机构id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * 单价
	 */
	@ApiField("unit_amt")
	private String unitAmt;

	public MultiCurrencyMoneyOpenApi getAmt() {
		return this.amt;
	}
	public void setAmt(MultiCurrencyMoneyOpenApi amt) {
		this.amt = amt;
	}

	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getDutyFreeFlag() {
		return this.dutyFreeFlag;
	}
	public void setDutyFreeFlag(String dutyFreeFlag) {
		this.dutyFreeFlag = dutyFreeFlag;
	}

	public String getDutyFreeType() {
		return this.dutyFreeType;
	}
	public void setDutyFreeType(String dutyFreeType) {
		this.dutyFreeType = dutyFreeType;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getInvoiceId() {
		return this.invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getInvoiceLineId() {
		return this.invoiceLineId;
	}
	public void setInvoiceLineId(String invoiceLineId) {
		this.invoiceLineId = invoiceLineId;
	}

	public String getLastModer() {
		return this.lastModer;
	}
	public void setLastModer(String lastModer) {
		this.lastModer = lastModer;
	}

	public String getMeasurementUnit() {
		return this.measurementUnit;
	}
	public void setMeasurementUnit(String measurementUnit) {
		this.measurementUnit = measurementUnit;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductNameSuffix() {
		return this.productNameSuffix;
	}
	public void setProductNameSuffix(String productNameSuffix) {
		this.productNameSuffix = productNameSuffix;
	}

	public String getProductSpecification() {
		return this.productSpecification;
	}
	public void setProductSpecification(String productSpecification) {
		this.productSpecification = productSpecification;
	}

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public MultiCurrencyMoneyOpenApi getTaxAmt() {
		return this.taxAmt;
	}
	public void setTaxAmt(MultiCurrencyMoneyOpenApi taxAmt) {
		this.taxAmt = taxAmt;
	}

	public String getTaxClassificationCode() {
		return this.taxClassificationCode;
	}
	public void setTaxClassificationCode(String taxClassificationCode) {
		this.taxClassificationCode = taxClassificationCode;
	}

	public String getTaxClassificationShortName() {
		return this.taxClassificationShortName;
	}
	public void setTaxClassificationShortName(String taxClassificationShortName) {
		this.taxClassificationShortName = taxClassificationShortName;
	}

	public MultiCurrencyMoneyOpenApi getTaxExclusiveAmt() {
		return this.taxExclusiveAmt;
	}
	public void setTaxExclusiveAmt(MultiCurrencyMoneyOpenApi taxExclusiveAmt) {
		this.taxExclusiveAmt = taxExclusiveAmt;
	}

	public String getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

	public String getUnitAmt() {
		return this.unitAmt;
	}
	public void setUnitAmt(String unitAmt) {
		this.unitAmt = unitAmt;
	}

}
