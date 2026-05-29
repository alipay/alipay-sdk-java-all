package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 房源问询agent
 *
 * @author auto create
 * @since 1.0, 2026-05-22 14:17:48
 */
public class AlipayCircularRentRoomAgentChatModel extends AlipayObject {

	private static final long serialVersionUID = 5748928498749599794L;

	/**
	 * null
	 */
	@ApiListField("biz_entity_ids")
	@ApiField("biz_entity_id")
	private List<BizEntityId> bizEntityIds;

	/**
	 * 业务类型（房子租赁）
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 商户查询条件
	 */
	@ApiField("merchant_query_condition")
	private String merchantQueryCondition;

	/**
	 * 用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部会话ID，商户侧唯一标识一次会话（商户侧生成）
	 */
	@ApiField("out_session_id")
	private String outSessionId;

	/**
	 * 用户问询内容
	 */
	@ApiField("query_content")
	private String queryContent;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public List<BizEntityId> getBizEntityIds() {
		return this.bizEntityIds;
	}
	public void setBizEntityIds(List<BizEntityId> bizEntityIds) {
		this.bizEntityIds = bizEntityIds;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getMerchantQueryCondition() {
		return this.merchantQueryCondition;
	}
	public void setMerchantQueryCondition(String merchantQueryCondition) {
		this.merchantQueryCondition = merchantQueryCondition;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutSessionId() {
		return this.outSessionId;
	}
	public void setOutSessionId(String outSessionId) {
		this.outSessionId = outSessionId;
	}

	public String getQueryContent() {
		return this.queryContent;
	}
	public void setQueryContent(String queryContent) {
		this.queryContent = queryContent;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
