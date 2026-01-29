package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资格平台服务同步
 *
 * @author auto create
 * @since 1.0, 2025-12-15 21:32:41
 */
public class AlipayMarketingQualificationServiceSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6645799961744657264L;

	/**
	 * 幂等号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * sn值
	 */
	@ApiField("entity_id")
	private String entityId;

	/**
	 * 商品信息或sn等对应参数
	 */
	@ApiField("entity_info")
	private String entityInfo;

	/**
	 * 商品
	 */
	@ApiField("entity_type")
	private String entityType;

	/**
	 * sn锁定
	 */
	@ApiField("fund_scene")
	private String fundScene;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getEntityId() {
		return this.entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public String getEntityInfo() {
		return this.entityInfo;
	}
	public void setEntityInfo(String entityInfo) {
		this.entityInfo = entityInfo;
	}

	public String getEntityType() {
		return this.entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getFundScene() {
		return this.fundScene;
	}
	public void setFundScene(String fundScene) {
		this.fundScene = fundScene;
	}

}
