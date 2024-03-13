package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 合并购物车信息
 *
 * @author auto create
 * @since 1.0, 2023-07-11 11:09:43
 */
public class MallMergeCartRequestDto extends AlipayObject {

	private static final long serialVersionUID = 7527142958814981681L;

	/**
	 * app_code，用于合并购物车
	 */
	@ApiField("app_code")
	private String appCode;

	/**
	 * fix_user_id，用于合并购物车
	 */
	@ApiField("fix_user_id")
	private String fixUserId;

	/**
	 * 用于合并购物车
	 */
	@ApiListField("items")
	@ApiField("mall_item_dtos")
	private List<MallItemDtos> items;

	/**
	 * order_id，用于合并购物车
	 */
	@ApiField("order_id")
	private String orderId;

	public String getAppCode() {
		return this.appCode;
	}
	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public String getFixUserId() {
		return this.fixUserId;
	}
	public void setFixUserId(String fixUserId) {
		this.fixUserId = fixUserId;
	}

	public List<MallItemDtos> getItems() {
		return this.items;
	}
	public void setItems(List<MallItemDtos> items) {
		this.items = items;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
