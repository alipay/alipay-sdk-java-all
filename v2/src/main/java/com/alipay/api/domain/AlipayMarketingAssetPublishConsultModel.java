package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 权益发放批量咨询
 *
 * @author auto create
 * @since 1.0, 2025-05-29 14:36:54
 */
public class AlipayMarketingAssetPublishConsultModel extends AlipayObject {

	private static final long serialVersionUID = 3881496379734843542L;

	/**
	 * 传入业务信息
	 */
	@ApiField("biz_context")
	private String bizContext;

	/**
	 * 实体id类型，用于区分发放咨询对应的实体id，可以是类目id、券id、立减id等
	 */
	@ApiField("entity_id_type")
	private String entityIdType;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 包括实体id等信息
	 */
	@ApiListField("publish_consult_infos")
	@ApiField("publish_consult_info")
	private List<PublishConsultInfo> publishConsultInfos;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizContext() {
		return this.bizContext;
	}
	public void setBizContext(String bizContext) {
		this.bizContext = bizContext;
	}

	public String getEntityIdType() {
		return this.entityIdType;
	}
	public void setEntityIdType(String entityIdType) {
		this.entityIdType = entityIdType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public List<PublishConsultInfo> getPublishConsultInfos() {
		return this.publishConsultInfos;
	}
	public void setPublishConsultInfos(List<PublishConsultInfo> publishConsultInfos) {
		this.publishConsultInfos = publishConsultInfos;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
