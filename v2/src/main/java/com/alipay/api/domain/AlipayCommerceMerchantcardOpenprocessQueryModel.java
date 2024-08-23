package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安心付开通进度查询
 *
 * @author auto create
 * @since 1.0, 2024-08-22 16:03:52
 */
public class AlipayCommerceMerchantcardOpenprocessQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6894767272841332431L;

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
