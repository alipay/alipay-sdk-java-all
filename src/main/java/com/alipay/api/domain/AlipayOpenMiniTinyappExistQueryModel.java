package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询是否创建过小程序
 *
 * @author auto create
 * @since 1.0, 2018-07-24 16:01:10
 */
public class AlipayOpenMiniTinyappExistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6838221384759873319L;

	/**
	 * 支付宝账号ID
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
