package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 海报列表
 *
 * @author auto create
 * @since 1.0, 2023-11-15 19:38:12
 */
public class StillList extends AlipayObject {

	private static final long serialVersionUID = 7685726279748593397L;

	/**
	 * 海报大图
	 */
	@ApiField("olonk")
	private String olonk;

	/**
	 * 海报缩略图
	 */
	@ApiField("tlink")
	private String tlink;

	public String getOlonk() {
		return this.olonk;
	}
	public void setOlonk(String olonk) {
		this.olonk = olonk;
	}

	public String getTlink() {
		return this.tlink;
	}
	public void setTlink(String tlink) {
		this.tlink = tlink;
	}

}
