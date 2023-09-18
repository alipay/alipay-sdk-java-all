package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收藏有礼活动查询详细入参
 *
 * @author auto create
 * @since 1.0, 2023-07-26 09:52:58
 */
public class ActivityQueryInfo extends AlipayObject {

	private static final long serialVersionUID = 2566497986797658933L;

	/**
	 * 新用户活动模版
	 */
	@ApiField("new_user_template")
	private String newUserTemplate;

	/**
	 * 老用户活动模版
	 */
	@ApiField("old_user_template")
	private String oldUserTemplate;

	/**
	 * 查询的小程序id
	 */
	@ApiField("query_app_id")
	private String queryAppId;

	public String getNewUserTemplate() {
		return this.newUserTemplate;
	}
	public void setNewUserTemplate(String newUserTemplate) {
		this.newUserTemplate = newUserTemplate;
	}

	public String getOldUserTemplate() {
		return this.oldUserTemplate;
	}
	public void setOldUserTemplate(String oldUserTemplate) {
		this.oldUserTemplate = oldUserTemplate;
	}

	public String getQueryAppId() {
		return this.queryAppId;
	}
	public void setQueryAppId(String queryAppId) {
		this.queryAppId = queryAppId;
	}

}
