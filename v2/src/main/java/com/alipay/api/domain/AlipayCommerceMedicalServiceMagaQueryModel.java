package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗服务推荐Maga投放查询接口
 *
 * @author auto create
 * @since 1.0, 2024-12-06 16:59:56
 */
public class AlipayCommerceMedicalServiceMagaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2392533475279785822L;

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
