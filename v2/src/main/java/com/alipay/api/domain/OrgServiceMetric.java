package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-01-04 15:22:42
 */
public class OrgServiceMetric extends AlipayObject {

	private static final long serialVersionUID = 5856459394241875464L;

	/**
	 * 医疗机构ID
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 机构名称
	 */
	@ApiField("org_name")
	private String orgName;

	/**
	 * 医疗机构服务人次
	 */
	@ApiField("uv_dt_td")
	private Long uvDtTd;

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return this.orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public Long getUvDtTd() {
		return this.uvDtTd;
	}
	public void setUvDtTd(Long uvDtTd) {
		this.uvDtTd = uvDtTd;
	}

}
