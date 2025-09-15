package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 双方电子CA签署业务签署方注册接口
 *
 * @author auto create
 * @since 1.0, 2024-08-02 16:34:16
 */
public class AlipayBossProdAntsignUserCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7671566213715482824L;

	/**
	 * 业务方来源系统
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 业务线
	 */
	@ApiField("business_line_code")
	private String businessLineCode;

	/**
	 * 用户证件号码
	 */
	@ApiField("cert_number")
	private String certNumber;

	/**
	 * 场景值
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 租户信息
	 */
	@ApiField("tenant")
	private String tenant;

	/**
	 * 用户证件类型，
	 * 个人仅支持：
	 * CRED_PSN_CH_IDCARD（大陆身份证）
	 *
	 * 机构仅支持：
	 * CRED_ORG_USCC（统一社会信用代码）
	 */
	@ApiField("user_cert_type")
	private String userCertType;

	/**
	 * 用户名称
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * 用户类型，个人“PERSON”，机构“ORG”
	 */
	@ApiField("user_type")
	private String userType;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getBusinessLineCode() {
		return this.businessLineCode;
	}
	public void setBusinessLineCode(String businessLineCode) {
		this.businessLineCode = businessLineCode;
	}

	public String getCertNumber() {
		return this.certNumber;
	}
	public void setCertNumber(String certNumber) {
		this.certNumber = certNumber;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	public String getUserCertType() {
		return this.userCertType;
	}
	public void setUserCertType(String userCertType) {
		this.userCertType = userCertType;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return this.userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

}
