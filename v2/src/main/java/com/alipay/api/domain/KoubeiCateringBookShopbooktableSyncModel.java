package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 可订座时间段回流
 *
 * @author auto create
 * @since 1.0, 2021-04-20 11:44:20
 */
public class KoubeiCateringBookShopbooktableSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1748186557778868149L;

	/**
	 * 可选时间段
	 */
	@ApiListField("book_time")
	@ApiField("book_time")
	private List<BookTime> bookTime;

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
	 * 时间戳，用作数据的版本号，取系统当前时间即可
	 */
	@ApiField("sync_timestamp")
	private String syncTimestamp;

	public List<BookTime> getBookTime() {
		return this.bookTime;
	}
	public void setBookTime(List<BookTime> bookTime) {
		this.bookTime = bookTime;
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

	public String getSyncTimestamp() {
		return this.syncTimestamp;
	}
	public void setSyncTimestamp(String syncTimestamp) {
		this.syncTimestamp = syncTimestamp;
	}

}
