package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PromotePageData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.promotepage.download response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-31 15:20:52
 */
public class AlipayDataDataserviceAdPromotepageDownloadResponse extends AlipayResponse {

	private static final long serialVersionUID = 2319943711275417691L;

	/** 
	 * 转化事件ID
	 */
	@ApiField("conversion_id")
	private String conversionId;

	/** 
	 * 留资属性实例数据列表
	 */
	@ApiListField("list")
	@ApiField("promote_page_data")
	private List<PromotePageData> list;

	/** 
	 * 分页参数之页数，从1开始
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 分页参数之每页大小，最大1000
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 分页参数之总数据量
	 */
	@ApiField("total")
	private Long total;

	public void setConversionId(String conversionId) {
		this.conversionId = conversionId;
	}
	public String getConversionId( ) {
		return this.conversionId;
	}

	public void setList(List<PromotePageData> list) {
		this.list = list;
	}
	public List<PromotePageData> getList( ) {
		return this.list;
	}

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

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
