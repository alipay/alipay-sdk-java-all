package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车主名片用户身份信息
 *
 * @author auto create
 * @since 1.0, 2025-10-17 10:20:18
 */
public class ZmCarOwnerIdentityInfo extends AlipayObject {

	private static final long serialVersionUID = 6818218921919942167L;

	/**
	 * 真实姓名
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 用户身份号
	 */
	@ApiField("cert_no")
	private String certNo;

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

}
