package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 生活服务商品日历价
 *
 * @author auto create
 * @since 1.0, 2026-03-31 15:02:08
 */
public class LifeserviceItemCalendarPrice extends AlipayObject {

	private static final long serialVersionUID = 3718514981338914861L;

	/**
	 * 按日期定价。如果和星期定价冲突，以日期定价为准。
	 */
	@ApiListField("date_price_list")
	@ApiField("lifeservice_item_date_price")
	private List<LifeserviceItemDatePrice> datePriceList;

	/**
	 * 基础原价，单位分。日历价未覆盖的日期兜底取当前值
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 基础售价，单位分。日历价未覆盖到的日期兜底取当前值
	 */
	@ApiField("sale_price")
	private Long salePrice;

	/**
	 * 按星期x定价。如果和日期定价冲突，以日期定价为准。
	 */
	@ApiListField("week_price_list")
	@ApiField("lifeservice_item_week_price")
	private List<LifeserviceItemWeekPrice> weekPriceList;

	public List<LifeserviceItemDatePrice> getDatePriceList() {
		return this.datePriceList;
	}
	public void setDatePriceList(List<LifeserviceItemDatePrice> datePriceList) {
		this.datePriceList = datePriceList;
	}

	public Long getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Long getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(Long salePrice) {
		this.salePrice = salePrice;
	}

	public List<LifeserviceItemWeekPrice> getWeekPriceList() {
		return this.weekPriceList;
	}
	public void setWeekPriceList(List<LifeserviceItemWeekPrice> weekPriceList) {
		this.weekPriceList = weekPriceList;
	}

}
