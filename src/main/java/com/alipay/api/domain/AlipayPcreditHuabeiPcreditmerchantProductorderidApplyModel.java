package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取订购单ID
 *
 * @author auto create
 * @since 1.0, 2020-08-11 13:51:23
 */
public class AlipayPcreditHuabeiPcreditmerchantProductorderidApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7423198371516735448L;

	/**
	 * 商户id
	 */
	@ApiField("pid")
	private String pid;

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

}
