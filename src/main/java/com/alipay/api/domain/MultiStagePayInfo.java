package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 分次支付的支付信息
 *
 * @author auto create
 * @since 1.0, 2019-11-26 18:03:34
 */
public class MultiStagePayInfo extends AlipayObject {

	private static final long serialVersionUID = 4134737735675461974L;

	/**
	 * 按月均匀支付:PAY_MONTHLY
	 */
	@ApiField("payment_mode")
	private String paymentMode;

	/**
	 * 每期的支付信息的列表
	 */
	@ApiListField("stage_lines")
	@ApiField("multi_stage_pay_line_info")
	private List<MultiStagePayLineInfo> stageLines;

	/**
	 * 总支付金额，单位为元，最多小数点后面2位
	 */
	@ApiField("total_payment_amount")
	private String totalPaymentAmount;

	public String getPaymentMode() {
		return this.paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public List<MultiStagePayLineInfo> getStageLines() {
		return this.stageLines;
	}
	public void setStageLines(List<MultiStagePayLineInfo> stageLines) {
		this.stageLines = stageLines;
	}

	public String getTotalPaymentAmount() {
		return this.totalPaymentAmount;
	}
	public void setTotalPaymentAmount(String totalPaymentAmount) {
		this.totalPaymentAmount = totalPaymentAmount;
	}

}
