package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-02 15:22:52
 */
public class LeadsImportItem extends AlipayObject {

	private static final long serialVersionUID = 7278876875453326246L;

	/**
	 * 司机主要营运出租业务的城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 司机所属出租车公司 如果不填则默认为个体工商户
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 司机身份证号
	 */
	@ApiField("driver_cert_no")
	private String driverCertNo;

	/**
	 * 司机名称
	 */
	@ApiField("driver_name")
	private String driverName;

	/**
	 * 司机运营出租车牌照号码 可不填
	 */
	@ApiField("driver_plate")
	private String driverPlate;

	/**
	 * 在税务局登记的税号 可以是个人税号或者所属公司的税号
	 */
	@ApiField("driver_tax_no")
	private String driverTaxNo;

	/**
	 * 实体车队长所属企业
	 */
	@ApiField("fleet_captain_company")
	private String fleetCaptainCompany;

	/**
	 * 车队长的身份证号
	 */
	@ApiField("fleet_captain_id_card")
	private String fleetCaptainIdCard;

	/**
	 * 车队长的姓名
	 */
	@ApiField("fleet_captain_name")
	private String fleetCaptainName;

	/**
	 * 实体车队长车牌
	 */
	@ApiField("fleet_captain_plate")
	private String fleetCaptainPlate;

	/**
	 * 联系电话号码
	 */
	@ApiField("phone_one")
	private String phoneOne;

	/**
	 * 备用手机号
	 */
	@ApiField("phone_three")
	private String phoneThree;

	/**
	 * 备用手机号
	 */
	@ApiField("phone_two")
	private String phoneTwo;

	/**
	 * 录入人对本司机的备注信息
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 标识自己的数据来源 数值找支付宝端申请分配
	 */
	@ApiField("source")
	private String source;

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDriverCertNo() {
		return this.driverCertNo;
	}
	public void setDriverCertNo(String driverCertNo) {
		this.driverCertNo = driverCertNo;
	}

	public String getDriverName() {
		return this.driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDriverPlate() {
		return this.driverPlate;
	}
	public void setDriverPlate(String driverPlate) {
		this.driverPlate = driverPlate;
	}

	public String getDriverTaxNo() {
		return this.driverTaxNo;
	}
	public void setDriverTaxNo(String driverTaxNo) {
		this.driverTaxNo = driverTaxNo;
	}

	public String getFleetCaptainCompany() {
		return this.fleetCaptainCompany;
	}
	public void setFleetCaptainCompany(String fleetCaptainCompany) {
		this.fleetCaptainCompany = fleetCaptainCompany;
	}

	public String getFleetCaptainIdCard() {
		return this.fleetCaptainIdCard;
	}
	public void setFleetCaptainIdCard(String fleetCaptainIdCard) {
		this.fleetCaptainIdCard = fleetCaptainIdCard;
	}

	public String getFleetCaptainName() {
		return this.fleetCaptainName;
	}
	public void setFleetCaptainName(String fleetCaptainName) {
		this.fleetCaptainName = fleetCaptainName;
	}

	public String getFleetCaptainPlate() {
		return this.fleetCaptainPlate;
	}
	public void setFleetCaptainPlate(String fleetCaptainPlate) {
		this.fleetCaptainPlate = fleetCaptainPlate;
	}

	public String getPhoneOne() {
		return this.phoneOne;
	}
	public void setPhoneOne(String phoneOne) {
		this.phoneOne = phoneOne;
	}

	public String getPhoneThree() {
		return this.phoneThree;
	}
	public void setPhoneThree(String phoneThree) {
		this.phoneThree = phoneThree;
	}

	public String getPhoneTwo() {
		return this.phoneTwo;
	}
	public void setPhoneTwo(String phoneTwo) {
		this.phoneTwo = phoneTwo;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
