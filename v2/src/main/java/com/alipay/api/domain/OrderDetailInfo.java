package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 营销咨询订单信息
 *
 * @author auto create
 * @since 1.0, 2024-07-03 14:36:00
 */
public class OrderDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 6338252975325718538L;

	/**
	 * 订单金额（单位 元）
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 订单的商品列表
	 */
	@ApiListField("item_detail_info_list")
	@ApiField("item_detail_info")
	private List<ItemDetailInfo> itemDetailInfoList;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public List<ItemDetailInfo> getItemDetailInfoList() {
		return this.itemDetailInfoList;
	}
	public void setItemDetailInfoList(List<ItemDetailInfo> itemDetailInfoList) {
		this.itemDetailInfoList = itemDetailInfoList;
	}

}
