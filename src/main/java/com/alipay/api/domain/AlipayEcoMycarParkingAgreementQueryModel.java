package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车牌代扣状态查询API
 *
 * @author auto create
 * @since 1.0, 2019-08-22 14:07:30
 */
public class AlipayEcoMycarParkingAgreementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7162792914176111325L;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 车牌，用户车辆进场时ISV设备识别到的车辆牌照
	 */
	@ApiField("car_number")
	private String carNumber;

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

	public String getVer() {
		return this.ver;
	}
	public void setVer(String ver) {
		this.ver = ver;
	}

}
