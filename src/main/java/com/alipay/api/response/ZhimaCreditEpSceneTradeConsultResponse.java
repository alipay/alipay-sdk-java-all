package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.scene.trade.consult response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-19 14:30:01
 */
public class ZhimaCreditEpSceneTradeConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 8688844272488497435L;

	/** 
	 * 评估结果：
ACCEPT：没有风险，
REJECT：有风险，
 REVIEW：需要面签
	 */
	@ApiField("decision")
	private String decision;

	/** 
	 * 芝麻企业信用评估订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 评估结果为REJECT时的原因说明，支持以下原因：SCORE_REJECT ：分数不准入
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	public void setDecision(String decision) {
		this.decision = decision;
	}
	public String getDecision( ) {
		return this.decision;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
	public String getRejectReason( ) {
		return this.rejectReason;
	}

}
