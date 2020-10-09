package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑商品交易退货接口
 *
 * @author auto create
 * @since 1.0, 2020-06-04 14:51:42
 */
public class KoubeiTradeItemorderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 8236616312539759534L;

	/**
	 * 口碑订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 标识一次退款请求，同一笔订单多次退款需要保证唯一
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 退款原因描述
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 退货明细信息
	 */
	@ApiListField("refund_infos")
	@ApiField("refund_info")
	private List<RefundInfo> refundInfos;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public List<RefundInfo> getRefundInfos() {
		return this.refundInfos;
	}
	public void setRefundInfos(List<RefundInfo> refundInfos) {
		this.refundInfos = refundInfos;
	}

}
