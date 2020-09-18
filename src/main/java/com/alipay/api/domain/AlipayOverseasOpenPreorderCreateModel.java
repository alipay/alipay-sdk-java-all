package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预下单
 *
 * @author auto create
 * @since 1.0, 2020-05-26 16:12:00
 */
public class AlipayOverseasOpenPreorderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4455872627254889748L;

	/**
	 * ISV机构信息
	 */
	@ApiField("agent_info")
	private TuitionISVAgentInfoDTO agentInfo;

	/**
	 * 付款信息
	 */
	@ApiField("payment_info")
	private TuitionISVRequestPaymentInfoDTO paymentInfo;

	/**
	 * 单号
	 */
	@ApiField("pre_order_id")
	private String preOrderId;

	/**
	 * 学生信息
	 */
	@ApiField("student_info")
	private TuitionISVStudentInfoDTO studentInfo;

	public TuitionISVAgentInfoDTO getAgentInfo() {
		return this.agentInfo;
	}
	public void setAgentInfo(TuitionISVAgentInfoDTO agentInfo) {
		this.agentInfo = agentInfo;
	}

	public TuitionISVRequestPaymentInfoDTO getPaymentInfo() {
		return this.paymentInfo;
	}
	public void setPaymentInfo(TuitionISVRequestPaymentInfoDTO paymentInfo) {
		this.paymentInfo = paymentInfo;
	}

	public String getPreOrderId() {
		return this.preOrderId;
	}
	public void setPreOrderId(String preOrderId) {
		this.preOrderId = preOrderId;
	}

	public TuitionISVStudentInfoDTO getStudentInfo() {
		return this.studentInfo;
	}
	public void setStudentInfo(TuitionISVStudentInfoDTO studentInfo) {
		this.studentInfo = studentInfo;
	}

}
