package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.paymenthub.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:01
 */
public class AlipayBusinessPaymenthubQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4835794954549498514L;

	/** 
	 * 支付，打款或者退款的操作金额
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 聚合支付的支付渠道，支付宝分配。
	 */
	@ApiField("channel")
	private String channel;

	/** 
	 * 支付、打款、退款时候支付宝返回的唯一凭证id，调用方查询时候建议优先传入该值，内部处理时优先以该值为准。instruction_id和out_request_no不能同时为空。
	 */
	@ApiField("instruction_id")
	private String instructionId;

	/** 
	 * 指令类型，表明该笔查询是支付，打款还是退款，跟out_request_no一起使用。 
支付：PAY 
打款：DISBURSE 
退款：REFUND
	 */
	@ApiField("instruction_type")
	private String instructionType;

	/** 
	 * 支付、打款或退款请求号，out_request_no和instruction_id不能同时为空。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 支付，打款或者退款的状态，目前支持如下值：
WAIT（指令操作已受理）；
SUCCESS（指令操作成功）；
FAIL（指令操作失败）。
	 */
	@ApiField("status")
	private String status;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getChannel( ) {
		return this.channel;
	}

	public void setInstructionId(String instructionId) {
		this.instructionId = instructionId;
	}
	public String getInstructionId( ) {
		return this.instructionId;
	}

	public void setInstructionType(String instructionType) {
		this.instructionType = instructionType;
	}
	public String getInstructionType( ) {
		return this.instructionType;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
