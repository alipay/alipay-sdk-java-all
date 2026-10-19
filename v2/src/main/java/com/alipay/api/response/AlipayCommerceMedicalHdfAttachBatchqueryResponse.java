package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UrlItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdf.attach.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-14 16:27:59
 */
public class AlipayCommerceMedicalHdfAttachBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3436435616759635783L;

	/** 
	 * null
	 */
	@ApiListField("items")
	@ApiField("url_item")
	private List<UrlItem> items;

	public void setItems(List<UrlItem> items) {
		this.items = items;
	}
	public List<UrlItem> getItems( ) {
		return this.items;
	}

}
