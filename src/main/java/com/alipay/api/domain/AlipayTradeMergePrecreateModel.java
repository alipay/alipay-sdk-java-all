package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 统一收单合并支付预创建接口
 *
 * @author auto create
 * @since 1.0, 2020-05-14 12:05:40
 */
public class AlipayTradeMergePrecreateModel extends AlipayObject {

	private static final long serialVersionUID = 1776831884953432497L;

	/**
	 * 子订单详情
	 */
	@ApiListField("order_details")
	@ApiField("order_detail")
	private List<OrderDetail> orderDetails;

	/**
	 * 如果已经和支付宝约定要求子订单明细必须同时支付成功或者同时支付失败则必须传入此参数，且该参数必须在商户端唯一，否则可以不需要填。
	 */
	@ApiField("out_merge_no")
	private String outMergeNo;

	/**
	 * 请求合并的所有订单允许的最晚付款时间，逾期将关闭交易，默认值为15d。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
如果已经和支付宝约定要求子订单明细必须同时支付成功或者同时支付失败，则不需要填入该字段。
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	public List<OrderDetail> getOrderDetails() {
		return this.orderDetails;
	}
	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public String getOutMergeNo() {
		return this.outMergeNo;
	}
	public void setOutMergeNo(String outMergeNo) {
		this.outMergeNo = outMergeNo;
	}

	public String getTimeoutExpress() {
		return this.timeoutExpress;
	}
	public void setTimeoutExpress(String timeoutExpress) {
		this.timeoutExpress = timeoutExpress;
	}

}
