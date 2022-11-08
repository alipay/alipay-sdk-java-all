package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EcConsumeInfo;
import com.alipay.api.domain.EcOrderInfo;
import com.alipay.api.domain.EcVoucherInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.consume.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-13 16:56:52
 */
public class AlipayCommerceEcConsumeDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7528125454225816767L;

	/** 
	 * 账单信息
	 */
	@ApiField("consume_info")
	private EcConsumeInfo consumeInfo;

	/** 
	 * 关联订单详情
	 */
	@ApiField("related_order_info")
	private EcOrderInfo relatedOrderInfo;

	/** 
	 * 关联账单列表
	 */
	@ApiListField("related_refund_list")
	@ApiField("ec_consume_info")
	private List<EcConsumeInfo> relatedRefundList;

	/** 
	 * 关联凭证详情列表
	 */
	@ApiListField("related_voucher_list")
	@ApiField("ec_voucher_info")
	private List<EcVoucherInfo> relatedVoucherList;

	public void setConsumeInfo(EcConsumeInfo consumeInfo) {
		this.consumeInfo = consumeInfo;
	}
	public EcConsumeInfo getConsumeInfo( ) {
		return this.consumeInfo;
	}

	public void setRelatedOrderInfo(EcOrderInfo relatedOrderInfo) {
		this.relatedOrderInfo = relatedOrderInfo;
	}
	public EcOrderInfo getRelatedOrderInfo( ) {
		return this.relatedOrderInfo;
	}

	public void setRelatedRefundList(List<EcConsumeInfo> relatedRefundList) {
		this.relatedRefundList = relatedRefundList;
	}
	public List<EcConsumeInfo> getRelatedRefundList( ) {
		return this.relatedRefundList;
	}

	public void setRelatedVoucherList(List<EcVoucherInfo> relatedVoucherList) {
		this.relatedVoucherList = relatedVoucherList;
	}
	public List<EcVoucherInfo> getRelatedVoucherList( ) {
		return this.relatedVoucherList;
	}

}
