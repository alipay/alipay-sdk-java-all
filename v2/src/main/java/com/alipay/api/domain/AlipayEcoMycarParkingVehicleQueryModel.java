package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车牌查询接口
 *
 * @author auto create
 * @since 1.0, 2022-10-12 15:40:13
 */
public class AlipayEcoMycarParkingVehicleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7461181237418964792L;

	/**
	 * 支付宝用户车辆ID，系统唯一。（该参数会在停车平台用户点击查询缴费，跳转到ISV停车缴费查询页面时，从请求中传递）
	 */
	@ApiField("car_id")
	private String carId;

	public String getCarId() {
		return this.carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}

}
