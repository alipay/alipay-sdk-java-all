package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询还款流水明细
 *
 * @author auto create
 * @since 1.0, 2018-11-14 14:26:39
 */
public class AlipayPcreditLoanRepayDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8825282819938786319L;

	/**
	 * 贷款申请受理单号，与外部业务单号二者不能同时为空
	 */
	@ApiField("apply_receipt_no")
	private String applyReceiptNo;

	/**
	 * 查询还款流水明细截止时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 外部业务单号，与贷款申请受理单号二者不能同时为空
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 代表了一次请求，作为业务幂等性控制
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 查询还款流水明细起始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	public String getApplyReceiptNo() {
		return this.applyReceiptNo;
	}
	public void setApplyReceiptNo(String applyReceiptNo) {
		this.applyReceiptNo = applyReceiptNo;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}
