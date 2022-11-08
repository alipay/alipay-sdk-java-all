package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通知token失效状态
 *
 * @author auto create
 * @since 1.0, 2022-05-17 10:41:53
 */
public class MybankCreditSupplychainWfTokeninvalidstatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1652888979155525511L;

	/**
	 * 幂等id
	 */
	@ApiField("requestid")
	private String requestid;

	/**
	 * 场景码，固定，WF提前收款个人
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 店铺id
	 */
	@ApiField("sellerid")
	private String sellerid;

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

	public String getRequestid() {
		return this.requestid;
	}
	public void setRequestid(String requestid) {
		this.requestid = requestid;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSellerid() {
		return this.sellerid;
	}
	public void setSellerid(String sellerid) {
		this.sellerid = sellerid;
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
