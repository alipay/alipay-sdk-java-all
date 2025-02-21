package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业注册申请
 *
 * @author auto create
 * @since 1.0, 2024-07-22 17:46:23
 */
public class AlipayCommerceEcEnterpriseRegisterApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6125791745463175295L;

	/**
	 * 企业简称
	 */
	@ApiField("enterprise_alias")
	private String enterpriseAlias;

	/**
	 * 企业邮箱
	 */
	@ApiField("enterprise_email")
	private String enterpriseEmail;

	/**
	 * 企业名称
	 */
	@ApiField("enterprise_name")
	private String enterpriseName;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 上级企业id
	 */
	@ApiField("parent_enterprise_id")
	private String parentEnterpriseId;

	public String getEnterpriseAlias() {
		return this.enterpriseAlias;
	}
	public void setEnterpriseAlias(String enterpriseAlias) {
		this.enterpriseAlias = enterpriseAlias;
	}

	public String getEnterpriseEmail() {
		return this.enterpriseEmail;
	}
	public void setEnterpriseEmail(String enterpriseEmail) {
		this.enterpriseEmail = enterpriseEmail;
	}

	public String getEnterpriseName() {
		return this.enterpriseName;
	}
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getParentEnterpriseId() {
		return this.parentEnterpriseId;
	}
	public void setParentEnterpriseId(String parentEnterpriseId) {
		this.parentEnterpriseId = parentEnterpriseId;
	}

}
