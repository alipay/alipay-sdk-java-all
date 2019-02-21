package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取指定用户所有的有效抬头列表（集团内部接口）
 *
 * @author auto create
 * @since 1.0, 2018-04-23 13:17:34
 */
public class AlipayEbppInvoiceTitleBatchqueryInnerModel extends AlipayObject {

	private static final long serialVersionUID = 5527734851934931789L;

	/**
	 * 抬头所属支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
