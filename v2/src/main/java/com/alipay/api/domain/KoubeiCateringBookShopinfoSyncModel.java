package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订座配置数据回流
 *
 * @author auto create
 * @since 1.0, 2021-03-29 15:06:13
 */
public class KoubeiCateringBookShopinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1516127296882655152L;

	/**
	 * 桌位保留时间（单位：分钟）
	 */
	@ApiField("book_keep_time")
	private Long bookKeepTime;

	/**
	 * 预订文案
	 */
	@ApiField("book_text")
	private String bookText;

	/**
	 * 最长预订多少时间（单位：分钟）
	 */
	@ApiField("max_book_time")
	private Long maxBookTime;

	/**
	 * 包厢最大人数
	 */
	@ApiField("max_box_num")
	private Long maxBoxNum;

	/**
	 * 最小起订人数
	 */
	@ApiField("min_book_num")
	private Long minBookNum;

	/**
	 * 最少提前预订时间（单位：分钟）
	 */
	@ApiField("min_book_time")
	private Long minBookTime;

	/**
	 * 包厢最小人数
	 */
	@ApiField("min_box_num")
	private Long minBoxNum;

	/**
	 * 美味门店ID
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 是否开启下单备注。如true表示开启，如false表示不开启。
	 */
	@ApiField("remark_flag")
	private Boolean remarkFlag;

	/**
	 * 口碑门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 门店状态。如BOOKABLE表示可预订，UNBOOKABLE表示不可预订。
	 */
	@ApiField("shop_state")
	private String shopState;

	/**
	 * 是否有包厢。如true表示有，如false表示没有。
	 */
	@ApiField("support_box")
	private Boolean supportBox;

	/**
	 * 是否支持秒订。如true表示支持，false表示不支持。
	 */
	@ApiField("support_quick_book")
	private Boolean supportQuickBook;

	/**
	 * 时间戳，用作数据的版本号，取系统当前时间即可
	 */
	@ApiField("sync_timestamp")
	private String syncTimestamp;

	public Long getBookKeepTime() {
		return this.bookKeepTime;
	}
	public void setBookKeepTime(Long bookKeepTime) {
		this.bookKeepTime = bookKeepTime;
	}

	public String getBookText() {
		return this.bookText;
	}
	public void setBookText(String bookText) {
		this.bookText = bookText;
	}

	public Long getMaxBookTime() {
		return this.maxBookTime;
	}
	public void setMaxBookTime(Long maxBookTime) {
		this.maxBookTime = maxBookTime;
	}

	public Long getMaxBoxNum() {
		return this.maxBoxNum;
	}
	public void setMaxBoxNum(Long maxBoxNum) {
		this.maxBoxNum = maxBoxNum;
	}

	public Long getMinBookNum() {
		return this.minBookNum;
	}
	public void setMinBookNum(Long minBookNum) {
		this.minBookNum = minBookNum;
	}

	public Long getMinBookTime() {
		return this.minBookTime;
	}
	public void setMinBookTime(Long minBookTime) {
		this.minBookTime = minBookTime;
	}

	public Long getMinBoxNum() {
		return this.minBoxNum;
	}
	public void setMinBoxNum(Long minBoxNum) {
		this.minBoxNum = minBoxNum;
	}

	public String getOutShopId() {
		return this.outShopId;
	}
	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

	public Boolean getRemarkFlag() {
		return this.remarkFlag;
	}
	public void setRemarkFlag(Boolean remarkFlag) {
		this.remarkFlag = remarkFlag;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopState() {
		return this.shopState;
	}
	public void setShopState(String shopState) {
		this.shopState = shopState;
	}

	public Boolean getSupportBox() {
		return this.supportBox;
	}
	public void setSupportBox(Boolean supportBox) {
		this.supportBox = supportBox;
	}

	public Boolean getSupportQuickBook() {
		return this.supportQuickBook;
	}
	public void setSupportQuickBook(Boolean supportQuickBook) {
		this.supportQuickBook = supportQuickBook;
	}

	public String getSyncTimestamp() {
		return this.syncTimestamp;
	}
	public void setSyncTimestamp(String syncTimestamp) {
		this.syncTimestamp = syncTimestamp;
	}

}
