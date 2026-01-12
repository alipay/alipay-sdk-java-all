package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 猜你想问查询接口
 *
 * @author auto create
 * @since 1.0, 2026-01-08 14:07:41
 */
public class AlipayCommerceMedicalGuessaskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1374613146985871998L;

	/**
	 * 好大夫用户id
	 */
	@ApiField("hdf_user_id")
	private String hdfUserId;

	/**
	 * 病例返回条数
	 */
	@ApiField("total")
	private Long total;

	public String getHdfUserId() {
		return this.hdfUserId;
	}
	public void setHdfUserId(String hdfUserId) {
		this.hdfUserId = hdfUserId;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
