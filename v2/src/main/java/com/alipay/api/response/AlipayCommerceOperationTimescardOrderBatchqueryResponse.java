package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TimeCardOrderInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.timescard.order.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 06:16:47
 */
public class AlipayCommerceOperationTimescardOrderBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3534818171789186242L;

	/** 
	 * 次卡订单信息
	 */
	@ApiListField("datas")
	@ApiField("time_card_order_info")
	private List<TimeCardOrderInfo> datas;

	/** 
	 * 分页页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 分页每页记录数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总的记录数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setDatas(List<TimeCardOrderInfo> datas) {
		this.datas = datas;
	}
	public List<TimeCardOrderInfo> getDatas( ) {
		return this.datas;
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
