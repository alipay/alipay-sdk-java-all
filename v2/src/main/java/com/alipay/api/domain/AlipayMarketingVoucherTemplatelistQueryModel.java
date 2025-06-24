package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询券模板列表
 *
 * @author auto create
 * @since 1.0, 2024-12-24 15:40:46
 */
public class AlipayMarketingVoucherTemplatelistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1332266529919862311L;

	/**
	 * 查询结束时间。即查询 create_start_time 日期至本参数指定日期间创建的券模板，时间格式为：yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("create_end_time")
	private Date createEndTime;

	/**
	 *  查询开始时间。即查询本参数指定日期至 create_end_time 日期间创建的券模板，时间格式为：yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("create_start_time")
	private Date createStartTime;

	/**
	 * 页码，必须为大于0的整数， 1表示第一页，2表示第2页，依次类推。
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页记录条数，必须为大于0的整数，最大值为30
	 */
	@ApiField("page_size")
	private Long pageSize;

	public Date getCreateEndTime() {
		return this.createEndTime;
	}
	public void setCreateEndTime(Date createEndTime) {
		this.createEndTime = createEndTime;
	}

	public Date getCreateStartTime() {
		return this.createStartTime;
	}
	public void setCreateStartTime(Date createStartTime) {
		this.createStartTime = createStartTime;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
