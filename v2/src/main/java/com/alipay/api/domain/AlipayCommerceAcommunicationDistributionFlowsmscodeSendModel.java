package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流量分销发送验证码
 *
 * @author auto create
 * @since 1.0, 2024-11-12 15:39:16
 */
public class AlipayCommerceAcommunicationDistributionFlowsmscodeSendModel extends AlipayObject {

	private static final long serialVersionUID = 5694348884629881245L;

	/**
	 * 分销商订单号
	 */
	@ApiField("inst_order_id")
	private String instOrderId;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 请求id
	 */
	@ApiField("request_id")
	private String requestId;

	public String getInstOrderId() {
		return this.instOrderId;
	}
	public void setInstOrderId(String instOrderId) {
		this.instOrderId = instOrderId;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
