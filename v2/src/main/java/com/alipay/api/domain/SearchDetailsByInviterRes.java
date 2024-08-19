package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 邀请单查询结果
 *
 * @author auto create
 * @since 1.0, 2024-07-10 10:23:56
 */
public class SearchDetailsByInviterRes extends AlipayObject {

	private static final long serialVersionUID = 7157178672331849918L;

	/**
	 * 邀请单列表
	 */
	@ApiListField("res_items")
	@ApiField("search_details_by_inviter_res_item")
	private List<SearchDetailsByInviterResItem> resItems;

	public List<SearchDetailsByInviterResItem> getResItems() {
		return this.resItems;
	}
	public void setResItems(List<SearchDetailsByInviterResItem> resItems) {
		this.resItems = resItems;
	}

}
