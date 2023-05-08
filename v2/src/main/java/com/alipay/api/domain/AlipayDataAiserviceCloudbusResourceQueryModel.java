package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智慧公交--资源文件
 *
 * @author auto create
 * @since 1.0, 2020-10-21 10:33:34
 */
public class AlipayDataAiserviceCloudbusResourceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8678372136754951772L;

	/**
	 * 按类型查找， 空默认查询所有
	 */
	@ApiField("type")
	private Long type;

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

}
