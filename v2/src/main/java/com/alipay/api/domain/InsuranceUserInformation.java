package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗用户信息
 *
 * @author auto create
 * @since 1.0, 2025-08-25 09:19:51
 */
public class InsuranceUserInformation extends AlipayObject {

	private static final long serialVersionUID = 7551731649844681643L;

	/**
	 * 绑定手机号
	 */
	@ApiField("binded_mobile")
	private String bindedMobile;

	/**
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 唯一标识
	 */
	@ApiField("cert_no_flag")
	private String certNoFlag;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 关系类型
	 */
	@ApiField("relation_type")
	private String relationType;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * userName
	 */
	@ApiField("user_name")
	private String userName;

	public String getBindedMobile() {
		return this.bindedMobile;
	}
	public void setBindedMobile(String bindedMobile) {
		this.bindedMobile = bindedMobile;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertNoFlag() {
		return this.certNoFlag;
	}
	public void setCertNoFlag(String certNoFlag) {
		this.certNoFlag = certNoFlag;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRelationType() {
		return this.relationType;
	}
	public void setRelationType(String relationType) {
		this.relationType = relationType;
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
