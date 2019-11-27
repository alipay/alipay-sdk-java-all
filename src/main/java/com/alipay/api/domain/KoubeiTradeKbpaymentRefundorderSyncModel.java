package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑外部支付退款回执
 *
 * @author auto create
 * @since 1.0, 2018-09-14 11:47:10
 */
public class KoubeiTradeKbpaymentRefundorderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6343483819113412394L;

	/**
	 * 附加数据，在查询API和支付通知中原样返回，该字段主要用于第三方系统携带订单的自定义数据
	 */
	@ApiField("attach")
	private String attach;

	/**
	 * 货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY
	 */
	@ApiField("fee_type")
	private String feeType;

	/**
	 * 一笔退款行为中，退的红包和代金券列表
	 */
	@ApiListField("fund_tool_list")
	@ApiField("kbp_fund_tool")
	private List<KbpFundTool> fundToolList;

	/**
	 * 退款完成时间，当refund_status=SUCCESS时必填；格式为yyyyMMddHHmmss，如2009年12月25日9点10分10秒表示为20091225091010
	 */
	@ApiField("gmt_finish")
	private String gmtFinish;

	/**
	 * 第三方退款单据号，比如在微信支付场景下，为微信退款单号
	 */
	@ApiField("out_refund_id")
	private String outRefundId;

	/**
	 * 退款时，对应的口碑支付单据号；标识该支付单的退款行为
	 */
	@ApiField("pay_id")
	private String payId;

	/**
	 * 第三方退款单金额；单位：分；在回执报文传入成功时，会校验该值，如果不一致，不会驱动业务；该值为正整数数值字符串；
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/**
	 * 口碑触发外部支付单退款时，对应的口碑退款单据号；
	 */
	@ApiField("refund_id")
	private String refundId;

	/**
	 * 第三方退款回执状态标识；SUCCESS：标识退款完成；FAIL：标识退款失败
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/**
	 * 请求id，唯一标识一次请求
	 */
	@ApiField("request_id")
	private String requestId;

	public String getAttach() {
		return this.attach;
	}
	public void setAttach(String attach) {
		this.attach = attach;
	}

	public String getFeeType() {
		return this.feeType;
	}
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	public List<KbpFundTool> getFundToolList() {
		return this.fundToolList;
	}
	public void setFundToolList(List<KbpFundTool> fundToolList) {
		this.fundToolList = fundToolList;
	}

	public String getGmtFinish() {
		return this.gmtFinish;
	}
	public void setGmtFinish(String gmtFinish) {
		this.gmtFinish = gmtFinish;
	}

	public String getOutRefundId() {
		return this.outRefundId;
	}
	public void setOutRefundId(String outRefundId) {
		this.outRefundId = outRefundId;
	}

	public String getPayId() {
		return this.payId;
	}
	public void setPayId(String payId) {
		this.payId = payId;
	}

	public String getRefundFee() {
		return this.refundFee;
	}
	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}

	public String getRefundId() {
		return this.refundId;
	}
	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}

	public String getRefundStatus() {
		return this.refundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
