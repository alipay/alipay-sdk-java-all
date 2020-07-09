package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.paymenthub.refund response.
 * 
 * @author auto create
 * @since 1.0, 2020-03-23 22:00:11
 */
public class AlipayBusinessPaymenthubRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 7327251175345595945L;

	/** 
	 * 聚合支付的支付渠道，支付宝分配。
	 */
	@ApiField("channel")
	private String channel;

	/** 
	 * 退款金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * 退款指令id，支付宝针对每一笔退款请求生成的唯一退款凭证号
	 */
	@ApiListField("refund_id")
	@ApiField("string")
	private List<String> refundId;

	/** 
	 * 退款请求号，对应一笔业务订单下的一次退款请求，不退款请求需保证请求号唯一
	 */
	@ApiField("refund_request_no")
	private String refundRequestNo;

	/** 
	 * 退款状态，目前支持如下值：
 SUCCESS（退款成功），该状态表示该笔退款已成功处理； 
FAIL（退款失败），该状态表示该笔退款已失败，并且不可重试，后续如果要重新退款，需要更换退款请求号。
	 */
	@ApiField("refund_status")
	private String refundStatus;

	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getChannel( ) {
		return this.channel;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getRefundAmount( ) {
		return this.refundAmount;
	}

	public void setRefundId(List<String> refundId) {
		this.refundId = refundId;
	}
	public List<String> getRefundId( ) {
		return this.refundId;
	}

	public void setRefundRequestNo(String refundRequestNo) {
		this.refundRequestNo = refundRequestNo;
	}
	public String getRefundRequestNo( ) {
		return this.refundRequestNo;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}
	public String getRefundStatus( ) {
		return this.refundStatus;
	}

}
