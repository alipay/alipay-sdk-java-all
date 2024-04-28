package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户历史对话记录接口
 *
 * @author auto create
 * @since 1.0, 2023-09-25 17:43:31
 */
public class TechriskInnovateSalesgptChatQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1639853254683163377L;

	/**
	 * 对话机器人id，由AI导购平台提供
	 */
	@ApiField("chat_bot_id")
	private String chatBotId;

	/**
	 * 当前页数，默认为1
	 */
	@ApiField("current_page")
	private Long currentPage;

	/**
	 * 支付宝开放平台中的商户id
	 */
	@ApiField("mer_pid")
	private String merPid;

	/**
	 * 开放平台用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 每页查询的消息个数，默认20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 请求来源appId
	 */
	@ApiField("source_app_id")
	private String sourceAppId;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getChatBotId() {
		return this.chatBotId;
	}
	public void setChatBotId(String chatBotId) {
		this.chatBotId = chatBotId;
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}
	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public String getMerPid() {
		return this.merPid;
	}
	public void setMerPid(String merPid) {
		this.merPid = merPid;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getSourceAppId() {
		return this.sourceAppId;
	}
	public void setSourceAppId(String sourceAppId) {
		this.sourceAppId = sourceAppId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
