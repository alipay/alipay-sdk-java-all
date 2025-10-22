package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecycleSubOrderAfterSaleInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycle.order.aftersale.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-02 11:27:39
 */
public class AlipayCommerceRecycleOrderAftersaleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3625593959622818964L;

	/** 
	 * 售后单号
	 */
	@ApiField("after_sale_id")
	private String afterSaleId;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 回收订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 商家订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/** 
	 * 子单售后信息列表
	 */
	@ApiListField("sub_order_after_sale_info_list")
	@ApiField("recycle_sub_order_after_sale_info_v_o")
	private List<RecycleSubOrderAfterSaleInfoVO> subOrderAfterSaleInfoList;

	/** 
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public void setAfterSaleId(String afterSaleId) {
		this.afterSaleId = afterSaleId;
	}
	public String getAfterSaleId( ) {
		return this.afterSaleId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}
	public String getOutOrderId( ) {
		return this.outOrderId;
	}

	public void setSubOrderAfterSaleInfoList(List<RecycleSubOrderAfterSaleInfoVO> subOrderAfterSaleInfoList) {
		this.subOrderAfterSaleInfoList = subOrderAfterSaleInfoList;
	}
	public List<RecycleSubOrderAfterSaleInfoVO> getSubOrderAfterSaleInfoList( ) {
		return this.subOrderAfterSaleInfoList;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
