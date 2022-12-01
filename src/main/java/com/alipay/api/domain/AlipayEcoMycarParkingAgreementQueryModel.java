package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车牌代扣状态查询API
 *
 * @author auto create
 * @since 1.0, 2022-11-16 15:03:16
 */
public class AlipayEcoMycarParkingAgreementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2298485978449774847L;

	/**
	 * 支付宝用户ID；只有传入该参数才能准确的匹配车和用户的关系，否则有可能无法正确获取到用户的代扣状态。
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 车牌，用户车辆进场时ISV设备识别到的车辆牌照
	 */
	@ApiField("car_number")
	private String carNumber;

	/**
	 * 应用用户ID，支付宝用户唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 车场录入接口返回的parking_id字段
	 */
	@ApiField("parking_id")
	private String parkingId;

	/**
	 * 车牌颜色, 蓝-BLUE、绿-GREEN、黄-YELLOW、白-WHITE、黑-BLACK、黄绿色-LIMEGREEN
	 */
	@ApiField("plate_color")
	private String plateColor;

	/**
	 * 接口版本号，不填则默认为v2.0，建议使用最新版v2.1
	 */
	@ApiField("ver")
	private String ver;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getCarNumber() {
		return this.carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getParkingId() {
		return this.parkingId;
	}
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}

	public String getPlateColor() {
		return this.plateColor;
	}
	public void setPlateColor(String plateColor) {
		this.plateColor = plateColor;
	}

	public String getVer() {
		return this.ver;
	}
	public void setVer(String ver) {
		this.ver = ver;
	}

}
