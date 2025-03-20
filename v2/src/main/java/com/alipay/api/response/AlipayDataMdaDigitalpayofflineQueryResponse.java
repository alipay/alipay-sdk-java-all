package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.digitalpayoffline.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-08 22:20:21
 */
public class AlipayDataMdaDigitalpayofflineQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3159675187815256632L;

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
	 * 打通国外钱包数
	 */
	@ApiField("cb_wallet_cnt")
	private Long cbWalletCnt;

	/** 
	 * 数字支付商户TOP5
	 */
	@ApiField("top_5_merchant")
	private String top5Merchant;

	/** 
	 * 数字支付累计金额(元)
	 */
	@ApiField("total_amount")
	private String totalAmount;

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

	public void setCbWalletCnt(Long cbWalletCnt) {
		this.cbWalletCnt = cbWalletCnt;
	}
	public Long getCbWalletCnt( ) {
		return this.cbWalletCnt;
	}

	public void setTop5Merchant(String top5Merchant) {
		this.top5Merchant = top5Merchant;
	}
	public String getTop5Merchant( ) {
		return this.top5Merchant;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
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
