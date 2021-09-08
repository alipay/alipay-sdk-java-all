package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RepayDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.studentloan.repay.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:13:51
 */
public class AlipayFundStudentloanRepayQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4842795756366789812L;

	/** 
	 * 业务类型 A生源地 B高校
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 学生所在分行名称
	 */
	@ApiField("branch_name")
	private String branchName;

	/** 
	 * 学生所在区县或高校
	 */
	@ApiField("org_name")
	private String orgName;

	/** 
	 * 还款日期，格式yyyy-MM-dd
	 */
	@ApiField("repay_date")
	private String repayDate;

	/** 
	 * 还款明细列表
	 */
	@ApiListField("repay_list")
	@ApiField("repay_detail")
	private List<RepayDetail> repayList;

	/** 
	 * 学生当前应还金额汇总
	 */
	@ApiField("should_amount")
	private String shouldAmount;

	/** 
	 * 李某
	 */
	@ApiField("student_name")
	private String studentName;

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchName( ) {
		return this.branchName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getOrgName( ) {
		return this.orgName;
	}

	public void setRepayDate(String repayDate) {
		this.repayDate = repayDate;
	}
	public String getRepayDate( ) {
		return this.repayDate;
	}

	public void setRepayList(List<RepayDetail> repayList) {
		this.repayList = repayList;
	}
	public List<RepayDetail> getRepayList( ) {
		return this.repayList;
	}

	public void setShouldAmount(String shouldAmount) {
		this.shouldAmount = shouldAmount;
	}
	public String getShouldAmount( ) {
		return this.shouldAmount;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentName( ) {
		return this.studentName;
	}

}
