package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.WeightRecordItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hmtask.weightrecord.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-25 17:38:58
 */
public class AlipayCommerceMedicalHmtaskWeightrecordQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6693358137447492217L;

	/** 
	 * null
	 */
	@ApiListField("items")
	@ApiField("weight_record_item")
	private List<WeightRecordItem> items;

	/** 
	 * 当前页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总记录条数
	 */
	@ApiField("total")
	private Long total;

	public void setItems(List<WeightRecordItem> items) {
		this.items = items;
	}
	public List<WeightRecordItem> getItems( ) {
		return this.items;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
