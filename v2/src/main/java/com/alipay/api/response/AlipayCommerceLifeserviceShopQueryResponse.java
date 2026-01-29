package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LifeServiceAttr;
import com.alipay.api.domain.ScheduleWeekPlanInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.shop.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-26 15:47:43
 */
public class AlipayCommerceLifeserviceShopQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7846154578922121429L;

	/** 
	 * 预约时间间隔【stockFetchType=sync时必填】 单位分钟，只能是15的倍数，最小15（15分钟），最大 15 * 24（6小时）
	 */
	@ApiField("book_interval")
	private Long bookInterval;

	/** 
	 * 预约是否需要商家确认
	 */
	@ApiField("book_need_confirm")
	private String bookNeedConfirm;

	/** 
	 * 最大可预约的连续区间数量【stockFetchType=sync时必填】 最小1，最大6 举例：门店营业时间9:00-21:00，interval=30，则预约时可选时间是9:00,9:30,10:00...20:00,20:30 如果maxBookingCount=1，则一次预约只能选半小时，例如选9:00 如果maxBookingCount=2，则一次预约可以选择一小时，例如选9:00和9:30
	 */
	@ApiField("max_book_count")
	private Long maxBookCount;

	/** 
	 * 接受预约信息的appid
	 */
	@ApiField("msg_app_id")
	private String msgAppId;

	/** 
	 * 外部门店id
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
	 * 门店类型
	 */
	@ApiField("shop_type")
	private String shopType;

	/** 
	 * 门店可预约状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 库存获取方式
	 */
	@ApiField("stock_fetch_type")
	private String stockFetchType;

	/** 
	 * 查询库存时指定的appid
	 */
	@ApiField("stock_query_app_id")
	private String stockQueryAppId;

	/** 
	 * null
	 */
	@ApiListField("week_plans")
	@ApiField("schedule_week_plan_info")
	private List<ScheduleWeekPlanInfo> weekPlans;

	public void setBookInterval(Long bookInterval) {
		this.bookInterval = bookInterval;
	}
	public Long getBookInterval( ) {
		return this.bookInterval;
	}

	public void setBookNeedConfirm(String bookNeedConfirm) {
		this.bookNeedConfirm = bookNeedConfirm;
	}
	public String getBookNeedConfirm( ) {
		return this.bookNeedConfirm;
	}

	public void setMaxBookCount(Long maxBookCount) {
		this.maxBookCount = maxBookCount;
	}
	public Long getMaxBookCount( ) {
		return this.maxBookCount;
	}

	public void setMsgAppId(String msgAppId) {
		this.msgAppId = msgAppId;
	}
	public String getMsgAppId( ) {
		return this.msgAppId;
	}

	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}
	public String getOutShopId( ) {
		return this.outShopId;
	}

	public void setShopAttrs(List<LifeServiceAttr> shopAttrs) {
		this.shopAttrs = shopAttrs;
	}
	public List<LifeServiceAttr> getShopAttrs( ) {
		return this.shopAttrs;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

	public void setShopType(String shopType) {
		this.shopType = shopType;
	}
	public String getShopType( ) {
		return this.shopType;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setStockFetchType(String stockFetchType) {
		this.stockFetchType = stockFetchType;
	}
	public String getStockFetchType( ) {
		return this.stockFetchType;
	}

	public void setStockQueryAppId(String stockQueryAppId) {
		this.stockQueryAppId = stockQueryAppId;
	}
	public String getStockQueryAppId( ) {
		return this.stockQueryAppId;
	}

	public void setWeekPlans(List<ScheduleWeekPlanInfo> weekPlans) {
		this.weekPlans = weekPlans;
	}
	public List<ScheduleWeekPlanInfo> getWeekPlans( ) {
		return this.weekPlans;
	}

}
