package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车牌代扣状态查询API
 *
 * @author auto create
 * @since 1.0, 2021-08-13 15:13:21
 */
public class AlipayEcoMycarParkingAgreementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7394252384843546372L;

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
	 * 车场录入接口返回的parking_id字段
	 */
	@ApiField("parking_id")
	private String parkingId;

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

	public String getParkingId() {
		return this.parkingId;
	}
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}

	public String getVer() {
		return this.ver;
	}
	public void setVer(String ver) {
		this.ver = ver;
	}

}
