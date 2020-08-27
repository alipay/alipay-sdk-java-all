package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部流量投放前的rta查询
 *
 * @author auto create
 * @since 1.0, 2020-03-03 10:49:35
 */
public class AlipayUserInviteRtaConsultModel extends AlipayObject {

	private static final long serialVersionUID = 6426241586651615684L;

	/**
	 * 加密类型，空表示不加密
	 */
	@ApiField("encrypt_type")
	private String encryptType;

	/**
	 * (加密或明文的)手机号、imei或idfa等信息
	 */
	@ApiField("principal")
	private String principal;

	/**
	 * 查询类型
	 */
	@ApiField("principal_type")
	private String principalType;

	/**
	 * 人群mode，运营分配，映射一个人群或几个人群的组合
	 */
	@ApiField("target_crowd_package_key")
	private String targetCrowdPackageKey;

	public String getEncryptType() {
		return this.encryptType;
	}
	public void setEncryptType(String encryptType) {
		this.encryptType = encryptType;
	}

	public String getPrincipal() {
		return this.principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getPrincipalType() {
		return this.principalType;
	}
	public void setPrincipalType(String principalType) {
		this.principalType = principalType;
	}

	public String getTargetCrowdPackageKey() {
		return this.targetCrowdPackageKey;
	}
	public void setTargetCrowdPackageKey(String targetCrowdPackageKey) {
		this.targetCrowdPackageKey = targetCrowdPackageKey;
	}

}
