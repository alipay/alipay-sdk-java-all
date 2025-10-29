package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * etc行程信息
 *
 * @author auto create
 * @since 1.0, 2025-04-29 21:55:17
 */
public class EtcTripInfo extends AlipayObject {

	private static final long serialVersionUID = 1551696698157756688L;

	/**
	 * 0:未垫资,1:已垫资,2:垫资已还款
	 */
	@ApiField("advance_status")
	private String advanceStatus;

	/**
	 * 1、收费站出口名称 2、格式为省份+收费站名，比如“黑龙江瓦盆窑西站”
	 */
	@ApiField("end_station_name")
	private String endStationName;

	/**
	 * 发行方扣款订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 1、收费站入口名称 2、格式为省份+收费站名，比如“黑龙江瓦盆窑西站”
	 */
	@ApiField("start_station_name")
	private String startStationName;

	/**
	 * ETC_HIGHWAY：ETC封闭式高速公路； ETC_HIGHWAY_OPEN：ETC开放式高速公路； ETC_PARKING：ETC停车场； ETC_GAS：ETC加油站； ETC_SERVICE_AREA：ETC服务区； ETC_MUNICIPAL_SERVICE：ETC市政服务
	 */
	@ApiField("sub_scene")
	private String subScene;

	/**
	 * HIGHWAY_TYPE：高速交易场景类型，对应具体交易场景[ETC_HIGHWAY,ETC_HIGHWAY_OPEN] EXPAND_TYPE：拓展消费交易类型，对应具体交易场景 [ETC_PARKING,ETC_GAS,ETC_SERVICE_AREA,ETC_MUNICIPAL_SERVICE]
	 */
	@ApiField("sub_type")
	private String subType;

	/**
	 * 商户扣费的总金额：单位为元，精确到小数点后两位
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 支付宝交易单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 行程扣款状态： "S":"支付成功"; "F":"支付失败";"R":"已退款";"PR", "部分退款";
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	/**
	 * 行程结束时间
	 */
	@ApiField("trip_end_time")
	private Date tripEndTime;

	/**
	 * 行程id
	 */
	@ApiField("trip_id")
	private String tripId;

	/**
	 * 行程开始时间
	 */
	@ApiField("trip_start_time")
	private Date tripStartTime;

	public String getAdvanceStatus() {
		return this.advanceStatus;
	}
	public void setAdvanceStatus(String advanceStatus) {
		this.advanceStatus = advanceStatus;
	}

	public String getEndStationName() {
		return this.endStationName;
	}
	public void setEndStationName(String endStationName) {
		this.endStationName = endStationName;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getStartStationName() {
		return this.startStationName;
	}
	public void setStartStationName(String startStationName) {
		this.startStationName = startStationName;
	}

	public String getSubScene() {
		return this.subScene;
	}
	public void setSubScene(String subScene) {
		this.subScene = subScene;
	}

	public String getSubType() {
		return this.subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeStatus() {
		return this.tradeStatus;
	}
	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

	public Date getTripEndTime() {
		return this.tripEndTime;
	}
	public void setTripEndTime(Date tripEndTime) {
		this.tripEndTime = tripEndTime;
	}

	public String getTripId() {
		return this.tripId;
	}
	public void setTripId(String tripId) {
		this.tripId = tripId;
	}

	public Date getTripStartTime() {
		return this.tripStartTime;
	}
	public void setTripStartTime(Date tripStartTime) {
		this.tripStartTime = tripStartTime;
	}

}
