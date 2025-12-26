package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 回收子单质检确认信息
 *
 * @author auto create
 * @since 1.0, 2025-09-02 11:22:07
 */
public class RecycleSubOrderInspectConfirmVO extends AlipayObject {

	private static final long serialVersionUID = 7251631854178873199L;

	/**
	 * 回收的子单号
	 */
	@ApiField("sub_order_id")
	private String subOrderId;

	/**
	 * 子单质检金额，币种：人民币，单位：元
	 */
	@ApiField("sub_order_inspect_price")
	private String subOrderInspectPrice;

	/**
	 * 子单质检商品列表
	 */
	@ApiListField("sub_order_inspect_product_list")
	@ApiField("recycle_sub_order_inspect_product_v_o")
	private List<RecycleSubOrderInspectProductVO> subOrderInspectProductList;

	/**
	 * 商家的子单号
	 */
	@ApiField("sub_out_order_id")
	private String subOutOrderId;

	public String getSubOrderId() {
		return this.subOrderId;
	}
	public void setSubOrderId(String subOrderId) {
		this.subOrderId = subOrderId;
	}

	public String getSubOrderInspectPrice() {
		return this.subOrderInspectPrice;
	}
	public void setSubOrderInspectPrice(String subOrderInspectPrice) {
		this.subOrderInspectPrice = subOrderInspectPrice;
	}

	public List<RecycleSubOrderInspectProductVO> getSubOrderInspectProductList() {
		return this.subOrderInspectProductList;
	}
	public void setSubOrderInspectProductList(List<RecycleSubOrderInspectProductVO> subOrderInspectProductList) {
		this.subOrderInspectProductList = subOrderInspectProductList;
	}

	public String getSubOutOrderId() {
		return this.subOutOrderId;
	}
	public void setSubOutOrderId(String subOutOrderId) {
		this.subOutOrderId = subOutOrderId;
	}

}
