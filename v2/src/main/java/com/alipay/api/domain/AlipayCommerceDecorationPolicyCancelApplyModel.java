package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 家装险退保申请接口
 *
 * @author auto create
 * @since 1.0, 2026-04-10 10:07:45
 */
public class AlipayCommerceDecorationPolicyCancelApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8216127816185672316L;

	/**
	 * 保司保单号
	 */
	@ApiField("inst_policy_no")
	private String instPolicyNo;

	/**
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 退保请求流水号
	 */
	@ApiField("surrender_flow_no")
	private String surrenderFlowNo;

	public String getInstPolicyNo() {
		return this.instPolicyNo;
	}
	public void setInstPolicyNo(String instPolicyNo) {
		this.instPolicyNo = instPolicyNo;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getSurrenderFlowNo() {
		return this.surrenderFlowNo;
	}
	public void setSurrenderFlowNo(String surrenderFlowNo) {
		this.surrenderFlowNo = surrenderFlowNo;
	}

}
