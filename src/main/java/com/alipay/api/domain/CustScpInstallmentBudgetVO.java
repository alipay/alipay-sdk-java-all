package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分期明细
 *
 * @author auto create
 * @since 1.0, 2019-04-02 13:41:02
 */
public class CustScpInstallmentBudgetVO extends AlipayObject {

	private static final long serialVersionUID = 8894454759657615436L;

	/**
	 * 是否可以还款
	 */
	@ApiField("can_repay")
	private Boolean canRepay;

	/**
	 * 分期到期日
	 */
	@ApiField("due_date")
	private Date dueDate;

	/**
	 * 分期编号
	 */
	@ApiField("install_num")
	private Long installNum;

	/**
	 * 账期开始日
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 分期状态 OVD:逾期状态,NOR:正常状态, CLR:结清状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 分期金额明细
	 */
	@ApiField("term_amt_detail")
	private CustScpBillAmtVO termAmtDetail;

	/**
	 * 分期总金额
	 */
	@ApiField("term_total_amt")
	private String termTotalAmt;

	public Boolean getCanRepay() {
		return this.canRepay;
	}
	public void setCanRepay(Boolean canRepay) {
		this.canRepay = canRepay;
	}

	public Date getDueDate() {
		return this.dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Long getInstallNum() {
		return this.installNum;
	}
	public void setInstallNum(Long installNum) {
		this.installNum = installNum;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public CustScpBillAmtVO getTermAmtDetail() {
		return this.termAmtDetail;
	}
	public void setTermAmtDetail(CustScpBillAmtVO termAmtDetail) {
		this.termAmtDetail = termAmtDetail;
	}

	public String getTermTotalAmt() {
		return this.termTotalAmt;
	}
	public void setTermTotalAmt(String termTotalAmt) {
		this.termTotalAmt = termTotalAmt;
	}

}
