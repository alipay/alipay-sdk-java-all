package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户查询客资信息
 *
 * @author auto create
 * @since 1.0, 2022-04-27 17:07:00
 */
public class KoubeiServindustryLeadsRecordBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8462849853784855436L;

	/**
	 * 查询时间范围结束时间（客资创建时间）,不能早于查询时间范围的开始时间，查询时间范围要在三个月之内（开始和结束时间的跨度），不能超过三个月。
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/**
	 * 查询时间范围开始时间（客资创建时间）,不能早于2020-05-01 00:00:00
	 */
	@ApiField("gmt_start")
	private Date gmtStart;

	/**
	 * 分页参数页码，第几页，要大于0，必须是数字
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 分页参数，每页查询数量大小，必须大于0，必须是数字，目前默认20，不能超过20
	 */
	@ApiField("page_size")
	private Long pageSize;

	public Date getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public Date getGmtStart() {
		return this.gmtStart;
	}
	public void setGmtStart(Date gmtStart) {
		this.gmtStart = gmtStart;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
