package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InstallmentMetaInfo;
import com.alipay.api.domain.InstallmentRepayPlan;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.loanar.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class MybankCreditLoantradeLoanarQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4859745659212183679L;

	/** 
	 * 合约状态 NORMAL:正常 ,OVD:逾期, CLEAR:结清
	 */
	@ApiField("arg_status")
	private String argStatus;

	/** 
	 * 利率
	 */
	@ApiListField("instal_int_rate")
	@ApiField("installment_meta_info")
	private List<InstallmentMetaInfo> instalIntRate;

	/** 
	 * 分期还款计划
	 */
	@ApiListField("installment_repay_plans")
	@ApiField("installment_repay_plan")
	private List<InstallmentRepayPlan> installmentRepayPlans;

	/** 
	 * 合约编号
	 */
	@ApiField("loan_ar_no")
	private String loanArNo;

	/** 
	 * 贷款期限,包含单位，有年、月、日
	 */
	@ApiField("loan_term")
	private String loanTerm;

	/** 
	 * 正常利息
	 */
	@ApiField("nom_int")
	private String nomInt;

	/** 
	 * 正常本金
	 */
	@ApiField("nom_prin")
	private String nomPrin;

	/** 
	 * 逾期利息
	 */
	@ApiField("ovd_int")
	private String ovdInt;

	/** 
	 * 逾期利息罚息
	 */
	@ApiField("ovd_int_pen_int")
	private String ovdIntPenInt;

	/** 
	 * 逾期本金
	 */
	@ApiField("ovd_prin")
	private String ovdPrin;

	/** 
	 * 逾期本金罚息
	 */
	@ApiField("ovd_prin_pen_int")
	private String ovdPrinPenInt;

	/** 
	 * 还款方式。若为分段还款，则存储的为分段还款方式的分段值。否则，该list仅含一个元素，为当前的还款方式
	 */
	@ApiListField("repay_modes")
	@ApiField("installment_meta_info")
	private List<InstallmentMetaInfo> repayModes;

	public void setArgStatus(String argStatus) {
		this.argStatus = argStatus;
	}
	public String getArgStatus( ) {
		return this.argStatus;
	}

	public void setInstalIntRate(List<InstallmentMetaInfo> instalIntRate) {
		this.instalIntRate = instalIntRate;
	}
	public List<InstallmentMetaInfo> getInstalIntRate( ) {
		return this.instalIntRate;
	}

	public void setInstallmentRepayPlans(List<InstallmentRepayPlan> installmentRepayPlans) {
		this.installmentRepayPlans = installmentRepayPlans;
	}
	public List<InstallmentRepayPlan> getInstallmentRepayPlans( ) {
		return this.installmentRepayPlans;
	}

	public void setLoanArNo(String loanArNo) {
		this.loanArNo = loanArNo;
	}
	public String getLoanArNo( ) {
		return this.loanArNo;
	}

	public void setLoanTerm(String loanTerm) {
		this.loanTerm = loanTerm;
	}
	public String getLoanTerm( ) {
		return this.loanTerm;
	}

	public void setNomInt(String nomInt) {
		this.nomInt = nomInt;
	}
	public String getNomInt( ) {
		return this.nomInt;
	}

	public void setNomPrin(String nomPrin) {
		this.nomPrin = nomPrin;
	}
	public String getNomPrin( ) {
		return this.nomPrin;
	}

	public void setOvdInt(String ovdInt) {
		this.ovdInt = ovdInt;
	}
	public String getOvdInt( ) {
		return this.ovdInt;
	}

	public void setOvdIntPenInt(String ovdIntPenInt) {
		this.ovdIntPenInt = ovdIntPenInt;
	}
	public String getOvdIntPenInt( ) {
		return this.ovdIntPenInt;
	}

	public void setOvdPrin(String ovdPrin) {
		this.ovdPrin = ovdPrin;
	}
	public String getOvdPrin( ) {
		return this.ovdPrin;
	}

	public void setOvdPrinPenInt(String ovdPrinPenInt) {
		this.ovdPrinPenInt = ovdPrinPenInt;
	}
	public String getOvdPrinPenInt( ) {
		return this.ovdPrinPenInt;
	}

	public void setRepayModes(List<InstallmentMetaInfo> repayModes) {
		this.repayModes = repayModes;
	}
	public List<InstallmentMetaInfo> getRepayModes( ) {
		return this.repayModes;
	}

}
