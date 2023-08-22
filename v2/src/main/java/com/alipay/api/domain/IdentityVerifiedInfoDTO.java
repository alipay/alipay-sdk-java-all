package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同人身份信息校验模型
 *
 * @author auto create
 * @since 1.0, 2023-02-07 10:10:28
 */
public class IdentityVerifiedInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7153557828647351894L;

	/**
	 * MD5加密处理后的证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型。暂仅支持 IDENTITY_CARD （身份证）
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 用户的真实姓名
	 */
	@ApiField("user_name")
	private String userName;

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

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
