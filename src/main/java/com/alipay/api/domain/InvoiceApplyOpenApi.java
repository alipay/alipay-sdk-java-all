package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票受理单据
 *
 * @author auto create
 * @since 1.0, 2022-12-16 09:52:25
 */
public class InvoiceApplyOpenApi extends AlipayObject {

	private static final long serialVersionUID = 5358856364684959835L;

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
	 * 机构号
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 开票年月 yyyyMM
	 */
	@ApiField("invoice_date")
	private String invoiceDate;

	/**
	 * 货物名称
	 */
	@ApiField("invoice_product_name")
	private String invoiceProductName;

	/**
	 * 规格型号，可为空
	 */
	@ApiField("invoice_specification")
	private String invoiceSpecification;

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
	 * 服务月份
	 */
	@ApiField("service_mth")
	private String serviceMth;

	/**
	 * 税率
	 */
	@ApiField("tax_rate")
	private String taxRate;

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

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getInvoiceDate() {
		return this.invoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getInvoiceProductName() {
		return this.invoiceProductName;
	}
	public void setInvoiceProductName(String invoiceProductName) {
		this.invoiceProductName = invoiceProductName;
	}

	public String getInvoiceSpecification() {
		return this.invoiceSpecification;
	}
	public void setInvoiceSpecification(String invoiceSpecification) {
		this.invoiceSpecification = invoiceSpecification;
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

	public String getServiceMth() {
		return this.serviceMth;
	}
	public void setServiceMth(String serviceMth) {
		this.serviceMth = serviceMth;
	}

	public String getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

	public String getTaxType() {
		return this.taxType;
	}
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

}
