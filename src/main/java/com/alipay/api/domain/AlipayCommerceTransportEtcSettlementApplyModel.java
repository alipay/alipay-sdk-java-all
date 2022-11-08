package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车主ETC服务行程上送申请接口
 *
 * @author auto create
 * @since 1.0, 2022-08-17 13:50:02
 */
public class AlipayCommerceTransportEtcSettlementApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4874563278879833331L;

	/**
	 * ETC平台协议号
	 */
	@ApiField("biz_agreement_no")
	private String bizAgreementNo;

	/**
	 * 车辆类型： 
1 - 一型客车
2 - 二型客车
3 - 三型客车
4 - 四型客车
	 */
	@ApiField("car_type")
	private String carType;

	/**
	 * 1、收费站出口名称
2、格式为省份+收费站名，比如“黑龙江瓦盆窑西站”
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
	 * 行程描述
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 发行方扣款订单号：
1、需要与真实的扣款行程对应
2、可以直接使用行程单id
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 车牌颜色： 
（1）参考申请订单的车牌颜色
（2）部分颜色枚举 ：0-蓝； 4-渐变绿
	 */
	@ApiField("plate_color")
	private String plateColor;

	/**
	 * 车牌号
	 */
	@ApiField("plate_no")
	private String plateNo;

	/**
	 * 1、默认为商户签约账号对应的支付宝用户ID
2、特殊情况可自定义，但需要额外配置白名单
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 1、收费站入口名称
2、格式为省份+收费站名，比如“黑龙江瓦盆窑西站”
	 */
	@ApiField("start_station_name")
	private String startStationName;

	/**
	 * 用户进入高速时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 子场景： ETC_HIGHWAY：ETC封闭式高速公路（不传默认这个值）； ETC_HIGHWAY_OPEN：ETC开放式高速公路； ETC_PARKING：ETC停车场； ETC_GAS：ETC加油站； ETC_SERVICE_AREA：ETC服务区； ETC_MUNICIPAL_SERVICE：ETC市政服务。
	 */
	@ApiField("sub_scene")
	private String subScene;

	/**
	 * HIGHWAY_TYPE：高速交易场景类型，对应具体交易场景[ETC_HIGHWAY,ETC_HIGHWAY_OPEN] EXPAND_TYPE：拓展消费交易类型，对应具体交易场景 [ETC_PARKING,ETC_GAS,ETC_SERVICE_AREA,ETC_MUNICIPAL_SERVICE]
	 */
	@ApiField("sub_type")
	private String subType;

	/**
	 * 行程标题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 商户扣费的总金额：单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getBizAgreementNo() {
		return this.bizAgreementNo;
	}
	public void setBizAgreementNo(String bizAgreementNo) {
		this.bizAgreementNo = bizAgreementNo;
	}

	public String getCarType() {
		return this.carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
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

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
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

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
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

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
