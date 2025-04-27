package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 碰一下点餐物料申请
 *
 * @author auto create
 * @since 1.0, 2025-04-18 15:30:49
 */
public class AlipayOpenSpNordermaterialsapplyOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5725783946939144444L;

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
