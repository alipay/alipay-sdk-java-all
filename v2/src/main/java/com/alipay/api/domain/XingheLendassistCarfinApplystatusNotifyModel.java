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
 * @since 1.0, 2025-02-10 18:03:04
 */
public class XingheLendassistCarfinApplystatusNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 2217589926369756525L;

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
	 * 贷款期次
	 */
	@ApiField("loan_term")
	private Long loanTerm;

	/**
	 * 客户贷款期次类型，Y、M、D分别代表年月日
	 */
	@ApiField("loan_term_unit")
	private String loanTermUnit;

	/**
	 * 抵押率，授信金额/车辆估值金额
	 */
	@ApiField("mortgage_rate")
	private String mortgageRate;

	/**
	 * 机构侧支用号，放款时必传
	 */
	@ApiField("org_drawdown_no")
	private String orgDrawdownNo;

	/**
	 * 机构侧唯一业务编号
	 */
	@ApiField("out_apply_no")
	private String outApplyNo;

	/**
	 * 拒绝原因错误码
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
	 * CANCEL_FAIL: 取消失败（适用于客户挽回成功的场景，经联系后客户愿意继续办理）
CANCEL_SUC: 取消成功（适用于客户确定放弃的场景，机构侧后续不能联系客户）
	 */
	@ApiField("status")
	private String status;

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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getValuatePrice() {
		return this.valuatePrice;
	}
	public void setValuatePrice(Long valuatePrice) {
		this.valuatePrice = valuatePrice;
	}

}
