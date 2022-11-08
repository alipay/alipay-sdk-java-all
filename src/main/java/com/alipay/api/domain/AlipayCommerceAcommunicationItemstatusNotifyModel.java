package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营商充值商品货物上下架状态修改
 *
 * @author auto create
 * @since 1.0, 2022-06-20 21:17:01
 */
public class AlipayCommerceAcommunicationItemstatusNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 8251517538636798673L;

	/**
	 * 商品状态操作类型，1/上架，2/下架
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 支付宝与机构之间的商品id映射码，需要包含关键信息：省份-运营商-面额
	 */
	@ApiField("item_code")
	private String itemCode;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

}
