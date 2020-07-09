package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 撤销审核
 *
 * @author auto create
 * @since 1.0, 2019-12-26 15:05:44
 */
public class AlipayOpenMiniMorphoAppauditCancelModel extends AlipayObject {

	private static final long serialVersionUID = 6822746655145818943L;

	/**
	 * 小程序版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 闪蝶应用ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 闪蝶身份校验
	 */
	@ApiField("identity")
	private MorphoIdentity identity;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public MorphoIdentity getIdentity() {
		return this.identity;
	}
	public void setIdentity(MorphoIdentity identity) {
		this.identity = identity;
	}

}
