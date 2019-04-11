package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝pass更新模版接口
 *
 * @author auto create
 * @since 1.0, 2019-03-12 15:09:42
 */
public class AlipayPassTemplateUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 3471793387166648795L;

	/**
	 * 模板内容信息，遵循JSON规范，详情参见tpl_content参数说明:https://doc.open.alipay.com/doc2/detail.htm?treeId=193&articleId=105249&docType=1#tpl_content
	 */
	@ApiField("tpl_content")
	private String tplContent;

	/**
	 * 更新的模板ID，即调用模板创建接口时返回的tpl_id。
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
