package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 健康档案成员匹配
 *
 * @author auto create
 * @since 1.0, 2026-08-27 15:56:19
 */
public class AlipayCommerceMedicalArchiveMemberMatchModel extends AlipayObject {

	private static final long serialVersionUID = 4111257713851246599L;

	/**
	 * 阿福用户openid
	 */
	@ApiField("aq_open_id")
	private String aqOpenId;

	/**
	 * 18位身份证号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 支付宝用户OPENID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 真实姓名
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAqOpenId() {
		return this.aqOpenId;
	}
	public void setAqOpenId(String aqOpenId) {
		this.aqOpenId = aqOpenId;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
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

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
