package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MyBkAccountVO;
import com.alipay.api.domain.LoanChargeInfo;
import com.alipay.api.domain.InstallmentValue;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.loanscheme.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-24 11:11:00
 */
public class MybankCreditLoantradeLoanschemeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5368637143974546723L;

	/** 
	 * 收款账号
	 */
	@ApiListField("account_vo")
	@ApiField("my_bk_account_v_o")
	private List<MyBkAccountVO> accountVo;

	/** 
	 * 警戒额度，单位元
	 */
	@ApiField("alert_amt")
	private String alertAmt;

	/** 
	 * 费用列表
	 */
	@ApiListField("charge_info_list")
	@ApiField("loan_charge_info")
	private List<LoanChargeInfo> chargeInfoList;

	/** 
	 * 授信有效截止日期(日期精度为天,包含截止日)，必选
	 */
	@ApiField("credit_expire_date")
	private Date creditExpireDate;

	/** 
	 * 授信额度，政策模型或人工审批出来的授信，单位元
	 */
	@ApiField("credit_lmt_amt")
	private String creditLmtAmt;

	/** 
	 * 授信编号,允许为空
	 */
	@ApiField("credit_no")
	private String creditNo;

	/** 
	 * 授信方式,包括预授信方式、自动授信方式、人工授信方式
	 */
	@ApiField("credit_source")
	private String creditSource;

	/** 
	 * 授信有效起始日期(日期精度为天,包含起始日)，必选
	 */
	@ApiField("credit_start_date")
	private Date creditStartDate;

	/** 
	 * 利率. 年利率小数
	 */
	@ApiField("int_rate")
	private String intRate;

	/** 
	 * 政策产品码(微贷的政策产品码,BC开头)
	 */
	@ApiField("loan_policy_code")
	private String loanPolicyCode;

	/** 
	 * 期限,指贷款期限的长度
	 */
	@ApiField("loan_term")
	private Long loanTerm;

	/** 
	 * 期限单位；贷款期限的长度单位，有年、月、日
	 */
	@ApiField("loan_term_unit")
	private String loanTermUnit;

	/** 
	 * 可贷额度，单位元
	 */
	@ApiField("loanable_amt")
	private String loanableAmt;

	/** 
	 * 还款方式集合
	 */
	@ApiField("repay_mode_list")
	private InstallmentValue repayModeList;

	/** 
	 * 金融云产品编码
	 */
	@ApiField("sale_pd_code")
	private String salePdCode;

	/** 
	 * 水位额度，单位元
	 */
	@ApiField("water_amt")
	private String waterAmt;

	public void setAccountVo(List<MyBkAccountVO> accountVo) {
		this.accountVo = accountVo;
	}
	public List<MyBkAccountVO> getAccountVo( ) {
		return this.accountVo;
	}

	public void setAlertAmt(String alertAmt) {
		this.alertAmt = alertAmt;
	}
	public String getAlertAmt( ) {
		return this.alertAmt;
	}

	public void setChargeInfoList(List<LoanChargeInfo> chargeInfoList) {
		this.chargeInfoList = chargeInfoList;
	}
	public List<LoanChargeInfo> getChargeInfoList( ) {
		return this.chargeInfoList;
	}

	public void setCreditExpireDate(Date creditExpireDate) {
		this.creditExpireDate = creditExpireDate;
	}
	public Date getCreditExpireDate( ) {
		return this.creditExpireDate;
	}

	public void setCreditLmtAmt(String creditLmtAmt) {
		this.creditLmtAmt = creditLmtAmt;
	}
	public String getCreditLmtAmt( ) {
		return this.creditLmtAmt;
	}

	public void setCreditNo(String creditNo) {
		this.creditNo = creditNo;
	}
	public String getCreditNo( ) {
		return this.creditNo;
	}

	public void setCreditSource(String creditSource) {
		this.creditSource = creditSource;
	}
	public String getCreditSource( ) {
		return this.creditSource;
	}

	public void setCreditStartDate(Date creditStartDate) {
		this.creditStartDate = creditStartDate;
	}
	public Date getCreditStartDate( ) {
		return this.creditStartDate;
	}

	public void setIntRate(String intRate) {
		this.intRate = intRate;
	}
	public String getIntRate( ) {
		return this.intRate;
	}

	public void setLoanPolicyCode(String loanPolicyCode) {
		this.loanPolicyCode = loanPolicyCode;
	}
	public String getLoanPolicyCode( ) {
		return this.loanPolicyCode;
	}

	public void setLoanTerm(Long loanTerm) {
		this.loanTerm = loanTerm;
	}
	public Long getLoanTerm( ) {
		return this.loanTerm;
	}

	public void setLoanTermUnit(String loanTermUnit) {
		this.loanTermUnit = loanTermUnit;
	}
	public String getLoanTermUnit( ) {
		return this.loanTermUnit;
	}

	public void setLoanableAmt(String loanableAmt) {
		this.loanableAmt = loanableAmt;
	}
	public String getLoanableAmt( ) {
		return this.loanableAmt;
	}

	public void setRepayModeList(InstallmentValue repayModeList) {
		this.repayModeList = repayModeList;
	}
	public InstallmentValue getRepayModeList( ) {
		return this.repayModeList;
	}

	public void setSalePdCode(String salePdCode) {
		this.salePdCode = salePdCode;
	}
	public String getSalePdCode( ) {
		return this.salePdCode;
	}

	public void setWaterAmt(String waterAmt) {
		this.waterAmt = waterAmt;
	}
	public String getWaterAmt( ) {
		return this.waterAmt;
	}

}
