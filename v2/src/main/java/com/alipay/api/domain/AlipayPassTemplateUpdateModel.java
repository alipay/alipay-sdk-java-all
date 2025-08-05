package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝pass更新模版接口
 *
 * @author auto create
 * @since 1.0, 2023-03-20 16:24:12
 */
public class AlipayPassTemplateUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 8514896269378872482L;

	/**
	 * 模板内容信息，遵循JSON规范，详情参见tpl_content <a href="https://opendocs.alipay.com/open/016d5g">参数详细说明</a>。
	 */
	@ApiField("tpl_content")
	private String tplContent;

	/**
	 * 支付宝pass模版ID。通过<a href="https://opendocs.alipay.com/apis/api_24/alipay.pass.template.add">alipay.pass.template.add</a>(卡券模板创建接口)创建模板后返回的tpl_id。
	 */
	@ApiField("tpl_id")
	private String tplId;

	public String getTplContent() {
		return this.tplContent;
	}
	public void setTplContent(String tplContent) {
		this.tplContent = tplContent;
	}

	public String getTplId() {
		return this.tplId;
	}
	public void setTplId(String tplId) {
		this.tplId = tplId;
	}

}
