package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 基于外部业务单号取消结算单
 *
 * @author auto create
 * @since 1.0, 2020-09-09 11:56:23
 */
public class AlipayBossFncSettleSettlementbillCancelModel extends AlipayObject {

	private static final long serialVersionUID = 1369833993448239551L;

	/**
	 * 取消金额  该金额等于结算单的金额 用于校验   不支持部分取消
	 */
	@ApiField("cancel_amount")
	private MultiCurrencyMoneyOpenApi cancelAmount;

	/**
	 * 外部业务单据号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 对应单据创建的来源 （系统名）
	 */
	@ApiField("source")
	private String source;

	public MultiCurrencyMoneyOpenApi getCancelAmount() {
		return this.cancelAmount;
	}
	public void setCancelAmount(MultiCurrencyMoneyOpenApi cancelAmount) {
		this.cancelAmount = cancelAmount;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
