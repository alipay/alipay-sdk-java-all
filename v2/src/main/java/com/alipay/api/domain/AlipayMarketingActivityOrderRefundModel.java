package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家营销订单退款接口
 *
 * @author auto create
 * @since 1.0, 2023-05-15 14:56:53
 */
public class AlipayMarketingActivityOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 6288289597693668865L;

	/**
	 * 购买者的支付宝uid.

用于水平权限校验。
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 购买者的支付宝openId

用于水平权限校验。
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 购买商家兑换券的营销订单号。
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 外部业务单号，用作幂等控制。


注：针对同一次退款请求，如果调用接口失败或异常了，重试时需要保证退款请求号不能变更，防止该笔交易重复退款。支付宝会保证同样的退款请求号多次请求只会退一次。

该外部业务单号会在后续alipay.marketing.activity.message.refund 退款消息中带上。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 退款活动信息列表
	 */
	@ApiListField("refund_activity_info_list")
	@ApiField("refund_activity_info")
	private List<RefundActivityInfo> refundActivityInfoList;

	/**
	 * 退款类型：
USER_REFUND：用户主动发起退款

AUTO_EXPIRE：过期自动退款
	 */
	@ApiField("refund_type")
	private String refundType;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public List<RefundActivityInfo> getRefundActivityInfoList() {
		return this.refundActivityInfoList;
	}
	public void setRefundActivityInfoList(List<RefundActivityInfo> refundActivityInfoList) {
		this.refundActivityInfoList = refundActivityInfoList;
	}

	public String getRefundType() {
		return this.refundType;
	}
	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}

}
