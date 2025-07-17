package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询自动回复详情
 *
 * @author auto create
 * @since 1.0, 2025-07-09 11:39:29
 */
public class AlipayMerchantGroupAutoreplyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8782435897949181279L;

	/**
	 * 自动回复id
	 */
	@ApiField("autoreply_id")
	private String autoreplyId;

	public String getAutoreplyId() {
		return this.autoreplyId;
	}
	public void setAutoreplyId(String autoreplyId) {
		this.autoreplyId = autoreplyId;
	}

}
