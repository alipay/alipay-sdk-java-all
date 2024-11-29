package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 助理首页openapi请求入参
 *
 * @author auto create
 * @since 1.0, 2023-02-06 10:25:16
 */
public class HomeApiRequest extends AlipayObject {

	private static final long serialVersionUID = 5853981692698788437L;

	/**
	 * 业务的类型
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 业务唯一id，比如包裹id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 展示的内容
	 */
	@ApiListField("content")
	@ApiField("home_api_content")
	private List<HomeApiContent> content;

	/**
	 * 节点状态
	 */
	@ApiField("node_code")
	private String nodeCode;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public List<HomeApiContent> getContent() {
		return this.content;
	}
	public void setContent(List<HomeApiContent> content) {
		this.content = content;
	}

	public String getNodeCode() {
		return this.nodeCode;
	}
	public void setNodeCode(String nodeCode) {
		this.nodeCode = nodeCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
