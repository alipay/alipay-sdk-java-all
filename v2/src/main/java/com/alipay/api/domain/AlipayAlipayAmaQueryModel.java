package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ama接口
 *
 * @author auto create
 * @since 1.0, 2025-10-27 14:57:40
 */
public class AlipayAlipayAmaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7677426821291129725L;

	/**
	 * 自定义业务
	 */
	@ApiField("biz")
	private String biz;

	/**
	 * 图片地址
	 */
	@ApiField("image")
	private String image;

	/**
	 * 用户标识，唯一标记用户
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 这是什么
	 */
	@ApiField("query")
	private String query;

	/**
	 * 唯一标识当前问题
	 */
	@ApiField("query_id")
	private String queryId;

	/**
	 * 唯一标识一个会话
	 */
	@ApiField("session_id")
	private String sessionId;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getBiz() {
		return this.biz;
	}
	public void setBiz(String biz) {
		this.biz = biz;
	}

	public String getImage() {
		return this.image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getQueryId() {
		return this.queryId;
	}
	public void setQueryId(String queryId) {
		this.queryId = queryId;
	}

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
