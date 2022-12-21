package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.tax.neworder.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 11:45:25
 */
public class AlipayOverseasTaxNeworderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5593819231845758397L;

	/** 
	 * 纸质退税单号
	 */
	@ApiField("doc_id")
	private String docId;

	/** 
	 * 支付宝退税单号
	 */
	@ApiField("tax_order_no")
	private String taxOrderNo;

	public void setDocId(String docId) {
		this.docId = docId;
	}
	public String getDocId( ) {
		return this.docId;
	}

	public void setTaxOrderNo(String taxOrderNo) {
		this.taxOrderNo = taxOrderNo;
	}
	public String getTaxOrderNo( ) {
		return this.taxOrderNo;
	}

}
