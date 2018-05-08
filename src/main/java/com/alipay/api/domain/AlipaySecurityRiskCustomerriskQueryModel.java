package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户风险服务输出
 *
 * @author auto create
 * @since 1.0, 2017-05-26 21:53:47
 */
public class AlipaySecurityRiskCustomerriskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2554256663618763116L;

	/**
	 * 银行卡号不唯一，用于传递服务商查询接入的商户的银行卡卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 身份证号不唯一，用于传递服务商查询接入的商户风险所需要的身份证号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 手机号不唯一，用于传递服务商查询接入的商户的手机号
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 风险类型不唯一，用于服务商查询接入的商户风险，例如：merchant_general（综合风险），merchant_fraud（欺诈风险），merchant_business（资质风险）等，签约时指定查询风险类型，且一次调用可以传递多个风险类型，用逗号隔开
	 */
	@ApiField("risk_type")
	private String riskType;

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

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

	public String getRiskType() {
		return this.riskType;
	}
	public void setRiskType(String riskType) {
		this.riskType = riskType;
	}

}
