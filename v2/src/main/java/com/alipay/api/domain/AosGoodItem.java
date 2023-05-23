package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * Aos商品数据
 *
 * @author auto create
 * @since 1.0, 2023-04-12 15:00:12
 */
public class AosGoodItem extends AlipayObject {

	private static final long serialVersionUID = 8681192169773814642L;

	/**
	 * data的唯一id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 图片列表
	 */
	@ApiListField("images")
	@ApiField("string")
	private List<String> images;

	/**
	 * item的title
	 */
	@ApiField("title")
	private String title;

	/**
	 * 搜索结果item的trace_id用于关联搜索结果和用户行为
	 */
	@ApiField("trace_id")
	private String traceId;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public List<String> getImages() {
		return this.images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

}
