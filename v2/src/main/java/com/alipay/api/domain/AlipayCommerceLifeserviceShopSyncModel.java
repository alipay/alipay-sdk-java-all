package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 门店预约配置同步
 *
 * @author auto create
 * @since 1.0, 2026-01-26 15:47:43
 */
public class AlipayCommerceLifeserviceShopSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1575789434884572149L;

	/**
	 * 预约时间间隔【stockFetchType=sync时必填】 单位分钟，只能是15的倍数，最小15（15分钟），最大 15 * 24（6小时）
	 */
	@ApiField("book_interval")
	private Long bookInterval;

	/**
	 * 预约是否需要商家确认，首次同步必填
	 */
	@ApiField("book_need_confirm")
	private String bookNeedConfirm;

	/**
	 * 最大可预约的连续区间数量【stockFetchType=sync时必填】 最小1，最大6 举例：门店营业时间9:00-21:00，interval=30，则预约时可选时间是9:00,9:30,10:00...20:00,20:30 如果maxBookingCount=1，则一次预约只能选半小时，例如选9:00 如果maxBookingCount=2，则一次预约可以选择一小时，例如选9:00和9:30
	 */
	@ApiField("max_book_count")
	private Long maxBookCount;

	/**
	 * 接受预约信息的appid，首次同步必填
	 */
	@ApiField("msg_app_id")
	private String msgAppId;

	/**
	 * 外部门店id，有就传，要保证唯一性
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * null
	 */
	@ApiListField("shop_attrs")
	@ApiField("life_service_attr")
	private List<LifeServiceAttr> shopAttrs;

	/**
	 * 蚂蚁门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 门店类型，首次同步必填
	 */
	@ApiField("shop_type")
	private String shopType;

	/**
	 * 门店可预约状态，首次同步必填
	 */
	@ApiField("status")
	private String status;

	/**
	 * 库存获取方式，首次同步必填
	 */
	@ApiField("stock_fetch_type")
	private String stockFetchType;

	/**
	 * 查询库存的appid，库存方式=query时需要
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

	public String getBookNeedConfirm() {
		return this.bookNeedConfirm;
	}
	public void setBookNeedConfirm(String bookNeedConfirm) {
		this.bookNeedConfirm = bookNeedConfirm;
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

	public List<LifeServiceAttr> getShopAttrs() {
		return this.shopAttrs;
	}
	public void setShopAttrs(List<LifeServiceAttr> shopAttrs) {
		this.shopAttrs = shopAttrs;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopType() {
		return this.shopType;
	}
	public void setShopType(String shopType) {
		this.shopType = shopType;
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
