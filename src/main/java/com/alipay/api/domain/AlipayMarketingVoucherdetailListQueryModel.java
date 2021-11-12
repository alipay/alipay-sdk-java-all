package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户票记录
 *
 * @author auto create
 * @since 1.0, 2021-10-14 16:19:36
 */
public class AlipayMarketingVoucherdetailListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2219548338623316334L;

	/**
	 * 当前第几页，从1开始
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页返回的数据量大小，取值范围1~50
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 券模板id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

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

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
