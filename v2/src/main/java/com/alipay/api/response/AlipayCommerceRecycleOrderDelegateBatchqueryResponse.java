package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecycleStdOrderAllVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycle.order.delegate.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-23 11:27:33
 */
public class AlipayCommerceRecycleOrderDelegateBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6899154616964714474L;

	/** 
	 * 订单内容
	 */
	@ApiListField("order_list")
	@ApiField("recycle_std_order_all_v_o")
	private List<RecycleStdOrderAllVO> orderList;

	/** 
	 * 页码
	 */
	@ApiField("page_no")
	private String pageNo;

	/** 
	 * 分页条数
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 订单调试
	 */
	@ApiField("total_count")
	private String totalCount;

	public void setOrderList(List<RecycleStdOrderAllVO> orderList) {
		this.orderList = orderList;
	}
	public List<RecycleStdOrderAllVO> getOrderList( ) {
		return this.orderList;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}
	public String getPageNo( ) {
		return this.pageNo;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	public String getTotalCount( ) {
		return this.totalCount;
	}

}
