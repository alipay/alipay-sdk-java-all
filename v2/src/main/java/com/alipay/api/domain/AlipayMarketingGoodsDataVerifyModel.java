package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品信息核验接口
 *
 * @author auto create
 * @since 1.0, 2025-03-28 14:25:39
 */
public class AlipayMarketingGoodsDataVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 3143629589917273458L;

	/**
	 * 操作类型
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 请求流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 商品额外信息
	 */
	@ApiField("entity_info")
	private String entityInfo;

	/**
	 * 支付宝分配的场景编码，用于识别活动场景及区域等信息
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getEntityInfo() {
		return this.entityInfo;
	}
	public void setEntityInfo(String entityInfo) {
		this.entityInfo = entityInfo;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
