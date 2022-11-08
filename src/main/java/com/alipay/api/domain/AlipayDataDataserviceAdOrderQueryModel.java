package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 广告订单查询
 *
 * @author auto create
 * @since 1.0, 2022-01-10 20:25:44
 */
public class AlipayDataDataserviceAdOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3153315185572593472L;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 外部平台导入广告库后，广告投放订单对应的外部资源ID
	 */
	@ApiField("order_outer_id")
	private String orderOuterId;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public String getOrderOuterId() {
		return this.orderOuterId;
	}
	public void setOrderOuterId(String orderOuterId) {
		this.orderOuterId = orderOuterId;
	}

}
