package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票申请明细列表
 *
 * @author auto create
 * @since 1.0, 2023-09-19 15:13:14
 */
public class OpenInvoiceApplyDetail extends AlipayObject {

	private static final long serialVersionUID = 7683218524521131186L;

	/**
	 * 单据总金额（元）
	 */
	@ApiField("bill_amount")
	private String billAmount;

	/**
	 * 平台单据号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 单据开票金额（元）
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/**
	 * 平台单据所属人ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 平台单据所属人ID
	 */
	@ApiField("platform_user_id")
	private String platformUserId;

	/**
	 * 平台单据所属人ID类型标识
	 */
	@ApiField("platform_user_id_type")
	private String platformUserIdType;

	/**
	 * 关联单据号
	 */
	@ApiField("related_bill_no")
	private String relatedBillNo;

	public String getBillAmount() {
		return this.billAmount;
	}
	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getInvoiceAmount() {
		return this.invoiceAmount;
	}
	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPlatformUserId() {
		return this.platformUserId;
	}
	public void setPlatformUserId(String platformUserId) {
		this.platformUserId = platformUserId;
	}

	public String getPlatformUserIdType() {
		return this.platformUserIdType;
	}
	public void setPlatformUserIdType(String platformUserIdType) {
		this.platformUserIdType = platformUserIdType;
	}

	public String getRelatedBillNo() {
		return this.relatedBillNo;
	}
	public void setRelatedBillNo(String relatedBillNo) {
		this.relatedBillNo = relatedBillNo;
	}

}
