package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保险营销活动发奖接口
 *
 * @author auto create
 * @since 1.0, 2017-12-14 18:04:02
 */
public class AlipayInsMarketingCampaignPrizeSendModel extends AlipayObject {

	private static final long serialVersionUID = 6176316878351829633L;

	/**
	 * 账户id，如支付宝userId：2088102161835009
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 账号类型
	 */
	@ApiField("account_type")
	private Long accountType;

	/**
	 * 营销保险活动Id
	 */
	@ApiField("campaign_id")
	private String campaignId;

	/**
	 * 发奖规则因子
	 */
	@ApiListField("factors")
	@ApiField("ins_mkt_factor_d_t_o")
	private List<InsMktFactorDTO> factors;

	/**
	 * 发奖接口幂等字段
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 请求流水Id
	 */
	@ApiField("request_id")
	private String requestId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public Long getAccountType() {
		return this.accountType;
	}
	public void setAccountType(Long accountType) {
		this.accountType = accountType;
	}

	public String getCampaignId() {
		return this.campaignId;
	}
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

	public List<InsMktFactorDTO> getFactors() {
		return this.factors;
	}
	public void setFactors(List<InsMktFactorDTO> factors) {
		this.factors = factors;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
