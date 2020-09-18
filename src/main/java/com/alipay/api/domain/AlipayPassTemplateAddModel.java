package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡券模板创建
 *
 * @author auto create
 * @since 1.0, 2020-09-04 17:07:30
 */
public class AlipayPassTemplateAddModel extends AlipayObject {

	private static final long serialVersionUID = 3853545375245385529L;

	/**
	 * 模板内容信息，遵循JSON规范，详情参见tpl_content参数说明：https://doc.open.alipay.com/doc2/detail.htm?treeId=193&articleId=105249&docType=1#tpl_content
	 */
	@ApiField("tpl_content")
	private String tplContent;

	/**
	 * 商户用于控制模版的唯一性。（可以使用时间戳保证唯一性）
	 */
	@ApiField("unique_id")
	private String uniqueId;

	public String getTplContent() {
		return this.tplContent;
	}
	public void setTplContent(String tplContent) {
		this.tplContent = tplContent;
	}

	public String getUniqueId() {
		return this.uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

}
