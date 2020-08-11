package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.auth.accumulation.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-13 16:02:28
 */
public class AlipayPcreditHuabeiAuthAccumulationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6493934562718211422L;

	/** 
	 * 本周期内支付宝端根据用户消费情况试算出的应付费用，仅供参考使用。
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/** 
	 * 本周期内用户累计享受的优惠金额
	 */
	@ApiField("total_discount_amount")
	private String totalDiscountAmount;

	/** 
	 * 本周期内用户总的消费次数
	 */
	@ApiField("total_pay_count")
	private String totalPayCount;

	/** 
	 * 本周期内用户累计支付宝付款金额
	 */
	@ApiField("total_real_pay_amount")
	private String totalRealPayAmount;

	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	public String getPayAmount( ) {
		return this.payAmount;
	}

	public void setTotalDiscountAmount(String totalDiscountAmount) {
		this.totalDiscountAmount = totalDiscountAmount;
	}
	public String getTotalDiscountAmount( ) {
		return this.totalDiscountAmount;
	}

	public void setTotalPayCount(String totalPayCount) {
		this.totalPayCount = totalPayCount;
	}
	public String getTotalPayCount( ) {
		return this.totalPayCount;
	}

	public void setTotalRealPayAmount(String totalRealPayAmount) {
		this.totalRealPayAmount = totalRealPayAmount;
	}
	public String getTotalRealPayAmount( ) {
		return this.totalRealPayAmount;
	}

}
