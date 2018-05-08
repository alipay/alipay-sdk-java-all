package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV获取用户违章车辆信息
 *
 * @author auto create
 * @since 1.0, 2017-07-13 14:24:54
 */
public class AlipayEcoMycarViolationVehicleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8368962364193568178L;

	/**
	 * 用户车辆ID,支付宝系统唯一
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
