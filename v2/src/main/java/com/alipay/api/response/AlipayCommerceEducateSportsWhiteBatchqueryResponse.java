package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SportsWhiteItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.sports.white.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-11 17:27:50
 */
public class AlipayCommerceEducateSportsWhiteBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2789447599694219152L;

	/** 
	 * null
	 */
	@ApiListField("list")
	@ApiField("sports_white_item")
	private List<SportsWhiteItem> list;

	/** 
	 * 总条数
	 */
	@ApiField("total")
	private Long total;

	public void setList(List<SportsWhiteItem> list) {
		this.list = list;
	}
	public List<SportsWhiteItem> getList( ) {
		return this.list;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
