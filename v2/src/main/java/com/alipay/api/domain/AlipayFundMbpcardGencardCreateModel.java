package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 制卡下单接口
 *
 * @author auto create
 * @since 1.0, 2023-10-25 17:53:35
 */
public class AlipayFundMbpcardGencardCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5744949554638571874L;

	/**
	 * 购卡交易的业务单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 外部请求单号，调用系统生成，幂等参数；
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 购卡交易方式
	 */
	@ApiField("pay_mode")
	private String payMode;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getPayMode() {
		return this.payMode;
	}
	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}

}
