package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品信息服务
 *
 * @author auto create
 * @since 1.0, 2025-05-29 14:36:42
 */
public class AlipayMarketingEntityQualificationVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 4684887485281476617L;

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
	 * 用于透传商品额外信息
	 */
	@ApiField("entity_info")
	private String entityInfo;

	/**
	 * 商品
	 */
	@ApiField("entity_type")
	private String entityType;

	/**
	 * SN锁定
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
