package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ETC设备实时行程信息模型
 *
 * @author auto create
 * @since 1.0, 2024-05-15 15:30:30
 */
public class EtcDeviceTripInfo extends AlipayObject {

	private static final long serialVersionUID = 5144586148284361523L;

	/**
	 * 行程记录唯一流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 行程出站站点id十六进制编码
	 */
	@ApiField("end_station_id_hex")
	private String endStationIdHex;

	/**
	 * 行程结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 行程进站站点id十六进制编码
	 */
	@ApiField("start_station_id_hex")
	private String startStationIdHex;

	/**
	 * 行程开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 行程总金额，单位元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getEndStationIdHex() {
		return this.endStationIdHex;
	}
	public void setEndStationIdHex(String endStationIdHex) {
		this.endStationIdHex = endStationIdHex;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getStartStationIdHex() {
		return this.startStationIdHex;
	}
	public void setStartStationIdHex(String startStationIdHex) {
		this.startStationIdHex = startStationIdHex;
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

}
