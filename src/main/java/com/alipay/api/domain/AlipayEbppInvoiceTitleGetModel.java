package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁电子发票平台根据抬头id获取单个抬头信息
 *
 * @author auto create
 * @since 1.0, 2019-06-21 16:58:52
 */
public class AlipayEbppInvoiceTitleGetModel extends AlipayObject {

	private static final long serialVersionUID = 5419447383518146261L;

	/**
	 * 抬头id
	 */
	@ApiField("title_id")
	private String titleId;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getTitleId() {
		return this.titleId;
	}
	public void setTitleId(String titleId) {
		this.titleId = titleId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
