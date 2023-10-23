package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能生产开放接口
 *
 * @author auto create
 * @since 1.0, 2019-03-27 16:49:56
 */
public class AntfortuneContentCommunityOpenSecuaiQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2653959287621424261L;

	/**
	 * 业务的请求参数
	 */
	@ApiField("biz_request")
	private String bizRequest;

	/**
	 * 请求的业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 租户ID
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public String getBizRequest() {
		return this.bizRequest;
	}
	public void setBizRequest(String bizRequest) {
		this.bizRequest = bizRequest;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
