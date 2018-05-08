package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 所有需要报价机构对应的精友码
 *
 * @author auto create
 * @since 1.0, 2017-10-24 17:03:38
 */
public class VehicleInfo extends AlipayObject {

	private static final long serialVersionUID = 3498136243747526695L;

	/**
	 * 保险公司ID
	 */
	@ApiField("company_id")
	private String companyId;

	/**
	 * 保险公司对应的精友码（转码）
	 */
	@ApiField("vehicle_code")
	private String vehicleCode;

	public String getCompanyId() {
		return this.companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getVehicleCode() {
		return this.vehicleCode;
	}
	public void setVehicleCode(String vehicleCode) {
		this.vehicleCode = vehicleCode;
	}

}
