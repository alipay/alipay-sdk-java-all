package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 高速行业灵动岛卡片行程同步
 *
 * @author auto create
 * @since 1.0, 2026-08-24 14:25:10
 */
public class AlipayCommerceTransportExpresswayCardtripSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7421464826332368867L;

	/**
	 * 具体业务变更时间
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 1、高速收费站出口名称
 2、格式为省份/直辖市+收费站名，比如“黑龙江瓦盆窑西站”
	 */
	@ApiField("end_station_name")
	private String endStationName;

	/**
	 * 1、如果是高速通行场景，该字段为高速出口的时间 
2、其他对应路网规范中的chargeTime字段
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 行业开发者身份标识
	 */
	@ApiField("isv_id")
	private String isvId;

	/**
	 * 行程授权开通外部流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 路网侧唯一高速行程单号
	 */
	@ApiField("out_trip_id")
	private String outTripId;

	/**
	 * 行程金额支付类型
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * 车牌颜色
	 */
	@ApiField("plate_color")
	private String plateColor;

	/**
	 * 车牌号
	 */
	@ApiField("plate_no")
	private String plateNo;

	/**
	 * 行程服务跳转链接
	 */
	@ApiField("service_url")
	private String serviceUrl;

	/**
	 * 1、收费站入口名称 
2、格式为省份/直辖市+收费站名，比如“黑龙江瓦盆窑西站”
	 */
	@ApiField("start_station_name")
	private String startStationName;

	/**
	 * 高速收费口进站时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 商户扣费的总金额，单位元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 行程交易处理状态
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	/**
	 * 支付宝侧高速行程单号，传入则代表更新行程流水相关信息
	 */
	@ApiField("trip_id")
	private String tripId;

	/**
	 * 行程单状态
	 */
	@ApiField("trip_status")
	private String tripStatus;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public String getEndStationName() {
		return this.endStationName;
	}
	public void setEndStationName(String endStationName) {
		this.endStationName = endStationName;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getIsvId() {
		return this.isvId;
	}
	public void setIsvId(String isvId) {
		this.isvId = isvId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutTripId() {
		return this.outTripId;
	}
	public void setOutTripId(String outTripId) {
		this.outTripId = outTripId;
	}

	public String getPayType() {
		return this.payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getPlateColor() {
		return this.plateColor;
	}
	public void setPlateColor(String plateColor) {
		this.plateColor = plateColor;
	}

	public String getPlateNo() {
		return this.plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getServiceUrl() {
		return this.serviceUrl;
	}
	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

	public String getStartStationName() {
		return this.startStationName;
	}
	public void setStartStationName(String startStationName) {
		this.startStationName = startStationName;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
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

	public String getTripId() {
		return this.tripId;
	}
	public void setTripId(String tripId) {
		this.tripId = tripId;
	}

	public String getTripStatus() {
		return this.tripStatus;
	}
	public void setTripStatus(String tripStatus) {
		this.tripStatus = tripStatus;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
