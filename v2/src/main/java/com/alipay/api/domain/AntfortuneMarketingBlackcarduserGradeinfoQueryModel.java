package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户黑卡身份查询接口
 *
 * @author auto create
 * @since 1.0, 2025-12-17 15:37:41
 */
public class AntfortuneMarketingBlackcarduserGradeinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7314286519781336624L;

	/**
	 * 用户证件号，AES加密
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 权益类型枚举
	 */
	@ApiField("equity_code")
	private String equityCode;

	/**
	 * 用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 查询场景类型:
黑卡等级是否满足: USER_BLACKCARD
是否有资格: USER_QUALIFICATION
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户名，AES加密
	 */
	@ApiField("user_name")
	private String userName;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getEquityCode() {
		return this.equityCode;
	}
	public void setEquityCode(String equityCode) {
		this.equityCode = equityCode;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
