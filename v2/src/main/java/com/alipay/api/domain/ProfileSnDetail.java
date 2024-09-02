package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * sn数据模型
 *
 * @author auto create
 * @since 1.0, 2020-01-08 15:05:13
 */
public class ProfileSnDetail extends AlipayObject {

	private static final long serialVersionUID = 6493298578678339656L;

	/**
	 * 设备sn
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * sn状态
-1无效，1未使用 。2已使用
	 */
	@ApiField("status")
	private Long status;

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

}
