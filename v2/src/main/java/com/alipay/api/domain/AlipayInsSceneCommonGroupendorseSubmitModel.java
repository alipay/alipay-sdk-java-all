package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 灵活用工团单批改提交
 *
 * @author auto create
 * @since 1.0, 2023-10-25 16:35:31
 */
public class AlipayInsSceneCommonGroupendorseSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 8123462811573535553L;

	/**
	 * 子批单的实付保费;单位:分
	 */
	@ApiField("endorse_fee")
	private Long endorseFee;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 渠道
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 子单数量
	 */
	@ApiField("sub_order_count")
	private Long subOrderCount;

	/**
	 * 主批单号
	 */
	@ApiField("summary_endorse_order_no")
	private String summaryEndorseOrderNo;

	/**
	 * 总保费;单位:分
	 */
	@ApiField("summary_premium")
	private Long summaryPremium;

	public Long getEndorseFee() {
		return this.endorseFee;
	}
	public void setEndorseFee(Long endorseFee) {
		this.endorseFee = endorseFee;
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

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public Long getSubOrderCount() {
		return this.subOrderCount;
	}
	public void setSubOrderCount(Long subOrderCount) {
		this.subOrderCount = subOrderCount;
	}

	public String getSummaryEndorseOrderNo() {
		return this.summaryEndorseOrderNo;
	}
	public void setSummaryEndorseOrderNo(String summaryEndorseOrderNo) {
		this.summaryEndorseOrderNo = summaryEndorseOrderNo;
	}

	public Long getSummaryPremium() {
		return this.summaryPremium;
	}
	public void setSummaryPremium(Long summaryPremium) {
		this.summaryPremium = summaryPremium;
	}

}
