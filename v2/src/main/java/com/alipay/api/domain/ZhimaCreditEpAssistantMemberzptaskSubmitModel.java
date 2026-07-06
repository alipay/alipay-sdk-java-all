package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企信助手_企业智评任务提交
 *
 * @author auto create
 * @since 1.0, 2026-05-27 10:42:50
 */
public class ZhimaCreditEpAssistantMemberzptaskSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 5498214544219336555L;

	/**
	 * null
	 */
	@ApiListField("company_info_list")
	@ApiField("assistant_company_simple_info")
	private List<AssistantCompanySimpleInfo> companyInfoList;

	/**
	 * 唯一键，幂等控制，同一id不允许多次发起
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 合作伙伴侧的商户id，后续发起的时候会校验是否一致
	 */
	@ApiField("partner_corp_id")
	private String partnerCorpId;

	/**
	 * 当前提交智评任务的用户所属商户的名称
	 */
	@ApiField("partner_corp_name")
	private String partnerCorpName;

	/**
	 * 合作伙伴侧的用户id，后续发起的时候会校验是否一致
	 */
	@ApiField("partner_user_id")
	private String partnerUserId;

	/**
	 * 提交的任务类型
	 */
	@ApiField("task_type")
	private String taskType;

	public List<AssistantCompanySimpleInfo> getCompanyInfoList() {
		return this.companyInfoList;
	}
	public void setCompanyInfoList(List<AssistantCompanySimpleInfo> companyInfoList) {
		this.companyInfoList = companyInfoList;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPartnerCorpId() {
		return this.partnerCorpId;
	}
	public void setPartnerCorpId(String partnerCorpId) {
		this.partnerCorpId = partnerCorpId;
	}

	public String getPartnerCorpName() {
		return this.partnerCorpName;
	}
	public void setPartnerCorpName(String partnerCorpName) {
		this.partnerCorpName = partnerCorpName;
	}

	public String getPartnerUserId() {
		return this.partnerUserId;
	}
	public void setPartnerUserId(String partnerUserId) {
		this.partnerUserId = partnerUserId;
	}

	public String getTaskType() {
		return this.taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

}
