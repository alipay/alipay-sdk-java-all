package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 碰一下点餐物料申请
 *
 * @author auto create
 * @since 1.0, 2025-05-21 13:51:11
 */
public class AlipayOpenSpNordermaterialsapplyOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5176277738245423675L;

	/**
	 * 用于区分不同渠道openapi申请单，不传时默认 CATERING_SAAS 餐饮saas，具体使用渠道请接入时和产品确认
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 与支付宝约定模版样式后，提供模版编号，接口传入
	 */
	@ApiField("materials_template_code")
	private String materialsTemplateCode;

	/**
	 * 是否测试数据，默认不传为false
	 */
	@ApiField("test_flag")
	private Boolean testFlag;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getMaterialsTemplateCode() {
		return this.materialsTemplateCode;
	}
	public void setMaterialsTemplateCode(String materialsTemplateCode) {
		this.materialsTemplateCode = materialsTemplateCode;
	}

	public Boolean getTestFlag() {
		return this.testFlag;
	}
	public void setTestFlag(Boolean testFlag) {
		this.testFlag = testFlag;
	}

}
