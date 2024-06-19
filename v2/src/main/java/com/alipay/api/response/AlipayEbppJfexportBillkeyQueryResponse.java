package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExportBillkey;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.jfexport.billkey.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-27 14:47:03
 */
public class AlipayEbppJfexportBillkeyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2299985426247875834L;

	/** 
	 * 返回的户号信息列表
	 */
	@ApiListField("billkey_list")
	@ApiField("export_billkey")
	private List<ExportBillkey> billkeyList;

	public void setBillkeyList(List<ExportBillkey> billkeyList) {
		this.billkeyList = billkeyList;
	}
	public List<ExportBillkey> getBillkeyList( ) {
		return this.billkeyList;
	}

}
