package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 银行转帐产品开通查询
 *
 * @author auto create
 * @since 1.0, 2024-09-26 19:29:17
 */
public class AlipayTradeEpayprodProductQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1176345297276776811L;

	/**
	 * 合作模式
	 */
	@ApiField("cooperation_mode")
	private String cooperationMode;

	/**
	 * 合作商户信息
	 */
	@ApiField("partner_info")
	private PartnerDTO partnerInfo;

	/**
	 * 解决方案标识
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
