package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ConversionDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.conversion.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:49
 */
public class AlipayDataDataserviceAdConversionBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1286358579834149839L;

	/** 
	 * 转化事件列表
	 */
	@ApiListField("list")
	@ApiField("conversion_detail")
	private List<ConversionDetail> list;

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

	public void setList(List<ConversionDetail> list) {
		this.list = list;
	}
	public List<ConversionDetail> getList( ) {
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
