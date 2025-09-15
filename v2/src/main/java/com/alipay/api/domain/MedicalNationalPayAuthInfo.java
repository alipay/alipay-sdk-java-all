package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 国家医保局线上业务身份核验授权信息
 *
 * @author auto create
 * @since 1.0, 2024-06-12 11:22:52
 */
public class MedicalNationalPayAuthInfo extends AlipayObject {

	private static final long serialVersionUID = 4188499853387662323L;

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
	 * 电子凭证中心线上身份核验返回的默认参保地
	 */
	@ApiField("insu_org")
	private String insuOrg;

	/**
	 * 就诊用户卡信息中机构内卡号,授权成功时返回
	 */
	@ApiField("medical_card_id")
	private String medicalCardId;

	/**
	 * 就诊用户卡信息中机构编码,授权成功时返回
	 */
	@ApiField("medical_card_inst_id")
	private String medicalCardInstId;

	/**
	 * 本人凭证激活状态
	 */
	@ApiField("medical_card_status")
	private String medicalCardStatus;

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
	 * 亲情账户绑定状态，在rels_pay_flag=1时返回
	 */
	@ApiField("rels_medical_card_status")
	private String relsMedicalCardStatus;

	/**
	 * 授权类型
本人授权-0
亲情账户授权-1
	 */
	@ApiField("rels_pay_flag")
	private String relsPayFlag;

	/**
	 * 如果授权人类型为亲情账户授权，该字段必填，返回主账户脱敏姓名
	 */
	@ApiField("rels_pay_user_name")
	private String relsPayUserName;

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

	public String getInsuOrg() {
		return this.insuOrg;
	}
	public void setInsuOrg(String insuOrg) {
		this.insuOrg = insuOrg;
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

	public String getMedicalCardStatus() {
		return this.medicalCardStatus;
	}
	public void setMedicalCardStatus(String medicalCardStatus) {
		this.medicalCardStatus = medicalCardStatus;
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

	public String getRelsMedicalCardStatus() {
		return this.relsMedicalCardStatus;
	}
	public void setRelsMedicalCardStatus(String relsMedicalCardStatus) {
		this.relsMedicalCardStatus = relsMedicalCardStatus;
	}

	public String getRelsPayFlag() {
		return this.relsPayFlag;
	}
	public void setRelsPayFlag(String relsPayFlag) {
		this.relsPayFlag = relsPayFlag;
	}

	public String getRelsPayUserName() {
		return this.relsPayUserName;
	}
	public void setRelsPayUserName(String relsPayUserName) {
		this.relsPayUserName = relsPayUserName;
	}

	public String getReqBizNo() {
		return this.reqBizNo;
	}
	public void setReqBizNo(String reqBizNo) {
		this.reqBizNo = reqBizNo;
	}

}
