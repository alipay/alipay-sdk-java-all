package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 内容风险同步识别对外开放接口
 *
 * @author auto create
 * @since 1.0, 2024-01-11 17:56:22
 */
public class AlipaySecurityRiskContentSyncDetectModel extends AlipayObject {

	private static final long serialVersionUID = 7121137237322289936L;

	/**
	 * 来源渠道，按照实际申请开通的产品权限相应传值：
Riskgo内容风险识别：tinyapp-eco-open
小程序云内容风险识别：miniappcloud（文本），miniappcloud-oss（图片OSS）
数科内容风险识别：digital-tech（数科生产），digital-tech-poc（数科POC）
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 送检内容类型枚举值：
图片:PICTURE，文本:TEXT
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 用户发表内容，建议对内容中的格式符号、表情符、HTML标签、UBB标签等做过滤，只传递纯文本，以减少误判（当前仅支持单图调用，多图调用待后续升级使用），当前接口仅支持单一内容传入。
	 */
	@ApiListField("data_list")
	@ApiField("string")
	private List<String> dataList;

	/**
	 * OPENID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 不同客户可能存在差异，按实际检测需求传值即可，当前支持的检测服务码：TJ_POLITICS_MC：敏感；TJ_PORN_MC：色情；TJ_ILLEGAL_MC：违禁；TJ_TERRORISM_MC：暴恐，TJ_ABUSES_MC：谩骂，其他需求请与蚂蚁内容安全客户经理沟通获取
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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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
