package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车牌付行程代扣支付
 *
 * @author auto create
 * @since 1.0, 2026-05-28 20:51:39
 */
public class AlipayCommerceTransportExpresswayTripCreateandpayModel extends AlipayObject {

	private static final long serialVersionUID = 4573218331625553441L;

	/**
	 * 支付宝侧车牌付代扣协议号
	 */
	@ApiField("biz_agreement_no")
	private String bizAgreementNo;

	/**
	 * 1、收费站出口名称 2、格式为省份+收费站名，比如“黑龙江瓦盆窑西站”
	 */
	@ApiField("end_station_name")
	private String endStationName;

	/**
	 * 收费站出口名称编码
	 */
	@ApiField("end_station_name_code")
	private String endStationNameCode;

	/**
	 * 1、该字段为高速出口的时间 2、其他对应路网规范中的chargeTime字段
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 调用方标识ID
	 */
	@ApiField("isv_id")
	private String isvId;

	/**
	 * 行程描述
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 路网侧扣款行程单号： 1、需要与真实的扣款行程对应 2、路网侧全国车牌付场景下唯一
	 */
	@ApiField("out_trip_id")
	private String outTripId;

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
	 * 若超过账期，请传递补扣标识为true，本批次行程受理将不限制账期。 默认false；
	 */
	@ApiField("replenish_deduct")
	private Boolean replenishDeduct;

	/**
	 * 收款方pid
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 1、收费站入口名称 2、格式为省份+收费站名，比如“黑龙江瓦盆窑西站”
	 */
	@ApiField("start_station_name")
	private String startStationName;

	/**
	 * 收费站入口名称编码
	 */
	@ApiField("start_station_name_code")
	private String startStationNameCode;

	/**
	 * 进站时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 行程标题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 行程需扣费金额，单位人民币元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizAgreementNo() {
		return this.bizAgreementNo;
	}
	public void setBizAgreementNo(String bizAgreementNo) {
		this.bizAgreementNo = bizAgreementNo;
	}

	public String getEndStationName() {
		return this.endStationName;
	}
	public void setEndStationName(String endStationName) {
		this.endStationName = endStationName;
	}

	public String getEndStationNameCode() {
		return this.endStationNameCode;
	}
	public void setEndStationNameCode(String endStationNameCode) {
		this.endStationNameCode = endStationNameCode;
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

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutTripId() {
		return this.outTripId;
	}
	public void setOutTripId(String outTripId) {
		this.outTripId = outTripId;
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

	public Boolean getReplenishDeduct() {
		return this.replenishDeduct;
	}
	public void setReplenishDeduct(Boolean replenishDeduct) {
		this.replenishDeduct = replenishDeduct;
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

	public String getStartStationNameCode() {
		return this.startStationNameCode;
	}
	public void setStartStationNameCode(String startStationNameCode) {
		this.startStationNameCode = startStationNameCode;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
