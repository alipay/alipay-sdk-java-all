package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 棋盘开放趋势图分析接口
 *
 * @author auto create
 * @since 1.0, 2023-05-16 13:56:20
 */
public class AlipayMerchantQipanTrendQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2299815557695396298L;

	/**
	 * 指标key，全局唯一，查询内容参考：<a href="https://opendocs.alipay.com/pre-open/04phhq#%E8%B6%8B%E5%8A%BF%E5%88%86%E6%9E%90%E4%B8%8D%E5%90%8Cindex_key%E6%9F%A5%E8%AF%A2" target="_blank">趋势分析不同index_key查询</a>
	 */
	@ApiField("index_key")
	private String indexKey;

	/**
	 * 趋势数据请求参数，如起止时间、关系类型、聚合维度等。
	 */
	@ApiField("request_params")
	private TrendQueryRequest requestParams;

	public String getIndexKey() {
		return this.indexKey;
	}
	public void setIndexKey(String indexKey) {
		this.indexKey = indexKey;
	}

	public TrendQueryRequest getRequestParams() {
		return this.requestParams;
	}
	public void setRequestParams(TrendQueryRequest requestParams) {
		this.requestParams = requestParams;
	}

}
