package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部流量投放前的rta查询
 *
 * @author auto create
 * @since 1.0, 2021-07-26 18:02:26
 */
public class AlipayUserInviteRtaConsultModel extends AlipayObject {

	private static final long serialVersionUID = 1559213911878486859L;

	/**
	 * 加密类型，空表示不加密
	 */
	@ApiField("encrypt_type")
	private String encryptType;

	/**
	 * 设备标识信息，包括IMEI，IDFA，OAID。
注意：IMEI必须为MD5加密类型
	 */
	@ApiField("principal")
	private String principal;

	/**
	 * 查询的设备类型（IMEI、IDFA、OAID）
	 */
	@ApiField("principal_type")
	private String principalType;

	/**
	 * 咨询策略组，包含一个或多个目标咨询策略的组合，由运营分配
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
