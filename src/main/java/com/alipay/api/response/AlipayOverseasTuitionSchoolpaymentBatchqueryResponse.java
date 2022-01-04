package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TuitionInremitOrder;
import com.alipay.api.domain.SchoolBatchQueryResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.tuition.schoolpayment.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2021-08-09 15:01:39
 */
public class AlipayOverseasTuitionSchoolpaymentBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3877496214283444273L;

	/** 
	 * 商户在支付宝开设的账号ID
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/** 
	 * 扩展字段
	 */
	@ApiField("pass_through_info")
	private String passThroughInfo;

	/** 
	 * 查询缴费订单的返回总数
	 */
	@ApiField("payment_order_count")
	private String paymentOrderCount;

	/** 
	 * 缴费订单列表
	 */
	@ApiListField("payment_orders")
	@ApiField("tuition_inremit_order")
	private List<TuitionInremitOrder> paymentOrders;

	/** 
	 * 学校批量查询结果状态
	 */
	@ApiField("result")
	private SchoolBatchQueryResult result;

	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}
	public String getIsvPid( ) {
		return this.isvPid;
	}

	public void setPassThroughInfo(String passThroughInfo) {
		this.passThroughInfo = passThroughInfo;
	}
	public String getPassThroughInfo( ) {
		return this.passThroughInfo;
	}

	public void setPaymentOrderCount(String paymentOrderCount) {
		this.paymentOrderCount = paymentOrderCount;
	}
	public String getPaymentOrderCount( ) {
		return this.paymentOrderCount;
	}

	public void setPaymentOrders(List<TuitionInremitOrder> paymentOrders) {
		this.paymentOrders = paymentOrders;
	}
	public List<TuitionInremitOrder> getPaymentOrders( ) {
		return this.paymentOrders;
	}

	public void setResult(SchoolBatchQueryResult result) {
		this.result = result;
	}
	public SchoolBatchQueryResult getResult( ) {
		return this.result;
	}

}
