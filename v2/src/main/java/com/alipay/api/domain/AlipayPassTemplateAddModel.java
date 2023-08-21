package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡券模板创建
 *
 * @author auto create
 * @since 1.0, 2023-03-20 16:23:51
 */
public class AlipayPassTemplateAddModel extends AlipayObject {

	private static final long serialVersionUID = 3486462342141936175L;

	/**
	 * 模板内容信息，遵循JSON规范，详情参见tpl_content <a href="https://opendocs.alipay.com/open/016d5g">参数详细说明</a>。
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
