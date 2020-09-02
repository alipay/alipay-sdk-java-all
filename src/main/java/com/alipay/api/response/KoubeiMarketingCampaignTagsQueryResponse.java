package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.tags.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingCampaignTagsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2143829916232257639L;

	/** 
	 * 查询成功时返回人群标签信息查询失败时为空
code:表示标签code
name:表示标签名称
valueRange：表示标签的取值范围
value:表示标签具体取值
label:描述信息
标签相关的详细信息参见附件。<a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/tags%26usecase.zip">标签信息</a>
	 */
	@ApiField("tags")
	private String tags;

	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getTags( ) {
		return this.tags;
	}

}
