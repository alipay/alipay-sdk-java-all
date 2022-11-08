package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家商品同步至花呗
 *
 * @author auto create
 * @since 1.0, 2022-08-18 16:59:11
 */
public class AlipayPcreditHuabeiPcreditbenefitItemSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6137312659148923496L;

	/**
	 * 商品列表
	 */
	@ApiListField("item_list")
	@ApiField("singltem")
	private List<Singltem> itemList;

	public List<Singltem> getItemList() {
		return this.itemList;
	}
	public void setItemList(List<Singltem> itemList) {
		this.itemList = itemList;
	}

}
