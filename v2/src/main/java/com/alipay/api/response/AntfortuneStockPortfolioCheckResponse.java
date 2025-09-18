package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.stock.portfolio.check response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-23 16:37:26
 */
public class AntfortuneStockPortfolioCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 8294621256312576289L;

	/** 
	 * 在自选列表的标的
	 */
	@ApiListField("in_list")
	@ApiField("string")
	private List<String> inList;

	/** 
	 * 不在自选列表的标的
	 */
	@ApiListField("out_list")
	@ApiField("string")
	private List<String> outList;

	public void setInList(List<String> inList) {
		this.inList = inList;
	}
	public List<String> getInList( ) {
		return this.inList;
	}

	public void setOutList(List<String> outList) {
		this.outList = outList;
	}
	public List<String> getOutList( ) {
		return this.outList;
	}

}
