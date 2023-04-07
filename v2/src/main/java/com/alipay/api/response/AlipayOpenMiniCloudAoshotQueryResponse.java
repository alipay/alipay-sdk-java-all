package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AosHotItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.cloud.aoshot.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 13:46:46
 */
public class AlipayOpenMiniCloudAoshotQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7528992792188586864L;

	/** 
	 * 结果的总条数
	 */
	@ApiField("item_total_count")
	private String itemTotalCount;

	/** 
	 * 热搜的item结果列表
	 */
	@ApiListField("result")
	@ApiField("aos_hot_item")
	private List<AosHotItem> result;

	/** 
	 * 请求的traceid，用于排查问题
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setItemTotalCount(String itemTotalCount) {
		this.itemTotalCount = itemTotalCount;
	}
	public String getItemTotalCount( ) {
		return this.itemTotalCount;
	}

	public void setResult(List<AosHotItem> result) {
		this.result = result;
	}
	public List<AosHotItem> getResult( ) {
		return this.result;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
