package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业裁判文书当事人信息
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:17:33
 */
public class EpVerdictPartiesInfo extends AlipayObject {

	private static final long serialVersionUID = 7368551173546744237L;

	/**
	 * 案件判决结果
	 */
	@ApiField("judgment_result")
	private String judgmentResult;

	/**
	 * 当事人是公司，公司的法定代表人
	 */
	@ApiListField("legal_representative")
	@ApiField("string")
	private List<String> legalRepresentative;

	/**
	 * 当事人姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 案件中的其他角色
	 */
	@ApiListField("other_roles")
	@ApiField("string")
	private List<String> otherRoles;

	/**
	 * 当事人在案件中的角色
	 */
	@ApiListField("roles")
	@ApiField("string")
	private List<String> roles;

	/**
	 * 当事人的类型
	 */
	@ApiField("type")
	private String type;

	public String getJudgmentResult() {
		return this.judgmentResult;
	}
	public void setJudgmentResult(String judgmentResult) {
		this.judgmentResult = judgmentResult;
	}

	public List<String> getLegalRepresentative() {
		return this.legalRepresentative;
	}
	public void setLegalRepresentative(List<String> legalRepresentative) {
		this.legalRepresentative = legalRepresentative;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<String> getOtherRoles() {
		return this.otherRoles;
	}
	public void setOtherRoles(List<String> otherRoles) {
		this.otherRoles = otherRoles;
	}

	public List<String> getRoles() {
		return this.roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
