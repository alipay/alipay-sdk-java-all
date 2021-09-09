package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序列表查询-根据开发者ID查询
 *
 * @author auto create
 * @since 1.0, 2021-06-21 10:41:56
 */
public class AlipayOpenMiniInnerbaseinfoListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6895647846826717798L;

	/**
	 * 普通小程序/插件/模板
	 */
	@ApiField("app_sub_type")
	private String appSubType;

	/**
	 * 开发者ID
	 */
	@ApiField("developer_id")
	private String developerId;

	/**
	 * 租户编码
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 页数-0开始
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页个数
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getAppSubType() {
		return this.appSubType;
	}
	public void setAppSubType(String appSubType) {
		this.appSubType = appSubType;
	}

	public String getDeveloperId() {
		return this.developerId;
	}
	public void setDeveloperId(String developerId) {
		this.developerId = developerId;
	}

	public String getInstCode() {
		return this.instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
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
