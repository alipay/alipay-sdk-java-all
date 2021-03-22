package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.crowd.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-02-24 17:01:50
 */
public class KoubeiMarketingCampaignCrowdDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2729167491823746743L;

	/** 
	 * op：表示操作符，目前支持 EQ（相等）、GT（大于）、GTEQ（大于等于）、LT（小于）、LTEQ（小于等于）、NEQ（不等）、LIKE（模糊匹配）、IN（在枚举范围内）、NOTIN（不在枚举范围内）、BETWEEN（范围比较）、LEFTDAYS（几天以内）、RIGHTDAYS（几天以外）、LOCATE（地理位置比较）LBS（地图位置数据）；
tagCode：标签code，详细标签 code 参见附件 <a href="https://gw.alipayobjects.com/os/bmw-prod/4b028911-cb1a-40e9-8abe-49cb04c9a379.zip">标签信息</a>。 
value：标签值。
	 */
	@ApiField("crowd_group_info")
	private String crowdGroupInfo;

	/** 
	 * 人群名称
	 */
	@ApiField("name")
	private String name;

	public void setCrowdGroupInfo(String crowdGroupInfo) {
		this.crowdGroupInfo = crowdGroupInfo;
	}
	public String getCrowdGroupInfo( ) {
		return this.crowdGroupInfo;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

}
