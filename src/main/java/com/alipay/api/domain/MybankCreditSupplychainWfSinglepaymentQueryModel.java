package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * wf单笔支用明细查询
 *
 * @author auto create
 * @since 1.0, 2022-05-17 10:40:52
 */
public class MybankCreditSupplychainWfSinglepaymentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4466616518669928626L;

	/**
	 * 网商支用编号
	 */
	@ApiField("billno")
	private String billno;

	/**
	 * 固定，WF提前收款个人
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

	public String getBillno() {
		return this.billno;
	}
	public void setBillno(String billno) {
		this.billno = billno;
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
