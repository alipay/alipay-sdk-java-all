package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MerchantShopDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.instantdelivery.merchantshop.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:21
 */
public class AlipayOpenInstantdeliveryMerchantshopBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3718267993885283717L;

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
	@ApiListField("records")
	@ApiField("merchant_shop_d_t_o")
	private List<MerchantShopDTO> records;

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

	public void setRecords(List<MerchantShopDTO> records) {
		this.records = records;
	}
	public List<MerchantShopDTO> getRecords( ) {
		return this.records;
	}

	public void setTotalNo(Long totalNo) {
		this.totalNo = totalNo;
	}
	public Long getTotalNo( ) {
		return this.totalNo;
	}

}
