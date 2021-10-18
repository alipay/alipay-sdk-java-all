package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 排队配置数据回流
 *
 * @author auto create
 * @since 1.0, 2021-04-22 11:21:51
 */
public class KoubeiCateringQueueShopinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7488563649657159723L;

	/**
	 * 过号是否作废。返回0表示作废；非0表示不作废，并以数字表示过号延几桌。如返回1，表示延一桌，返回2则是延两桌。
	 */
	@ApiField("discard_off")
	private Long discardOff;

	/**
	 * 等位优惠信息
	 */
	@ApiField("discount_desc")
	private String discountDesc;

	/**
	 * 取号距离（单位：米）
	 */
	@ApiField("distance_limit")
	private Long distanceLimit;

	/**
	 * 过号描述
	 */
	@ApiField("notice")
	private String notice;

	/**
	 * 美味门店ID
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 口碑门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 是否显示号单等待时间。如返回true，则表示是；如返回false，则表示否。
	 */
	@ApiField("show_order_wait_time")
	private Boolean showOrderWaitTime;

	/**
	 * 是否显示排队等待时间。如返回true，则表示是；如返回false，则表示否。
	 */
	@ApiField("show_wait_time")
	private Boolean showWaitTime;

	/**
	 * 时间戳，用作数据的版本号，取系统当前时间即可
	 */
	@ApiField("sync_timestamp")
	private String syncTimestamp;

	public Long getDiscardOff() {
		return this.discardOff;
	}
	public void setDiscardOff(Long discardOff) {
		this.discardOff = discardOff;
	}

	public String getDiscountDesc() {
		return this.discountDesc;
	}
	public void setDiscountDesc(String discountDesc) {
		this.discountDesc = discountDesc;
	}

	public Long getDistanceLimit() {
		return this.distanceLimit;
	}
	public void setDistanceLimit(Long distanceLimit) {
		this.distanceLimit = distanceLimit;
	}

	public String getNotice() {
		return this.notice;
	}
	public void setNotice(String notice) {
		this.notice = notice;
	}

	public String getOutShopId() {
		return this.outShopId;
	}
	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public Boolean getShowOrderWaitTime() {
		return this.showOrderWaitTime;
	}
	public void setShowOrderWaitTime(Boolean showOrderWaitTime) {
		this.showOrderWaitTime = showOrderWaitTime;
	}

	public Boolean getShowWaitTime() {
		return this.showWaitTime;
	}
	public void setShowWaitTime(Boolean showWaitTime) {
		this.showWaitTime = showWaitTime;
	}

	public String getSyncTimestamp() {
		return this.syncTimestamp;
	}
	public void setSyncTimestamp(String syncTimestamp) {
		this.syncTimestamp = syncTimestamp;
	}

}
