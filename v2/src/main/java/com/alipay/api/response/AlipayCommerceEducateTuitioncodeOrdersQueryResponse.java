package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RechargeOrderTuitionDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.tuitioncode.orders.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 22:27:17
 */
public class AlipayCommerceEducateTuitioncodeOrdersQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7786234525526718259L;

	/** 
	 * 订单列表
	 */
	@ApiListField("data")
	@ApiField("recharge_order_tuition_d_t_o")
	private List<RechargeOrderTuitionDTO> data;

	/** 
	 * 当前分页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 记录总数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setData(List<RechargeOrderTuitionDTO> data) {
		this.data = data;
	}
	public List<RechargeOrderTuitionDTO> getData( ) {
		return this.data;
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

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
