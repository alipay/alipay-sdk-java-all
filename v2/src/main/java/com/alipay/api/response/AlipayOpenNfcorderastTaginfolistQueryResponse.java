package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.NOrderTagDetailDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.nfcorderast.taginfolist.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-27 16:22:49
 */
public class AlipayOpenNfcorderastTaginfolistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3583522278826845381L;

	/** 
	 * 为空 则表述数据不存在
	 */
	@ApiField("data")
	private NOrderTagDetailDTO data;

	/** 
	 * 是否有下一页
	 */
	@ApiField("has_next")
	private Boolean hasNext;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总页数
	 */
	@ApiField("pages")
	private Long pages;

	/** 
	 * 总记录数
	 */
	@ApiField("total")
	private Long total;

	public void setData(NOrderTagDetailDTO data) {
		this.data = data;
	}
	public NOrderTagDetailDTO getData( ) {
		return this.data;
	}

	public void setHasNext(Boolean hasNext) {
		this.hasNext = hasNext;
	}
	public Boolean getHasNext( ) {
		return this.hasNext;
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

	public void setPages(Long pages) {
		this.pages = pages;
	}
	public Long getPages( ) {
		return this.pages;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
