package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.mock.plaint.api response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayMobilePublicMockPlaintApiResponse extends AlipayResponse {

	private static final long serialVersionUID = 4489257948511294327L;

	/** 
	 * 11
	 */
	@ApiField("count_items")
	private Long countItems;

	/** 
	 * 111
	 */
	@ApiField("happen_time")
	private Date happenTime;

	/** 
	 * 1.2
	 */
	@ApiField("price_num")
	private String priceNum;

	/** 
	 * false
	 */
	@ApiField("right")
	private Boolean right;

	/** 
	 * trade_no
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setCountItems(Long countItems) {
		this.countItems = countItems;
	}
	public Long getCountItems( ) {
		return this.countItems;
	}

	public void setHappenTime(Date happenTime) {
		this.happenTime = happenTime;
	}
	public Date getHappenTime( ) {
		return this.happenTime;
	}

	public void setPriceNum(String priceNum) {
		this.priceNum = priceNum;
	}
	public String getPriceNum( ) {
		return this.priceNum;
	}

	public void setRight(Boolean right) {
		this.right = right;
	}
	public Boolean getRight( ) {
		return this.right;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
