package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益发放咨询返回结果
 *
 * @author auto create
 * @since 1.0, 2024-08-30 15:12:17
 */
public class OpenAssetPublishConsultResult extends AlipayObject {

	private static final long serialVersionUID = 2549337139642362783L;

	/**
	 * 资产id，券id、模板id等
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 返回券id+业务场景+品类+省份的组合信息
	 */
	@ApiField("asset_info")
	private String assetInfo;

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

	/**
	 * 未申领UN_PUBLISH已申领PUBLISHED已核销USED
	 */
	@ApiField("status")
	private String status;

	public String getAssetId() {
		return this.assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getAssetInfo() {
		return this.assetInfo;
	}
	public void setAssetInfo(String assetInfo) {
		this.assetInfo = assetInfo;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
