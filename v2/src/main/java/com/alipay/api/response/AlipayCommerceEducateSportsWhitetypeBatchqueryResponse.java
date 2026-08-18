package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.WhiteTypeItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.sports.whitetype.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-11 17:27:49
 */
public class AlipayCommerceEducateSportsWhitetypeBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5255993141877272915L;

	/** 
	 * null
	 */
	@ApiListField("list")
	@ApiField("white_type_item")
	private List<WhiteTypeItem> list;

	public void setList(List<WhiteTypeItem> list) {
		this.list = list;
	}
	public List<WhiteTypeItem> getList( ) {
		return this.list;
	}

}
