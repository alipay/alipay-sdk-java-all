package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HonorBankCardDTO;
import com.alipay.api.domain.HonorContractDTO;
import com.alipay.api.domain.HonorRepayPlanTermDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.honor.lendcalc.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-12 17:12:39
 */
public class AlipayPcreditLoanHonorLendcalcConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6117422379382984579L;

	/** 
	 * 综合年利率, 示例12.95【即12.95%】 (优惠后)
	 */
	@ApiField("annual_rate")
	private String annualRate;

	/** 
	 * 默选的银行卡信息
	 */
	@ApiField("bank_card")
	private HonorBankCardDTO bankCard;

	/** 
	 * 返回借款协议，默认返回
	 */
	@ApiListField("contract")
	@ApiField("honor_contract_d_t_o")
	private List<HonorContractDTO> contract;

	/** 
	 * 首次还款日, 格式yyyyMMdd
	 */
	@ApiField("first_repay_date")
	private String firstRepayDate;

	/** 
	 * 最后还款日, 格式yyyyMMdd
	 */
	@ApiField("last_repay_date")
	private String lastRepayDate;

	/** 
	 * 优惠前原价年利率, 示例12.95【即12.95%】
	 */
	@ApiField("original_rate")
	private String originalRate;

	/** 
	 * 拒绝原因码, status=1时必传
	 */
	@ApiField("refuse_code")
	private String refuseCode;

	/** 
	 * 拒绝原因说明, status=1时必传
	 */
	@ApiField("refuse_msg")
	private String refuseMsg;

	/** 
	 * 拒绝具体原因说明， status=1时必传
	 */
	@ApiField("refuse_msg_data")
	private String refuseMsgData;

	/** 
	 * 还款计划
	 */
	@ApiListField("repay_plan_terms")
	@ApiField("honor_repay_plan_term_d_t_o")
	private List<HonorRepayPlanTermDTO> repayPlanTerms;

	/** 
	 * 应还总额，单位：分(应还总额=应还本金总额+应还利息总额)
	 */
	@ApiField("should_repay_amount")
	private String shouldRepayAmount;

	/** 
	 * 应还利息总额，单位：分
	 */
	@ApiField("should_repay_inter_amount")
	private String shouldRepayInterAmount;

	/** 
	 * 应还本金总额，单位：分
	 */
	@ApiField("should_repay_prin_amount")
	private String shouldRepayPrinAmount;

	/** 
	 * 出资方
	 */
	@ApiField("stakeholders")
	private String stakeholders;

	/** 
	 * 状态，
1、拒绝 
2、通过
	 */
	@ApiField("status")
	private Long status;

	/** 
	 * 总优惠金额，单位：分
	 */
	@ApiField("total_discount")
	private String totalDiscount;

	/** 
	 * 借款试算咨询id
	 */
	@ApiField("trial_serial_no")
	private String trialSerialNo;

	public void setAnnualRate(String annualRate) {
		this.annualRate = annualRate;
	}
	public String getAnnualRate( ) {
		return this.annualRate;
	}

	public void setBankCard(HonorBankCardDTO bankCard) {
		this.bankCard = bankCard;
	}
	public HonorBankCardDTO getBankCard( ) {
		return this.bankCard;
	}

	public void setContract(List<HonorContractDTO> contract) {
		this.contract = contract;
	}
	public List<HonorContractDTO> getContract( ) {
		return this.contract;
	}

	public void setFirstRepayDate(String firstRepayDate) {
		this.firstRepayDate = firstRepayDate;
	}
	public String getFirstRepayDate( ) {
		return this.firstRepayDate;
	}

	public void setLastRepayDate(String lastRepayDate) {
		this.lastRepayDate = lastRepayDate;
	}
	public String getLastRepayDate( ) {
		return this.lastRepayDate;
	}

	public void setOriginalRate(String originalRate) {
		this.originalRate = originalRate;
	}
	public String getOriginalRate( ) {
		return this.originalRate;
	}

	public void setRefuseCode(String refuseCode) {
		this.refuseCode = refuseCode;
	}
	public String getRefuseCode( ) {
		return this.refuseCode;
	}

	public void setRefuseMsg(String refuseMsg) {
		this.refuseMsg = refuseMsg;
	}
	public String getRefuseMsg( ) {
		return this.refuseMsg;
	}

	public void setRefuseMsgData(String refuseMsgData) {
		this.refuseMsgData = refuseMsgData;
	}
	public String getRefuseMsgData( ) {
		return this.refuseMsgData;
	}

	public void setRepayPlanTerms(List<HonorRepayPlanTermDTO> repayPlanTerms) {
		this.repayPlanTerms = repayPlanTerms;
	}
	public List<HonorRepayPlanTermDTO> getRepayPlanTerms( ) {
		return this.repayPlanTerms;
	}

	public void setShouldRepayAmount(String shouldRepayAmount) {
		this.shouldRepayAmount = shouldRepayAmount;
	}
	public String getShouldRepayAmount( ) {
		return this.shouldRepayAmount;
	}

	public void setShouldRepayInterAmount(String shouldRepayInterAmount) {
		this.shouldRepayInterAmount = shouldRepayInterAmount;
	}
	public String getShouldRepayInterAmount( ) {
		return this.shouldRepayInterAmount;
	}

	public void setShouldRepayPrinAmount(String shouldRepayPrinAmount) {
		this.shouldRepayPrinAmount = shouldRepayPrinAmount;
	}
	public String getShouldRepayPrinAmount( ) {
		return this.shouldRepayPrinAmount;
	}

	public void setStakeholders(String stakeholders) {
		this.stakeholders = stakeholders;
	}
	public String getStakeholders( ) {
		return this.stakeholders;
	}

	public void setStatus(Long status) {
		this.status = status;
	}
	public Long getStatus( ) {
		return this.status;
	}

	public void setTotalDiscount(String totalDiscount) {
		this.totalDiscount = totalDiscount;
	}
	public String getTotalDiscount( ) {
		return this.totalDiscount;
	}

	public void setTrialSerialNo(String trialSerialNo) {
		this.trialSerialNo = trialSerialNo;
	}
	public String getTrialSerialNo( ) {
		return this.trialSerialNo;
	}

}
