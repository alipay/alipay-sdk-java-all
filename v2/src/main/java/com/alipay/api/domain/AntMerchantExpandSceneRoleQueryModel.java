package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景商户角色信息查询
 *
 * @author auto create
 * @since 1.0, 2025-06-17 20:27:29
 */
public class AntMerchantExpandSceneRoleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7696986391981767426L;

	/**
	 * 商户编号，由调用方定义，需要保证在调用方下唯一
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 商户 id
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 业务场景
	 */
	@ApiField("scene")
	private String scene;

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
