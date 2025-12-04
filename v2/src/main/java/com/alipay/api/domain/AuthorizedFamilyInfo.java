package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户已授权的医疗健康家人信息
 *
 * @author auto create
 * @since 1.0, 2025-12-02 11:24:22
 */
public class AuthorizedFamilyInfo extends AlipayObject {

	private static final long serialVersionUID = 3868796697649655292L;

	/**
	 * 已授权家人证件号
	 */
	@ApiField("user_cert_no")
	private String userCertNo;

	/**
	 * 已授权家人证件类型
	 */
	@ApiField("user_cert_type")
	private String userCertType;

	/**
	 * 已授权家人跟支付宝用户本人的亲属关系
	 */
	@ApiField("user_relation_type")
	private String userRelationType;

	/**
	 * 已授权家人姓名
	 */
	@ApiField("username")
	private String username;

	public String getUserCertNo() {
		return this.userCertNo;
	}
	public void setUserCertNo(String userCertNo) {
		this.userCertNo = userCertNo;
	}

	public String getUserCertType() {
		return this.userCertType;
	}
	public void setUserCertType(String userCertType) {
		this.userCertType = userCertType;
	}

	public String getUserRelationType() {
		return this.userRelationType;
	}
	public void setUserRelationType(String userRelationType) {
		this.userRelationType = userRelationType;
	}

	public String getUsername() {
		return this.username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

}
