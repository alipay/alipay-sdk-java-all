package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗服务推荐Maga投放查询接口
 *
 * @author auto create
 * @since 1.0, 2025-09-22 14:54:40
 */
public class AlipayCommerceMedicalServiceMagaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8373693658552192557L;

	/**
	 * 工单ID（预览的请求必填，正式的不用填），预发AQ机构智能体，通过工ID获取预览数据
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
