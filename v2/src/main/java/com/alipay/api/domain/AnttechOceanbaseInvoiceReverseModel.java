package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票红冲
 *
 * @author auto create
 * @since 1.0, 2025-06-20 10:18:47
 */
public class AnttechOceanbaseInvoiceReverseModel extends AlipayObject {

	private static final long serialVersionUID = 8745285535346195164L;

	/**
	 * 调用方的业务唯一键，可做幂等，保证同一个请求多次调用该唯一键不变
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 业务类型示例，非真实值，接入需要提起申请
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 创建人的域名
	 */
	@ApiField("creator_id")
	private String creatorId;

	/**
	 * 发票的业务主键
	 */
	@ApiField("invoice_id")
	private String invoiceId;

	/**
	 * 用来描述红冲的原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 发票红冲的备注内容
	 */
	@ApiField("remarks")
	private String remarks;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCreatorId() {
		return this.creatorId;
	}
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getInvoiceId() {
		return this.invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getRemarks() {
		return this.remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
