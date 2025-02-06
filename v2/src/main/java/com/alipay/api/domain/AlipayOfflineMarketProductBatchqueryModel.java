package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过该接口可以查询商户录入的所有商品编号
 *
 * @author auto create
 * @since 1.0, 2024-07-04 17:00:58
 */
public class AlipayOfflineMarketProductBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8877562965136655361L;

	/**
	 * 操作人角色，默认商户操作:MERCHANT；服务商操作：PROVIDER。支付宝内部使用，外部商户不需填写此字段。
	 */
	@ApiField("op_role")
	private String opRole;

	/**
	 * 页码，留空标示第一页，默认100个结果为一页
	 */
	@ApiField("page_no")
	private String pageNo;

	/**
	 * 门店ID。支付宝内部使用，外部商户不需填写此字段。
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getOpRole() {
		return this.opRole;
	}
	public void setOpRole(String opRole) {
		this.opRole = opRole;
	}

	public String getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
