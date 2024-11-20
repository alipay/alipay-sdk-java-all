package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 银行转账付款产品开通申请
 *
 * @author auto create
 * @since 1.0, 2024-09-26 19:29:17
 */
public class AlipayTradeEpayprodProductApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8824415427362252415L;

	/**
	 * 合作模式：PLATFORM_BUSINESS_MODE（直付通）
	 */
	@ApiField("cooperation_mode")
	private String cooperationMode;

	/**
	 * 合作商户信息
	 */
	@ApiField("partner_info")
	private PartnerDTO partnerInfo;

	/**
	 * 解决方案码，不固定，联系业务分配
	 */
	@ApiField("pay_solution")
	private String paySolution;

	public String getCooperationMode() {
		return this.cooperationMode;
	}
	public void setCooperationMode(String cooperationMode) {
		this.cooperationMode = cooperationMode;
	}

	public PartnerDTO getPartnerInfo() {
		return this.partnerInfo;
	}
	public void setPartnerInfo(PartnerDTO partnerInfo) {
		this.partnerInfo = partnerInfo;
	}

	public String getPaySolution() {
		return this.paySolution;
	}
	public void setPaySolution(String paySolution) {
		this.paySolution = paySolution;
	}

}
