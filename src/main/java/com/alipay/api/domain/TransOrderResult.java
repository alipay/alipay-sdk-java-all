package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单笔转账的结果
 *
 * @author auto create
 * @since 1.0, 2018-10-10 21:05:55
 */
public class TransOrderResult extends AlipayObject {

	private static final long serialVersionUID = 6328146327122831526L;

	/**
	 * 转账失败时的错误码描述。
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 转账失败时的错误原因描述
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 该笔转账在支付宝系统内部的单据ID。
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商户订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 转账单据状态。
	SUCCESS：转账成功（对转账到银行卡的单据, 同一笔单据多次查询有可能从成功变成退票状态）；
	FAIL：转账失败（具体失败原因请参见error_code以及fail_reason返回值）；
	WAIT_PAY：转账订单等待支付（只有alipay.fund.trans.app.pay接口的单据有此状态）；
	DEALING：转账到银行卡处理中；
	REFUND：退票 收款方是银行卡时会有次状态, 具体退票原因请参见fail_reason返回值）；
        CLOSED：订单超时关闭（只有alipay.fund.trans.app.pay接口的单据有此状态）

APP转账涉及的状态： WAIT_PAY SUCCESS CLOSED
转账到卡涉及的状态：DEALING FAIL SUCCESS REFUND 
转账到支付宝账户涉及的状态：FAIL SUCCESS
	 */
	@ApiField("status")
	private String status;

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
