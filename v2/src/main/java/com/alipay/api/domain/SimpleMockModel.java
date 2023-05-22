package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 简单的mock模型
 *
 * @author auto create
 * @since 1.0, 2022-08-05 13:39:47
 */
public class SimpleMockModel extends AlipayObject {

	private static final long serialVersionUID = 6468982727246637525L;

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
	 * 1.2f
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

	public Long getCountItems() {
		return this.countItems;
	}
	public void setCountItems(Long countItems) {
		this.countItems = countItems;
	}

	public Date getHappenTime() {
		return this.happenTime;
	}
	public void setHappenTime(Date happenTime) {
		this.happenTime = happenTime;
	}

	public String getPriceNum() {
		return this.priceNum;
	}
	public void setPriceNum(String priceNum) {
		this.priceNum = priceNum;
	}

	public Boolean getRight() {
		return this.right;
	}
	public void setRight(Boolean right) {
		this.right = right;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
