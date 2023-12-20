package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.order.rating.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:59:26
 */
public class ZhimaCreditEpOrderRatingQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6628743864896274935L;

	/** 
	 * 评估额度;
单位为人民币分；
	 */
	@ApiField("amount")
	private Long amount;

	/** 
	 * 用户的信用层级；部分行业场景输出，使用前请先跟对接BD沟通该行业场景下是否会输出该信用层级以及层级的值范围。
	 */
	@ApiField("credit_level")
	private String creditLevel;

	/** 
	 * 风控决策结果：
ACCEPT：通过，没有风险；
REJECT：拒绝，有风险 ；
REVIEW:无法评估；
	 */
	@ApiField("decision")
	private String decision;

	/** 
	 * 订单查询返回扩展信息，根据特定场景下允许传回企业三要素：
ep_name：企业名称；
ep_cert_type：企业证件类型，目前支持：NATIONAL_LEGAL---工商注册号
,NATIONAL_LEGAL_MERGE---社会统一信用代码;
ep_cert_no：企业证件号
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 芝麻企业信用评估订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 订单状态 
INIT:初始化，
FINISH:订单完成，
CLOSE:订单关闭，已失败 。
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 关联的商户订单唯一标识，64位长度的字母数字下划线组合。该标识作为对账的关键信息，商户要保证其唯一性。
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 评估结果为REJECT时的原因说明，
支持以下原因：
SCORE_REJECT ：分数不准入
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	/** 
	 * 被查询企业的芝麻信用评分，分值在[1000,2000]之间。如果无分则返回N/A。签约时决定是否输出
	 */
	@ApiField("zm_score")
	private String zmScore;

	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public Long getAmount( ) {
		return this.amount;
	}

	public void setCreditLevel(String creditLevel) {
		this.creditLevel = creditLevel;
	}
	public String getCreditLevel( ) {
		return this.creditLevel;
	}

	public void setDecision(String decision) {
		this.decision = decision;
	}
	public String getDecision( ) {
		return this.decision;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
	public String getRejectReason( ) {
		return this.rejectReason;
	}

	public void setZmScore(String zmScore) {
		this.zmScore = zmScore;
	}
	public String getZmScore( ) {
		return this.zmScore;
	}

}
