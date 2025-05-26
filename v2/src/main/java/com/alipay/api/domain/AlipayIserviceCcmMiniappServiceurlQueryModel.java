package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询小程序的云客服聊天窗跳转链接
 *
 * @author auto create
 * @since 1.0, 2024-05-31 14:53:58
 */
public class AlipayIserviceCcmMiniappServiceurlQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1179475966133357978L;

	/**
	 * 可选，用于数据统计分析，该字段会经过白名单校验，未通过校验会忽略。使用该字段前请联系接口负责人。
	 */
	@ApiField("biz_tag")
	private String bizTag;

	/**
	 * 是否强制使用支付宝tab4消息（客服号）聊天窗，否则根据后台配置查询。聊天窗有客服号和小程序聊天窗两种形态。
	 */
	@ApiField("force_use_bc_chat")
	private Boolean forceUseBcChat;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizTag() {
		return this.bizTag;
	}
	public void setBizTag(String bizTag) {
		this.bizTag = bizTag;
	}

	public Boolean getForceUseBcChat() {
		return this.forceUseBcChat;
	}
	public void setForceUseBcChat(Boolean forceUseBcChat) {
		this.forceUseBcChat = forceUseBcChat;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
