package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.bot.query.recommend response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-18 18:37:25
 */
public class AlipayEbppIndustryBotQueryRecommendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6531867557742634229L;

	/** 
	 * 详细介绍下社保缴纳标准
	 */
	@ApiListField("ask_more_list")
	@ApiField("string")
	private List<String> askMoreList;

	public void setAskMoreList(List<String> askMoreList) {
		this.askMoreList = askMoreList;
	}
	public List<String> getAskMoreList( ) {
		return this.askMoreList;
	}

}
