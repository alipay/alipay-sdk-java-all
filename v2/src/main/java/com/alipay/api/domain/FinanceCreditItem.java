package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 区块链金融业务的授信条目
 *
 * @author auto create
 * @since 1.0, 2020-02-24 11:22:26
 */
public class FinanceCreditItem extends AlipayObject {

	private static final long serialVersionUID = 4289485652728933848L;

	/**
	 * 授信id
	 */
	@ApiField("credit_id")
	private String creditId;

	/**
	 * 版本，从1开始，0表示最新版本
	 */
	@ApiField("ver")
	private Long ver;

	public String getCreditId() {
		return this.creditId;
	}
	public void setCreditId(String creditId) {
		this.creditId = creditId;
	}

	public Long getVer() {
		return this.ver;
	}
	public void setVer(Long ver) {
		this.ver = ver;
	}

}
