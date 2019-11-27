package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报关单信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class DeclareRecord extends AlipayObject {

	private static final long serialVersionUID = 4627939414613277755L;

	/**
	 * 支付宝推送到海关的支付单据号
	 */
	@ApiField("alipay_declare_no")
	private String alipayDeclareNo;

	/**
	 * 商户端报关请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public String getAlipayDeclareNo() {
		return this.alipayDeclareNo;
	}
	public void setAlipayDeclareNo(String alipayDeclareNo) {
		this.alipayDeclareNo = alipayDeclareNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
