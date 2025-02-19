package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝二手车车源修改同步接口
 *
 * @author auto create
 * @since 1.0, 2024-10-22 10:40:19
 */
public class AlipayCommerceTransportCarsaleVehicleModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5298617456643695827L;

	/**
	 * 车辆更新数据对象，主要更新 status 和 price 字段
	 */
	@ApiListField("car_data")
	@ApiField("transfer_car_update_data")
	private List<TransferCarUpdateData> carData;

	public List<TransferCarUpdateData> getCarData() {
		return this.carData;
	}
	public void setCarData(List<TransferCarUpdateData> carData) {
		this.carData = carData;
	}

}
