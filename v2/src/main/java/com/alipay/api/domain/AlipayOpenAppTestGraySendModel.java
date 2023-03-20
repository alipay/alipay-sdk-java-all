package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 页面 v3测试
 *
 * @author auto create
 * @since 1.0, 2023-01-09 16:44:30
 */
public class AlipayOpenAppTestGraySendModel extends AlipayObject {

	private static final long serialVersionUID = 5254189758865929368L;

	/**
	 * 1
	 */
	@ApiField("oid")
	private String oid;

	public String getOid() {
		return this.oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}

}
