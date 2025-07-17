package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 媒体报表查询接口
 *
 * @author auto create
 * @since 1.0, 2025-04-08 10:04:53
 */
public class AlipayDataDataserviceMediaReportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2581562737113382592L;

	/**
	 * 广告位id
	 */
	@ApiField("ad_pos_id")
	private String adPosId;

	/**
	 * 应用id，需要查询的灯火应用id，非必填参数
	 */
	@ApiField("application_id")
	private String applicationId;

	/**
	 * 数据查询结束日期，时间格式：yyyyMMdd
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 商家pid，非必填参数；type=AGENCY的情况必须传入
	 */
	@ApiField("m_pid")
	private String mPid;

	/**
	 * 当前页码，默认1
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页大小，默认值10，最大1000
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 展位码
	 */
	@ApiField("space_code")
	private String spaceCode;

	/**
	 * 数据查询开始日期，时间格式：yyyyMMdd
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * MERCHANT：商家；AGENCY：服务商
	 */
	@ApiField("type")
	private String type;

	public String getAdPosId() {
		return this.adPosId;
	}
	public void setAdPosId(String adPosId) {
		this.adPosId = adPosId;
	}

	public String getApplicationId() {
		return this.applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getmPid() {
		return this.mPid;
	}
	public void setmPid(String mPid) {
		this.mPid = mPid;
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

	public String getSpaceCode() {
		return this.spaceCode;
	}
	public void setSpaceCode(String spaceCode) {
		this.spaceCode = spaceCode;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
