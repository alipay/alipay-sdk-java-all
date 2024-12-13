package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保单查询
 *
 * @author auto create
 * @since 1.0, 2022-10-12 18:35:48
 */
public class AlipayInsSceneApplicationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8482252571585527358L;

	/**
	 * 投保订单号;当商户生成的外部投保业务号不传时则必传
	 */
	@ApiField("application_no")
	private String applicationNo;

	/**
	 * 商户生成的外部投保业务号;当投保订单号不传时必传
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 产品编码;当投保订单号不传时必传.
	 */
	@ApiField("prod_code")
	private String prodCode;

	public String getApplicationNo() {
		return this.applicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

}
