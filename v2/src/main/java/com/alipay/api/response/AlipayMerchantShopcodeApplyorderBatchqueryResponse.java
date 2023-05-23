package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OrderInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.shopcode.applyorder.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 00:31:54
 */
public class AlipayMerchantShopcodeApplyorderBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6841466684473214564L;

	/** 
	 * 当前页码
	 */
	@ApiField("cur_page_no")
	private Long curPageNo;

	/** 
	 * 门店码开通流水详情
	 */
	@ApiListField("order_list")
	@ApiField("order_info_d_t_o")
	private List<OrderInfoDTO> orderList;

	/** 
	 * 当前页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 本次查询总记录数
	 */
	@ApiField("total_items")
	private Long totalItems;

	/** 
	 * 本次查询总页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	public void setCurPageNo(Long curPageNo) {
		this.curPageNo = curPageNo;
	}
	public Long getCurPageNo( ) {
		return this.curPageNo;
	}

	public void setOrderList(List<OrderInfoDTO> orderList) {
		this.orderList = orderList;
	}
	public List<OrderInfoDTO> getOrderList( ) {
		return this.orderList;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalItems(Long totalItems) {
		this.totalItems = totalItems;
	}
	public Long getTotalItems( ) {
		return this.totalItems;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	public Long getTotalPages( ) {
		return this.totalPages;
	}

}
