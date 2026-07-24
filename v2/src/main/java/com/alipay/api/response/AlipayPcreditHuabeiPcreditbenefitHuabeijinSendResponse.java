package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.pcreditbenefit.huabeijin.send response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-14 14:42:51
 */
public class AlipayPcreditHuabeiPcreditbenefitHuabeijinSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7324593636558738119L;

	/** 
	 * 用户发奖活动调用成功之后给用户的单据id，用于后续的变更操作
	 */
	@ApiField("activity_order_id")
	private String activityOrderId;

	/** 
	 * 计算后的待领取花呗金数量
	 */
	@ApiField("calculated_amount")
	private Long calculatedAmount;

	/** 
	 * 不同的业务码表示在花呗侧业务处理过程中的不同状态
	 */
	@ApiField("hb_biz_code")
	private String hbBizCode;

	/** 
	 * 输入中的外部业务单据，原样返回
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * HBMT_EXCHANGE_GOLDEN_POINT描述商户对接的待领取花呗金，也可能是直接入账的花呗金，看具体的权益
	 */
	@ApiField("product_id")
	private String productId;

	public void setActivityOrderId(String activityOrderId) {
		this.activityOrderId = activityOrderId;
	}
	public String getActivityOrderId( ) {
		return this.activityOrderId;
	}

	public void setCalculatedAmount(Long calculatedAmount) {
		this.calculatedAmount = calculatedAmount;
	}
	public Long getCalculatedAmount( ) {
		return this.calculatedAmount;
	}

	public void setHbBizCode(String hbBizCode) {
		this.hbBizCode = hbBizCode;
	}
	public String getHbBizCode( ) {
		return this.hbBizCode;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductId( ) {
		return this.productId;
	}

}
