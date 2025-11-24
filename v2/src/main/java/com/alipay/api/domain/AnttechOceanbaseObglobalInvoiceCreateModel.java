package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 纷享销客创建海图总代发货单
 *
 * @author auto create
 * @since 1.0, 2025-08-28 16:21:37
 */
public class AnttechOceanbaseObglobalInvoiceCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6555383698815732188L;

	/**
	 * 总代发货单创建请求体
	 */
	@ApiField("fxiaoke_create_invoice_request")
	private FxiaokeCreateInvoiceRequest fxiaokeCreateInvoiceRequest;

	public FxiaokeCreateInvoiceRequest getFxiaokeCreateInvoiceRequest() {
		return this.fxiaokeCreateInvoiceRequest;
	}
	public void setFxiaokeCreateInvoiceRequest(FxiaokeCreateInvoiceRequest fxiaokeCreateInvoiceRequest) {
		this.fxiaokeCreateInvoiceRequest = fxiaokeCreateInvoiceRequest;
	}

}
