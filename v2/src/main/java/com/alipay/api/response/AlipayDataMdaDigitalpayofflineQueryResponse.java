package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.digitalpayoffline.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 11:28:10
 */
public class AlipayDataMdaDigitalpayofflineQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3148177722691976468L;

	/** 
	 * 跨境数字支付用户数TOP5
	 */
	@ApiField("cb_top_5_uv")
	private String cbTop5Uv;

	/** 
	 * 跨境数字支付用户数
	 */
	@ApiField("cb_total_uv")
	private Long cbTotalUv;

	/** 
	 * 数字支付商户TOP5
	 */
	@ApiField("top_5_merchant")
	private String top5Merchant;

	/** 
	 * 数字支付累计金额
	 */
	@ApiField("total_amount")
	private Long totalAmount;

	/** 
	 * 数字支付商户覆盖数
	 */
	@ApiField("total_merchants")
	private Long totalMerchants;

	/** 
	 * 数字支付累计金额趋势
	 */
	@ApiField("total_trend")
	private String totalTrend;

	public void setCbTop5Uv(String cbTop5Uv) {
		this.cbTop5Uv = cbTop5Uv;
	}
	public String getCbTop5Uv( ) {
		return this.cbTop5Uv;
	}

	public void setCbTotalUv(Long cbTotalUv) {
		this.cbTotalUv = cbTotalUv;
	}
	public Long getCbTotalUv( ) {
		return this.cbTotalUv;
	}

	public void setTop5Merchant(String top5Merchant) {
		this.top5Merchant = top5Merchant;
	}
	public String getTop5Merchant( ) {
		return this.top5Merchant;
	}

	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Long getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTotalMerchants(Long totalMerchants) {
		this.totalMerchants = totalMerchants;
	}
	public Long getTotalMerchants( ) {
		return this.totalMerchants;
	}

	public void setTotalTrend(String totalTrend) {
		this.totalTrend = totalTrend;
	}
	public String getTotalTrend( ) {
		return this.totalTrend;
	}

}
