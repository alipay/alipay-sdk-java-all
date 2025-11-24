package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 智能体版本审核
 *
 * @author auto create
 * @since 1.0, 2025-05-14 20:07:56
 */
public class AlipayOpenAgentVersionAuditModel extends AlipayObject {

	private static final long serialVersionUID = 8337584969997485413L;

	/**
	 * 智能体版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 智能体投放的客户端类型。支持如下客户端：支小宝、web服务
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 智能体投放端列表
	 */
	@ApiListField("bundle_ids")
	@ApiField("string")
	private List<String> bundleIds;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public List<String> getBundleIds() {
		return this.bundleIds;
	}
	public void setBundleIds(List<String> bundleIds) {
		this.bundleIds = bundleIds;
	}

}
