package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智慧公交--资源文件
 *
 * @author auto create
 * @since 1.0, 2020-05-07 15:30:21
 */
public class AlipayDataAiserviceCloudbusResourceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7293766479981925937L;

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
