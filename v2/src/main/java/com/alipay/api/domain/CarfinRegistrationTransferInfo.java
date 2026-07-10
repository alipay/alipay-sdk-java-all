package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 登记证转移登记记录
 *
 * @author auto create
 * @since 1.0, 2026-06-25 21:29:38
 */
public class CarfinRegistrationTransferInfo extends AlipayObject {

	private static final long serialVersionUID = 1898746918817861766L;

	/**
	 * 获得方式
	 */
	@ApiField("acquisition_method")
	private String acquisitionMethod;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("social_code")
	private String socialCode;

	/**
	 * 转移人姓名
	 */
	@ApiField("transfer_name")
	private String transferName;

	/**
	 * 转移登记日期
	 */
	@ApiField("transfer_registration_date")
	private String transferRegistrationDate;

	/**
	 * 机动车登记编号
	 */
	@ApiField("vehicle_registration_number")
	private String vehicleRegistrationNumber;

	public String getAcquisitionMethod() {
		return this.acquisitionMethod;
	}
	public void setAcquisitionMethod(String acquisitionMethod) {
		this.acquisitionMethod = acquisitionMethod;
	}

	public String getSocialCode() {
		return this.socialCode;
	}
	public void setSocialCode(String socialCode) {
		this.socialCode = socialCode;
	}

	public String getTransferName() {
		return this.transferName;
	}
	public void setTransferName(String transferName) {
		this.transferName = transferName;
	}

	public String getTransferRegistrationDate() {
		return this.transferRegistrationDate;
	}
	public void setTransferRegistrationDate(String transferRegistrationDate) {
		this.transferRegistrationDate = transferRegistrationDate;
	}

	public String getVehicleRegistrationNumber() {
		return this.vehicleRegistrationNumber;
	}
	public void setVehicleRegistrationNumber(String vehicleRegistrationNumber) {
		this.vehicleRegistrationNumber = vehicleRegistrationNumber;
	}

}
