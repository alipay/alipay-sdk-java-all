package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁与闲鱼进行联防联控，输出的参数值
 *
 * @author auto create
 * @since 1.0, 2024-07-31 10:02:52
 */
public class DataOutputParam extends AlipayObject {

	private static final long serialVersionUID = 6797231294752424955L;

	/**
	 * 不同的枚举对应的值不一样，如果是风险标签类是Y或N，用户的异常状态、url网址等信息
	 */
	@ApiField("content")
	private String content;

	/**
	 * 只是一个枚举值，譬如00代表是否风险灰名单  01代表是否有新签风险 02 代表赌博庄家等
	 */
	@ApiField("property")
	private String property;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getProperty() {
		return this.property;
	}
	public void setProperty(String property) {
		this.property = property;
	}

}
