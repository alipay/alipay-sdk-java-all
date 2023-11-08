package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 平台险赠险投保申请
 *
 * @author auto create
 * @since 1.0, 2021-06-22 20:47:33
 */
public class AlipayInsSceneCouponReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 4336241496294147989L;

	/**
	 * 投保人
	 */
	@ApiField("applicant")
	private InsPerson applicant;

	/**
	 * 保险发奖凭证
	 */
	@ApiField("certificate")
	private InsCertificate certificate;

	/**
	 * 被保险人
	 */
	@ApiField("insured")
	private InsPerson insured;

	/**
	 * 市场类型;TAOBAO:淘宝平台,ANT: 蚂蚁平台
	 */
	@ApiField("market_type")
	private String marketType;

	/**
	 * 商户生成的外部业务号,必须保证唯一，幂等控制
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商户pid
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 产品编码;由蚂蚁保险平台分配
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 产品版本号
	 */
	@ApiField("prod_version")
	private String prodVersion;

	/**
	 * 服务场景;
propertyPaySuccess:蚂蚁物业支付成功页面
	 */
	@ApiField("service_scenario")
	private String serviceScenario;

	public InsPerson getApplicant() {
		return this.applicant;
	}
	public void setApplicant(InsPerson applicant) {
		this.applicant = applicant;
	}

	public InsCertificate getCertificate() {
		return this.certificate;
	}
	public void setCertificate(InsCertificate certificate) {
		this.certificate = certificate;
	}

	public InsPerson getInsured() {
		return this.insured;
	}
	public void setInsured(InsPerson insured) {
		this.insured = insured;
	}

	public String getMarketType() {
		return this.marketType;
	}
	public void setMarketType(String marketType) {
		this.marketType = marketType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getProdVersion() {
		return this.prodVersion;
	}
	public void setProdVersion(String prodVersion) {
		this.prodVersion = prodVersion;
	}

	public String getServiceScenario() {
		return this.serviceScenario;
	}
	public void setServiceScenario(String serviceScenario) {
		this.serviceScenario = serviceScenario;
	}

}
