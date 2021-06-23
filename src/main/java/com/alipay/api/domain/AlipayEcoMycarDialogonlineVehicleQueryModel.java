package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取用户车辆信息
 *
 * @author auto create
 * @since 1.0, 2020-12-31 11:47:45
 */
public class AlipayEcoMycarDialogonlineVehicleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5781217353793683683L;

	/**
	 * 车辆ID
	 */
	@ApiField("vi_id")
	private String viId;

	public String getViId() {
		return this.viId;
	}
	public void setViId(String viId) {
		this.viId = viId;
	}

}
