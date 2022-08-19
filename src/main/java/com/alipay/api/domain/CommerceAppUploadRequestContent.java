package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租户应用服务数据
 *
 * @author auto create
 * @since 1.0, 2021-07-02 15:22:35
 */
public class CommerceAppUploadRequestContent extends AlipayObject {

	private static final long serialVersionUID = 1575923463242975645L;

	/**
	 * 租户应用业务流程ID
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 租户应用业务流程内容
	 */
	@ApiField("body")
	private String body;

	/**
	 * 查询条件
	 */
	@ApiField("query")
	private String query;

	/**
	 * 租户应用ID
	 */
	@ApiField("tenant_app_id")
	private String tenantAppId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getBody() {
		return this.body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getTenantAppId() {
		return this.tenantAppId;
	}
	public void setTenantAppId(String tenantAppId) {
		this.tenantAppId = tenantAppId;
	}

}
