package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝二手车车源新增同步
 *
 * @author auto create
 * @since 1.0, 2025-04-01 19:25:18
 */
public class AlipayCommerceTransportCarsaleVehicleAddModel extends AlipayObject {

	private static final long serialVersionUID = 1155389558991533125L;

	/**
	 * 二手车数据字段
	 */
	@ApiListField("car_data")
	@ApiField("transfer_car_data")
	private List<TransferCarData> carData;

	public List<TransferCarData> getCarData() {
		return this.carData;
	}
	public void setCarData(List<TransferCarData> carData) {
		this.carData = carData;
	}

}
