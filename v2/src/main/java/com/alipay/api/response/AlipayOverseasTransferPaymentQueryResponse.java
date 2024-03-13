package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.transfer.payment.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 21:02:12
 */
public class AlipayOverseasTransferPaymentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7565539713237236199L;

	/** 
	 * 收款人明细
	 */
	@ApiField("additional_beneficiary_details")
	private String additionalBeneficiaryDetails;

	/** 
	 * 汇款指令金额类型，表示期望汇款的固定一方金额
	 */
	@ApiField("instructed_amount_type")
	private String instructedAmountType;

	/** 
	 * 透传字段，采用key-value的方式存储
	 */
	@ApiField("pass_through_info")
	private String passThroughInfo;

	/** 
	 * 汇款金额（from）
	 */
	@ApiField("transfer_from_amount")
	private String transferFromAmount;

	/** 
	 * 主站交易流水号
	 */
	@ApiField("transfer_id")
	private String transferId;

	/** 
	 * 汇款结果
	 */
	@ApiField("transfer_result")
	private String transferResult;

	/** 
	 * 汇款时间
	 */
	@ApiField("transfer_time")
	private Date transferTime;

	/** 
	 * 汇款金额（to）
	 */
	@ApiField("transfer_to_amount")
	private String transferToAmount;

	public void setAdditionalBeneficiaryDetails(String additionalBeneficiaryDetails) {
		this.additionalBeneficiaryDetails = additionalBeneficiaryDetails;
	}
	public String getAdditionalBeneficiaryDetails( ) {
		return this.additionalBeneficiaryDetails;
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
