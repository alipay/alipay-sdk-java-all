package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构向支付宝发送出租车司机信息
 *
 * @author auto create
 * @since 1.0, 2022-04-07 21:47:02
 */
public class AlipayCommerceTransportTaxiDriverSendModel extends AlipayObject {

	private static final long serialVersionUID = 7483986952526293445L;

	/**
	 * 支付宝账号
	 */
	@ApiField("alipay_account")
	private String alipayAccount;

	/**
	 * 车牌号
	 */
	@ApiField("car_no")
	private String carNo;

	/**
	 * 司机身份证号
	 */
	@ApiField("driver_cert_no")
	private String driverCertNo;

	/**
	 * 司机工号
	 */
	@ApiField("driver_job_no")
	private String driverJobNo;

	/**
	 * 司机姓名
	 */
	@ApiField("driver_name")
	private String driverName;

	/**
	 * 司机手机号
	 */
	@ApiField("driver_phone")
	private String driverPhone;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 来源方，由支付宝分配
	 */
	@ApiField("source")
	private String source;

	public String getAlipayAccount() {
		return this.alipayAccount;
	}
	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}

	public String getCarNo() {
		return this.carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getDriverCertNo() {
		return this.driverCertNo;
	}
	public void setDriverCertNo(String driverCertNo) {
		this.driverCertNo = driverCertNo;
	}

	public String getDriverJobNo() {
		return this.driverJobNo;
	}
	public void setDriverJobNo(String driverJobNo) {
		this.driverJobNo = driverJobNo;
	}

	public String getDriverName() {
		return this.driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDriverPhone() {
		return this.driverPhone;
	}
	public void setDriverPhone(String driverPhone) {
		this.driverPhone = driverPhone;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
