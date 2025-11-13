package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建会员
 *
 * @author auto create
 * @since 1.0, 2021-01-29 16:41:48
 */
public class AnttechBlockchainDefinCustomerMemberCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7678416558973989128L;

	/**
	 * 认证方式（NONE:不认证）
	 */
	@ApiField("auth_type")
	private String authType;

	/**
	 * 业务线（LOGISTICS_FIN-物流金融，SHIPPING_EBL-电子提单）
	 */
	@ApiField("biz_product")
	private String bizProduct;

	/**
	 * 企业相关数据
	 */
	@ApiField("company_info")
	private DefiCustCompanyDTO companyInfo;

	/**
	 * did
	 */
	@ApiField("did")
	private String did;

	/**
	 * 会员类型（ENTERPRISE-企业，INDIVIDUAL-个人）
	 */
	@ApiField("member_type")
	private String memberType;

	/**
	 * 角色列表
	 */
	@ApiListField("role_types")
	@ApiField("string")
	private List<String> roleTypes;

	/**
	 * 商业中台租户ID
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public String getAuthType() {
		return this.authType;
	}
	public void setAuthType(String authType) {
		this.authType = authType;
	}

	public String getBizProduct() {
		return this.bizProduct;
	}
	public void setBizProduct(String bizProduct) {
		this.bizProduct = bizProduct;
	}

	public DefiCustCompanyDTO getCompanyInfo() {
		return this.companyInfo;
	}
	public void setCompanyInfo(DefiCustCompanyDTO companyInfo) {
		this.companyInfo = companyInfo;
	}

	public String getDid() {
		return this.did;
	}
	public void setDid(String did) {
		this.did = did;
	}

	public String getMemberType() {
		return this.memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public List<String> getRoleTypes() {
		return this.roleTypes;
	}
	public void setRoleTypes(List<String> roleTypes) {
		this.roleTypes = roleTypes;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
