package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MerchantShopDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.instantdelivery.merchantshop.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-27 21:35:11
 */
public class AlipayOpenInstantdeliveryMerchantshopBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6416663718789776891L;

	/** 
	 * 当前页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 分页数量, 最大50。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 门店列表数据。
	 */
	@ApiField("records")
	private MerchantShopDTO records;

	/** 
	 * 总数量
	 */
	@ApiField("total_no")
	private Long totalNo;

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

	public void setRecords(MerchantShopDTO records) {
		this.records = records;
	}
	public MerchantShopDTO getRecords( ) {
		return this.records;
	}

	public void setTotalNo(Long totalNo) {
		this.totalNo = totalNo;
	}
	public Long getTotalNo( ) {
		return this.totalNo;
	}

}
