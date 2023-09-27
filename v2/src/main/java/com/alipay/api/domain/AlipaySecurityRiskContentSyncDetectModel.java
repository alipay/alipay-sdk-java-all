package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 内容风险同步识别对外开放接口
 *
 * @author auto create
 * @since 1.0, 2023-09-19 18:25:58
 */
public class AlipaySecurityRiskContentSyncDetectModel extends AlipayObject {

	private static final long serialVersionUID = 7168629659998662649L;

	/**
	 * 来源渠道，请与蚂蚁业务同学沟通获取
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 送检内容类型
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 用户发表内容，建议对内容中的格式符号、表情符、HTML标签、UBB标签等做过滤，只传递纯文本，以减少误判
	 */
	@ApiListField("data_list")
	@ApiField("string")
	private List<String> dataList;

	/**
	 * 服务码列表
	 */
	@ApiField("products")
	private String products;

	/**
	 * 唯一请求ID
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 租户ID
	 */
	@ApiField("tenants")
	private String tenants;

	/**
	 * 内容发布账号ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public List<String> getDataList() {
		return this.dataList;
	}
	public void setDataList(List<String> dataList) {
		this.dataList = dataList;
	}

	public String getProducts() {
		return this.products;
	}
	public void setProducts(String products) {
		this.products = products;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTenants() {
		return this.tenants;
	}
	public void setTenants(String tenants) {
		this.tenants = tenants;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
