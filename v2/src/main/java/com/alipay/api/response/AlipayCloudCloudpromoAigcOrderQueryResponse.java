package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.aigc.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-13 13:11:46
 */
public class AlipayCloudCloudpromoAigcOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4334664689436741722L;

	/** 
	 * 当前订单状态中文描述
	 */
	@ApiField("desc")
	private String desc;

	/** 
	 * 图像处理结果，未完成时结果为空
	 */
	@ApiListField("images")
	@ApiField("string")
	private List<String> images;

	/** 
	 * 当前订单状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 文字处理结果，未完成时结果为空
	 */
	@ApiListField("texts")
	@ApiField("string")
	private List<String> texts;

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc( ) {
		return this.desc;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}
	public List<String> getImages( ) {
		return this.images;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTexts(List<String> texts) {
		this.texts = texts;
	}
	public List<String> getTexts( ) {
		return this.texts;
	}

}
