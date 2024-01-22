package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.scene.rating.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 02:08:44
 */
public class ZhimaCreditEpSceneRatingQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2765991783777694973L;

	/** 
	 * 评估额度，单位为人民币分。只有在order_status=FINISH且在评估流程中credit_category对应的场景有额度时才会有值，其它情况为空
	 */
	@ApiField("amount")
	private Long amount;

	/** 
	 * 用户的信用层级。只有部分合作商户有输出，其它商户为空
	 */
	@ApiField("credit_level")
	private String creditLevel;

	/** 
	 * 风控决策结果，只有在order_status=FINISH时有值。评估通过，没有风险返回ACCEPT；
拒绝，有风险 返回REJECT；无法评估返回REVIEW。
	 */
	@ApiField("decision")
	private String decision;

	/** 
	 * 如果评估流程走的是企业评估流程，并且成功走完全流程，将会返回企业的以下两个公开信息(公开信息无需脱敏)：
ep_name：企业名称,
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
	 * 订单状态。初始化即进行中返回INIT；评估流程结束返回FINISH；评估流程异常或终止返回CLOSE。
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 商户请求订单号。
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 评估结果为REJECT时的原因说明。
支持以下原因：
SCORE_REJECT ：分数不准入；
CERTIFY_NOT_PASS：企业认证不通过。
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	/** 
	 * 芝麻信用评分，分值在[1000,2000]之间。如果无分则返回N/A。目前暂停输出。
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
