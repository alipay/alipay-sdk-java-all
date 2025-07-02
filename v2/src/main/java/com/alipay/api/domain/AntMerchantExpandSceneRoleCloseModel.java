package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 注销商户
 *
 * @author auto create
 * @since 1.0, 2025-06-17 19:17:31
 */
public class AntMerchantExpandSceneRoleCloseModel extends AlipayObject {

	private static final long serialVersionUID = 7194641588674418766L;

	/**
	 * 外部商户号，和商家 id 二选一必填
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 商户id，和外部商户号二选一必填
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
