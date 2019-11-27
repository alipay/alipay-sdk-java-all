package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约实体信息
 *
 * @author auto create
 * @since 1.0, 2017-12-20 15:24:35
 */
public class Principal extends AlipayObject {

	private static final long serialVersionUID = 4452733587288351349L;

	/**
	 * 企业注册
	 */
	@ApiField("biz_operation")
	private String bizOperation;

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
	 * 公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 西安工商
	 */
	@ApiField("from_industrial")
	private String fromIndustrial;

	/**
	 * 是否法人
	 */
	@ApiField("is_corporation")
	private String isCorporation;

	/**
	 * 操作人手机
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 签约主体类型
individual //个人/操作员
entreprise //企业
	 */
	@ApiField("signer_type")
	private String signerType;

	/**
	 * 数据来源
	 */
	@ApiField("source")
	private String source;

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

	public String getBizOperation() {
		return this.bizOperation;
	}
	public void setBizOperation(String bizOperation) {
		this.bizOperation = bizOperation;
	}

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

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getFromIndustrial() {
		return this.fromIndustrial;
	}
	public void setFromIndustrial(String fromIndustrial) {
		this.fromIndustrial = fromIndustrial;
	}

	public String getIsCorporation() {
		return this.isCorporation;
	}
	public void setIsCorporation(String isCorporation) {
		this.isCorporation = isCorporation;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getSignerType() {
		return this.signerType;
	}
	public void setSignerType(String signerType) {
		this.signerType = signerType;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
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
