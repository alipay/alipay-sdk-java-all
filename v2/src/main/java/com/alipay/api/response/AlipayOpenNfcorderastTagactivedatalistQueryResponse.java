package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.NOrderTagActiveDataDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.nfcorderast.tagactivedatalist.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-27 16:20:23
 */
public class AlipayOpenNfcorderastTagactivedatalistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3289414737561491442L;

	/** 
	 * 线圈活跃数列表
	 */
	@ApiField("data")
	private NOrderTagActiveDataDTO data;

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
	 * 页数
	 */
	@ApiField("pages")
	private Long pages;

	/** 
	 * 总记录数
	 */
	@ApiField("total")
	private Long total;

	public void setData(NOrderTagActiveDataDTO data) {
		this.data = data;
	}
	public NOrderTagActiveDataDTO getData( ) {
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
