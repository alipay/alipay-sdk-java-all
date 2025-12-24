package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内容安全需要进行识别的内容类，用于内容风险识别API中的请求参数：
data内容可以包含几类: 文本，图片，视频，音频
 *
 * @author auto create
 * @since 1.0, 2022-11-22 14:50:48
 */
public class InfoSecAnalyzeSyncContent extends AlipayObject {

	private static final long serialVersionUID = 1478748945874252865L;

	/**
	 * 业务id
	 */
	@ApiField("business_id")
	private String businessId;

	/**
	 * 业务过检分类,如果没有勾选分类提交返回参数错误，您可指定多个垃圾类别进行机器检测，多个垃圾类别以逗号分隔（"porn,terrorism"）
	 */
	@ApiField("check_labels")
	private String checkLabels;

	/**
	 * 用户发表内容
	 */
	@ApiField("data")
	private String data;

	/**
	 * 数据唯一标识，能够根据该值定位到该条数据
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 由内容安全服务分配的产品账号标识
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 发表时间，UNIX 时间戳(毫秒值)
	 */
	@ApiField("publish_time")
	private String publishTime;

	/**
	 * 业务请求ID
	 */
	@ApiField("request_id")
	private String requestId;

	public String getBusinessId() {
		return this.businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getCheckLabels() {
		return this.checkLabels;
	}
	public void setCheckLabels(String checkLabels) {
		this.checkLabels = checkLabels;
	}

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getPublishTime() {
		return this.publishTime;
	}
	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
