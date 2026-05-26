package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ActSignUpRecord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.promo.record.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-08 21:57:45
 */
public class AlipayCommerceOperationPromoRecordQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1411185793138848946L;

	/** 
	 * 当前页
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * null
	 */
	@ApiListField("records")
	@ApiField("act_sign_up_record")
	private List<ActSignUpRecord> records;

	/** 
	 * 总量
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 总页数
	 */
	@ApiField("total_page")
	private Long totalPage;

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo( ) {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setRecords(List<ActSignUpRecord> records) {
		this.records = records;
	}
	public List<ActSignUpRecord> getRecords( ) {
		return this.records;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public Long getTotalPage( ) {
		return this.totalPage;
	}

}
