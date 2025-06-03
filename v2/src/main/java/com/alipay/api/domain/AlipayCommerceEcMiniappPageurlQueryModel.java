package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业小程序跳链查询
 *
 * @author auto create
 * @since 1.0, 2024-12-05 11:50:16
 */
public class AlipayCommerceEcMiniappPageurlQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5615713492557425977L;

	/**
	 * 页面跳链需要业务属性
	 */
	@ApiField("biz_data")
	private MiniAppPageBizAttrContent bizData;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 当page_type为THIRD_MINI_APP时，需要配合page_id来确认跳转到三方小程序的具体哪个页面
	 */
	@ApiField("page_id")
	private String pageId;

	/**
	 * 页面类型，传需要跳转到具体位置的页面类型，如企业码小程序列表页，或者三方小程序某个页面
	 */
	@ApiField("page_type")
	private String pageType;

	public MiniAppPageBizAttrContent getBizData() {
		return this.bizData;
	}
	public void setBizData(MiniAppPageBizAttrContent bizData) {
		this.bizData = bizData;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getPageId() {
		return this.pageId;
	}
	public void setPageId(String pageId) {
		this.pageId = pageId;
	}

	public String getPageType() {
		return this.pageType;
	}
	public void setPageType(String pageType) {
		this.pageType = pageType;
	}

}
