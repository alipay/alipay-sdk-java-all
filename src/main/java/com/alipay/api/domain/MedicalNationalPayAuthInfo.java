package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 国家医保局线上业务身份核验授权信息
 *
 * @author auto create
 * @since 1.0, 2021-12-28 20:06:54
 */
public class MedicalNationalPayAuthInfo extends AlipayObject {

	private static final long serialVersionUID = 5361299716389845385L;

	/**
	 * 线上支付授权流水号
	 */
	@ApiField("auth_no")
	private String authNo;

	/**
	 * 用户授权状态
	 */
	@ApiField("auth_stas")
	private String authStas;

	/**
	 * 授权时间
	 */
	@ApiField("auth_time")
	private Date authTime;

	/**
	 * 线上授权确认页链接
	 */
	@ApiField("auth_url")
	private String authUrl;

	/**
	 * 用户卡信息中机构内卡号,授权成功时返回
	 */
	@ApiField("medical_card_id")
	private String medicalCardId;

	/**
	 * 用户卡信息中机构编码,授权成功时返回
	 */
	@ApiField("medical_card_inst_id")
	private String medicalCardInstId;

	/**
	 * 开放平台应用Id
	 */
	@ApiField("openapi_app_id")
	private String openapiAppId;

	/**
	 * 线上支付授权编码,authStas=1且线上业务类型编码等于04107才返回该值
	 */
	@ApiField("pay_auth_no")
	private String payAuthNo;

	/**
	 * 商户请求流水号
	 */
	@ApiField("req_biz_no")
	private String reqBizNo;

	public String getAuthNo() {
		return this.authNo;
	}
	public void setAuthNo(String authNo) {
		this.authNo = authNo;
	}

	public String getAuthStas() {
		return this.authStas;
	}
	public void setAuthStas(String authStas) {
		this.authStas = authStas;
	}

	public Date getAuthTime() {
		return this.authTime;
	}
	public void setAuthTime(Date authTime) {
		this.authTime = authTime;
	}

	public String getAuthUrl() {
		return this.authUrl;
	}
	public void setAuthUrl(String authUrl) {
		this.authUrl = authUrl;
	}

	public String getMedicalCardId() {
		return this.medicalCardId;
	}
	public void setMedicalCardId(String medicalCardId) {
		this.medicalCardId = medicalCardId;
	}

	public String getMedicalCardInstId() {
		return this.medicalCardInstId;
	}
	public void setMedicalCardInstId(String medicalCardInstId) {
		this.medicalCardInstId = medicalCardInstId;
	}

	public String getOpenapiAppId() {
		return this.openapiAppId;
	}
	public void setOpenapiAppId(String openapiAppId) {
		this.openapiAppId = openapiAppId;
	}

	public String getPayAuthNo() {
		return this.payAuthNo;
	}
	public void setPayAuthNo(String payAuthNo) {
		this.payAuthNo = payAuthNo;
	}

	public String getReqBizNo() {
		return this.reqBizNo;
	}
	public void setReqBizNo(String reqBizNo) {
		this.reqBizNo = reqBizNo;
	}

}
