package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车主车辆信息查询
 *
 * @author auto create
 * @since 1.0, 2022-09-29 10:02:25
 */
public class AlipayEcoMycarVehicleInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2618737448117747273L;

	/**
	 * 车牌号
	 */
	@ApiField("plate_no")
	private String plateNo;

	/**
	 * 车辆id
	 */
	@ApiField("vi_id")
	private String viId;

	public String getPlateNo() {
		return this.plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getViId() {
		return this.viId;
	}
	public void setViId(String viId) {
		this.viId = viId;
	}

}
