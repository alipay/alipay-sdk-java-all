package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 退款模型
 *
 * @author auto create
 * @since 1.0, 2023-05-04 13:29:17
 */
public class RefundInfoVO extends AlipayObject {

	private static final long serialVersionUID = 1685776676188279278L;

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
