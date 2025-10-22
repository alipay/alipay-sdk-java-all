package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门票游客
 *
 * @author auto create
 * @since 1.0, 2024-08-21 16:07:23
 */
public class TicketPassager extends AlipayObject {

	private static final long serialVersionUID = 4896729945212644319L;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 手机号
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 用户姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 门票状态
	 */
	@ApiField("status")
	private String status;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
