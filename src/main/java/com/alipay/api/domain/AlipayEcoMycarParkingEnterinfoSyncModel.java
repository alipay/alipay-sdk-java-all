package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车辆驶入上送接口
 *
 * @author auto create
 * @since 1.0, 2020-09-21 09:11:55
 */
public class AlipayEcoMycarParkingEnterinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1681687477878449956L;

	/**
	 * 是否启用车牌代扣状态查询功能，true为启用，false为停用
	 */
	@ApiField("agreement_query")
	private Boolean agreementQuery;

	/**
	 * 车牌颜色，可选蓝-BLUE、绿-GREEN、黄-YELLOW、白-WHITE、黑-BLACK、黄绿色-LIMEGREEN
	 */
	@ApiField("car_color")
	private String carColor;

	/**
	 * 车牌号
	 */
	@ApiField("car_number")
	private String carNumber;

	/**
	 * 用于识别车辆进口，多出入口车场适用
	 */
	@ApiField("entrance_id")
	private String entranceId;

	/**
	 * 车辆入场的时间，格式"YYYY-MM-DD HH:mm:ss"，24小时制，请保证服务器时间准确，入场时间不应晚于当前网络时间
	 */
	@ApiField("in_time")
	private String inTime;

	/**
	 * 支付宝停车场ID ，系统唯一
	 */
	@ApiField("parking_id")
	private String parkingId;

	/**
	 * 用于标识车辆停放车位编号，路侧适用
	 */
	@ApiField("space_number")
	private String spaceNumber;

	/**
	 * 与parking_id对应的外部停车场编号，在门店中维护
	 */
	@ApiField("store_id")
	private String storeId;

	public Boolean getAgreementQuery() {
		return this.agreementQuery;
	}
	public void setAgreementQuery(Boolean agreementQuery) {
		this.agreementQuery = agreementQuery;
	}

	public String getCarColor() {
		return this.carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public String getCarNumber() {
		return this.carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getEntranceId() {
		return this.entranceId;
	}
	public void setEntranceId(String entranceId) {
		this.entranceId = entranceId;
	}

	public String getInTime() {
		return this.inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	public String getParkingId() {
		return this.parkingId;
	}
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}

	public String getSpaceNumber() {
		return this.spaceNumber;
	}
	public void setSpaceNumber(String spaceNumber) {
		this.spaceNumber = spaceNumber;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
