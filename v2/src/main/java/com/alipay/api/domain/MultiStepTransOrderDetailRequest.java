package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多步转账明细请求参数
 *
 * @author auto create
 * @since 1.0, 2024-12-12 22:24:53
 */
public class MultiStepTransOrderDetailRequest extends AlipayObject {

	private static final long serialVersionUID = 7275812283454453593L;

	/**
	 * 传递业务参数，具体业务参数取值请以接入文档示例为准！
	 */
	@ApiField("business_params")
	private String businessParams;

	/**
	 * 订单转账顺序
	 */
	@ApiField("order_seq")
	private String orderSeq;

	/**
	 * 订单标题
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 外部单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 公用回传参数，如果请求时传递了该参数，则异步通知商户时会回传该参数。
	 */
	@ApiField("passback_params")
	private String passbackParams;

	/**
	 * 收款方信息
	 */
	@ApiField("payee_info")
	private MultiStepTransferParticipant payeeInfo;

	/**
	 * 付款方信息
	 */
	@ApiField("payer_info")
	private MultiStepTransferParticipant payerInfo;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 转账金额 单位：元
	 */
	@ApiField("trans_amount")
	private String transAmount;

	public String getBusinessParams() {
		return this.businessParams;
	}
	public void setBusinessParams(String businessParams) {
		this.businessParams = businessParams;
	}

	public String getOrderSeq() {
		return this.orderSeq;
	}
	public void setOrderSeq(String orderSeq) {
		this.orderSeq = orderSeq;
	}

	public String getOrderTitle() {
		return this.orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPassbackParams() {
		return this.passbackParams;
	}
	public void setPassbackParams(String passbackParams) {
		this.passbackParams = passbackParams;
	}

	public MultiStepTransferParticipant getPayeeInfo() {
		return this.payeeInfo;
	}
	public void setPayeeInfo(MultiStepTransferParticipant payeeInfo) {
		this.payeeInfo = payeeInfo;
	}

	public MultiStepTransferParticipant getPayerInfo() {
		return this.payerInfo;
	}
	public void setPayerInfo(MultiStepTransferParticipant payerInfo) {
		this.payerInfo = payerInfo;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTransAmount() {
		return this.transAmount;
	}
	public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}

}
