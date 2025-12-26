package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 预约门店同步
 *
 * @author auto create
 * @since 1.0, 2025-12-03 10:27:42
 */
public class AlipayCommerceMerchantcardBookingshopSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8799319765488891116L;

	/**
	 * 预约时间间隔【stockFetchType=sync时必填】
单位分钟，只能是30的倍数，最小30（半小时），最大 30 * 12（6小时）
	 */
	@ApiField("book_interval")
	private Long bookInterval;

	/**
	 * 预约是否需要商家确认，默认false；
true     需要，用户发起后，需商家确认；
false    不需要，用户发起即完成预约
	 */
	@ApiField("book_need_confirm")
	private Boolean bookNeedConfirm;

	/**
	 * 是否购卡后才能预约【首次同步门店信息时必填】
true     只能购卡后预约
false    不用购卡也能预约
	 */
	@ApiField("book_with_item")
	private Boolean bookWithItem;

	/**
	 * 预约时是否需要指定服务【首次同步门店信息时必填】
true     预约时必须指定服务
false    预约时不指定服务，直接预约门店
	 */
	@ApiField("book_with_service")
	private Boolean bookWithService;

	/**
	 * null
	 */
	@ApiListField("can_not_book_items")
	@ApiField("string")
	private List<String> canNotBookItems;

	/**
	 * 最大可预约的连续区间数量【stockFetchType=sync时必填】
最小1，最大6
举例：门店营业时间9:00-21:00，interval=30，则预约时可选时间是9:00,9:30,10:00...20:00,20:30
如果maxBookingCount=1，则一次预约只能选半小时，例如选9:00
如果maxBookingCount=2，则一次预约可以选择一小时，例如选9:00和9:30
	 */
	@ApiField("max_book_count")
	private Long maxBookCount;

	/**
	 * 接受预约信息的appid【首次同步门店信息时必填】
	 */
	@ApiField("msg_app_id")
	private String msgAppId;

	/**
	 * 外部门店id【可选，有就传】
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 门店id【必填】
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 门店状态【首次同步门店信息时必填】
active       可预约状态
inactive     不可预约，后续可恢复成active
	 */
	@ApiField("status")
	private String status;

	/**
	 * 库存获取方式【首次同步门店信息时必填】
sync     同步：服务商同步门店的排期，并在库存有变化时每次同步给安心付
query    查询：每次在预约时，安心付实时查询服务商的库存
	 */
	@ApiField("stock_fetch_type")
	private String stockFetchType;

	/**
	 * 查询库存时，需要指定服务商的appid【获取库存方式=query时必填】
	 */
	@ApiField("stock_query_app_id")
	private String stockQueryAppId;

	/**
	 * null
	 */
	@ApiListField("week_plans")
	@ApiField("schedule_week_plan_info")
	private List<ScheduleWeekPlanInfo> weekPlans;

	public Long getBookInterval() {
		return this.bookInterval;
	}
	public void setBookInterval(Long bookInterval) {
		this.bookInterval = bookInterval;
	}

	public Boolean getBookNeedConfirm() {
		return this.bookNeedConfirm;
	}
	public void setBookNeedConfirm(Boolean bookNeedConfirm) {
		this.bookNeedConfirm = bookNeedConfirm;
	}

	public Boolean getBookWithItem() {
		return this.bookWithItem;
	}
	public void setBookWithItem(Boolean bookWithItem) {
		this.bookWithItem = bookWithItem;
	}

	public Boolean getBookWithService() {
		return this.bookWithService;
	}
	public void setBookWithService(Boolean bookWithService) {
		this.bookWithService = bookWithService;
	}

	public List<String> getCanNotBookItems() {
		return this.canNotBookItems;
	}
	public void setCanNotBookItems(List<String> canNotBookItems) {
		this.canNotBookItems = canNotBookItems;
	}

	public Long getMaxBookCount() {
		return this.maxBookCount;
	}
	public void setMaxBookCount(Long maxBookCount) {
		this.maxBookCount = maxBookCount;
	}

	public String getMsgAppId() {
		return this.msgAppId;
	}
	public void setMsgAppId(String msgAppId) {
		this.msgAppId = msgAppId;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStockFetchType() {
		return this.stockFetchType;
	}
	public void setStockFetchType(String stockFetchType) {
		this.stockFetchType = stockFetchType;
	}

	public String getStockQueryAppId() {
		return this.stockQueryAppId;
	}
	public void setStockQueryAppId(String stockQueryAppId) {
		this.stockQueryAppId = stockQueryAppId;
	}

	public List<ScheduleWeekPlanInfo> getWeekPlans() {
		return this.weekPlans;
	}
	public void setWeekPlans(List<ScheduleWeekPlanInfo> weekPlans) {
		this.weekPlans = weekPlans;
	}

}
