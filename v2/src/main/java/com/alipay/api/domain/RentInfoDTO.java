package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租金信息
 *
 * @author auto create
 * @since 1.0, 2023-08-08 15:34:03
 */
public class RentInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4371676182238484194L;

	/**
	 * 买断价，单位元
	 */
	@ApiField("buyout_price")
	private String buyoutPrice;

	/**
	 * 首期租金,单位元
	 */
	@ApiField("initial_rent_price")
	private String initialRentPrice;

	/**
	 * 期数，1-36的整数，包含边界值
	 */
	@ApiField("period_num")
	private Long periodNum;

	/**
	 * 每期租金，单位元
	 */
	@ApiField("period_real_rent_price")
	private String periodRealRentPrice;

	public String getBuyoutPrice() {
		return this.buyoutPrice;
	}
	public void setBuyoutPrice(String buyoutPrice) {
		this.buyoutPrice = buyoutPrice;
	}

	public String getInitialRentPrice() {
		return this.initialRentPrice;
	}
	public void setInitialRentPrice(String initialRentPrice) {
		this.initialRentPrice = initialRentPrice;
	}

	public Long getPeriodNum() {
		return this.periodNum;
	}
	public void setPeriodNum(Long periodNum) {
		this.periodNum = periodNum;
	}

	public String getPeriodRealRentPrice() {
		return this.periodRealRentPrice;
	}
	public void setPeriodRealRentPrice(String periodRealRentPrice) {
		this.periodRealRentPrice = periodRealRentPrice;
	}

}
