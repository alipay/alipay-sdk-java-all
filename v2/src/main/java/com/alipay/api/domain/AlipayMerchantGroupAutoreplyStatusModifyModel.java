package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改自动回复状态
 *
 * @author auto create
 * @since 1.0, 2025-07-09 11:39:27
 */
public class AlipayMerchantGroupAutoreplyStatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3297886545963934766L;

	/**
	 * 自动回复id
	 */
	@ApiField("autoreply_id")
	private String autoreplyId;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	public String getAutoreplyId() {
		return this.autoreplyId;
	}
	public void setAutoreplyId(String autoreplyId) {
		this.autoreplyId = autoreplyId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
