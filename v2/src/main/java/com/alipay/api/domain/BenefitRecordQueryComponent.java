package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益流水查询组件
 *
 * @author auto create
 * @since 1.0, 2024-08-02 10:17:52
 */
public class BenefitRecordQueryComponent extends AlipayObject {

	private static final long serialVersionUID = 1683365329428295774L;

	/**
	 * 查询结束时间
	 */
	@ApiField("end_query_date")
	private Date endQueryDate;

	/**
	 * 玩法模版编码
	 */
	@ApiField("ldp_code")
	private String ldpCode;

	/**
	 * 分页页数，默认为1
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/**
	 * 分页大小，默认为10条记录
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 权益来源标识，非固定值，由业务运营定义
	 */
	@ApiField("source")
	private String source;

	/**
	 * 查询开始时间
	 */
	@ApiField("start_query_date")
	private Date startQueryDate;

	public Date getEndQueryDate() {
		return this.endQueryDate;
	}
	public void setEndQueryDate(Date endQueryDate) {
		this.endQueryDate = endQueryDate;
	}

	public String getLdpCode() {
		return this.ldpCode;
	}
	public void setLdpCode(String ldpCode) {
		this.ldpCode = ldpCode;
	}

	public Long getPageIndex() {
		return this.pageIndex;
	}
	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public Date getStartQueryDate() {
		return this.startQueryDate;
	}
	public void setStartQueryDate(Date startQueryDate) {
		this.startQueryDate = startQueryDate;
	}

}
