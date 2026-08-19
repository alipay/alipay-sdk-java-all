package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 运动打卡新增白名单
 *
 * @author auto create
 * @since 1.0, 2026-08-11 17:27:50
 */
public class AlipayCommerceEducateSportsWhiteCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5226526125127413185L;

	/**
	 * 学校组织code
	 */
	@ApiField("organization_code")
	private String organizationCode;

	/**
	 * 花名册人员编码
	 */
	@ApiField("roster_code")
	private String rosterCode;

	/**
	 * null
	 */
	@ApiListField("white_type_list")
	@ApiField("string")
	private List<String> whiteTypeList;

	public String getOrganizationCode() {
		return this.organizationCode;
	}
	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}

	public String getRosterCode() {
		return this.rosterCode;
	}
	public void setRosterCode(String rosterCode) {
		this.rosterCode = rosterCode;
	}

	public List<String> getWhiteTypeList() {
		return this.whiteTypeList;
	}
	public void setWhiteTypeList(List<String> whiteTypeList) {
		this.whiteTypeList = whiteTypeList;
	}

}
