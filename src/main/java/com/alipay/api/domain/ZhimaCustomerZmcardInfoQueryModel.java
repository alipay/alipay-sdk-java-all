package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻证信息查询
 *
 * @author auto create
 * @since 1.0, 2022-01-24 10:16:18
 */
public class ZhimaCustomerZmcardInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6714638298122796817L;

	/**
	 * 查看者的身份证号,A申请查看B的芝麻证信息，则传入A的身份证号，若是自己查看自己的，则传入自己的身份证号，无法确定查看者，则传入空
	 */
	@ApiField("guest_cert_no")
	private String guestCertNo;

	/**
	 * 芝麻证被查看人的身份证号
	 */
	@ApiField("host_cert_no")
	private String hostCertNo;

	public String getGuestCertNo() {
		return this.guestCertNo;
	}
	public void setGuestCertNo(String guestCertNo) {
		this.guestCertNo = guestCertNo;
	}

	public String getHostCertNo() {
		return this.hostCertNo;
	}
	public void setHostCertNo(String hostCertNo) {
		this.hostCertNo = hostCertNo;
	}

}
