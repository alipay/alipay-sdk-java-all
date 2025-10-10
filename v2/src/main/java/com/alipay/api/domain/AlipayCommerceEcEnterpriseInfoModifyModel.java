package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业信息修改
 *
 * @author auto create
 * @since 1.0, 2025-08-25 14:03:32
 */
public class AlipayCommerceEcEnterpriseInfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5789391135163465814L;

	/**
	 * 企业简称
	 */
	@ApiField("enterprise_alias")
	private String enterpriseAlias;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 企业名称
	 */
	@ApiField("enterprise_name")
	private String enterpriseName;

	/**
	 * 企业个性化信息，仅适用于可信渠道（如钉钉），普通场景请勿传此参数
	 */
	@ApiField("reliable_profiles")
	private ReliableEnterpriseProfilesDTO reliableProfiles;

	public String getEnterpriseAlias() {
		return this.enterpriseAlias;
	}
	public void setEnterpriseAlias(String enterpriseAlias) {
		this.enterpriseAlias = enterpriseAlias;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getEnterpriseName() {
		return this.enterpriseName;
	}
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public ReliableEnterpriseProfilesDTO getReliableProfiles() {
		return this.reliableProfiles;
	}
	public void setReliableProfiles(ReliableEnterpriseProfilesDTO reliableProfiles) {
		this.reliableProfiles = reliableProfiles;
	}

}
