package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 圈人规则查询
 *
 * @author auto create
 * @since 1.0, 2021-06-23 15:40:13
 */
public class AlipayMarketingCampaignRuleRulelistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1158832117957171333L;

	/**
	 * 签约商户下属子机构唯一编号
	 */
	@ApiField("mpid")
	private String mpid;

	/**
	 * 页码，从1开始
	 */
	@ApiField("pageno")
	private String pageno;

	/**
	 * 每页大小
	 */
	@ApiField("pagesize")
	private String pagesize;

	public String getMpid() {
		return this.mpid;
	}
	public void setMpid(String mpid) {
		this.mpid = mpid;
	}

	public String getPageno() {
		return this.pageno;
	}
	public void setPageno(String pageno) {
		this.pageno = pageno;
	}

	public String getPagesize() {
		return this.pagesize;
	}
	public void setPagesize(String pagesize) {
		this.pagesize = pagesize;
	}

}
