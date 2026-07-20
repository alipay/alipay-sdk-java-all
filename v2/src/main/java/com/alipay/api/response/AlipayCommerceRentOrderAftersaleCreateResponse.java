package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AftersalePayItemVO;
import com.alipay.api.domain.AftersaleRefundItemVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.order.aftersale.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-15 11:02:56
 */
public class AlipayCommerceRentOrderAftersaleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8825358761223295367L;

	/** 
	 * 支付宝售后单ID
	 */
	@ApiField("aftersale_id")
	private String aftersaleId;

	/** 
	 * 商户外部售后单号
	 */
	@ApiField("out_aftersale_id")
	private String outAftersaleId;

	/** 
	 * 费用项明细列表
	 */
	@ApiListField("pay_items")
	@ApiField("aftersale_pay_item_v_o")
	private List<AftersalePayItemVO> payItems;

	/** 
	 * 退款费用项明细
	 */
	@ApiListField("refund_items")
	@ApiField("aftersale_refund_item_v_o")
	private List<AftersaleRefundItemVO> refundItems;

	public void setAftersaleId(String aftersaleId) {
		this.aftersaleId = aftersaleId;
	}
	public String getAftersaleId( ) {
		return this.aftersaleId;
	}

	public void setOutAftersaleId(String outAftersaleId) {
		this.outAftersaleId = outAftersaleId;
	}
	public String getOutAftersaleId( ) {
		return this.outAftersaleId;
	}

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

}
