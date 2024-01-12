package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 所有需要报价机构对应的精友码
 *
 * @author auto create
 * @since 1.0, 2019-12-09 15:22:32
 */
public class VehicleInfo extends AlipayObject {

	private static final long serialVersionUID = 8692463645747739888L;

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

	/**
	 * 精友码提供者在精友的主体编码
	 */
	@ApiField("vehicle_subject_code")
	private String vehicleSubjectCode;

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

	public String getVehicleSubjectCode() {
		return this.vehicleSubjectCode;
	}
	public void setVehicleSubjectCode(String vehicleSubjectCode) {
		this.vehicleSubjectCode = vehicleSubjectCode;
	}

}
