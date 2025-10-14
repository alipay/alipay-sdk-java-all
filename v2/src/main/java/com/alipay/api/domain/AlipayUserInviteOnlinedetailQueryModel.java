package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线上拉新结算明细数据查询
 *
 * @author auto create
 * @since 1.0, 2020-06-09 16:28:12
 */
public class AlipayUserInviteOnlinedetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7857484711538484915L;

	/**
	 * 页号
	 */
	@ApiField("page")
	private Long page;

	/**
	 * 页大小，page_size上限500，当大于500时，最多返回500条记录
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 二级渠道
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 一级渠道
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 日期
	 */
	@ApiField("report_date")
	private String reportDate;

	public Long getPage() {
		return this.page;
	}
	public void setPage(Long page) {
		this.page = page;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getReportDate() {
		return this.reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

}
