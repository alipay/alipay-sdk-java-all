package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PhoneNumberItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.aics.devin.phonenumber.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-10 15:45:12
 */
public class DatadigitalAicsDevinPhonenumberQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4415999563695628772L;

	/** 
	 * null
	 */
	@ApiListField("list")
	@ApiField("phone_number_item")
	private List<PhoneNumberItem> list;

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
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 总页数
	 */
	@ApiField("total_page")
	private Long totalPage;

	public void setList(List<PhoneNumberItem> list) {
		this.list = list;
	}
	public List<PhoneNumberItem> getList( ) {
		return this.list;
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
