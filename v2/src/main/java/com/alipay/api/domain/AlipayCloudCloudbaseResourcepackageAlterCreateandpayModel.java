package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 变配下单并支付(退款)
 *
 * @author auto create
 * @since 1.0, 2023-09-18 17:33:51
 */
public class AlipayCloudCloudbaseResourcepackageAlterCreateandpayModel extends AlipayObject {

	private static final long serialVersionUID = 6177767447159176476L;

	/**
	 * 待变配的资源包规格编码
 - public_cloudd_cd_cn_free_bag
 - public_cloudd_cd_cn_base_bag
 - public_cloudd_cd_cn_standard_bag
 - public_cloudd_cd_cn_pro_bag
 - public_cloudd_cd_cn_ent_bag
 - public_cloudd_cd_cn_flagship_bag
	 */
	@ApiField("alter_spec_code")
	private String alterSpecCode;

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

	public String getAlterSpecCode() {
		return this.alterSpecCode;
	}
	public void setAlterSpecCode(String alterSpecCode) {
		this.alterSpecCode = alterSpecCode;
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
