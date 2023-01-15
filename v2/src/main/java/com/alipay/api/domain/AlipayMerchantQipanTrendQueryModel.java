package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 棋盘开放趋势图分析接口
 *
 * @author auto create
 * @since 1.0, 2023-01-05 17:20:01
 */
public class AlipayMerchantQipanTrendQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4214421368591663454L;

	/**
	 * 指标key，由棋盘注册，全局唯一
	 */
	@ApiField("index_key")
	private String indexKey;

	/**
	 * 请求参数，如关系类型、聚合维度
	 */
	@ApiField("request_params")
	private String requestParams;

	public String getIndexKey() {
		return this.indexKey;
	}
	public void setIndexKey(String indexKey) {
		this.indexKey = indexKey;
	}

	public String getRequestParams() {
		return this.requestParams;
	}
	public void setRequestParams(String requestParams) {
		this.requestParams = requestParams;
	}

}
