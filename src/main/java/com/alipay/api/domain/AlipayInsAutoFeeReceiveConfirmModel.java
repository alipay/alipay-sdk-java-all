package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车险向行业平台收费确认
 *
 * @author auto create
 * @since 1.0, 2021-07-22 15:49:24
 */
public class AlipayInsAutoFeeReceiveConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 6291666482111721471L;

	/**
	 * 外部业务单号，幂等字段，必填。和保险公司交互时同收单系统的outTradeNo
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 交易总金额 ;单位分
	 */
	@ApiField("trade_amount")
	private Long tradeAmount;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Long getTradeAmount() {
		return this.tradeAmount;
	}
	public void setTradeAmount(Long tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

}
