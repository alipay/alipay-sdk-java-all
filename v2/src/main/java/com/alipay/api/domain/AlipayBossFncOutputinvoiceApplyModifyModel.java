package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 编辑票面信息后开票接口
 *
 * @author auto create
 * @since 1.0, 2024-06-12 17:42:23
 */
public class AlipayBossFncOutputinvoiceApplyModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3399373511318638846L;

	/**
	 * 当前该接口的操作人，用于权限校验，校验登录人与预览提交人是否一致
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 预览发票并编辑后的发票票面信息
	 */
	@ApiListField("output_invoice_previewed_orders")
	@ApiField("open_api_output_invoice_previewed_order")
	private List<OpenApiOutputInvoicePreviewedOrder> outputInvoicePreviewedOrders;

	/**
	 * 预览请求Id，用于查询数据库中保存的发票预览信息
	 */
	@ApiField("preview_order_id")
	private String previewOrderId;

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public List<OpenApiOutputInvoicePreviewedOrder> getOutputInvoicePreviewedOrders() {
		return this.outputInvoicePreviewedOrders;
	}
	public void setOutputInvoicePreviewedOrders(List<OpenApiOutputInvoicePreviewedOrder> outputInvoicePreviewedOrders) {
		this.outputInvoicePreviewedOrders = outputInvoicePreviewedOrders;
	}

	public String getPreviewOrderId() {
		return this.previewOrderId;
	}
	public void setPreviewOrderId(String previewOrderId) {
		this.previewOrderId = previewOrderId;
	}

}
