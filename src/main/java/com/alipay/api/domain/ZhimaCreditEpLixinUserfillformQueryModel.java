package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询权益中心用户填写表单
 *
 * @author auto create
 * @since 1.0, 2022-06-01 15:15:36
 */
public class ZhimaCreditEpLixinUserfillformQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1241449827315298214L;

	/**
	 * 企业信用立信平台问卷的问卷ID
	 */
	@ApiField("form_id")
	private Long formId;

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
	 * 支付宝用户id
	 */
	@ApiListField("user_id_list")
	@ApiField("string")
	private List<String> userIdList;

	public Long getFormId() {
		return this.formId;
	}
	public void setFormId(Long formId) {
		this.formId = formId;
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

	public List<String> getUserIdList() {
		return this.userIdList;
	}
	public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;
	}

}
