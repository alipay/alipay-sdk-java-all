package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 图像质量打分接口
 *
 * @author auto create
 * @since 1.0, 2019-09-02 16:44:30
 */
public class AlipayDataIotdataImageaestheticBaiQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8212832375997413619L;

	/**
	 * 用于标识不同的业务方
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 用于标识当次的图片base64数据
	 */
	@ApiField("image_base_64")
	private String imageBase64;

	/**
	 * 图片的oss url地址
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 用于标识当次请求
	 */
	@ApiField("trace_id")
	private String traceId;

	/**
	 * url 或 base64
	 */
	@ApiField("type")
	private String type;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getImageBase64() {
		return this.imageBase64;
	}
	public void setImageBase64(String imageBase64) {
		this.imageBase64 = imageBase64;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
