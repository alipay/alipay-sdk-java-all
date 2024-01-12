package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 灵活用工团单提交
 *
 * @author auto create
 * @since 1.0, 2023-04-27 15:45:59
 */
public class AlipayInsSceneCommonGrouporderSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 5674114471431289433L;

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
	 * 主单号
	 */
	@ApiField("summary_order_no")
	private String summaryOrderNo;

	/**
	 * 总保费，单位分
	 */
	@ApiField("summary_order_premium")
	private Long summaryOrderPremium;

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

	public String getSummaryOrderNo() {
		return this.summaryOrderNo;
	}
	public void setSummaryOrderNo(String summaryOrderNo) {
		this.summaryOrderNo = summaryOrderNo;
	}

	public Long getSummaryOrderPremium() {
		return this.summaryOrderPremium;
	}
	public void setSummaryOrderPremium(Long summaryOrderPremium) {
		this.summaryOrderPremium = summaryOrderPremium;
	}

}
