package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 当前对话多个视频
 *
 * @author auto create
 * @since 1.0, 2025-07-11 14:46:41
 */
public class CurrentChatVideos extends AlipayObject {

	private static final long serialVersionUID = 1488734354367157758L;

	/**
	 * 文件类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 视频详细信息
	 */
	@ApiListField("value")
	@ApiField("video_value_request")
	private List<VideoValueRequest> value;

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public List<VideoValueRequest> getValue() {
		return this.value;
	}
	public void setValue(List<VideoValueRequest> value) {
		this.value = value;
	}

}
