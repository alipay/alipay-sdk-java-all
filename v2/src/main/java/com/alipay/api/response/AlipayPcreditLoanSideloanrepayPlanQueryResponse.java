package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MergedInstallmentBill;
import com.alipay.api.domain.InstallmentBill;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.sideloanrepay.plan.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-02 17:47:24
 */
public class AlipayPcreditLoanSideloanrepayPlanQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2369751733365973444L;

	/** 
	 * 所有到期分期汇总合并信息
	 */
	@ApiField("due_merged_installment_bill")
	private MergedInstallmentBill dueMergedInstallmentBill;

	/** 
	 * 最近一期分期账单合并
	 */
	@ApiField("following_merged_installment_bill")
	private MergedInstallmentBill followingMergedInstallmentBill;

	/** 
	 * 分期账单列表
	 */
	@ApiListField("installment_bill_list")
	@ApiField("installment_bill")
	private List<InstallmentBill> installmentBillList;

	/** 
	 * 所有逾期分期汇总
	 */
	@ApiField("overdue_merged_installment_bill")
	private MergedInstallmentBill overdueMergedInstallmentBill;

	/** 
	 * 表示请求处理状态。 SUCCESS - 成功 NEED_RETRY -需要重试 FAIL - 不可重试
	 */
	@ApiField("return_code")
	private String returnCode;

	/** 
	 * returnCode为FAIL或者NEED_RETRY状态下，返回具体错误码
	 */
	@ApiField("return_sub_code")
	private String returnSubCode;

	/** 
	 * 可以详细描述失败原因，方便双方定位问题
	 */
	@ApiField("return_sub_message")
	private String returnSubMessage;

	/** 
	 * 未结清借据总数
	 */
	@ApiField("unpaid_loan_total")
	private Long unpaidLoanTotal;

	public void setDueMergedInstallmentBill(MergedInstallmentBill dueMergedInstallmentBill) {
		this.dueMergedInstallmentBill = dueMergedInstallmentBill;
	}
	public MergedInstallmentBill getDueMergedInstallmentBill( ) {
		return this.dueMergedInstallmentBill;
	}

	public void setFollowingMergedInstallmentBill(MergedInstallmentBill followingMergedInstallmentBill) {
		this.followingMergedInstallmentBill = followingMergedInstallmentBill;
	}
	public MergedInstallmentBill getFollowingMergedInstallmentBill( ) {
		return this.followingMergedInstallmentBill;
	}

	public void setInstallmentBillList(List<InstallmentBill> installmentBillList) {
		this.installmentBillList = installmentBillList;
	}
	public List<InstallmentBill> getInstallmentBillList( ) {
		return this.installmentBillList;
	}

	public void setOverdueMergedInstallmentBill(MergedInstallmentBill overdueMergedInstallmentBill) {
		this.overdueMergedInstallmentBill = overdueMergedInstallmentBill;
	}
	public MergedInstallmentBill getOverdueMergedInstallmentBill( ) {
		return this.overdueMergedInstallmentBill;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	public String getReturnCode( ) {
		return this.returnCode;
	}

	public void setReturnSubCode(String returnSubCode) {
		this.returnSubCode = returnSubCode;
	}
	public String getReturnSubCode( ) {
		return this.returnSubCode;
	}

	public void setReturnSubMessage(String returnSubMessage) {
		this.returnSubMessage = returnSubMessage;
	}
	public String getReturnSubMessage( ) {
		return this.returnSubMessage;
	}

	public void setUnpaidLoanTotal(Long unpaidLoanTotal) {
		this.unpaidLoanTotal = unpaidLoanTotal;
	}
	public Long getUnpaidLoanTotal( ) {
		return this.unpaidLoanTotal;
	}

}
