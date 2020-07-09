package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 检测任务列表
 *
 * @author auto create
 * @since 1.0, 2019-09-03 21:34:26
 */
public class SpiDetectionTask extends AlipayObject {

	private static final long serialVersionUID = 4262219764735871929L;

	/**
	 * 待检测文本内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 检测任务编号
	 */
	@ApiField("data_id")
	private String dataId;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

}
