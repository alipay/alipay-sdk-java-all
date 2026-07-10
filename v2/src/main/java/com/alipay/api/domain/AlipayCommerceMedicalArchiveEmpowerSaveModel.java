package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保存康乃心小程序授权信息
 *
 * @author auto create
 * @since 1.0, 2026-05-14 16:17:49
 */
public class AlipayCommerceMedicalArchiveEmpowerSaveModel extends AlipayObject {

	private static final long serialVersionUID = 1377953812513556324L;

	/**
	 * 认证令牌
	 */
	@ApiField("access_token")
	private String accessToken;

	/**
	 * 授权操作类型
	 */
	@ApiField("auth_action")
	private String authAction;

	/**
	 * 授权码
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 授权状态
	 */
	@ApiField("auth_status")
	private String authStatus;

	/**
	 * 数据来源
	 */
	@ApiField("data_source")
	private String dataSource;

	/**
	 * 康乃心授权信息
	 */
	@ApiField("knx_auth_datail")
	private KnxAuthDetail knxAuthDatail;

	/**
	 * 健康档案成员id
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getAccessToken() {
		return this.accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getAuthAction() {
		return this.authAction;
	}
	public void setAuthAction(String authAction) {
		this.authAction = authAction;
	}

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getAuthStatus() {
		return this.authStatus;
	}
	public void setAuthStatus(String authStatus) {
		this.authStatus = authStatus;
	}

	public String getDataSource() {
		return this.dataSource;
	}
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public KnxAuthDetail getKnxAuthDatail() {
		return this.knxAuthDatail;
	}
	public void setKnxAuthDatail(KnxAuthDetail knxAuthDatail) {
		this.knxAuthDatail = knxAuthDatail;
	}

	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
