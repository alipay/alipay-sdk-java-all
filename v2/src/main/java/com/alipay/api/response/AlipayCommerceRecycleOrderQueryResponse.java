package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecycleAuctionInfoVO;
import com.alipay.api.domain.RecycleSubOrderInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycle.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-30 14:07:45
 */
public class AlipayCommerceRecycleOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6555356949432953554L;

	/** 
	 * 回收竞拍信息
	 */
	@ApiField("auction_info")
	private RecycleAuctionInfoVO auctionInfo;

	/** 
	 * 商家的名称
	 */
	@ApiField("merchant_alias")
	private String merchantAlias;

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
	 * 订单的状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 商家订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/** 
	 * 子订单信息列表
	 */
	@ApiListField("sub_order_info_list")
	@ApiField("recycle_sub_order_info_v_o")
	private List<RecycleSubOrderInfoVO> subOrderInfoList;

	public void setAuctionInfo(RecycleAuctionInfoVO auctionInfo) {
		this.auctionInfo = auctionInfo;
	}
	public RecycleAuctionInfoVO getAuctionInfo( ) {
		return this.auctionInfo;
	}

	public void setMerchantAlias(String merchantAlias) {
		this.merchantAlias = merchantAlias;
	}
	public String getMerchantAlias( ) {
		return this.merchantAlias;
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

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}
	public String getOutOrderId( ) {
		return this.outOrderId;
	}

	public void setSubOrderInfoList(List<RecycleSubOrderInfoVO> subOrderInfoList) {
		this.subOrderInfoList = subOrderInfoList;
	}
	public List<RecycleSubOrderInfoVO> getSubOrderInfoList( ) {
		return this.subOrderInfoList;
	}

}
