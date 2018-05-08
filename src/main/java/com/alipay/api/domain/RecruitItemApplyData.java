package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 招商报名商品数据
 *
 * @author auto create
 * @since 1.0, 2016-11-18 11:48:44
 */
public class RecruitItemApplyData extends AlipayObject {

	private static final long serialVersionUID = 5131547747127949867L;

	/**
	 * 活动价格，单位为元，活动期间以此价格售卖。注：预热期间仍然以原价售卖，但是不消耗活动的库存。
	 */
	@ApiField("activity_price")
	private String activityPrice;

	/**
	 * 活动总库存，活动锁定的库存，是从商品总库存中隔离出来的库存。只有活动期间购买商品会消耗活动库存。
	 */
	@ApiField("activity_stock")
	private String activityStock;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品原价，单位为元
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 折扣，8.5表示八五折，9表示九折
	 */
	@ApiField("sales")
	private String sales;

	public String getActivityPrice() {
		return this.activityPrice;
	}
	public void setActivityPrice(String activityPrice) {
		this.activityPrice = activityPrice;
	}

	public String getActivityStock() {
		return this.activityStock;
	}
	public void setActivityStock(String activityStock) {
		this.activityStock = activityStock;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getSales() {
		return this.sales;
	}
	public void setSales(String sales) {
		this.sales = sales;
	}

}
