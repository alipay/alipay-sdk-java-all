package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询权益中心用户填写表单
 *
 * @author auto create
 * @since 1.0, 2022-10-09 14:52:50
 */
public class ZhimaCreditEpLixinUserfillformQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6361588739653692988L;

	/**
	 * 表单提交结束时间，与表单开始时间组合前开后闭[start_time,end_time)
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 企业信用立信平台问卷的问卷ID
	 */
	@ApiField("form_id")
	private Long formId;

	/**
	 * 支付宝用户openId列表
	 */
	@ApiListField("open_id_list")
	@ApiField("string")
	private List<String> openIdList;

	/**
	 * 分页请求的页码，从1开始
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/**
	 * 分页请求单页内数据个数，取值范围1-100
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 表单提交开始时间，与表单结束时间组合前开后闭[start_time,end_time)
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 支付宝用户id
	 */
	@ApiListField("user_id_list")
	@ApiField("string")
	private List<String> userIdList;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Long getFormId() {
		return this.formId;
	}
	public void setFormId(Long formId) {
		this.formId = formId;
	}

	public List<String> getOpenIdList() {
		return this.openIdList;
	}
	public void setOpenIdList(List<String> openIdList) {
		this.openIdList = openIdList;
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

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public List<String> getUserIdList() {
		return this.userIdList;
	}
	public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;
	}

}
