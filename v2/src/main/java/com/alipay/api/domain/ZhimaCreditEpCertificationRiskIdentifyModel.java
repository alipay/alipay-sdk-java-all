package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用认证风险识别
 *
 * @author auto create
 * @since 1.0, 2023-01-31 15:40:15
 */
public class ZhimaCreditEpCertificationRiskIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 4416753448816857233L;

	/**
	 * 一次认证的唯一标识,在商户调用认证初始化接口的时候获取。risk_identify_type=BIZNO 必填
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 统一社会信用代码或营业执照注册号risk_identify_type=ENTERPRISE 必填
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 企业全称,当risk_identify_type=ENTERPRISE 必填
	 */
	@ApiField("ep_name")
	private String epName;

	/**
	 * 风险识别类别，可传入ENTERPRISE或者PERSON或者BIZNO，用于认证场景，通过传入不同的类别返回不同的风险结果
	 */
	@ApiField("risk_identify_type")
	private String riskIdentifyType;

	/**
	 * 证件号码，仅支持身份证号,risk_identify_type=PERSON 必填
	 */
	@ApiField("user_cert_no")
	private String userCertNo;

	/**
	 * 个人用户姓名,risk_identify_type=PERSON 必填
	 */
	@ApiField("user_name")
	private String userName;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

	public String getEpName() {
		return this.epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}

	public String getRiskIdentifyType() {
		return this.riskIdentifyType;
	}
	public void setRiskIdentifyType(String riskIdentifyType) {
		this.riskIdentifyType = riskIdentifyType;
	}

	public String getUserCertNo() {
		return this.userCertNo;
	}
	public void setUserCertNo(String userCertNo) {
		this.userCertNo = userCertNo;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
