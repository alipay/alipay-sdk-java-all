package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.morse.marketing.rta.auth response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-31 11:46:49
 */
public class AnttechMorseMarketingRtaAuthResponse extends AlipayResponse {

	private static final long serialVersionUID = 6383752551813583435L;

	/** 
	 * 预授权成功的活动id列表
	 */
	@ApiListField("auth_campaign_ids")
	@ApiField("string")
	private List<String> authCampaignIds;

	/** 
	 * 业务唯一标识，标识本次查询的唯一识别号，用于问题定位
	 */
	@ApiField("biz_no")
	private String bizNo;

	public void setAuthCampaignIds(List<String> authCampaignIds) {
		this.authCampaignIds = authCampaignIds;
	}
	public List<String> getAuthCampaignIds( ) {
		return this.authCampaignIds;
	}

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

}
