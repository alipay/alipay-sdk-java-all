package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询三方应用实例化作业商家小程序列表
 *
 * @author auto create
 * @since 1.0, 2023-05-30 17:37:55
 */
public class AlipayOpenMiniInstantiateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4149654546397983888L;

	/**
	 * 小程序appId
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 小程序名称
	 */
	@ApiField("mini_app_name")
	private String miniAppName;

	/**
	 * 分页页数
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 分页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 小程序模板应用id
	 */
	@ApiField("template_id")
	private String templateId;

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getMiniAppName() {
		return this.miniAppName;
	}
	public void setMiniAppName(String miniAppName) {
		this.miniAppName = miniAppName;
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

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
