package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 灯火平台留资页数据结构
 *
 * @author auto create
 * @since 1.0, 2020-05-11 14:38:08
 */
public class PromotePage extends AlipayObject {

	private static final long serialVersionUID = 5596862446759677793L;

	/**
	 * 留资页页面ID
	 */
	@ApiField("page_id")
	private String pageId;

	/**
	 * 留资页名称
	 */
	@ApiField("page_name")
	private String pageName;

	/**
	 * 留资页状态
	 */
	@ApiField("page_status")
	private String pageStatus;

	public String getPageId() {
		return this.pageId;
	}
	public void setPageId(String pageId) {
		this.pageId = pageId;
	}

	public String getPageName() {
		return this.pageName;
	}
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getPageStatus() {
		return this.pageStatus;
	}
	public void setPageStatus(String pageStatus) {
		this.pageStatus = pageStatus;
	}

}
