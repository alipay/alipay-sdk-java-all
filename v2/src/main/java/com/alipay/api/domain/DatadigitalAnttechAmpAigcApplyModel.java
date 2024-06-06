package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * aigc服务调用
 *
 * @author auto create
 * @since 1.0, 2024-05-16 11:32:29
 */
public class DatadigitalAnttechAmpAigcApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8342637419554562141L;

	/**
	 * 生成图片或视频的文本或文件id
	 */
	@ApiField("context")
	private String context;

	/**
	 * 像素高
	 */
	@ApiField("height")
	private Long height;

	/**
	 * aigc模式
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 参数数据
	 */
	@ApiField("param_data")
	private String paramData;

	/**
	 * 系统幂等请求id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 企业社会信用代码
	 */
	@ApiField("social_code")
	private String socialCode;

	/**
	 * 风格
	 */
	@ApiField("style")
	private String style;

	/**
	 * 像素宽
	 */
	@ApiField("width")
	private Long width;

	public String getContext() {
		return this.context;
	}
	public void setContext(String context) {
		this.context = context;
	}

	public Long getHeight() {
		return this.height;
	}
	public void setHeight(Long height) {
		this.height = height;
	}

	public String getMode() {
		return this.mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getParamData() {
		return this.paramData;
	}
	public void setParamData(String paramData) {
		this.paramData = paramData;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSocialCode() {
		return this.socialCode;
	}
	public void setSocialCode(String socialCode) {
		this.socialCode = socialCode;
	}

	public String getStyle() {
		return this.style;
	}
	public void setStyle(String style) {
		this.style = style;
	}

	public Long getWidth() {
		return this.width;
	}
	public void setWidth(Long width) {
		this.width = width;
	}

}
