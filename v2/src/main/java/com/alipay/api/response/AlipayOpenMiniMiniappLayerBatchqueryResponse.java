package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeliveryResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.miniapp.layer.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:57:17
 */
public class AlipayOpenMiniMiniappLayerBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6883147949724986116L;

	/** 
	 * 有礼投放活动列表
	 */
	@ApiListField("delivery_result_list")
	@ApiField("delivery_result")
	private List<DeliveryResult> deliveryResultList;

	/** 
	 * 第几页
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页数据10条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总共多少条数据
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setDeliveryResultList(List<DeliveryResult> deliveryResultList) {
		this.deliveryResultList = deliveryResultList;
	}
	public List<DeliveryResult> getDeliveryResultList( ) {
		return this.deliveryResultList;
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
