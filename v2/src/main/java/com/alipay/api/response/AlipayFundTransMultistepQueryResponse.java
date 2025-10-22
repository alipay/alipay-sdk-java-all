package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MultiStepTransOrderDetailResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.multistep.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-30 10:34:57
 */
public class AlipayFundTransMultistepQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6811144289896235843L;

	/** 
	 * 订单明细
	 */
	@ApiListField("order_details")
	@ApiField("multi_step_trans_order_detail_response")
	private List<MultiStepTransOrderDetailResponse> orderDetails;

	/** 
	 * 订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 外部单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/** 
	 * 请求方ID
	 */
	@ApiField("request_user_id")
	private String requestUserId;

	/** 
	 * 转账总金额 单元：元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 转账明细总数量 （单位：条）
	 */
	@ApiField("total_count")
	private String totalCount;

	public void setOrderDetails(List<MultiStepTransOrderDetailResponse> orderDetails) {
		this.orderDetails = orderDetails;
	}
	public List<MultiStepTransOrderDetailResponse> getOrderDetails( ) {
		return this.orderDetails;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRemark( ) {
		return this.remark;
	}

	public void setRequestUserId(String requestUserId) {
		this.requestUserId = requestUserId;
	}
	public String getRequestUserId( ) {
		return this.requestUserId;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	public String getTotalCount( ) {
		return this.totalCount;
	}

}
