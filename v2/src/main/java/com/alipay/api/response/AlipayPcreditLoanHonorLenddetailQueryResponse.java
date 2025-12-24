package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HonorContractDTO;
import com.alipay.api.domain.HonorRepayPlanTermDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.honor.lenddetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-12 17:12:40
 */
public class AlipayPcreditLoanHonorLenddetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8891518593741125499L;

	/** 
	 * 借款申请日期，格式yyyyMMdd
	 */
	@ApiField("apply_date")
	private String applyDate;

	/** 
	 * 渠道侧借款单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/** 
	 * 借款申请时间，时间戳毫秒
	 */
	@ApiField("apply_time")
	private Long applyTime;

	/** 
	 * 年利率
	 */
	@ApiField("apr")
	private String apr;

	/** 
	 * 收款卡发卡行code
	 */
	@ApiField("bind_bank_code")
	private String bindBankCode;

	/** 
	 * 收款卡发卡行名称
	 */
	@ApiField("bind_bank_name")
	private String bindBankName;

	/** 
	 * 收款卡号 (后四位)
	 */
	@ApiField("bind_card_no")
	private String bindCardNo;

	/** 
	 * 已签署的借款协议列表
	 */
	@ApiListField("contract_list")
	@ApiField("honor_contract_d_t_o")
	private List<HonorContractDTO> contractList;

	/** 
	 * 借款优惠券id
	 */
	@ApiField("coupon_no")
	private String couponNo;

	/** 
	 * 日利率
	 */
	@ApiField("day_rate")
	private String dayRate;

	/** 
	 * 借款起息日，格式yyyyMMdd
	 */
	@ApiField("effective_date")
	private String effectiveDate;

	/** 
	 * 机构名称(简称)，用于给用户展示放款机构，不能脱敏
	 */
	@ApiField("institution_names")
	private String institutionNames;

	/** 
	 * 借款金额，单位：分
	 */
	@ApiField("loan_amount")
	private String loanAmount;

	/** 
	 * 借款来源, appld（渠道侧提供）
	 */
	@ApiField("loan_source")
	private String loanSource;

	/** 
	 * 随身贷支用受理单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 借据逾期未还金额，单位分，有逾期必传
	 */
	@ApiField("overdue_amount")
	private String overdueAmount;

	/** 
	 * 借据逾期天数，有逾期必传
	 */
	@ApiField("overdue_days")
	private Long overdueDays;

	/** 
	 * 还款方式，枚举值：
1-等额本息(灵活还)，
2-等额本金(灵活还)，
3-先息后本(灵活还)，
4-等额本息(按期还)
	 */
	@ApiField("repay_method")
	private Long repayMethod;

	/** 
	 * 待还款计划列表（已经结清不查询）
	 */
	@ApiListField("repay_plan_terms")
	@ApiField("honor_repay_plan_term_d_t_o")
	private List<HonorRepayPlanTermDTO> repayPlanTerms;

	/** 
	 * 借据状态，枚举值：
1-申请中，
2-正常还款中，
3-已逾期，
4-已结清，
5-借款失败
	 */
	@ApiField("status")
	private Long status;

	/** 
	 * 借款期数
	 */
	@ApiField("total_term")
	private Long totalTerm;

	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}
	public String getApplyDate( ) {
		return this.applyDate;
	}

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}
	public String getApplyNo( ) {
		return this.applyNo;
	}

	public void setApplyTime(Long applyTime) {
		this.applyTime = applyTime;
	}
	public Long getApplyTime( ) {
		return this.applyTime;
	}

	public void setApr(String apr) {
		this.apr = apr;
	}
	public String getApr( ) {
		return this.apr;
	}

	public void setBindBankCode(String bindBankCode) {
		this.bindBankCode = bindBankCode;
	}
	public String getBindBankCode( ) {
		return this.bindBankCode;
	}

	public void setBindBankName(String bindBankName) {
		this.bindBankName = bindBankName;
	}
	public String getBindBankName( ) {
		return this.bindBankName;
	}

	public void setBindCardNo(String bindCardNo) {
		this.bindCardNo = bindCardNo;
	}
	public String getBindCardNo( ) {
		return this.bindCardNo;
	}

	public void setContractList(List<HonorContractDTO> contractList) {
		this.contractList = contractList;
	}
	public List<HonorContractDTO> getContractList( ) {
		return this.contractList;
	}

	public void setCouponNo(String couponNo) {
		this.couponNo = couponNo;
	}
	public String getCouponNo( ) {
		return this.couponNo;
	}

	public void setDayRate(String dayRate) {
		this.dayRate = dayRate;
	}
	public String getDayRate( ) {
		return this.dayRate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public String getEffectiveDate( ) {
		return this.effectiveDate;
	}

	public void setInstitutionNames(String institutionNames) {
		this.institutionNames = institutionNames;
	}
	public String getInstitutionNames( ) {
		return this.institutionNames;
	}

	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getLoanAmount( ) {
		return this.loanAmount;
	}

	public void setLoanSource(String loanSource) {
		this.loanSource = loanSource;
	}
	public String getLoanSource( ) {
		return this.loanSource;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setOverdueAmount(String overdueAmount) {
		this.overdueAmount = overdueAmount;
	}
	public String getOverdueAmount( ) {
		return this.overdueAmount;
	}

	public void setOverdueDays(Long overdueDays) {
		this.overdueDays = overdueDays;
	}
	public Long getOverdueDays( ) {
		return this.overdueDays;
	}

	public void setRepayMethod(Long repayMethod) {
		this.repayMethod = repayMethod;
	}
	public Long getRepayMethod( ) {
		return this.repayMethod;
	}

	public void setRepayPlanTerms(List<HonorRepayPlanTermDTO> repayPlanTerms) {
		this.repayPlanTerms = repayPlanTerms;
	}
	public List<HonorRepayPlanTermDTO> getRepayPlanTerms( ) {
		return this.repayPlanTerms;
	}

	public void setStatus(Long status) {
		this.status = status;
	}
	public Long getStatus( ) {
		return this.status;
	}

	public void setTotalTerm(Long totalTerm) {
		this.totalTerm = totalTerm;
	}
	public Long getTotalTerm( ) {
		return this.totalTerm;
	}

}
