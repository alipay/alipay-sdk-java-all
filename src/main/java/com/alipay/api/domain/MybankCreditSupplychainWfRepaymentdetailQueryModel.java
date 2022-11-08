package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * wf还款明细查询（单笔用款（支用）维度
 *
 * @author auto create
 * @since 1.0, 2022-05-17 10:46:42
 */
public class MybankCreditSupplychainWfRepaymentdetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6483193234559848227L;

	/**
	 * 网商支用编号
	 */
	@ApiField("billno")
	private String billno;

	/**
	 * 页码
	 */
	@ApiField("pagenum")
	private Long pagenum;

	/**
	 * 分页大小
	 */
	@ApiField("pagesize")
	private Long pagesize;

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

	public Long getPagenum() {
		return this.pagenum;
	}
	public void setPagenum(Long pagenum) {
		this.pagenum = pagenum;
	}

	public Long getPagesize() {
		return this.pagesize;
	}
	public void setPagesize(Long pagesize) {
		this.pagesize = pagesize;
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
