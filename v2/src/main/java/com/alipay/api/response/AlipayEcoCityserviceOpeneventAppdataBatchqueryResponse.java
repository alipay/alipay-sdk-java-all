package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cityservice.openevent.appdata.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 18:36:43
 */
public class AlipayEcoCityserviceOpeneventAppdataBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8823688867874372572L;

	/** 
	 * 符合查询条件的数据的总条数
	 */
	@ApiField("count")
	private Long count;

	/** 
	 * 服务相关数据的返回值
	 */
	@ApiField("data_detail")
	private String dataDetail;

	/** 
	 * 当前页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页数据条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	public void setCount(Long count) {
		this.count = count;
	}
	public Long getCount( ) {
		return this.count;
	}

	public void setDataDetail(String dataDetail) {
		this.dataDetail = dataDetail;
	}
	public String getDataDetail( ) {
		return this.dataDetail;
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

}
