package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ApeRecItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalop.ucdp.apeitem.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-02 16:36:31
 */
public class AlipayDigitalopUcdpApeitemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3865232915638792595L;

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
