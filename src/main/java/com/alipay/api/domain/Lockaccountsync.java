package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 锁户同步
 *
 * @author auto create
 * @since 1.0, 2022-05-17 10:41:53
 */
public class Lockaccountsync extends AlipayObject {

	private static final long serialVersionUID = 3793173657259538321L;

	/**
	 * 亚马逊offerid
	 */
	@ApiField("offerid")
	private String offerid;

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
	 * 用户站点id
	 */
	@ApiField("siteuserid")
	private String siteuserid;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	public String getOfferid() {
		return this.offerid;
	}
	public void setOfferid(String offerid) {
		this.offerid = offerid;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
