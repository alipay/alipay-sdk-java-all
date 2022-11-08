package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * wf账单汇总查询
 *
 * @author auto create
 * @since 1.0, 2022-05-17 10:46:18
 */
public class MybankCreditSupplychainWfBillsummaryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2223665199535724694L;

	/**
	 * 固定，WF提前收款个人
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 站点
	 */
	@ApiField("site")
	private String site;

	/**
	 * 站点id
	 */
	@ApiField("siteuserid")
	private String siteuserid;

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSite() {
		return this.site;
	}
	public void setSite(String site) {
		this.site = site;
	}

	public String getSiteuserid() {
		return this.siteuserid;
	}
	public void setSiteuserid(String siteuserid) {
		this.siteuserid = siteuserid;
	}

}
