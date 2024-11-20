package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建数据查询任务
 *
 * @author auto create
 * @since 1.0, 2024-09-13 22:01:17
 */
public class AlipayCommerceTransportChargerSiteselectionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2735435793786348843L;

	/**
	 * 数据计算任务条件
	 */
	@ApiField("site_selection_param")
	private SiteSelectionParam siteSelectionParam;

	/**
	 * 数据计算任务模板编码，请按需求传入指定枚举类型传值
	 */
	@ApiField("template_code")
	private String templateCode;

	public SiteSelectionParam getSiteSelectionParam() {
		return this.siteSelectionParam;
	}
	public void setSiteSelectionParam(SiteSelectionParam siteSelectionParam) {
		this.siteSelectionParam = siteSelectionParam;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

}
