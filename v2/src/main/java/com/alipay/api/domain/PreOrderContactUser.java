package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预下单的联系人信息
 *
 * @author auto create
 * @since 1.0, 2024-09-18 17:12:55
 */
public class PreOrderContactUser extends AlipayObject {

	private static final long serialVersionUID = 6769475471517923169L;

	/**
	 * 联系人身份证号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 联系人电话
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 联系人的姓名
	 */
	@ApiField("name")
	private String name;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
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

}
