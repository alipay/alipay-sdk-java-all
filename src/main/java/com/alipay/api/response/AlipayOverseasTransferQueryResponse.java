package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.transfer.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-03-19 20:50:10
 */
public class AlipayOverseasTransferQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8166861549934466977L;

	/** 
	 * 收款人附属信息
	 */
	@ApiField("additional_beneficiary_details")
	private String additionalBeneficiaryDetails;

	/** 
	 * 收端机构id
	 */
	@ApiField("beneficiary_agent_id")
	private String beneficiaryAgentId;

	/** 
	 * 汇款指令金额类型，表示期望汇款的固定一方金额
	 */
	@ApiField("instructed_amount_type")
	private String instructedAmountType;

	/** 
	 * 透传信息
	 */
	@ApiField("pass_through_info")
	private String passThroughInfo;

	/** 
	 * 发端机构id
	 */
	@ApiField("payer_agent_id")
	private String payerAgentId;

	/** 
	 * 转账人付款总量 json对象
	 */
	@ApiField("transfer_from_amount")
	private String transferFromAmount;

	/** 
	 * 汇款id
	 */
	@ApiField("transfer_id")
	private String transferId;

	/** 
	 * 报价信息json对象
	 */
	@ApiField("transfer_quote")
	private String transferQuote;

	/** 
	 * transferResult的json对象
	 */
	@ApiField("transfer_result")
	private String transferResult;

	/** 
	 * 汇款成功实践
	 */
	@ApiField("transfer_time")
	private Date transferTime;

	/** 
	 * 收款人收款总量 json对象
	 */
	@ApiField("transfer_to_amount")
	private String transferToAmount;

	public void setAdditionalBeneficiaryDetails(String additionalBeneficiaryDetails) {
		this.additionalBeneficiaryDetails = additionalBeneficiaryDetails;
	}
	public String getAdditionalBeneficiaryDetails( ) {
		return this.additionalBeneficiaryDetails;
	}

	public void setBeneficiaryAgentId(String beneficiaryAgentId) {
		this.beneficiaryAgentId = beneficiaryAgentId;
	}
	public String getBeneficiaryAgentId( ) {
		return this.beneficiaryAgentId;
	}

	public void setInstructedAmountType(String instructedAmountType) {
		this.instructedAmountType = instructedAmountType;
	}
	public String getInstructedAmountType( ) {
		return this.instructedAmountType;
	}

	public void setPassThroughInfo(String passThroughInfo) {
		this.passThroughInfo = passThroughInfo;
	}
	public String getPassThroughInfo( ) {
		return this.passThroughInfo;
	}

	public void setPayerAgentId(String payerAgentId) {
		this.payerAgentId = payerAgentId;
	}
	public String getPayerAgentId( ) {
		return this.payerAgentId;
	}

	public void setTransferFromAmount(String transferFromAmount) {
		this.transferFromAmount = transferFromAmount;
	}
	public String getTransferFromAmount( ) {
		return this.transferFromAmount;
	}

	public void setTransferId(String transferId) {
		this.transferId = transferId;
	}
	public String getTransferId( ) {
		return this.transferId;
	}

	public void setTransferQuote(String transferQuote) {
		this.transferQuote = transferQuote;
	}
	public String getTransferQuote( ) {
		return this.transferQuote;
	}

	public void setTransferResult(String transferResult) {
		this.transferResult = transferResult;
	}
	public String getTransferResult( ) {
		return this.transferResult;
	}

	public void setTransferTime(Date transferTime) {
		this.transferTime = transferTime;
	}
	public Date getTransferTime( ) {
		return this.transferTime;
	}

	public void setTransferToAmount(String transferToAmount) {
		this.transferToAmount = transferToAmount;
	}
	public String getTransferToAmount( ) {
		return this.transferToAmount;
	}

}
