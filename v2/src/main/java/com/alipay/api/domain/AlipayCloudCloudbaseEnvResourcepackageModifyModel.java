package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资源包升配降配
 *
 * @author auto create
 * @since 1.0, 2023-08-10 20:00:06
 */
public class AlipayCloudCloudbaseEnvResourcepackageModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4775552298299135966L;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 环境id
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	/**
	 * 区域
	 */
	@ApiField("region")
	private String region;

	/**
	 * 资源包规格CODE
 - public_cloudd_cd_cn_free_bag
 - public_cloudd_cd_cn_basic_bag
 - public_cloudd_cd_cn_standard_bag
 - public_cloudd_cd_cn_pro_bag
 - public_cloudd_cd_cn_enterprise_bag
 - public_cloudd_cd_cn_flagship_bag
	 */
	@ApiField("resource_spec_code")
	private String resourceSpecCode;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getBizEnvId() {
		return this.bizEnvId;
	}
	public void setBizEnvId(String bizEnvId) {
		this.bizEnvId = bizEnvId;
	}

	public String getRegion() {
		return this.region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

	public String getResourceSpecCode() {
		return this.resourceSpecCode;
	}
	public void setResourceSpecCode(String resourceSpecCode) {
		this.resourceSpecCode = resourceSpecCode;
	}

}
