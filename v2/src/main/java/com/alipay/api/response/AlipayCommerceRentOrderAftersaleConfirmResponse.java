package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AftersalePayItemVO;
import com.alipay.api.domain.AftersaleRefundItemVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.order.aftersale.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-01 00:08:12
 */
public class AlipayCommerceRentOrderAftersaleConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 8513742311473122876L;

	/** 
	 * 费用项明细列表
	 */
	@ApiListField("pay_items")
	@ApiField("aftersale_pay_item_v_o")
	private List<AftersalePayItemVO> payItems;

	/** 
	 * 退款费用项明细列表
	 */
	@ApiListField("refund_items")
	@ApiField("aftersale_refund_item_v_o")
	private List<AftersaleRefundItemVO> refundItems;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setPayItems(List<AftersalePayItemVO> payItems) {
		this.payItems = payItems;
	}
	public List<AftersalePayItemVO> getPayItems( ) {
		return this.payItems;
	}

	public void setRefundItems(List<AftersaleRefundItemVO> refundItems) {
		this.refundItems = refundItems;
	}
	public List<AftersaleRefundItemVO> getRefundItems( ) {
		return this.refundItems;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
