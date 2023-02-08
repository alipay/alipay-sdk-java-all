package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询即时配送订单的开票结果
 *
 * @author auto create
 * @since 1.0, 2022-05-31 16:13:55
 */
public class AlipayCommerceLogisticsInvoiceIstdwaybillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6462964331554841697L;

	/**
	 * 即时配送公司编码
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 开票请求流水号
	 */
	@ApiField("out_invoice_request_no")
	private String outInvoiceRequestNo;

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getOutInvoiceRequestNo() {
		return this.outInvoiceRequestNo;
	}
	public void setOutInvoiceRequestNo(String outInvoiceRequestNo) {
		this.outInvoiceRequestNo = outInvoiceRequestNo;
	}

}
