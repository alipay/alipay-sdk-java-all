package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AppContentItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.appcontent.item.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-03 11:02:46
 */
public class AlipayOpenAppAppcontentItemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6269259716746257777L;

	/** 
	 * 商品信息
	 */
	@ApiListField("items")
	@ApiField("app_content_item")
	private List<AppContentItem> items;

	/** 
	 * 总商品数
	 */
	@ApiField("total")
	private Long total;

	public void setItems(List<AppContentItem> items) {
		this.items = items;
	}
	public List<AppContentItem> getItems( ) {
		return this.items;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
