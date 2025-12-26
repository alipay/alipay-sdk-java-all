package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取订购单ID
 *
 * @author auto create
 * @since 1.0, 2024-08-02 11:08:16
 */
public class AlipayPcreditHuabeiPcreditmerchantProductorderidApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1476386686634745589L;

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
