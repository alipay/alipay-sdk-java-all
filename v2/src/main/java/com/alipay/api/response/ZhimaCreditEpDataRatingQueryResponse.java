package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.data.rating.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:38:06
 */
public class ZhimaCreditEpDataRatingQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5533729577614694265L;

	/** 
	 * 评估额度，单位为人民币分。只有在decision =ACCEPT才会有值，其它情况为空
	 */
	@ApiField("amount")
	private Long amount;

	/** 
	 * 咨询成功返回SUCCESS；当decision为空时，会给出两种业务原因code，一种是PERMISSION_DENIED，一种是NO_DATA；枚举值：SUCCESS，PERMISSION_DENIED，NO_DATA；
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 企业的信用等级
	 */
	@ApiField("credit_level")
	private String creditLevel;

	/** 
	 * 风控决策结果，评估通过，没有风险返回ACCEPT； 拒绝，有风险返回REJECT。当企业不存在或者其他情况可能为空
	 */
	@ApiField("decision")
	private String decision;

	/** 
	 * 企业被拒绝，存放拒绝原因
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 芝麻企业数据评估订单号
	 */
	@ApiField("relation_order_no")
	private String relationOrderNo;

	/** 
	 * 商户请求的唯一标志，商户要保证其唯一性，可以传入流水号。建议：前面几位字符是商户自定义的简称，中间可以使用一段日期，结尾可以使用一个序列号。
	 */
	@ApiField("transaction_id")
	private String transactionId;

	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public Long getAmount( ) {
		return this.amount;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
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

	public void setRelationOrderNo(String relationOrderNo) {
		this.relationOrderNo = relationOrderNo;
	}
	public String getRelationOrderNo( ) {
		return this.relationOrderNo;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionId( ) {
		return this.transactionId;
	}

}
