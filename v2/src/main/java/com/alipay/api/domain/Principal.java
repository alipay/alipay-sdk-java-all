package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约实体信息
 *
 * @author auto create
 * @since 1.0, 2017-10-26 15:12:24
 */
public class Principal extends AlipayObject {

	private static final long serialVersionUID = 7857612497144672664L;

	/**
	 * 用户身份证号。
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
'IDENTIFY' //个人认证-身份证类型
'BRNUMBER' //工商注册号
'USCC' //统一社会信用代码
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 签约主体类型
individual //个人/操作员
entreprise //企业
	 */
	@ApiField("signer_type")
	private String signerType;

	/**
	 * 签约主体名称
个人认证时例如：'张三'
企业认证时例如：'XX公司'
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * 是否需要认证
'NEED'  //需要认证
'NONEED'  //不需要认证
	 */
	@ApiField("verify_type")
	private String verifyType;

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

	public String getSignerType() {
		return this.signerType;
	}
	public void setSignerType(String signerType) {
		this.signerType = signerType;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getVerifyType() {
		return this.verifyType;
	}
	public void setVerifyType(String verifyType) {
		this.verifyType = verifyType;
	}

}
