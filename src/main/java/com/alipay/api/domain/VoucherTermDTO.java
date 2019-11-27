package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券使用说明
 *
 * @author auto create
 * @since 1.0, 2016-05-01 19:04:17
 */
public class VoucherTermDTO extends AlipayObject {

	private static final long serialVersionUID = 8887369883197697395L;

	/**
	 * 说明信息
	 */
	@ApiListField("descriptions")
	@ApiField("string")
	private List<String> descriptions;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	public List<String> getDescriptions() {
		return this.descriptions;
	}
	public void setDescriptions(List<String> descriptions) {
		this.descriptions = descriptions;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
