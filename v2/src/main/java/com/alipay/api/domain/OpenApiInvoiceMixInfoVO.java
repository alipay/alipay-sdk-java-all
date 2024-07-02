package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * openApi预览发票混合信息
 *
 * @author auto create
 * @since 1.0, 2023-10-12 20:42:25
 */
public class OpenApiInvoiceMixInfoVO extends AlipayObject {

	private static final long serialVersionUID = 1815977831356618687L;

	/**
	 * 预览融合信息生成的发票列表
	 */
	@ApiListField("output_invoices")
	@ApiField("open_api_output_invoice_v_o")
	private List<OpenApiOutputInvoiceVO> outputInvoices;

	/**
	 * 预览融合信息请求ID
	 */
	@ApiField("preview_order_id")
	private String previewOrderId;

	public List<OpenApiOutputInvoiceVO> getOutputInvoices() {
		return this.outputInvoices;
	}
	public void setOutputInvoices(List<OpenApiOutputInvoiceVO> outputInvoices) {
		this.outputInvoices = outputInvoices;
	}

	public String getPreviewOrderId() {
		return this.previewOrderId;
	}
	public void setPreviewOrderId(String previewOrderId) {
		this.previewOrderId = previewOrderId;
	}

}
