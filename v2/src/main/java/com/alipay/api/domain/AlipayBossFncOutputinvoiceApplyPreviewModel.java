package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票平台预览发票融合信息API
 *
 * @author auto create
 * @since 1.0, 2024-06-12 10:22:17
 */
public class AlipayBossFncOutputinvoiceApplyPreviewModel extends AlipayObject {

	private static final long serialVersionUID = 6426828733636752255L;

	/**
	 * openapi 申请开票order集合
	 */
	@ApiListField("open_api_apply_invoice_orders")
	@ApiField("open_api_apply_invoice_order")
	private List<OpenApiApplyInvoiceOrder> openApiApplyInvoiceOrders;

	public List<OpenApiApplyInvoiceOrder> getOpenApiApplyInvoiceOrders() {
		return this.openApiApplyInvoiceOrders;
	}
	public void setOpenApiApplyInvoiceOrders(List<OpenApiApplyInvoiceOrder> openApiApplyInvoiceOrders) {
		this.openApiApplyInvoiceOrders = openApiApplyInvoiceOrders;
	}

}
