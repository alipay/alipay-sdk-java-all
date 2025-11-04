package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 车金融订单状态通知接口
 *
 * @author auto create
 * @since 1.0, 2025-10-22 15:55:26
 */
public class XingheLendassistCarfinApplystatusNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 4235393737418196891L;

	/**
	 * 星河侧唯一业务编号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 是否完成完善企业信息（人查企，含非企业主场景）
true/false
	 */
	@ApiField("company_info_completed")
	private Boolean companyInfoCompleted;

	/**
	 * 授信金额，单位分
	 */
	@ApiField("credit_amt")
	private Long creditAmt;

	/**
	 * 授信额度到期时间
	 */
	@ApiField("credit_amt_expire_date")
	private Date creditAmtExpireDate;

	/**
	 * 授信信息列表
	 */
	@ApiListField("credit_list")
	@ApiField("credit")
	private List<Credit> creditList;

	/**
	 * 取消失败时，申请单当前状态
	 */
	@ApiField("current_status")
	private String currentStatus;

	/**
	 * 客户状态
	 */
	@ApiField("cust_status")
	private String custStatus;

	/**
	 * 资方支用号
	 */
	@ApiField("fin_drawdown_no")
	private String finDrawdownNo;

	/**
	 * 资方机构名称
	 */
	@ApiField("fin_org")
	private String finOrg;

	/**
	 * 资金利率，如：1%传0.01
	 */
	@ApiField("fund_rate")
	private String fundRate;

	/**
	 * 是否完成实名认证，true/false
	 */
	@ApiField("identity_verified")
	private Boolean identityVerified;

	/**
	 * 放款金额，单位分
	 */
	@ApiField("loan_amt")
	private Long loanAmt;

	/**
	 * 客户放款成功日期，yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("loan_date")
	private String loanDate;

	/**
	 * 放款利率
	 */
	@ApiField("loan_rate")
	private String loanRate;

	/**
	 * 贷款期次，单位根据loan_term_unit字段决定(Y年/M月/D日)
	 */
	@ApiField("loan_term")
	private Long loanTerm;

	/**
	 * 贷款期次类型
Y、M、D分别代表年月日
	 */
	@ApiField("loan_term_unit")
	private String loanTermUnit;

	/**
	 * 是否合并初终审
	 */
	@ApiField("merged_approval_flag")
	private Boolean mergedApprovalFlag;

	/**
	 * 抵押率（授信金额/车辆估值金额），单位为小数
	 */
	@ApiField("mortgage_rate")
	private String mortgageRate;

	/**
	 * 机构侧支用号
	 */
	@ApiField("org_drawdown_no")
	private String orgDrawdownNo;

	/**
	 * 其他信息
	 */
	@ApiField("other")
	private CarfinStatusNotifyOther other;

	/**
	 * 机构侧唯一业务编号
	 */
	@ApiField("out_apply_no")
	private String outApplyNo;

	/**
	 * 拒绝原因错误
	 */
	@ApiField("refuse_code")
	private String refuseCode;

	/**
	 * 拒绝原因
	 */
	@ApiField("refuse_msg")
	private String refuseMsg;

	/**
	 * 还款方式，1：等额本金，2：等额本息，3：先息后本，4：一次性结清本息
	 */
	@ApiField("repay_type")
	private String repayType;

	/**
	 * 服务费率（融担费率、保险费率等），单位为小数
	 */
	@ApiField("service_fee_rate")
	private String serviceFeeRate;

	/**
	 * CANCEL_FAIL: 取消失败（适用于客户挽回成功的场景，经联系后客户愿意继续办理）
CANCEL_SUC: 取消成功（适用于客户确定放弃的场景，机构侧后续不能联系客户）
	 */
	@ApiField("status")
	private String status;

	/**
	 * 补充类别信息
	 */
	@ApiListField("supplement_category_list")
	@ApiField("supplement_category_info")
	private List<SupplementCategoryInfo> supplementCategoryList;

	/**
	 * 是否需要补充信息或流水
	 */
	@ApiField("supplement_info_flag")
	private Boolean supplementInfoFlag;

	/**
	 * 需要补充的原因
	 */
	@ApiField("supplement_reason")
	private String supplementReason;

	/**
	 * 是否支持先放后抵
	 */
	@ApiField("support_lend_before_mortgage")
	private Boolean supportLendBeforeMortgage;

	/**
	 * 用户类别
	 */
	@ApiField("user_tier")
	private String userTier;

	/**
	 * 车辆估值金额，单位分
	 */
	@ApiField("valuate_price")
	private Long valuatePrice;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public Boolean getCompanyInfoCompleted() {
		return this.companyInfoCompleted;
	}
	public void setCompanyInfoCompleted(Boolean companyInfoCompleted) {
		this.companyInfoCompleted = companyInfoCompleted;
	}

	public Long getCreditAmt() {
		return this.creditAmt;
	}
	public void setCreditAmt(Long creditAmt) {
		this.creditAmt = creditAmt;
	}

	public Date getCreditAmtExpireDate() {
		return this.creditAmtExpireDate;
	}
	public void setCreditAmtExpireDate(Date creditAmtExpireDate) {
		this.creditAmtExpireDate = creditAmtExpireDate;
	}

	public List<Credit> getCreditList() {
		return this.creditList;
	}
	public void setCreditList(List<Credit> creditList) {
		this.creditList = creditList;
	}

	public String getCurrentStatus() {
		return this.currentStatus;
	}
	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}

	public String getCustStatus() {
		return this.custStatus;
	}
	public void setCustStatus(String custStatus) {
		this.custStatus = custStatus;
	}

	public String getFinDrawdownNo() {
		return this.finDrawdownNo;
	}
	public void setFinDrawdownNo(String finDrawdownNo) {
		this.finDrawdownNo = finDrawdownNo;
	}

	public String getFinOrg() {
		return this.finOrg;
	}
	public void setFinOrg(String finOrg) {
		this.finOrg = finOrg;
	}

	public String getFundRate() {
		return this.fundRate;
	}
	public void setFundRate(String fundRate) {
		this.fundRate = fundRate;
	}

	public Boolean getIdentityVerified() {
		return this.identityVerified;
	}
	public void setIdentityVerified(Boolean identityVerified) {
		this.identityVerified = identityVerified;
	}

	public Long getLoanAmt() {
		return this.loanAmt;
	}
	public void setLoanAmt(Long loanAmt) {
		this.loanAmt = loanAmt;
	}

	public String getLoanDate() {
		return this.loanDate;
	}
	public void setLoanDate(String loanDate) {
		this.loanDate = loanDate;
	}

	public String getLoanRate() {
		return this.loanRate;
	}
	public void setLoanRate(String loanRate) {
		this.loanRate = loanRate;
	}

	public Long getLoanTerm() {
		return this.loanTerm;
	}
	public void setLoanTerm(Long loanTerm) {
		this.loanTerm = loanTerm;
	}

	public String getLoanTermUnit() {
		return this.loanTermUnit;
	}
	public void setLoanTermUnit(String loanTermUnit) {
		this.loanTermUnit = loanTermUnit;
	}

	public Boolean getMergedApprovalFlag() {
		return this.mergedApprovalFlag;
	}
	public void setMergedApprovalFlag(Boolean mergedApprovalFlag) {
		this.mergedApprovalFlag = mergedApprovalFlag;
	}

	public String getMortgageRate() {
		return this.mortgageRate;
	}
	public void setMortgageRate(String mortgageRate) {
		this.mortgageRate = mortgageRate;
	}

	public String getOrgDrawdownNo() {
		return this.orgDrawdownNo;
	}
	public void setOrgDrawdownNo(String orgDrawdownNo) {
		this.orgDrawdownNo = orgDrawdownNo;
	}

	public CarfinStatusNotifyOther getOther() {
		return this.other;
	}
	public void setOther(CarfinStatusNotifyOther other) {
		this.other = other;
	}

	public String getOutApplyNo() {
		return this.outApplyNo;
	}
	public void setOutApplyNo(String outApplyNo) {
		this.outApplyNo = outApplyNo;
	}

	public String getRefuseCode() {
		return this.refuseCode;
	}
	public void setRefuseCode(String refuseCode) {
		this.refuseCode = refuseCode;
	}

	public String getRefuseMsg() {
		return this.refuseMsg;
	}
	public void setRefuseMsg(String refuseMsg) {
		this.refuseMsg = refuseMsg;
	}

	public String getRepayType() {
		return this.repayType;
	}
	public void setRepayType(String repayType) {
		this.repayType = repayType;
	}

	public String getServiceFeeRate() {
		return this.serviceFeeRate;
	}
	public void setServiceFeeRate(String serviceFeeRate) {
		this.serviceFeeRate = serviceFeeRate;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public List<SupplementCategoryInfo> getSupplementCategoryList() {
		return this.supplementCategoryList;
	}
	public void setSupplementCategoryList(List<SupplementCategoryInfo> supplementCategoryList) {
		this.supplementCategoryList = supplementCategoryList;
	}

	public Boolean getSupplementInfoFlag() {
		return this.supplementInfoFlag;
	}
	public void setSupplementInfoFlag(Boolean supplementInfoFlag) {
		this.supplementInfoFlag = supplementInfoFlag;
	}

	public String getSupplementReason() {
		return this.supplementReason;
	}
	public void setSupplementReason(String supplementReason) {
		this.supplementReason = supplementReason;
	}

	public Boolean getSupportLendBeforeMortgage() {
		return this.supportLendBeforeMortgage;
	}
	public void setSupportLendBeforeMortgage(Boolean supportLendBeforeMortgage) {
		this.supportLendBeforeMortgage = supportLendBeforeMortgage;
	}

	public String getUserTier() {
		return this.userTier;
	}
	public void setUserTier(String userTier) {
		this.userTier = userTier;
	}

	public Long getValuatePrice() {
		return this.valuatePrice;
	}
	public void setValuatePrice(Long valuatePrice) {
		this.valuatePrice = valuatePrice;
	}

}
