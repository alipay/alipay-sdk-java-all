package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商业订单退款
 *
 * @author auto create
 * @since 1.0, 2019-08-17 17:38:37
 */
public class AlipayBusinessOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 1677654342391518754L;

	/**
	 * 订单退款环境信息
	 */
	@ApiField("env_info")
	private EnvInfo envInfo;

	/**
	 * 支付宝订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 退款支付工具列表
	 */
	@ApiListField("refund_paytool_list")
	@ApiField("paytool_refund_request_detail")
	private List<PaytoolRefundRequestDetail> refundPaytoolList;

	/**
	 * 退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 退款请求号。若退款请求号不为空，则必需传入refund_paytools_list。
若不传入退款请求号，同时refund_paytools_list为空，则认为是全额退款。
	 */
	@ApiField("refund_request_no")
	private String refundRequestNo;

	public EnvInfo getEnvInfo() {
		return this.envInfo;
	}
	public void setEnvInfo(EnvInfo envInfo) {
		this.envInfo = envInfo;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public List<PaytoolRefundRequestDetail> getRefundPaytoolList() {
		return this.refundPaytoolList;
	}
	public void setRefundPaytoolList(List<PaytoolRefundRequestDetail> refundPaytoolList) {
		this.refundPaytoolList = refundPaytoolList;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getRefundRequestNo() {
		return this.refundRequestNo;
	}
	public void setRefundRequestNo(String refundRequestNo) {
		this.refundRequestNo = refundRequestNo;
	}

}
