package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 基于商业订单的支付
 *
 * @author auto create
 * @since 1.0, 2019-08-17 17:36:05
 */
public class AlipayBusinessOrderPayModel extends AlipayObject {

	private static final long serialVersionUID = 5599859424199627347L;

	/**
	 * 支付宝订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 支付工具请求列表。支持将现金、商户预付卡、POS、支付宝等支付工具一起支付。
	 */
	@ApiListField("paytool_list")
	@ApiField("paytool_request_detail")
	private List<PaytoolRequestDetail> paytoolList;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public List<PaytoolRequestDetail> getPaytoolList() {
		return this.paytoolList;
	}
	public void setPaytoolList(List<PaytoolRequestDetail> paytoolList) {
		this.paytoolList = paytoolList;
	}

}
