package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 积分回退接口
 *
 * @author auto create
 * @since 1.0, 2023-02-13 13:25:15
 */
public class AlipayMerchantOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 4878319927383262336L;

	/**
	 * 业务场景，某些场景下操作的不是用户本身的订单，而是用户所在群体的订单的情况下，必传
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 下单时候的买家id
	 */
	@ApiField("buyer")
	private UserIdentity buyer;

	/**
	 * 退款扩展信息
	 */
	@ApiListField("ext_info")
	@ApiField("order_ext_info")
	private List<OrderExtInfo> extInfo;

	/**
	 * 下单并支付的时候返回的订单号，与外部请求号两者之间必须传一个
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 创建订单时传入的外部请求号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 退款原因描述，可能是用户发起退款、或者是系统异常发起的回补退款
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 退款请求，比如下面的请求代表在这次退款中退2000家庭积分[{"request_no":"2019678438","amount":{"type":"FAMILY_POINT","amount":2000}}]。之所以是一个list是为了支持多笔退款，退款失败重试请不要更换request_no。单次全额退的request_no可以用out_biz_no
	 */
	@ApiListField("refund_request")
	@ApiField("payment_information")
	private List<PaymentInformation> refundRequest;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public UserIdentity getBuyer() {
		return this.buyer;
	}
	public void setBuyer(UserIdentity buyer) {
		this.buyer = buyer;
	}

	public List<OrderExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<OrderExtInfo> extInfo) {
		this.extInfo = extInfo;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public List<PaymentInformation> getRefundRequest() {
		return this.refundRequest;
	}
	public void setRefundRequest(List<PaymentInformation> refundRequest) {
		this.refundRequest = refundRequest;
	}

}
