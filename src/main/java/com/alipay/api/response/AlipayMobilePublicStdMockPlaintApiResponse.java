package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.std.mock.plaint.api response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayMobilePublicStdMockPlaintApiResponse extends AlipayResponse {

	private static final long serialVersionUID = 7258664684562377947L;

	/** 
	 * 1
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
	 * XXXX
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
