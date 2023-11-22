package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租金信息
 *
 * @author auto create
 * @since 1.0, 2023-09-13 11:56:04
 */
public class RentInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5156165281311974234L;

	/**
	 * 续租总期数，仅续租且订单修改时传入，1-12的整数，包含边界值
	 */
	@ApiField("addon_period_num")
	private String addonPeriodNum;

	/**
	 * 续租总金额，仅续租且订单修改时传入，单位元
	 */
	@ApiField("addon_real_rent_price")
	private String addonRealRentPrice;

	/**
	 * 买断价，单位元
	 */
	@ApiField("buyout_price")
	private String buyoutPrice;

	/**
	 * 尾期租金用在非每期分期租金一致场景，例如一笔订单总金额100，首期33.33，每期33.33，尾期33.34，，单位元
	 */
	@ApiField("finish_real_rent_price")
	private String finishRealRentPrice;

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

	public String getAddonPeriodNum() {
		return this.addonPeriodNum;
	}
	public void setAddonPeriodNum(String addonPeriodNum) {
		this.addonPeriodNum = addonPeriodNum;
	}

	public String getAddonRealRentPrice() {
		return this.addonRealRentPrice;
	}
	public void setAddonRealRentPrice(String addonRealRentPrice) {
		this.addonRealRentPrice = addonRealRentPrice;
	}

	public String getBuyoutPrice() {
		return this.buyoutPrice;
	}
	public void setBuyoutPrice(String buyoutPrice) {
		this.buyoutPrice = buyoutPrice;
	}

	public String getFinishRealRentPrice() {
		return this.finishRealRentPrice;
	}
	public void setFinishRealRentPrice(String finishRealRentPrice) {
		this.finishRealRentPrice = finishRealRentPrice;
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
