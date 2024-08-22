package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益发放咨询返回结果
 *
 * @author auto create
 * @since 1.0, 2024-08-22 15:26:10
 */
public class OpenAssetPublishConsultResult extends AlipayObject {

	private static final long serialVersionUID = 5456237476869874127L;

	/**
	 * 资产id，券id、模板id等
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 实体id，配合实体id类型使用，可以是类目id、券id、模板id
	 */
	@ApiField("entity_id")
	private String entityId;

	/**
	 * 发放咨询是否通过
	 */
	@ApiField("passed")
	private Boolean passed;

	public String getAssetId() {
		return this.assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getEntityId() {
		return this.entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public Boolean getPassed() {
		return this.passed;
	}
	public void setPassed(Boolean passed) {
		this.passed = passed;
	}

}
