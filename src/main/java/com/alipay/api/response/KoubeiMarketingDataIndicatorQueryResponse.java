package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.indicator.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-12 11:07:33
 */
public class KoubeiMarketingDataIndicatorQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6755998123692122947L;

	/** 
	 * JSON格式数组，每个对象表示一个门店某个具体日期的指标信息，KEY为指标代码，VALUE为该指标对应的值,各biz_type入参以及返回值的详细信息参见<a href="https://doc.open.alipay.com/docs/doc.htm?spm=a219a.7629140.0.0.1AZ2QH&treeId=193&articleId=106028&docType=1">快速接入</a>
	 */
	@ApiField("indicator_infos")
	private String indicatorInfos;

	/** 
	 * 总条目数,供计算分页信息使用
	 */
	@ApiField("total_size")
	private String totalSize;

	public void setIndicatorInfos(String indicatorInfos) {
		this.indicatorInfos = indicatorInfos;
	}
	public String getIndicatorInfos( ) {
		return this.indicatorInfos;
	}

	public void setTotalSize(String totalSize) {
		this.totalSize = totalSize;
	}
	public String getTotalSize( ) {
		return this.totalSize;
	}

}
