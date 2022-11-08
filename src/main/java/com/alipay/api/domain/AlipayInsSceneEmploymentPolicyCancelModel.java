package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 灵活用工保单退保
 *
 * @author auto create
 * @since 1.0, 2022-08-22 14:05:48
 */
public class AlipayInsSceneEmploymentPolicyCancelModel extends AlipayObject {

	private static final long serialVersionUID = 3675365548297361885L;

	/**
	 * cainiao
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 企业信息
	 */
	@ApiField("merchant")
	private InsCompany merchant;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 保险合作商信息
	 */
	@ApiField("partner_organization")
	private InsPartnerOrganization partnerOrganization;

	/**
	 * 保单号，一次最多50个
	 */
	@ApiListField("policy_no_list")
	@ApiField("string")
	private List<String> policyNoList;

	/**
	 * 场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public InsCompany getMerchant() {
		return this.merchant;
	}
	public void setMerchant(InsCompany merchant) {
		this.merchant = merchant;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public InsPartnerOrganization getPartnerOrganization() {
		return this.partnerOrganization;
	}
	public void setPartnerOrganization(InsPartnerOrganization partnerOrganization) {
		this.partnerOrganization = partnerOrganization;
	}

	public List<String> getPolicyNoList() {
		return this.policyNoList;
	}
	public void setPolicyNoList(List<String> policyNoList) {
		this.policyNoList = policyNoList;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
