package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单确认（异步接口）
 *
 * @author auto create
 * @since 1.0, 2023-03-13 19:52:55
 */
public class AlipayCommerceSportsVenueOrderConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 6434128415756777735L;

	/**
	 * 订单确认描述
	 */
	@ApiField("confirm_desc")
	private String confirmDesc;

	/**
	 * 订单确认状态
succ - 确认成功
fail - 确认失败
	 */
	@ApiField("confirm_status")
	private String confirmStatus;

	/**
	 * 支付宝业务订单唯一ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 服务商内部唯一订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 订单商品信息列表
	 */
	@ApiListField("product_group_list")
	@ApiField("product_group")
	private List<ProductGroup> productGroupList;

	/**
	 * 订单付款总金额(单位：元)
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getConfirmDesc() {
		return this.confirmDesc;
	}
	public void setConfirmDesc(String confirmDesc) {
		this.confirmDesc = confirmDesc;
	}

	public String getConfirmStatus() {
		return this.confirmStatus;
	}
	public void setConfirmStatus(String confirmStatus) {
		this.confirmStatus = confirmStatus;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public List<ProductGroup> getProductGroupList() {
		return this.productGroupList;
	}
	public void setProductGroupList(List<ProductGroup> productGroupList) {
		this.productGroupList = productGroupList;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
