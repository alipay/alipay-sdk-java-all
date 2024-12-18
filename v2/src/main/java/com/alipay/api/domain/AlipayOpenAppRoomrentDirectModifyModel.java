package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租房商品免审更新接口
 *
 * @author auto create
 * @since 1.0, 2024-10-12 11:14:16
 */
public class AlipayOpenAppRoomrentDirectModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5648745115353931145L;

	/**
	 * 支付宝平台侧商品ID，是支付宝平台侧商品的唯一标识，后续与平台交互，需要使用该 ID，建议持久化。
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 操作商品上下架。
	 */
	@ApiField("opt_type")
	private String optType;

	/**
	 * 要求 APPID 下全局唯一
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 目前支持库存区间1~100000
	 */
	@ApiField("stock_num")
	private Long stockNum;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOptType() {
		return this.optType;
	}
	public void setOptType(String optType) {
		this.optType = optType;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public Long getStockNum() {
		return this.stockNum;
	}
	public void setStockNum(Long stockNum) {
		this.stockNum = stockNum;
	}

}
