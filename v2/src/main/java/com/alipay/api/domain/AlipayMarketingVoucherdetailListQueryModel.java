package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户票记录
 *
 * @author auto create
 * @since 1.0, 2022-11-13 19:19:51
 */
public class AlipayMarketingVoucherdetailListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2748894194329342121L;

	/**
	 * 支付宝用户的openid
	 */
	@ApiField("open_id")
	private String openId;

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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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
