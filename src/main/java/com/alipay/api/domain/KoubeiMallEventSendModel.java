package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提供商圈事件
 *
 * @author auto create
 * @since 1.0, 2019-09-16 17:50:29
 */
public class KoubeiMallEventSendModel extends AlipayObject {

	private static final long serialVersionUID = 8222264133627748239L;

	/**
	 * 业务号
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 事件业务数据
	 */
	@ApiField("data")
	private String data;

	/**
	 * 事件码
	 */
	@ApiField("event_code")
	private String eventCode;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getEventCode() {
		return this.eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
