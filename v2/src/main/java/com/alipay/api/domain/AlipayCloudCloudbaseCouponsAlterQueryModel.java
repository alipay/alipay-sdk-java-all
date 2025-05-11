package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 变配询券
 *
 * @author auto create
 * @since 1.0, 2024-05-22 17:26:54
 */
public class AlipayCloudCloudbaseCouponsAlterQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5398879116432991837L;

	/**
	 * 变配资源包规格编码
 - public_cloudd_cd_cn_free_bag
 - public_cloudd_cd_cn_base_bag
 - public_cloudd_cd_cn_standard_bag
 - public_cloudd_cd_cn_pro_bag
 - public_cloudd_cd_cn_ent_bag
 - public_cloudd_cd_cn_flagship_bag
 - public_cloudd_cd_cn_free_bag
	 */
	@ApiField("alter_spec_code")
	private String alterSpecCode;

	/**
	 * 变配商品规格类型
 - ALTERATION_UP
 - ALTERATION_DOWN
	 */
	@ApiField("alter_type")
	private String alterType;

	/**
	 * 应用ID
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 环境ID
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	public String getAlterSpecCode() {
		return this.alterSpecCode;
	}
	public void setAlterSpecCode(String alterSpecCode) {
		this.alterSpecCode = alterSpecCode;
	}

	public String getAlterType() {
		return this.alterType;
	}
	public void setAlterType(String alterType) {
		this.alterType = alterType;
	}

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

}
