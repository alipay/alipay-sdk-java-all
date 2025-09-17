package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生成简历授权登录链接
 *
 * @author auto create
 * @since 1.0, 2025-09-08 18:27:39
 */
public class AlipayEbppIndustryJobResumeauthloginurlGetModel extends AlipayObject {

	private static final long serialVersionUID = 7597123192894512669L;

	/**
	 * 外部业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 授权返回链接
	 */
	@ApiField("return_complete_url")
	private String returnCompleteUrl;

	/**
	 * 模版ID
	 */
	@ApiField("template_id")
	private String templateId;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getReturnCompleteUrl() {
		return this.returnCompleteUrl;
	}
	public void setReturnCompleteUrl(String returnCompleteUrl) {
		this.returnCompleteUrl = returnCompleteUrl;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
