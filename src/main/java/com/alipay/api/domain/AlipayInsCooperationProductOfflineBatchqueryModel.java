package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * （快捷投保）查询该保险公司的线下产品列表
 *
 * @author auto create
 * @since 1.0, 2017-10-24 10:29:35
 */
public class AlipayInsCooperationProductOfflineBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2864739679397376136L;

	/**
	 * 机构在蚂蚁平台上的惟一标识
	 */
	@ApiField("inst_id")
	private String instId;

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

}
