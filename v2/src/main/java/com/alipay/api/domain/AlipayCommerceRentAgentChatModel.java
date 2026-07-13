package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁智能体问答
 *
 * @author auto create
 * @since 1.0, 2026-05-26 21:27:47
 */
public class AlipayCommerceRentAgentChatModel extends AlipayObject {

	private static final long serialVersionUID = 3549273866236887418L;

	/**
	 * null
	 */
	@ApiListField("biz_entity_ids")
	@ApiField("biz_entity")
	private List<BizEntity> bizEntityIds;

	/**
	 * 请求类型
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
	 * 用户id，支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public List<BizEntity> getBizEntityIds() {
		return this.bizEntityIds;
	}
	public void setBizEntityIds(List<BizEntity> bizEntityIds) {
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
