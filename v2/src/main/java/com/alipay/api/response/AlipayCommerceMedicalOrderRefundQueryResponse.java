package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RefundOrderDetailVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.order.refund.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-03 20:07:07
 */
public class AlipayCommerceMedicalOrderRefundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8142825612788713859L;

	/** 
	 * 退款订单列表
	 */
	@ApiListField("refund_list")
	@ApiField("refund_order_detail_v_o")
	private List<RefundOrderDetailVO> refundList;

	public void setRefundList(List<RefundOrderDetailVO> refundList) {
		this.refundList = refundList;
	}
	public List<RefundOrderDetailVO> getRefundList( ) {
		return this.refundList;
	}

}
