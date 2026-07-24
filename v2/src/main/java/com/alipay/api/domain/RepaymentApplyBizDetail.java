package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单期还款履约明细
 *
 * @author auto create
 * @since 1.0, 2026-07-20 16:32:51
 */
public class RepaymentApplyBizDetail extends AlipayObject {

	private static final long serialVersionUID = 8262967964842874874L;

	/**
	 * 当期还款金额，单位：CNY
	 */
	@ApiField("current_amt")
	private String currentAmt;

	/**
	 * 当期还款期数
	 */
	@ApiField("install_num")
	private Long installNum;

	/**
	 * 还款流水号（全局唯一）
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getCurrentAmt() {
		return this.currentAmt;
	}
	public void setCurrentAmt(String currentAmt) {
		this.currentAmt = currentAmt;
	}

	public Long getInstallNum() {
		return this.installNum;
	}
	public void setInstallNum(Long installNum) {
		this.installNum = installNum;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
