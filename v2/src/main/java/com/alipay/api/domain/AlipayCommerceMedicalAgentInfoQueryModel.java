package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开放平台机构智能体信息查询
 *
 * @author auto create
 * @since 1.0, 2025-11-24 14:57:40
 */
public class AlipayCommerceMedicalAgentInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6696253667473938757L;

	/**
	 * 预览时需要传入,用来读取预览配置
	 */
	@ApiField("config_order_id")
	private String configOrderId;

	/**
	 * 由医保自己填的机构唯一标识
	 */
	@ApiField("org_id")
	private String orgId;

	public String getConfigOrderId() {
		return this.configOrderId;
	}
	public void setConfigOrderId(String configOrderId) {
		this.configOrderId = configOrderId;
	}

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

}
