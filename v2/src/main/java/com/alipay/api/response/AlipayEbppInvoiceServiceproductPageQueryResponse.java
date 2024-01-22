package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ServiceProductInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.serviceproduct.page.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 00:21:50
 */
public class AlipayEbppInvoiceServiceproductPageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6876724142392695145L;

	/** 
	 * 服务产品列表
	 */
	@ApiListField("items")
	@ApiField("service_product_info")
	private List<ServiceProductInfo> items;

	/** 
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总页数
	 */
	@ApiField("total_num")
	private Long totalNum;

	/** 
	 * 总记录条数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setItems(List<ServiceProductInfo> items) {
		this.items = items;
	}
	public List<ServiceProductInfo> getItems( ) {
		return this.items;
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

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
