package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 退货单模型
 *
 * @author auto create
 * @since 1.0, 2019-06-25 17:56:23
 */
public class GoodsReturnOrder extends AlipayObject {

	private static final long serialVersionUID = 1424153888479477933L;

	/**
	 * 退货单号
	 */
	@ApiField("erp_order")
	private String erpOrder;

	/**
	 * 退货单类型
	 */
	@ApiField("erp_order_type")
	private String erpOrderType;

	/**
	 * 扩展字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 退货明细
	 */
	@ApiListField("order_item")
	@ApiField("goods_return_order_item")
	private List<GoodsReturnOrderItem> orderItem;

	/**
	 * 退货单关联的原erpOrder单据
	 */
	@ApiField("ori_erp_order")
	private String oriErpOrder;

	/**
	 * 退货单关联的原erpOrder类型
	 */
	@ApiField("ori_erp_order_type")
	private String oriErpOrderType;

	public String getErpOrder() {
		return this.erpOrder;
	}
	public void setErpOrder(String erpOrder) {
		this.erpOrder = erpOrder;
	}

	public String getErpOrderType() {
		return this.erpOrderType;
	}
	public void setErpOrderType(String erpOrderType) {
		this.erpOrderType = erpOrderType;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public List<GoodsReturnOrderItem> getOrderItem() {
		return this.orderItem;
	}
	public void setOrderItem(List<GoodsReturnOrderItem> orderItem) {
		this.orderItem = orderItem;
	}

	public String getOriErpOrder() {
		return this.oriErpOrder;
	}
	public void setOriErpOrder(String oriErpOrder) {
		this.oriErpOrder = oriErpOrder;
	}

	public String getOriErpOrderType() {
		return this.oriErpOrderType;
	}
	public void setOriErpOrderType(String oriErpOrderType) {
		this.oriErpOrderType = oriErpOrderType;
	}

}
