package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DataItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.cloud.aositem.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-31 17:37:01
 */
public class AlipayOpenMiniCloudAositemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2771914569986767765L;

	/** 
	 * 返回请求参数中对应aggregation_field指定要聚合的字段的值
	 */
	@ApiField("aggregation_result")
	private String aggregationResult;

	/** 
	 * 结果总量
	 */
	@ApiField("item_total_count")
	private Long itemTotalCount;

	/** 
	 * 搜索的item结果列表
	 */
	@ApiListField("result")
	@ApiField("data_item")
	private List<DataItem> result;

	/** 
	 * 搜索请求的traceid，用于排查问题及关联s搜索结果和用户行为
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setAggregationResult(String aggregationResult) {
		this.aggregationResult = aggregationResult;
	}
	public String getAggregationResult( ) {
		return this.aggregationResult;
	}

	public void setItemTotalCount(Long itemTotalCount) {
		this.itemTotalCount = itemTotalCount;
	}
	public Long getItemTotalCount( ) {
		return this.itemTotalCount;
	}

	public void setResult(List<DataItem> result) {
		this.result = result;
	}
	public List<DataItem> getResult( ) {
		return this.result;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
