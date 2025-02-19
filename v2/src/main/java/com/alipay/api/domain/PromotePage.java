package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 灯火平台留资页数据结构
 *
 * @author auto create
 * @since 1.0, 2020-09-24 21:16:30
 */
public class PromotePage extends AlipayObject {

	private static final long serialVersionUID = 2311713427231145536L;

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

	/**
	 * 推广页类型: TRADE-交易类;COLLECT_INFO-留资类
	 */
	@ApiField("type")
	private String type;

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

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
