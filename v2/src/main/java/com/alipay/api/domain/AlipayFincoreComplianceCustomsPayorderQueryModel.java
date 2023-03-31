package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝跨境业务海关支付单信息查询
 *
 * @author auto create
 * @since 1.0, 2023-03-23 16:47:51
 */
public class AlipayFincoreComplianceCustomsPayorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8837725657559936898L;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * trade_no+唯一+海关推支付单+无+从淘宝支付交易里获取+内部菜鸟使用
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
