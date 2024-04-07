package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 开票账单DTO
 *
 * @author auto create
 * @since 1.0, 2023-08-25 14:53:16
 */
public class InvoiceBillDTO extends AlipayObject {

	private static final long serialVersionUID = 7386388274572716869L;

	/**
	 * 金额（单位：各币种的“元”单位，精确到小数点后2位）
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 到票金额（单位：各币种的“元”单位，精确到小数点后2位）
	 */
	@ApiField("arrival_amount")
	private String arrivalAmount;

	/**
	 * 账期月
	 */
	@ApiField("bill_cycle")
	private Date billCycle;

	/**
	 * 开票描述
	 */
	@ApiField("bill_desc")
	private String billDesc;

	/**
	 * 账单类型：合同 or 月账单
	 */
	@ApiField("bill_type")
	private String billType;

	/**
	 * 开票类型PREPAYorEXPENSE
	 */
	@ApiField("billable_type")
	private String billableType;

	/**
	 * 业务单据号
	 */
	@ApiField("biz_document_no")
	private String bizDocumentNo;

	/**
	 * 业务身份
	 */
	@ApiField("biz_id")
	private Long bizId;

	/**
	 * 已确认金额（单位：各币种的“元”单位，精确到小数点后2位）
	 */
	@ApiField("confirmed_arrival_amount")
	private String confirmedArrivalAmount;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 减免金额（费用抵扣）（单位：各币种的“元”单位，精确到小数点后2位）
	 */
	@ApiField("deduct_amount")
	private String deductAmount;

	/**
	 * 明细ID列表
	 */
	@ApiListField("detail_ids")
	@ApiField("string")
	private List<String> detailIds;

	/**
	 * 免除金额（允差处理）（单位：各币种的“元”单位，精确到小数点后2位）
	 */
	@ApiField("discharge_amount")
	private String dischargeAmount;

	/**
	 * 明细JSON
	 */
	@ApiField("ext_json")
	private String extJson;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * KP单ID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 开票账单号
	 */
	@ApiField("invoice_bill_no")
	private String invoiceBillNo;

	/**
	 * 开票抬头
	 */
	@ApiField("ou_code")
	private String ouCode;

	/**
	 * 预开票号
	 */
	@ApiField("pre_invoice_bill_no")
	private String preInvoiceBillNo;

	/**
	 * 是否红票
	 */
	@ApiField("red")
	private Boolean red;

	/**
	 * 关联单据号
	 */
	@ApiField("related_document_no")
	private String relatedDocumentNo;

	/**
	 * 来源ID
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 同步状态
	 */
	@ApiField("sync_status")
	private String syncStatus;

	/**
	 * 税率
	 */
	@ApiField("tax_rate")
	private String taxRate;

	/**
	 * 临时到票金额（单位：各币种的“元”单位，精确到小数点后2位）
	 */
	@ApiField("temp_arrival_amount")
	private String tempArrivalAmount;

	/**
	 * 商家ID
	 */
	@ApiField("vendor_id")
	private Long vendorId;

	/**
	 * 供应商店铺编号
	 */
	@ApiField("vendor_user_id")
	private String vendorUserId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getArrivalAmount() {
		return this.arrivalAmount;
	}
	public void setArrivalAmount(String arrivalAmount) {
		this.arrivalAmount = arrivalAmount;
	}

	public Date getBillCycle() {
		return this.billCycle;
	}
	public void setBillCycle(Date billCycle) {
		this.billCycle = billCycle;
	}

	public String getBillDesc() {
		return this.billDesc;
	}
	public void setBillDesc(String billDesc) {
		this.billDesc = billDesc;
	}

	public String getBillType() {
		return this.billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}

	public String getBillableType() {
		return this.billableType;
	}
	public void setBillableType(String billableType) {
		this.billableType = billableType;
	}

	public String getBizDocumentNo() {
		return this.bizDocumentNo;
	}
	public void setBizDocumentNo(String bizDocumentNo) {
		this.bizDocumentNo = bizDocumentNo;
	}

	public Long getBizId() {
		return this.bizId;
	}
	public void setBizId(Long bizId) {
		this.bizId = bizId;
	}

	public String getConfirmedArrivalAmount() {
		return this.confirmedArrivalAmount;
	}
	public void setConfirmedArrivalAmount(String confirmedArrivalAmount) {
		this.confirmedArrivalAmount = confirmedArrivalAmount;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDeductAmount() {
		return this.deductAmount;
	}
	public void setDeductAmount(String deductAmount) {
		this.deductAmount = deductAmount;
	}

	public List<String> getDetailIds() {
		return this.detailIds;
	}
	public void setDetailIds(List<String> detailIds) {
		this.detailIds = detailIds;
	}

	public String getDischargeAmount() {
		return this.dischargeAmount;
	}
	public void setDischargeAmount(String dischargeAmount) {
		this.dischargeAmount = dischargeAmount;
	}

	public String getExtJson() {
		return this.extJson;
	}
	public void setExtJson(String extJson) {
		this.extJson = extJson;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getInvoiceBillNo() {
		return this.invoiceBillNo;
	}
	public void setInvoiceBillNo(String invoiceBillNo) {
		this.invoiceBillNo = invoiceBillNo;
	}

	public String getOuCode() {
		return this.ouCode;
	}
	public void setOuCode(String ouCode) {
		this.ouCode = ouCode;
	}

	public String getPreInvoiceBillNo() {
		return this.preInvoiceBillNo;
	}
	public void setPreInvoiceBillNo(String preInvoiceBillNo) {
		this.preInvoiceBillNo = preInvoiceBillNo;
	}

	public Boolean getRed() {
		return this.red;
	}
	public void setRed(Boolean red) {
		this.red = red;
	}

	public String getRelatedDocumentNo() {
		return this.relatedDocumentNo;
	}
	public void setRelatedDocumentNo(String relatedDocumentNo) {
		this.relatedDocumentNo = relatedDocumentNo;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getSyncStatus() {
		return this.syncStatus;
	}
	public void setSyncStatus(String syncStatus) {
		this.syncStatus = syncStatus;
	}

	public String getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

	public String getTempArrivalAmount() {
		return this.tempArrivalAmount;
	}
	public void setTempArrivalAmount(String tempArrivalAmount) {
		this.tempArrivalAmount = tempArrivalAmount;
	}

	public Long getVendorId() {
		return this.vendorId;
	}
	public void setVendorId(Long vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorUserId() {
		return this.vendorUserId;
	}
	public void setVendorUserId(String vendorUserId) {
		this.vendorUserId = vendorUserId;
	}

}
