package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业行政许可明细许可表格信息
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:27:38
 */
public class EpAdminLicensePermissionTableInfo extends AlipayObject {

	private static final long serialVersionUID = 4674259336394681929L;

	/**
	 * 审批类别
	 */
	@ApiField("splb")
	private String splb;

	/**
	 * 许可决定日期
	 */
	@ApiField("xkjdrq")
	private String xkjdrq;

	/**
	 * 许可截止日期
	 */
	@ApiField("xkjzrq")
	private String xkjzrq;

	/**
	 * 行政许可决定书文号
	 */
	@ApiField("xzxujdwh")
	private String xzxujdwh;

	public String getSplb() {
		return this.splb;
	}
	public void setSplb(String splb) {
		this.splb = splb;
	}

	public String getXkjdrq() {
		return this.xkjdrq;
	}
	public void setXkjdrq(String xkjdrq) {
		this.xkjdrq = xkjdrq;
	}

	public String getXkjzrq() {
		return this.xkjzrq;
	}
	public void setXkjzrq(String xkjzrq) {
		this.xkjzrq = xkjzrq;
	}

	public String getXzxujdwh() {
		return this.xzxujdwh;
	}
	public void setXzxujdwh(String xzxujdwh) {
		this.xzxujdwh = xzxujdwh;
	}

}
