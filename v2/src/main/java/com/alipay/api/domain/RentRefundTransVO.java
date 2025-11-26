package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租金支付退款流水
 *
 * @author auto create
 * @since 1.0, 2025-11-13 10:24:05
 */
public class RentRefundTransVO extends AlipayObject {

	private static final long serialVersionUID = 2287136531193171454L;

	/**
	 * 退款请求号。 标识一次退款请求，需要保证在交易号下唯一。 注：针对同一次退款请求，如果调用接口失败或异常了，重试时需要保证退款请求号不能变更，防止该笔交易重复退款。支付宝会保证同样的退款请求号多次请求只会退一次。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 资金退款时间。对齐Z50退款查询接口响应参数中的gmt_refund_pay退款时间字段。
	 */
	@ApiField("real_refund_time")
	private Date realRefundTime;

	/**
	 * 退款请求的退款金额。单位：元。商户reduction扣减不包含在内
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 订单退款费用项明细列
	 */
	@ApiListField("refund_items")
	@ApiField("rent_refund_item_v_o")
	private List<RentRefundItemVO> refundItems;

	/**
	 * 退款状态
	 */
	@ApiField("status")
	private String status;

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public Date getRealRefundTime() {
		return this.realRefundTime;
	}
	public void setRealRefundTime(Date realRefundTime) {
		this.realRefundTime = realRefundTime;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public List<RentRefundItemVO> getRefundItems() {
		return this.refundItems;
	}
	public void setRefundItems(List<RentRefundItemVO> refundItems) {
		this.refundItems = refundItems;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
