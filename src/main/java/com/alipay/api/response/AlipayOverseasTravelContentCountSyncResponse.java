package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.content.count.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOverseasTravelContentCountSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1783226313411769184L;

	/** 
	 * 详细错误码。可选，当code=40004，sub_code=BUSINESS_ERROR，不能为空。详细错误码结构描述如下(对照示例值)：

content_id: 内容ID，如果内容ID未传，则使用数组下表代替，如：count_infos[1]，表示数组中的第2条记录没有content_id

code: 错误码

msg: 错误信息

sub_code: 子错误码，候选项有：CONTENT_ID_EMPTY / TOTAL_PAGE_VIEW_COUNT_EMPTY / SUPPORT_COUNT_EMPTY / ARGUMENT_EXCEED_MAX_SIZE

sub_msg: 子错误信息，候选项有：CONTENT_ID不为空/阅读数为空/点赞数为空/某个参数字段超长
	 */
	@ApiField("results")
	private String results;

	public void setResults(String results) {
		this.results = results;
	}
	public String getResults( ) {
		return this.results;
	}

}
