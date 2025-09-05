package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 权益账户修改
 *
 * @author auto create
 * @since 1.0, 2025-08-29 11:05:55
 */
public class AlipayMarketingBenefitaccountAccountModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4788128145282429382L;

	/**
	 * 权益账户账号
	 */
	@ApiField("benefit_account_no")
	private String benefitAccountNo;

	/**
	 * 业务本次修改业务订单号，用于幂等
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 出资方信息
	 */
	@ApiListField("fund_infos")
	@ApiField("fs_fund_info_form")
	private List<FsFundInfoForm> fundInfos;

	/**
	 * 出资关系组
	 */
	@ApiListField("fund_relation_groups")
	@ApiField("fs_fund_relation_group_form")
	private List<FsFundRelationGroupForm> fundRelationGroups;

	/**
	 * 权益账户归属人对应的支付宝账号
	 */
	@ApiField("publisher_user_id")
	private String publisherUserId;

	public String getBenefitAccountNo() {
		return this.benefitAccountNo;
	}
	public void setBenefitAccountNo(String benefitAccountNo) {
		this.benefitAccountNo = benefitAccountNo;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public List<FsFundInfoForm> getFundInfos() {
		return this.fundInfos;
	}
	public void setFundInfos(List<FsFundInfoForm> fundInfos) {
		this.fundInfos = fundInfos;
	}

	public List<FsFundRelationGroupForm> getFundRelationGroups() {
		return this.fundRelationGroups;
	}
	public void setFundRelationGroups(List<FsFundRelationGroupForm> fundRelationGroups) {
		this.fundRelationGroups = fundRelationGroups;
	}

	public String getPublisherUserId() {
		return this.publisherUserId;
	}
	public void setPublisherUserId(String publisherUserId) {
		this.publisherUserId = publisherUserId;
	}

}
