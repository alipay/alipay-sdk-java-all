package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DietRecordItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hmtask.dietrecord.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-25 17:39:13
 */
public class AlipayCommerceMedicalHmtaskDietrecordQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8744956786741129999L;

	/** 
	 * null
	 */
	@ApiListField("items")
	@ApiField("diet_record_item")
	private List<DietRecordItem> items;

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

	public void setItems(List<DietRecordItem> items) {
		this.items = items;
	}
	public List<DietRecordItem> getItems( ) {
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
