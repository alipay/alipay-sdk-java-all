package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PrintModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.print.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:34
 */
public class KoubeiCateringPosPrintQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7544138969137493536L;

	/** 
	 * 打印机Model对象集合
	 */
	@ApiListField("print_model_list")
	@ApiField("print_model")
	private List<PrintModel> printModelList;

	public void setPrintModelList(List<PrintModel> printModelList) {
		this.printModelList = printModelList;
	}
	public List<PrintModel> getPrintModelList( ) {
		return this.printModelList;
	}

}
