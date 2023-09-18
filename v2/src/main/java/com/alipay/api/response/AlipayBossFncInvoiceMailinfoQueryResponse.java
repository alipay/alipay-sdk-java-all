package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.invoice.mailinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 03:27:28
 */
public class AlipayBossFncInvoiceMailinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1699953874282892765L;

	/** 
	 * 创建人
	 */
	@ApiField("creator")
	private String creator;

	/** 
	 * 快递公司名称
	 */
	@ApiField("express_company_name")
	private String expressCompanyName;

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
	 * 发票ID，发票表主键ID，用于关联发票信息
	 */
	@ApiField("invoice_id")
	private String invoiceId;

	/** 
	 * 修改人
	 */
	@ApiField("last_modifier")
	private String lastModifier;

	/** 
	 * 邮寄日期YYYYMMDD
	 */
	@ApiField("mail_date")
	private String mailDate;

	/** 
	 * 邮寄ID，唯一性ID，邮寄信息表唯一主键ID
	 */
	@ApiField("mail_id")
	private String mailId;

	/** 
	 * 邮寄原因
	 */
	@ApiField("reason")
	private String reason;

	/** 
	 * 收件人地址
	 */
	@ApiField("recipients_address")
	private String recipientsAddress;

	/** 
	 * 收件人名称
	 */
	@ApiField("recipients_name")
	private String recipientsName;

	/** 
	 * 收件人电话
	 */
	@ApiField("recipients_tel")
	private String recipientsTel;

	/** 
	 * 寄件人地址
	 */
	@ApiField("sender_address")
	private String senderAddress;

	/** 
	 * 寄件人名称
	 */
	@ApiField("sender_name")
	private String senderName;

	/** 
	 * 寄件人电话
	 */
	@ApiField("sender_tel")
	private String senderTel;

	/** 
	 * 租户ID
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/** 
	 * 快递单号
	 */
	@ApiField("tracking_no")
	private String trackingNo;

	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getCreator( ) {
		return this.creator;
	}

	public void setExpressCompanyName(String expressCompanyName) {
		this.expressCompanyName = expressCompanyName;
	}
	public String getExpressCompanyName( ) {
		return this.expressCompanyName;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
	public Date getGmtModified( ) {
		return this.gmtModified;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getInvoiceId( ) {
		return this.invoiceId;
	}

	public void setLastModifier(String lastModifier) {
		this.lastModifier = lastModifier;
	}
	public String getLastModifier( ) {
		return this.lastModifier;
	}

	public void setMailDate(String mailDate) {
		this.mailDate = mailDate;
	}
	public String getMailDate( ) {
		return this.mailDate;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getMailId( ) {
		return this.mailId;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getReason( ) {
		return this.reason;
	}

	public void setRecipientsAddress(String recipientsAddress) {
		this.recipientsAddress = recipientsAddress;
	}
	public String getRecipientsAddress( ) {
		return this.recipientsAddress;
	}

	public void setRecipientsName(String recipientsName) {
		this.recipientsName = recipientsName;
	}
	public String getRecipientsName( ) {
		return this.recipientsName;
	}

	public void setRecipientsTel(String recipientsTel) {
		this.recipientsTel = recipientsTel;
	}
	public String getRecipientsTel( ) {
		return this.recipientsTel;
	}

	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
	}
	public String getSenderAddress( ) {
		return this.senderAddress;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getSenderName( ) {
		return this.senderName;
	}

	public void setSenderTel(String senderTel) {
		this.senderTel = senderTel;
	}
	public String getSenderTel( ) {
		return this.senderTel;
	}

	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}
	public String getTntInstId( ) {
		return this.tntInstId;
	}

	public void setTrackingNo(String trackingNo) {
		this.trackingNo = trackingNo;
	}
	public String getTrackingNo( ) {
		return this.trackingNo;
	}

}
