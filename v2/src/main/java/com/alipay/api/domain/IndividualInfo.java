package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 个人信息，包含与商户有关联的个体，如联系人，董事，控股个人，等的姓名，地址，生日，国籍等信息。
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class IndividualInfo extends AlipayObject {

	private static final long serialVersionUID = 4364171366828822135L;

	/**
	 * 生日
	 */
	@ApiField("date_of_birth")
	private String dateOfBirth;

	/**
	 * 证件号码
	 */
	@ApiField("id_number")
	private String idNumber;

	/**
	 * 个人名字
	 */
	@ApiField("name")
	private String name;

	/**
	 * 国籍
	 */
	@ApiField("nationality")
	private String nationality;

	/**
	 * 个人居住地
	 */
	@ApiField("residential_address")
	private String residentialAddress;

	/**
	 * 该个体的类型
	 */
	@ApiField("type")
	private String type;

	public String getDateOfBirth() {
		return this.dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getIdNumber() {
		return this.idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return this.nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getResidentialAddress() {
		return this.residentialAddress;
	}
	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
