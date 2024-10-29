package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TuitionISVAgentInfoDTO;
import com.alipay.api.domain.TuitionISVAmountInfoDTO;
import com.alipay.api.domain.TuitionISVResponsePaymentInfoDTO;
import com.alipay.api.domain.TuitionISVResult;
import com.alipay.api.domain.TuitionISVOrderStatusDTO;
import com.alipay.api.domain.TuitionISVStudentInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.open.preorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-21 18:27:01
 */
public class AlipayOverseasOpenPreorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8481351489261696844L;

	/** 
	 * 机构信息
	 */
	@ApiField("agent_info")
	private TuitionISVAgentInfoDTO agentInfo;

	/** 
	 * 付款金额
	 */
	@ApiField("payment_amount")
	private TuitionISVAmountInfoDTO paymentAmount;

	/** 
	 * payment_info（已废弃）
	 */
	@ApiField("payment_info")
	private TuitionISVResponsePaymentInfoDTO paymentInfo;

	/** 
	 * 预缴费单据号
	 */
	@ApiField("pre_order_id")
	private String preOrderId;

	/** 
	 * 退款金额
	 */
	@ApiField("refund_amount")
	private TuitionISVAmountInfoDTO refundAmount;

	/** 
	 * 留学汇款对isv返回结果
	 */
	@ApiField("result")
	private TuitionISVResult result;

	/** 
	 * 订单状态
	 */
	@ApiField("status")
	private TuitionISVOrderStatusDTO status;

	/** 
	 * 单据状态（已废弃）
	 */
	@ApiField("status_code")
	private String statusCode;

	/** 
	 * TuitionISVStudentInfoDTO（已废弃）
	 */
	@ApiField("student_info")
	private TuitionISVStudentInfoDTO studentInfo;

	public void setAgentInfo(TuitionISVAgentInfoDTO agentInfo) {
		this.agentInfo = agentInfo;
	}
	public TuitionISVAgentInfoDTO getAgentInfo( ) {
		return this.agentInfo;
	}

	public void setPaymentAmount(TuitionISVAmountInfoDTO paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public TuitionISVAmountInfoDTO getPaymentAmount( ) {
		return this.paymentAmount;
	}

	public void setPaymentInfo(TuitionISVResponsePaymentInfoDTO paymentInfo) {
		this.paymentInfo = paymentInfo;
	}
	public TuitionISVResponsePaymentInfoDTO getPaymentInfo( ) {
		return this.paymentInfo;
	}

	public void setPreOrderId(String preOrderId) {
		this.preOrderId = preOrderId;
	}
	public String getPreOrderId( ) {
		return this.preOrderId;
	}

	public void setRefundAmount(TuitionISVAmountInfoDTO refundAmount) {
		this.refundAmount = refundAmount;
	}
	public TuitionISVAmountInfoDTO getRefundAmount( ) {
		return this.refundAmount;
	}

	public void setResult(TuitionISVResult result) {
		this.result = result;
	}
	public TuitionISVResult getResult( ) {
		return this.result;
	}

	public void setStatus(TuitionISVOrderStatusDTO status) {
		this.status = status;
	}
	public TuitionISVOrderStatusDTO getStatus( ) {
		return this.status;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusCode( ) {
		return this.statusCode;
	}

	public void setStudentInfo(TuitionISVStudentInfoDTO studentInfo) {
		this.studentInfo = studentInfo;
	}
	public TuitionISVStudentInfoDTO getStudentInfo( ) {
		return this.studentInfo;
	}

}
