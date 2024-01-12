package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺商家信息模型
 *
 * @author auto create
 * @since 1.0, 2021-03-10 16:54:54
 */
public class ShopMerchantInfo extends AlipayObject {

	private static final long serialVersionUID = 4197971452747843221L;

	/**
	 * isv定义的商家id（isv侧唯一）
	 */
	@ApiField("isv_mid")
	private String isvMid;

	/**
	 * 商家名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 商家id
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 签约模式(self_help：商户自助开通、isv_help_smid：ISV代smid开通、isv_help_pid：ISV代pid开通)
	 */
	@ApiField("sign_mode")
	private String signMode;

	/**
	 * 间连商家smid(间连必传)
	 */
	@ApiField("smid")
	private String smid;

	public String getIsvMid() {
		return this.isvMid;
	}
	public void setIsvMid(String isvMid) {
		this.isvMid = isvMid;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getSignMode() {
		return this.signMode;
	}
	public void setSignMode(String signMode) {
		this.signMode = signMode;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

}
