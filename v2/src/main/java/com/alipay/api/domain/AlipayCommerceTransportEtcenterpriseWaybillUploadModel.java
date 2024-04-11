package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业ETC运单上送
 *
 * @author auto create
 * @since 1.0, 2023-12-20 11:13:46
 */
public class AlipayCommerceTransportEtcenterpriseWaybillUploadModel extends AlipayObject {

	private static final long serialVersionUID = 1126713316292692535L;

	/**
	 * 支付宝企业id
	 */
	@ApiField("corp_id")
	private String corpId;

	/**
	 * 企业侧车辆编号
	 */
	@ApiField("corp_vehicle_id")
	private String corpVehicleId;

	/**
	 * 高速通行费用，单位元，精确到两位小数
	 */
	@ApiField("highway_fee")
	private String highwayFee;

	/**
	 * 0：蓝； 1：黄； 2：黑； 3：白； 4：渐变绿
	 */
	@ApiField("plate_color")
	private String plateColor;

	/**
	 * 车牌号码
	 */
	@ApiField("plate_no")
	private String plateNo;

	/**
	 * 运单目的地
	 */
	@ApiField("waybill_end_address")
	private String waybillEndAddress;

	/**
	 * 企业运单结束时间
	 */
	@ApiField("waybill_end_time")
	private Date waybillEndTime;

	/**
	 * 运单总费用，单位元，精确到两位小数
	 */
	@ApiField("waybill_fee")
	private String waybillFee;

	/**
	 * 企业运单号
	 */
	@ApiField("waybill_no")
	private String waybillNo;

	/**
	 * 运单始发地
	 */
	@ApiField("waybill_start_address")
	private String waybillStartAddress;

	/**
	 * 运单开始时间
	 */
	@ApiField("waybill_start_time")
	private Date waybillStartTime;

	/**
	 * 企业运单状态
	 */
	@ApiField("waybill_status")
	private String waybillStatus;

	public String getCorpId() {
		return this.corpId;
	}
	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getCorpVehicleId() {
		return this.corpVehicleId;
	}
	public void setCorpVehicleId(String corpVehicleId) {
		this.corpVehicleId = corpVehicleId;
	}

	public String getHighwayFee() {
		return this.highwayFee;
	}
	public void setHighwayFee(String highwayFee) {
		this.highwayFee = highwayFee;
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

	public String getWaybillEndAddress() {
		return this.waybillEndAddress;
	}
	public void setWaybillEndAddress(String waybillEndAddress) {
		this.waybillEndAddress = waybillEndAddress;
	}

	public Date getWaybillEndTime() {
		return this.waybillEndTime;
	}
	public void setWaybillEndTime(Date waybillEndTime) {
		this.waybillEndTime = waybillEndTime;
	}

	public String getWaybillFee() {
		return this.waybillFee;
	}
	public void setWaybillFee(String waybillFee) {
		this.waybillFee = waybillFee;
	}

	public String getWaybillNo() {
		return this.waybillNo;
	}
	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}

	public String getWaybillStartAddress() {
		return this.waybillStartAddress;
	}
	public void setWaybillStartAddress(String waybillStartAddress) {
		this.waybillStartAddress = waybillStartAddress;
	}

	public Date getWaybillStartTime() {
		return this.waybillStartTime;
	}
	public void setWaybillStartTime(Date waybillStartTime) {
		this.waybillStartTime = waybillStartTime;
	}

	public String getWaybillStatus() {
		return this.waybillStatus;
	}
	public void setWaybillStatus(String waybillStatus) {
		this.waybillStatus = waybillStatus;
	}

}
