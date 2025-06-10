package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IntentionInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.user.intention.identify response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-22 17:57:27
 */
public class AlipayEbppIndustryUserIntentionIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7484623815842648346L;

	/** 
	 * 意图信息列表
	 */
	@ApiField("intention_info_list")
	private IntentionInfo intentionInfoList;

	/** 
	 * 用户原始query扩写后的结果
	 */
	@ApiListField("query_extension_list")
	@ApiField("string")
	private List<String> queryExtensionList;

	/** 
	 * 用户原始输入之后的改写
	 */
	@ApiField("query_rewrite")
	private String queryRewrite;

	public void setIntentionInfoList(IntentionInfo intentionInfoList) {
		this.intentionInfoList = intentionInfoList;
	}
	public IntentionInfo getIntentionInfoList( ) {
		return this.intentionInfoList;
	}

	public void setQueryExtensionList(List<String> queryExtensionList) {
		this.queryExtensionList = queryExtensionList;
	}
	public List<String> getQueryExtensionList( ) {
		return this.queryExtensionList;
	}

	public void setQueryRewrite(String queryRewrite) {
		this.queryRewrite = queryRewrite;
	}
	public String getQueryRewrite( ) {
		return this.queryRewrite;
	}

}
