package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票规则记录
 *
 * @author auto create
 * @since 1.0, 2021-12-23 16:53:14
 */
public class EnterpriseOpenRuleRecordInfo extends AlipayObject {

	private static final long serialVersionUID = 1324483552578147484L;

	/**
	 * 开票规则账单日
	 */
	@ApiField("bill_month_day")
	private Long billMonthDay;

	/**
	 * 开票规则生效日期
	 */
	@ApiField("effective_start")
	private Date effectiveStart;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 开票规则id
	 */
	@ApiField("invoice_rule_id")
	private String invoiceRuleId;

	/**
	 * 开票规则记录id
	 */
	@ApiField("invoice_rule_record_id")
	private String invoiceRuleRecordId;

	/**
	 * 发票抬头id
	 */
	@ApiField("invoice_title_id")
	private String invoiceTitleId;

	/**
	 * 开票申请方：ENTERPRISE（企业发起），EMPLOYEE（员工发起）
	 */
	@ApiField("open_applyer")
	private String openApplyer;

	/**
	 * 开票模式：汇总开、笔笔开
枚举定义：SUMMARY:汇总开
SINGLE:单笔开
	 */
	@ApiField("open_mode")
	private String openMode;

	/**
	 * 开票申请类型：AUTO（自动开票），MANUAL（手动开票）
	 */
	@ApiField("open_type")
	private String openType;

	/**
	 * 所有者id（企业情况下=enterpriseId）
	 */
	@ApiField("owner_id")
	private String ownerId;

	public Long getBillMonthDay() {
		return this.billMonthDay;
	}
	public void setBillMonthDay(Long billMonthDay) {
		this.billMonthDay = billMonthDay;
	}

	public Date getEffectiveStart() {
		return this.effectiveStart;
	}
	public void setEffectiveStart(Date effectiveStart) {
		this.effectiveStart = effectiveStart;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getInvoiceRuleId() {
		return this.invoiceRuleId;
	}
	public void setInvoiceRuleId(String invoiceRuleId) {
		this.invoiceRuleId = invoiceRuleId;
	}

	public String getInvoiceRuleRecordId() {
		return this.invoiceRuleRecordId;
	}
	public void setInvoiceRuleRecordId(String invoiceRuleRecordId) {
		this.invoiceRuleRecordId = invoiceRuleRecordId;
	}

	public String getInvoiceTitleId() {
		return this.invoiceTitleId;
	}
	public void setInvoiceTitleId(String invoiceTitleId) {
		this.invoiceTitleId = invoiceTitleId;
	}

	public String getOpenApplyer() {
		return this.openApplyer;
	}
	public void setOpenApplyer(String openApplyer) {
		this.openApplyer = openApplyer;
	}

	public String getOpenMode() {
		return this.openMode;
	}
	public void setOpenMode(String openMode) {
		this.openMode = openMode;
	}

	public String getOpenType() {
		return this.openType;
	}
	public void setOpenType(String openType) {
		this.openType = openType;
	}

	public String getOwnerId() {
		return this.ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

}
