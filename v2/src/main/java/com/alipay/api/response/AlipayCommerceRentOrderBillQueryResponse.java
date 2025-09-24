package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RentBillOrderDetailDto;
import com.alipay.api.domain.RentBillRoyaltyDetailDto;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.order.bill.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-01 12:12:38
 */
public class AlipayCommerceRentOrderBillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7271982197843657854L;

	/** 
	 * 交易组件订单号
	 */
	@ApiField("biz_order_id")
	private String bizOrderId;

	/** 
	 * 订单关联用户支付明细列表
	 */
	@ApiListField("order_detail_list")
	@ApiField("rent_bill_order_detail_dto")
	private List<RentBillOrderDetailDto> orderDetailList;

	/** 
	 * 订单关联分账明细列表
	 */
	@ApiListField("royalty_detail_list")
	@ApiField("rent_bill_royalty_detail_dto")
	private List<RentBillRoyaltyDetailDto> royaltyDetailList;

	/** 
	 * 实分总金额，单位元
	 */
	@ApiField("total_actual_royalty_amount")
	private String totalActualRoyaltyAmount;

	/** 
	 * 应分总金额，单位元
	 */
	@ApiField("total_royalty_amount")
	private String totalRoyaltyAmount;

	public void setBizOrderId(String bizOrderId) {
		this.bizOrderId = bizOrderId;
	}
	public String getBizOrderId( ) {
		return this.bizOrderId;
	}

	public void setOrderDetailList(List<RentBillOrderDetailDto> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}
	public List<RentBillOrderDetailDto> getOrderDetailList( ) {
		return this.orderDetailList;
	}

	public void setRoyaltyDetailList(List<RentBillRoyaltyDetailDto> royaltyDetailList) {
		this.royaltyDetailList = royaltyDetailList;
	}
	public List<RentBillRoyaltyDetailDto> getRoyaltyDetailList( ) {
		return this.royaltyDetailList;
	}

	public void setTotalActualRoyaltyAmount(String totalActualRoyaltyAmount) {
		this.totalActualRoyaltyAmount = totalActualRoyaltyAmount;
	}
	public String getTotalActualRoyaltyAmount( ) {
		return this.totalActualRoyaltyAmount;
	}

	public void setTotalRoyaltyAmount(String totalRoyaltyAmount) {
		this.totalRoyaltyAmount = totalRoyaltyAmount;
	}
	public String getTotalRoyaltyAmount( ) {
		return this.totalRoyaltyAmount;
	}

}
