package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 饿了么订单状态推送接口
 *
 * @author auto create
 * @since 1.0, 2022-09-26 16:06:44
 */
public class KoubeiCateringEleOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6139173836655282189L;

	/**
	 * 饿了么数据回流action类型.包含ORDER_STATUS，ORDER_DELIVERY,ORDER_REFUND
	 */
	@ApiField("action")
	private String action;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 饿了么推送的数据类型json字符串.注意data是一个字符串类型,要把一串json作为字符串传入
	 */
	@ApiField("data")
	private String data;

	/**
	 * 数据推送来源,需要找业务PD申请
	 */
	@ApiField("source")
	private String source;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
