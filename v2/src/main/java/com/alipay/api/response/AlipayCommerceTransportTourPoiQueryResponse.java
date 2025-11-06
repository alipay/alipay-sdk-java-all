package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PoimInfoQueryOpenapiResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.tour.poi.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-14 15:05:23
 */
public class AlipayCommerceTransportTourPoiQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4249775967263152255L;

	/** 
	 * 页码值
	 */
	@ApiField("page_num")
	private String pageNum;

	/** 
	 * 页面大小
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 门店点位信息查询结果数据
	 */
	@ApiField("poim_info_data")
	private PoimInfoQueryOpenapiResult poimInfoData;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private String totalPages;

	/** 
	 * 总条数
	 */
	@ApiField("total_size")
	private String totalSize;

	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}
	public String getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setPoimInfoData(PoimInfoQueryOpenapiResult poimInfoData) {
		this.poimInfoData = poimInfoData;
	}
	public PoimInfoQueryOpenapiResult getPoimInfoData( ) {
		return this.poimInfoData;
	}

	public void setTotalPages(String totalPages) {
		this.totalPages = totalPages;
	}
	public String getTotalPages( ) {
		return this.totalPages;
	}

	public void setTotalSize(String totalSize) {
		this.totalSize = totalSize;
	}
	public String getTotalSize( ) {
		return this.totalSize;
	}

}
