package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 后台运营操作风险识别
 *
 * @author auto create
 * @since 1.0, 2020-06-04 17:23:02
 */
public class AlipaySecurityRiskReconfirmRiskidentifyCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 5322553542224816385L;

	/**
	 * 登录对应的账号名
	 */
	@ApiField("account")
	private String account;

	/**
	 * 接入的应用编号
	 */
	@ApiField("app_code")
	private String appCode;

	/**
	 * 用户所属公司
	 */
	@ApiField("company")
	private String company;

	/**
	 * 额外参数
	 */
	@ApiField("extend_param")
	private String extendParam;

	/**
	 * 具体场景对应的code
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 用户关联的租户id list
	 */
	@ApiField("tenant_id_list")
	private String tenantIdList;

	/**
	 * 设备指纹id
	 */
	@ApiField("um_id")
	private String umId;

	/**
	 * 采集设备指纹信息对应的token
	 */
	@ApiField("um_id_token")
	private String umIdToken;

	/**
	 * 用户id
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

	public String getCompany() {
		return this.company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

	public String getExtendParam() {
		return this.extendParam;
	}
	public void setExtendParam(String extendParam) {
		this.extendParam = extendParam;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getTenantIdList() {
		return this.tenantIdList;
	}
	public void setTenantIdList(String tenantIdList) {
		this.tenantIdList = tenantIdList;
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
