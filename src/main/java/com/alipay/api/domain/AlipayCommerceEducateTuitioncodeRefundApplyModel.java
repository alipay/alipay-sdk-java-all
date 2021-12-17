package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 学费码退款申请
 *
 * @author auto create
 * @since 1.0, 2021-04-25 17:10:56
 */
public class AlipayCommerceEducateTuitioncodeRefundApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7398882194629151334L;

	/**
	 * 外部商户的订单编号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 退已打款计划明细：
当退款类型为2时必填
	 */
	@ApiListField("refund_paid_detail_list")
	@ApiField("refund_paid_detail")
	private List<RefundPaidDetail> refundPaidDetailList;

	/**
	 * 退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 退款类型：
1-退未打款
2-退已打款
3-全部
	 */
	@ApiField("refund_type")
	private Long refundType;

	/**
	 * 部分退款时：外部幂等号，长度不能超过32位
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 二级商户
	 */
	@ApiField("smid")
	private String smid;

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public List<RefundPaidDetail> getRefundPaidDetailList() {
		return this.refundPaidDetailList;
	}
	public void setRefundPaidDetailList(List<RefundPaidDetail> refundPaidDetailList) {
		this.refundPaidDetailList = refundPaidDetailList;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public Long getRefundType() {
		return this.refundType;
	}
	public void setRefundType(Long refundType) {
		this.refundType = refundType;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

}
