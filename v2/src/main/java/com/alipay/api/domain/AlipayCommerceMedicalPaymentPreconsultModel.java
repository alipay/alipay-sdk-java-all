package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医保支付预咨询接口
 *
 * @author auto create
 * @since 1.0, 2025-05-26 16:08:30
 */
public class AlipayCommerceMedicalPaymentPreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 3813794115893796896L;

	/**
	 * 支付金额,单位：元，精确到分。商保支付场景必选
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 当为商业保险支付是必须传入此参数
	 */
	@ApiField("business_scene")
	private String businessScene;

	/**
	 * 商保支付场景必选
	 */
	@ApiField("callback_url")
	private String callbackUrl;

	/**
	 * 商保支付场景必选
	 */
	@ApiField("commercial_insurance_params")
	private CommercialInsuranceParams commercialInsuranceParams;

	/**
	 * 药店标签，在异地就医场景中用于判断门店是否支持异地医保结算
	 */
	@ApiField("drug_store_tag")
	private String drugStoreTag;

	/**
	 * 定点医药机构所在地标准行政区划编码。可在<a href="http://xzqh.mca.gov.cn/map">民政部全国行政区划信息查询平台</a>查询
	 */
	@ApiField("payment_city_code")
	private String paymentCityCode;

	/**
	 * 用户证件号，目前只支持身份证号，用于判断是否与支付账户同一绑定用户
	 */
	@ApiField("user_cert_no")
	private String userCertNo;

	/**
	 * 当传入了证件号时，用来判断证件号类型，本期只支持身份证号
	 */
	@ApiField("user_cert_type")
	private String userCertType;

	/**
	 * 商保支付场景必选，其它场景可不填
	 */
	@ApiField("user_mobile_no")
	private String userMobileNo;

	/**
	 * 商保支付场景必选
	 */
	@ApiField("user_name")
	private String userName;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBusinessScene() {
		return this.businessScene;
	}
	public void setBusinessScene(String businessScene) {
		this.businessScene = businessScene;
	}

	public String getCallbackUrl() {
		return this.callbackUrl;
	}
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	public CommercialInsuranceParams getCommercialInsuranceParams() {
		return this.commercialInsuranceParams;
	}
	public void setCommercialInsuranceParams(CommercialInsuranceParams commercialInsuranceParams) {
		this.commercialInsuranceParams = commercialInsuranceParams;
	}

	public String getDrugStoreTag() {
		return this.drugStoreTag;
	}
	public void setDrugStoreTag(String drugStoreTag) {
		this.drugStoreTag = drugStoreTag;
	}

	public String getPaymentCityCode() {
		return this.paymentCityCode;
	}
	public void setPaymentCityCode(String paymentCityCode) {
		this.paymentCityCode = paymentCityCode;
	}

	public String getUserCertNo() {
		return this.userCertNo;
	}
	public void setUserCertNo(String userCertNo) {
		this.userCertNo = userCertNo;
	}

	public String getUserCertType() {
		return this.userCertType;
	}
	public void setUserCertType(String userCertType) {
		this.userCertType = userCertType;
	}

	public String getUserMobileNo() {
		return this.userMobileNo;
	}
	public void setUserMobileNo(String userMobileNo) {
		this.userMobileNo = userMobileNo;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
