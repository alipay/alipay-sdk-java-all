package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.aigc.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-26 11:41:49
 */
public class AlipayCloudCloudpromoAigcOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2231314985757656271L;

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
	 * 支付宝内部订单id，唯一
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_id")
	private String outBizId;

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

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}
	public String getOutBizId( ) {
		return this.outBizId;
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
