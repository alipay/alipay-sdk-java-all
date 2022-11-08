package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关键词位置
 *
 * @author auto create
 * @since 1.0, 2022-05-20 11:34:53
 */
public class DialogueKeyWord extends AlipayObject {

	private static final long serialVersionUID = 2543513575622336948L;

	/**
	 * 高亮关键词位置-单句开始下标位置
例：abcd，b是1位置开始
	 */
	@ApiField("from")
	private Long from;

	/**
	 * 命中结果高亮，备选--单句结束下标位置
例：abcd，b是2位置结束
	 */
	@ApiField("to")
	private Long to;

	public Long getFrom() {
		return this.from;
	}
	public void setFrom(Long from) {
		this.from = from;
	}

	public Long getTo() {
		return this.to;
	}
	public void setTo(Long to) {
		this.to = to;
	}

}
