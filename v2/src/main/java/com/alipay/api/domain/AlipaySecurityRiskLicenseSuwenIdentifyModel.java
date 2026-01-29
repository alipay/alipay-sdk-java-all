package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医生信息风险识别能力
 *
 * @author auto create
 * @since 1.0, 2025-07-08 10:54:28
 */
public class AlipaySecurityRiskLicenseSuwenIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 1128367484853854623L;

	/**
	 * 关联上游审核工单id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 医生资质核验参数
	 */
	@ApiField("doctor_license_request")
	private RcDoctorLicenseRequest doctorLicenseRequest;

	/**
	 * 调用方名称
	 */
	@ApiField("invoke_app_name")
	private String invokeAppName;

	/**
	 * 调用方使用token
	 */
	@ApiField("invoke_token")
	private String invokeToken;

	/**
	 * 资质类型
	 */
	@ApiField("license_type")
	private String licenseType;

	/**
	 * 请求唯一标识
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 调用场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public RcDoctorLicenseRequest getDoctorLicenseRequest() {
		return this.doctorLicenseRequest;
	}
	public void setDoctorLicenseRequest(RcDoctorLicenseRequest doctorLicenseRequest) {
		this.doctorLicenseRequest = doctorLicenseRequest;
	}

	public String getInvokeAppName() {
		return this.invokeAppName;
	}
	public void setInvokeAppName(String invokeAppName) {
		this.invokeAppName = invokeAppName;
	}

	public String getInvokeToken() {
		return this.invokeToken;
	}
	public void setInvokeToken(String invokeToken) {
		this.invokeToken = invokeToken;
	}

	public String getLicenseType() {
		return this.licenseType;
	}
	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
