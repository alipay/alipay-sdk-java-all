package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VoyagerCampaignInfo;
import com.alipay.api.domain.ResultInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.voyager.marketing.campaignquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-23 10:47:54
 */
public class AlipayVoyagerMarketingCampaignqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2441117466239154328L;

	/** 
	 * null
	 */
	@ApiListField("campaign_infos")
	@ApiField("voyager_campaign_info")
	private List<VoyagerCampaignInfo> campaignInfos;

	/** 
	 * 埋点反馈的城市
	 */
	@ApiField("feedback_city_code")
	private String feedbackCityCode;

	/** 
	 * null
	 */
	@ApiListField("feedback_ext_info_list")
	@ApiField("string")
	private List<String> feedbackExtInfoList;

	/** 
	 * 业务结果信息
	 */
	@ApiField("result")
	private ResultInfoDTO result;

	public void setCampaignInfos(List<VoyagerCampaignInfo> campaignInfos) {
		this.campaignInfos = campaignInfos;
	}
	public List<VoyagerCampaignInfo> getCampaignInfos( ) {
		return this.campaignInfos;
	}

	public void setFeedbackCityCode(String feedbackCityCode) {
		this.feedbackCityCode = feedbackCityCode;
	}
	public String getFeedbackCityCode( ) {
		return this.feedbackCityCode;
	}

	public void setFeedbackExtInfoList(List<String> feedbackExtInfoList) {
		this.feedbackExtInfoList = feedbackExtInfoList;
	}
	public List<String> getFeedbackExtInfoList( ) {
		return this.feedbackExtInfoList;
	}

	public void setResult(ResultInfoDTO result) {
		this.result = result;
	}
	public ResultInfoDTO getResult( ) {
		return this.result;
	}

}
