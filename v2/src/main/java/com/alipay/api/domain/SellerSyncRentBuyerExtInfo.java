package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 买家扩展信息
 *
 * @author auto create
 * @since 1.0, 2025-08-11 11:18:17
 */
public class SellerSyncRentBuyerExtInfo extends AlipayObject {

	private static final long serialVersionUID = 6467953689349234194L;

	/**
	 * 买家身份证地址
	 */
	@ApiField("cert_address")
	private RentAddress certAddress;

	/**
	 * 买家的身份号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 买家的手机号码
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 买家的名字
	 */
	@ApiField("name")
	private String name;

	public RentAddress getCertAddress() {
		return this.certAddress;
	}
	public void setCertAddress(RentAddress certAddress) {
		this.certAddress = certAddress;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
