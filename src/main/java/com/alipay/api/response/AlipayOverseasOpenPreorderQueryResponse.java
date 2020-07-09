package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TuitionISVAgentInfoDTO;
import com.alipay.api.domain.TuitionISVResponsePaymentInfoDTO;
import com.alipay.api.domain.TuitionISVResult;
import com.alipay.api.domain.TuitionISVStudentInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.open.preorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-05-26 16:42:25
 */
public class AlipayOverseasOpenPreorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8838795717769665242L;

	/** 
	 * 机构信息
	 */
	@ApiField("agent_info")
	private TuitionISVAgentInfoDTO agentInfo;

	/** 
	 * payment_info
	 */
	@ApiField("payment_info")
	private TuitionISVResponsePaymentInfoDTO paymentInfo;

	/** 
	 * 预缴费单据号
	 */
	@ApiField("pre_order_id")
	private String preOrderId;

	/** 
	 * 留学汇款对isv返回结果
	 */
	@ApiField("result")
	private TuitionISVResult result;

	/** 
	 * 单据状态
	 */
	@ApiField("status_code")
	private String statusCode;

	/** 
	 * TuitionISVStudentInfoDTO
	 */
	@ApiField("student_info")
	private TuitionISVStudentInfoDTO studentInfo;

	public void setAgentInfo(TuitionISVAgentInfoDTO agentInfo) {
		this.agentInfo = agentInfo;
	}
	public TuitionISVAgentInfoDTO getAgentInfo( ) {
		return this.agentInfo;
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

	public void setResult(TuitionISVResult result) {
		this.result = result;
	}
	public TuitionISVResult getResult( ) {
		return this.result;
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
