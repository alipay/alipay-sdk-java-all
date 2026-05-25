package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账户页面支付链接获取
 *
 * @author auto create
 * @since 1.0, 2026-05-25 14:37:55
 */
public class AlipayCommerceLifeserviceAccountpageGetModel extends AlipayObject {

	private static final long serialVersionUID = 3169616758146614365L;

	/**
	 * 核销单id
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 退款对应的次数
	 */
	@ApiField("count")
	private String count;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getCount() {
		return this.count;
	}
	public void setCount(String count) {
		this.count = count;
	}

}
