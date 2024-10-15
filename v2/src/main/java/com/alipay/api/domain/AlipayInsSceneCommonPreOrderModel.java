package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投保预下单
 *
 * @author auto create
 * @since 1.0, 2024-05-27 15:28:19
 */
public class AlipayInsSceneCommonPreOrderModel extends AlipayObject {

	private static final long serialVersionUID = 6428679299747663345L;

	/**
	 * 用户手动选中或默认选中了自动续保
	 */
	@ApiField("auto_renewal")
	private Boolean autoRenewal;

	/**
	 * 预下单扩展参数
	 */
	@ApiField("biz_data")
	private InsOpenPreOrderBizData bizData;

	/**
	 * 投保人
	 */
	@ApiField("holder_user")
	private InsOpenUserDTO holderUser;

	/**
	 * 被保人
	 */
	@ApiField("insured_user")
	private InsOpenUserDTO insuredUser;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 合作商标识
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 报价id
	 */
	@ApiField("quote_id")
	private String quoteId;

	/**
	 * 推荐流水id
	 */
	@ApiField("recommend_flow_id")
	private String recommendFlowId;

	/**
	 * 客户端渠道:wx_applet/android/pc/ios/alipay_applet
	 */
	@ApiField("user_client")
	private String userClient;

	public Boolean getAutoRenewal() {
		return this.autoRenewal;
	}
	public void setAutoRenewal(Boolean autoRenewal) {
		this.autoRenewal = autoRenewal;
	}

	public InsOpenPreOrderBizData getBizData() {
		return this.bizData;
	}
	public void setBizData(InsOpenPreOrderBizData bizData) {
		this.bizData = bizData;
	}

	public InsOpenUserDTO getHolderUser() {
		return this.holderUser;
	}
	public void setHolderUser(InsOpenUserDTO holderUser) {
		this.holderUser = holderUser;
	}

	public InsOpenUserDTO getInsuredUser() {
		return this.insuredUser;
	}
	public void setInsuredUser(InsOpenUserDTO insuredUser) {
		this.insuredUser = insuredUser;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

	public String getQuoteId() {
		return this.quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}

	public String getRecommendFlowId() {
		return this.recommendFlowId;
	}
	public void setRecommendFlowId(String recommendFlowId) {
		this.recommendFlowId = recommendFlowId;
	}

	public String getUserClient() {
		return this.userClient;
	}
	public void setUserClient(String userClient) {
		this.userClient = userClient;
	}

}
