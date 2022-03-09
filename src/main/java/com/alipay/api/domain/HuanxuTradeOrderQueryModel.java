package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 焕旭科技聚合支付产品操作指令查询接口
 *
 * @author auto create
 * @since 1.0, 2020-10-15 15:26:21
 */
public class HuanxuTradeOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7192344175686142471L;

	/**
	 * 支付、打款、退款时候焕旭返回的唯一凭证id，调用方查询时候建议优先传入该值，内部处理时优先以该值为准。instruction_id和out_request_no不能同时为空。
	 */
	@ApiField("instruction_id")
	private String instructionId;

	/**
	 * 指令类型，表明该笔查询是支付，打款还是退款，跟out_request_no一起使用。 支付：PAY 打款：DISBURSE 退款：REFUND
	 */
	@ApiField("instruction_type")
	private String instructionType;

	/**
	 * 商户订单号，merchant_order_no和out_request_no是一起使用。
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 支付、打款或退款请求号，out_request_no和instruction_id不能同时为空。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 支付请求号，out_request_no是一起使用。
	 */
	@ApiField("pay_request_no")
	private String payRequestNo;

	/**
	 * 付款方信息，跟out_request_no一起使用。
	 */
	@ApiField("payer")
	private UserIdentity payer;

	public String getInstructionId() {
		return this.instructionId;
	}
	public void setInstructionId(String instructionId) {
		this.instructionId = instructionId;
	}

	public String getInstructionType() {
		return this.instructionType;
	}
	public void setInstructionType(String instructionType) {
		this.instructionType = instructionType;
	}

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getPayRequestNo() {
		return this.payRequestNo;
	}
	public void setPayRequestNo(String payRequestNo) {
		this.payRequestNo = payRequestNo;
	}

	public UserIdentity getPayer() {
		return this.payer;
	}
	public void setPayer(UserIdentity payer) {
		this.payer = payer;
	}

}
