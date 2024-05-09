package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AosHintItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.cloud.aoshint.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-28 00:41:58
 */
public class AlipayOpenMiniCloudAoshintQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8319981816644639192L;

	/** 
	 * 结果的总条数
	 */
	@ApiField("item_total_count")
	private String itemTotalCount;

	/** 
	 * 底纹搜索的结果
	 */
	@ApiListField("result")
	@ApiField("aos_hint_item")
	private List<AosHintItem> result;

	/** 
	 * 请求链路唯一id，用于问题排查
	 */
	@ApiField("sequence")
	private String sequence;

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

	public void setResult(List<AosHintItem> result) {
		this.result = result;
	}
	public List<AosHintItem> getResult( ) {
		return this.result;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	public String getSequence( ) {
		return this.sequence;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
