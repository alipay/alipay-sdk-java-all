package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 装修留资线索反馈接口
 *
 * @author auto create
 * @since 1.0, 2025-11-14 15:56:03
 */
public class AlipayEbppIndustryDecorationLeadsSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8583694429546611228L;

	/**
	 * 装企名称全称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 装企与客户建联情况
	 */
	@ApiField("contact")
	private DecorationLeadsFeedbackContact contact;

	/**
	 * 留资业务id，从用户留资数据中可获取
	 */
	@ApiField("leads_biz_id")
	private String leadsBizId;

	/**
	 * 装企与客户成交信息
	 */
	@ApiField("trans_info")
	private DecorationLeadsFeedbackTransInfo transInfo;

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public DecorationLeadsFeedbackContact getContact() {
		return this.contact;
	}
	public void setContact(DecorationLeadsFeedbackContact contact) {
		this.contact = contact;
	}

	public String getLeadsBizId() {
		return this.leadsBizId;
	}
	public void setLeadsBizId(String leadsBizId) {
		this.leadsBizId = leadsBizId;
	}

	public DecorationLeadsFeedbackTransInfo getTransInfo() {
		return this.transInfo;
	}
	public void setTransInfo(DecorationLeadsFeedbackTransInfo transInfo) {
		this.transInfo = transInfo;
	}

}
