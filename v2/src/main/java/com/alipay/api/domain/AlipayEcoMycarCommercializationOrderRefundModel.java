package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务商品退款
 *
 * @author auto create
 * @since 1.0, 2023-09-04 17:09:55
 */
public class AlipayEcoMycarCommercializationOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 8719699664569292153L;

	/**
	 * openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商家侧订单id，订单的唯一标识
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 退款流水号，退款请求唯一标识
	 */
	@ApiField("out_refund_no")
	private String outRefundNo;

	/**
	 * 退款的凭证明细列表，如果不传，则表明是业务订单整体退款。如果支付宝侧发现凭证已经使用（冻结和核销），则直接失败
	 */
	@ApiListField("refund_certificate_list")
	@ApiField("commercialization_certificate_info")
	private List<CommercializationCertificateInfo> refundCertificateList;

	/**
	 * 退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getOutRefundNo() {
		return this.outRefundNo;
	}
	public void setOutRefundNo(String outRefundNo) {
		this.outRefundNo = outRefundNo;
	}

	public List<CommercializationCertificateInfo> getRefundCertificateList() {
		return this.refundCertificateList;
	}
	public void setRefundCertificateList(List<CommercializationCertificateInfo> refundCertificateList) {
		this.refundCertificateList = refundCertificateList;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
