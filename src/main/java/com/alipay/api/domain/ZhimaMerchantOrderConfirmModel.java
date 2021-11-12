package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 在线发卡商户确认订单
 *
 * @author auto create
 * @since 1.0, 2021-07-15 16:57:53
 */
public class ZhimaMerchantOrderConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 3891213771524112338L;

	/**
	 * 芝麻信用订单号,此订单号是在业务办理中的信用套餐页面点提交后生成的单号，此单号通过页面url或者后台通知到商户的业务系统，商户用此单号可以查询用户授权过的信用评估的相关信息后完成接下来的业务流程
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * transaction_id是代表一笔请求的唯一标志，该标识作为对账的关键信息，对于用户使用相同transaction_id的查询，芝麻在一天（86400秒）内返回首次查询数据，超过有效期的查询即为无效并返回异常，有效期内的反复查询不重新计费。 transaction_id 推荐生成方式是：30位，（其中17位时间值（精确到毫秒）：yyyyMMddHHmmssSSS）加上（13位自增数字：1234567890123）
	 */
	@ApiField("transaction_id")
	private String transactionId;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getTransactionId() {
		return this.transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

}
