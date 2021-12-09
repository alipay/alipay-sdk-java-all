package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AlipayOrderDataOpenapiResultInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.order.securitydigest.consumer.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-20 10:58:10
 */
public class AlipayMerchantOrderSecuritydigestConsumerBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6327678676968569419L;

	/** 
	 * 是否还有下一页
	 */
	@ApiField("has_next_page")
	private Boolean hasNextPage;

	/** 
	 * 下一次请求的end_time（用于分页查询）
	 */
	@ApiField("next_end_time")
	private String nextEndTime;

	/** 
	 * 订单信息列表，当存在符合条件的订单时，则返回订单信息；
	 */
	@ApiListField("order_list")
	@ApiField("alipay_order_data_openapi_result_info")
	private List<AlipayOrderDataOpenapiResultInfo> orderList;

	public void setHasNextPage(Boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
	public Boolean getHasNextPage( ) {
		return this.hasNextPage;
	}

	public void setNextEndTime(String nextEndTime) {
		this.nextEndTime = nextEndTime;
	}
	public String getNextEndTime( ) {
		return this.nextEndTime;
	}

	public void setOrderList(List<AlipayOrderDataOpenapiResultInfo> orderList) {
		this.orderList = orderList;
	}
	public List<AlipayOrderDataOpenapiResultInfo> getOrderList( ) {
		return this.orderList;
	}

}
