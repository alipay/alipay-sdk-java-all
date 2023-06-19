package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 国际留学汇款-订单批量查询
 *
 * @author auto create
 * @since 1.0, 2021-08-09 15:01:39
 */
public class AlipayOverseasTuitionSchoolpaymentBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6433387318147851167L;

	/**
	 * ISV入驻签约PID
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 扩展字段
	 */
	@ApiField("pass_through_info")
	private String passThroughInfo;

	/**
	 * 一次最多输入100个订单组
	 */
	@ApiListField("payment_orders")
	@ApiField("tuition_query_order")
	private List<TuitionQueryOrder> paymentOrders;

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getPassThroughInfo() {
		return this.passThroughInfo;
	}
	public void setPassThroughInfo(String passThroughInfo) {
		this.passThroughInfo = passThroughInfo;
	}

	public List<TuitionQueryOrder> getPaymentOrders() {
		return this.paymentOrders;
	}
	public void setPaymentOrders(List<TuitionQueryOrder> paymentOrders) {
		this.paymentOrders = paymentOrders;
	}

}
