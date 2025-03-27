package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InvoiceTitleModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.title.batchquery.inner response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:34:28
 */
public class AlipayEbppInvoiceTitleBatchqueryInnerResponse extends AlipayResponse {

	private static final long serialVersionUID = 5117113192363995795L;

	/** 
	 * 用户抬头列表（包括个人、单位抬头）
	 */
	@ApiListField("title_list")
	@ApiField("invoice_title_model")
	private List<InvoiceTitleModel> titleList;

	public void setTitleList(List<InvoiceTitleModel> titleList) {
		this.titleList = titleList;
	}
	public List<InvoiceTitleModel> getTitleList( ) {
		return this.titleList;
	}

}
