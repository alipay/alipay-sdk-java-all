package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据小二2088查询小二信息
 *
 * @author auto create
 * @since 1.0, 2023-07-10 10:05:05
 */
public class AlipayIserviceIsresourceUrquerybyuidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6176784533541229295L;

	/**
	 * 小二的2088账号
	 */
	@ApiField("alipay_uid")
	private String alipayUid;

	public String getAlipayUid() {
		return this.alipayUid;
	}
	public void setAlipayUid(String alipayUid) {
		this.alipayUid = alipayUid;
	}

}
