package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShopTaskDeliveryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.nordermaterialsapply.task.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-20 11:22:29
 */
public class AlipayOpenSpNordermaterialsapplyTaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6699422625847587842L;

	/** 
	 * 近30天内有交易情况，有为TRUE，无为FALSE，无数据、未知为UNKNOWN
	 */
	@ApiField("has_monthly_trade")
	private String hasMonthlyTrade;

	/** 
	 * 近7天内有交易情况，有为TRUE，无为FALSE，无数据、未知为UNKNOWN
	 */
	@ApiField("has_weekly_trade")
	private String hasWeeklyTrade;

	/** 
	 * 近30天内交易笔数，可空
	 */
	@ApiField("monthly_trade_cnt")
	private Long monthlyTradeCnt;

	/** 
	 * 小二当前作业的门店，所在位置唯一标识
	 */
	@ApiField("poi_mid")
	private String poiMid;

	/** 
	 * 门店物流信息状态，有多个快递单号时，数组中会有多个元素
	 */
	@ApiListField("shop_task_delivery_info_list")
	@ApiField("shop_task_delivery_info")
	private List<ShopTaskDeliveryInfo> shopTaskDeliveryInfoList;

	/** 
	 * 门店作业单据标识唯一标识，一个作业单据只需要支付一次保证金
	 */
	@ApiField("shop_task_id")
	private String shopTaskId;

	/** 
	 * ● INFO_COLLECTION：信息收集；选择完作业模式后，默认该状态
● MATETIAL_PRODUCTION：线圈生产，确认完成信息收集后进入该状态
● ACCEPTANCE：作业验收，确认收货后进入该状态
● FINISHED：作业完成，作业验收通过后进入该状态
● DEPRECATED：废弃，未创建作业单导致门店被释放、作废时，进入该状态
	 */
	@ApiField("shop_task_status")
	private String shopTaskStatus;

	/** 
	 * 近7天内交易笔数，可空
	 */
	@ApiField("weekly_trade_cnt")
	private Long weeklyTradeCnt;

	public void setHasMonthlyTrade(String hasMonthlyTrade) {
		this.hasMonthlyTrade = hasMonthlyTrade;
	}
	public String getHasMonthlyTrade( ) {
		return this.hasMonthlyTrade;
	}

	public void setHasWeeklyTrade(String hasWeeklyTrade) {
		this.hasWeeklyTrade = hasWeeklyTrade;
	}
	public String getHasWeeklyTrade( ) {
		return this.hasWeeklyTrade;
	}

	public void setMonthlyTradeCnt(Long monthlyTradeCnt) {
		this.monthlyTradeCnt = monthlyTradeCnt;
	}
	public Long getMonthlyTradeCnt( ) {
		return this.monthlyTradeCnt;
	}

	public void setPoiMid(String poiMid) {
		this.poiMid = poiMid;
	}
	public String getPoiMid( ) {
		return this.poiMid;
	}

	public void setShopTaskDeliveryInfoList(List<ShopTaskDeliveryInfo> shopTaskDeliveryInfoList) {
		this.shopTaskDeliveryInfoList = shopTaskDeliveryInfoList;
	}
	public List<ShopTaskDeliveryInfo> getShopTaskDeliveryInfoList( ) {
		return this.shopTaskDeliveryInfoList;
	}

	public void setShopTaskId(String shopTaskId) {
		this.shopTaskId = shopTaskId;
	}
	public String getShopTaskId( ) {
		return this.shopTaskId;
	}

	public void setShopTaskStatus(String shopTaskStatus) {
		this.shopTaskStatus = shopTaskStatus;
	}
	public String getShopTaskStatus( ) {
		return this.shopTaskStatus;
	}

	public void setWeeklyTradeCnt(Long weeklyTradeCnt) {
		this.weeklyTradeCnt = weeklyTradeCnt;
	}
	public Long getWeeklyTradeCnt( ) {
		return this.weeklyTradeCnt;
	}

}
