package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ape搜索接口
 *
 * @author auto create
 * @since 1.0, 2023-05-06 16:23:20
 */
public class AlipayDigitalopUcdpApeitemsearchQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7273998742567268115L;

	/**
	 * ape搜索的上下文
	 */
	@ApiField("context")
	private ApeSearchContext context;

	/**
	 * 加密的userid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商家在蚂蚁推荐引擎创建的项目id，调用前需要找蚂蚁技术获取。
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 搜索词
	 */
	@ApiField("query")
	private String query;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public ApeSearchContext getContext() {
		return this.context;
	}
	public void setContext(ApeSearchContext context) {
		this.context = context;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
