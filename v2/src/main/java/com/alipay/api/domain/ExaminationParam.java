package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ISV履约同步的检查检验类对象
 *
 * @author auto create
 * @since 1.0, 2026-04-10 16:25:17
 */
public class ExaminationParam extends AlipayObject {

	private static final long serialVersionUID = 5297859752384197499L;

	/**
	 * 外部商品ID集合与pdf链接关系
	 */
	@ApiListField("item_id_to_pdf")
	@ApiField("fulfillment_item_pdf_info")
	private List<FulfillmentItemPdfInfo> itemIdToPdf;

	public List<FulfillmentItemPdfInfo> getItemIdToPdf() {
		return this.itemIdToPdf;
	}
	public void setItemIdToPdf(List<FulfillmentItemPdfInfo> itemIdToPdf) {
		this.itemIdToPdf = itemIdToPdf;
	}

}
