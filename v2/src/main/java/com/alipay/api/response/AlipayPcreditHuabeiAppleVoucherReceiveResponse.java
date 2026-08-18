package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.apple.voucher.receive response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-13 11:37:49
 */
public class AlipayPcreditHuabeiAppleVoucherReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 8536714545528914486L;

	/** 
	 * 提额额度，单位分
	 */
	@ApiField("credit_amount")
	private Long creditAmount;

	/** 
	 * 活动结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/** 
	 * 幂等命中true、未命中false
	 */
	@ApiField("idempotent")
	private Boolean idempotent;

	/** 
	 * 额度券实例号
	 */
	@ApiField("instance_no")
	private String instanceNo;

	/** 
	 * 活动开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	public void setCreditAmount(Long creditAmount) {
		this.creditAmount = creditAmount;
	}
	public Long getCreditAmount( ) {
		return this.creditAmount;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getEndDate( ) {
		return this.endDate;
	}

	public void setIdempotent(Boolean idempotent) {
		this.idempotent = idempotent;
	}
	public Boolean getIdempotent( ) {
		return this.idempotent;
	}

	public void setInstanceNo(String instanceNo) {
		this.instanceNo = instanceNo;
	}
	public String getInstanceNo( ) {
		return this.instanceNo;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getStartDate( ) {
		return this.startDate;
	}

}
