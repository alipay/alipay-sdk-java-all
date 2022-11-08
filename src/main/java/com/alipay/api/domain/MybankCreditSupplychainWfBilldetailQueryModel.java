package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * wf账单明细查询（店铺维度）
 *
 * @author auto create
 * @since 1.0, 2022-05-17 10:46:04
 */
public class MybankCreditSupplychainWfBilldetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2544121496723242359L;

	/**
	 * 首次入账结束时间
	 */
	@ApiField("maxstartdate")
	private Long maxstartdate;

	/**
	 * 首次入账起始时间
	 */
	@ApiField("minstartdate")
	private Long minstartdate;

	/**
	 * 页码
	 */
	@ApiField("pagenum")
	private Long pagenum;

	/**
	 * 分页大小
	 */
	@ApiField("pagesize")
	private String pagesize;

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

	/**
	 * 账单状态
	 */
	@ApiField("status")
	private String status;

	public Long getMaxstartdate() {
		return this.maxstartdate;
	}
	public void setMaxstartdate(Long maxstartdate) {
		this.maxstartdate = maxstartdate;
	}

	public Long getMinstartdate() {
		return this.minstartdate;
	}
	public void setMinstartdate(Long minstartdate) {
		this.minstartdate = minstartdate;
	}

	public Long getPagenum() {
		return this.pagenum;
	}
	public void setPagenum(Long pagenum) {
		this.pagenum = pagenum;
	}

	public String getPagesize() {
		return this.pagesize;
	}
	public void setPagesize(String pagesize) {
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
