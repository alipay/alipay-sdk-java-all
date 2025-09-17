package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ApeRecItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalop.ucdp.apeitemsearch.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:25:23
 */
public class AlipayDigitalopUcdpApeitemsearchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3816658367929554293L;

	/** 
	 * 可推荐的商品总数
	 */
	@ApiField("item_total_count")
	private Long itemTotalCount;

	/** 
	 * 推荐的item结果列表
	 */
	@ApiListField("items")
	@ApiField("ape_rec_item")
	private List<ApeRecItem> items;

	/** 
	 * 推荐请求的traceid，用于关联推荐结果和用户行为
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setItemTotalCount(Long itemTotalCount) {
		this.itemTotalCount = itemTotalCount;
	}
	public Long getItemTotalCount( ) {
		return this.itemTotalCount;
	}

	public void setItems(List<ApeRecItem> items) {
		this.items = items;
	}
	public List<ApeRecItem> getItems( ) {
		return this.items;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
