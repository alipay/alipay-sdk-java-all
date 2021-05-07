package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车主车辆信息查询
 *
 * @author auto create
 * @since 1.0, 2020-11-23 20:22:04
 */
public class AlipayEcoMycarVehicleInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7586687139839947363L;

	/**
	 * 车牌号
	 */
	@ApiField("plate_no")
	private String plateNo;

	public String getPlateNo() {
		return this.plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

}
