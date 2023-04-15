package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 退款模型
 *
 * @author auto create
 * @since 1.0, 2023-04-05 10:53:24
 */
public class RefundInfoVO extends AlipayObject {

	private static final long serialVersionUID = 6468729385643991629L;

	/**
	 * 退款记录
	 */
	@ApiListField("refund_list")
	@ApiField("refund_record_v_o")
	private List<RefundRecordVO> refundList;

	public List<RefundRecordVO> getRefundList() {
		return this.refundList;
	}
	public void setRefundList(List<RefundRecordVO> refundList) {
		this.refundList = refundList;
	}

}
