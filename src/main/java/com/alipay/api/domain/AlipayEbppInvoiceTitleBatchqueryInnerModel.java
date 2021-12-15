package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取指定用户所有的有效抬头列表（集团内部接口）
 *
 * @author auto create
 * @since 1.0, 2020-05-20 15:49:48
 */
public class AlipayEbppInvoiceTitleBatchqueryInnerModel extends AlipayObject {

	private static final long serialVersionUID = 2861252261747939556L;

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
