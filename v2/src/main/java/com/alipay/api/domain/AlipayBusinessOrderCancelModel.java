package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商业订单撤销
 *
 * @author auto create
 * @since 1.0, 2019-08-17 17:39:20
 */
public class AlipayBusinessOrderCancelModel extends AlipayObject {

	private static final long serialVersionUID = 4346645196873384143L;

	/**
	 * 支付工具撤销请求明细。若该字段为空则认为是整单撤销
	 */
	@ApiListField("cancel_paytool_list")
	@ApiField("paytool_cancel_request_detail")
	private List<PaytoolCancelRequestDetail> cancelPaytoolList;

	/**
	 * 商户外部订单号，与支付宝订单号不能同时为空。注：商户已获取order_no（支付宝订单号）的情况下必须优先传入order_no
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 支付宝订单号，与商户外部订单号不能同时为空。注：商户已获取order_no的情况下必须优先传入order_no
	 */
	@ApiField("order_no")
	private String orderNo;

	public List<PaytoolCancelRequestDetail> getCancelPaytoolList() {
		return this.cancelPaytoolList;
	}
	public void setCancelPaytoolList(List<PaytoolCancelRequestDetail> cancelPaytoolList) {
		this.cancelPaytoolList = cancelPaytoolList;
	}

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
