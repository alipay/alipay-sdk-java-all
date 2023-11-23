package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.titlelibrary.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 17:29:41
 */
public class AlipayEbppInvoiceTitlelibraryListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8386511524161476844L;

	/** 
	 * 抬头名称列表
	 */
	@ApiListField("title_name_list")
	@ApiField("string")
	private List<String> titleNameList;

	public void setTitleNameList(List<String> titleNameList) {
		this.titleNameList = titleNameList;
	}
	public List<String> getTitleNameList( ) {
		return this.titleNameList;
	}

}
