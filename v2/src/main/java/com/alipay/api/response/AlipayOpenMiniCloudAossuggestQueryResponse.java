package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AosSuggestItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.cloud.aossuggest.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-31 17:37:01
 */
public class AlipayOpenMiniCloudAossuggestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3113251679833672555L;

	/** 
	 * 结果的总条数
	 */
	@ApiField("item_total_count")
	private String itemTotalCount;

	/** 
	 * 搜索suggest数据
	 */
	@ApiListField("result")
	@ApiField("aos_suggest_item")
	private List<AosSuggestItem> result;

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

	public void setResult(List<AosSuggestItem> result) {
		this.result = result;
	}
	public List<AosSuggestItem> getResult( ) {
		return this.result;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
