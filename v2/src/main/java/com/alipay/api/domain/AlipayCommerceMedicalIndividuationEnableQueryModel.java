package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询当前用户个性化开启卡片是否需要展示
 *
 * @author auto create
 * @since 1.0, 2026-03-03 18:54:17
 */
public class AlipayCommerceMedicalIndividuationEnableQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2339296392814577919L;

	/**
	 * 智能体预览工单ID（预览的请求必填，正式的不用填），编辑中机构智能体，通过预览工单ID获取预览数据
	 */
	@ApiField("config_id")
	private String configId;

	/**
	 * 用于区分同一个app下的机构
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 用户的userId
	 */
	@ApiField("out_user_id")
	private String outUserId;

	public String getConfigId() {
		return this.configId;
	}
	public void setConfigId(String configId) {
		this.configId = configId;
	}

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

}
