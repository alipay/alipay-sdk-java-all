package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 差额追偿快赔退款
 *
 * @author auto create
 * @since 1.0, 2024-09-19 17:50:29
 */
public class AlipayCommerceMedicalInsurancePayRefundModel extends AlipayObject {

	private static final long serialVersionUID = 6737364272233378324L;

	/**
	 * 申请单号，快赔时必填
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 业务类型，1：快赔退款，2：差额追偿
	 */
	@ApiField("biz_type")
	private Long bizType;

	/**
	 * 理赔案件号，当业务类型为快赔退款时必填
	 */
	@ApiField("claim_order_no")
	private String claimOrderNo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部支付单号
	 */
	@ApiField("out_pay_order_no")
	private String outPayOrderNo;

	/**
	 * 请求来源，固定值，由支付宝侧统一定义给出，标识用户请求来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 订单标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public Long getBizType() {
		return this.bizType;
	}
	public void setBizType(Long bizType) {
		this.bizType = bizType;
	}

	public String getClaimOrderNo() {
		return this.claimOrderNo;
	}
	public void setClaimOrderNo(String claimOrderNo) {
		this.claimOrderNo = claimOrderNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutPayOrderNo() {
		return this.outPayOrderNo;
	}
	public void setOutPayOrderNo(String outPayOrderNo) {
		this.outPayOrderNo = outPayOrderNo;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
