package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 任务模版发布
 *
 * @author auto create
 * @since 1.0, 2022-04-11 19:43:24
 */
public class AlipayCommerceTaskTemplatePublishModel extends AlipayObject {

	private static final long serialVersionUID = 6596525488663948623L;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 任务模版id
	 */
	@ApiField("template_id")
	private String templateId;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
