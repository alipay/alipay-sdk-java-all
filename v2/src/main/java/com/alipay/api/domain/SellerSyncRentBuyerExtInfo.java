package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 买家扩展信息
 *
 * @author auto create
 * @since 1.0, 2025-08-20 21:37:35
 */
public class SellerSyncRentBuyerExtInfo extends AlipayObject {

	private static final long serialVersionUID = 6193492246189365323L;

	/**
	 * 买家身份证地址
	 */
	@ApiField("cert_address")
	private RentAddress certAddress;

	/**
	 * 身份证有效期失效时间
	 */
	@ApiField("cert_expire_time")
	private String certExpireTime;

	/**
	 * 买家的身份号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 身份证有效期开始时间
	 */
	@ApiField("cert_start_time")
	private String certStartTime;

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

	public String getCertExpireTime() {
		return this.certExpireTime;
	}
	public void setCertExpireTime(String certExpireTime) {
		this.certExpireTime = certExpireTime;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertStartTime() {
		return this.certStartTime;
	}
	public void setCertStartTime(String certStartTime) {
		this.certStartTime = certStartTime;
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
