package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 实时退税结果查询
 *
 * @author auto create
 * @since 1.0, 2025-11-19 10:43:58
 */
public class AlipayOverseasTaxTaxdataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1284151497471795755L;

	/**
	 * 外部交易单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

}
