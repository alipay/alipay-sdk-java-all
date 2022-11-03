package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自建推广页留资数据查询
 *
 * @author auto create
 * @since 1.0, 2022-10-25 15:34:16
 */
public class AlipayDataDataserviceAdPromotepageDownloadModel extends AlipayObject {

	private static final long serialVersionUID = 5843751581622485867L;

	/**
	 * 代理商访问灯火平台的token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 留资结束日期，格式：yyyy-mm-dd；不能晚于当天
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 分页参数之页数，从1开始
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 分页参数之每页大小，最大1000
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 商家标志
	 */
	@ApiField("principal_tag")
	private String principalTag;

	/**
	 * 推广页id
	 */
	@ApiField("promote_page_id")
	private Long promotePageId;

	/**
	 * 留资开始日期，格式：yyyy-mm-dd，不能早于30天前
	 */
	@ApiField("start_date")
	private String startDate;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
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

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

	public Long getPromotePageId() {
		return this.promotePageId;
	}
	public void setPromotePageId(Long promotePageId) {
		this.promotePageId = promotePageId;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
