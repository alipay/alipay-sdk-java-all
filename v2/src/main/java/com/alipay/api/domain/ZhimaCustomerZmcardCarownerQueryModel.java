package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻车主名片双证信息查询
 *
 * @author auto create
 * @since 1.0, 2025-10-17 10:20:18
 */
public class ZhimaCustomerZmcardCarownerQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3182232558852347586L;

	/**
	 * 真实姓名
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 用户身份号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 名片角色类型
	 */
	@ApiField("role_type")
	private String roleType;

	/**
	 * 来源：小程序/端外APP
	 */
	@ApiField("source")
	private String source;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRoleType() {
		return this.roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
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

}
