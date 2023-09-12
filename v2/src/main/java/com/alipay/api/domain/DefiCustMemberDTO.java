package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 智能科技统一客户中台会员模型
 *
 * @author auto create
 * @since 1.0, 2020-09-22 15:37:17
 */
public class DefiCustMemberDTO extends AlipayObject {

	private static final long serialVersionUID = 6865818934938159923L;

	/**
	 * 企业认证状态 INIT("INIT", "初始状态"), AUTH("AUTH", "认证状态"),;
	 */
	@ApiField("auth_status")
	private String authStatus;

	/**
	 * 统一社会信用代码或者工商注册号
	 */
	@ApiField("company_cert_no")
	private String companyCertNo;

	/**
	 * NATIONAL_LEGAL_MERGE("2011", " NATIONAL_LEGAL_MERGE", "全国法人营业执照(多证合一)", "全国法人营业执照(多证合一)"), NATIONAL_LEGAL("201", "NATIONAL_LEGAL", "全国法人营业执照", "全国法人营业执照"),
	 */
	@ApiField("company_cert_type")
	private String companyCertType;

	/**
	 * 企业名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * ID映射
	 */
	@ApiField("id_map")
	private String idMap;

	/**
	 * 企业邮箱
	 */
	@ApiField("member_email")
	private String memberEmail;

	/**
	 * 会员id
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 角色，支持多角色
	 */
	@ApiListField("role_types")
	@ApiField("string")
	private List<String> roleTypes;

	/**
	 * ACTIVE("ACTIVE", "激活状态"), FROZEN("FROZEN", "冻结状态"), DISABLED("DISABLED", "禁用状态"),;
	 */
	@ApiField("status")
	private String status;

	public String getAuthStatus() {
		return this.authStatus;
	}
	public void setAuthStatus(String authStatus) {
		this.authStatus = authStatus;
	}

	public String getCompanyCertNo() {
		return this.companyCertNo;
	}
	public void setCompanyCertNo(String companyCertNo) {
		this.companyCertNo = companyCertNo;
	}

	public String getCompanyCertType() {
		return this.companyCertType;
	}
	public void setCompanyCertType(String companyCertType) {
		this.companyCertType = companyCertType;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getIdMap() {
		return this.idMap;
	}
	public void setIdMap(String idMap) {
		this.idMap = idMap;
	}

	public String getMemberEmail() {
		return this.memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public List<String> getRoleTypes() {
		return this.roleTypes;
	}
	public void setRoleTypes(List<String> roleTypes) {
		this.roleTypes = roleTypes;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
