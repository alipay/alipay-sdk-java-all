package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核身结果同步
 *
 * @author auto create
 * @since 1.0, 2020-06-04 17:23:25
 */
public class AlipaySecurityRiskReconfirmVerificatecallbackSendModel extends AlipayObject {

	private static final long serialVersionUID = 3279577541951678955L;

	/**
	 * 账号名
	 */
	@ApiField("account")
	private String account;

	/**
	 * 接入的应用编号
	 */
	@ApiField("app_code")
	private String appCode;

	/**
	 * 额外参数
	 */
	@ApiField("extend_param")
	private String extendParam;

	/**
	 * 风险识别流水id，为风险识别的标识，不敏感，无需脱敏
	 */
	@ApiField("identify_id")
	private String identifyId;

	/**
	 * 核身方式
	 */
	@ApiField("reauth_type")
	private String reauthType;

	/**
	 * 核身结果
	 */
	@ApiField("reconfirm_result")
	private Boolean reconfirmResult;

	/**
	 * 场景对应的编号
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 设备指纹id
	 */
	@ApiField("um_id")
	private String umId;

	/**
	 * 采集设备指纹对应的token
	 */
	@ApiField("um_id_token")
	private String umIdToken;

	/**
	 * 会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public String getAppCode() {
		return this.appCode;
	}
	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public String getExtendParam() {
		return this.extendParam;
	}
	public void setExtendParam(String extendParam) {
		this.extendParam = extendParam;
	}

	public String getIdentifyId() {
		return this.identifyId;
	}
	public void setIdentifyId(String identifyId) {
		this.identifyId = identifyId;
	}

	public String getReauthType() {
		return this.reauthType;
	}
	public void setReauthType(String reauthType) {
		this.reauthType = reauthType;
	}

	public Boolean getReconfirmResult() {
		return this.reconfirmResult;
	}
	public void setReconfirmResult(Boolean reconfirmResult) {
		this.reconfirmResult = reconfirmResult;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getUmId() {
		return this.umId;
	}
	public void setUmId(String umId) {
		this.umId = umId;
	}

	public String getUmIdToken() {
		return this.umIdToken;
	}
	public void setUmIdToken(String umIdToken) {
		this.umIdToken = umIdToken;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
