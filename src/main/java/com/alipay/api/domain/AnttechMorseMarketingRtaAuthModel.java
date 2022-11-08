package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 摩卡营销活动人群权益预授权
 *
 * @author auto create
 * @since 1.0, 2022-10-31 11:46:40
 */
public class AnttechMorseMarketingRtaAuthModel extends AlipayObject {

	private static final long serialVersionUID = 7317283693792454158L;

	/**
	 * 活动id描述用户使用这个活动消耗预算，该活动必须是被场景侧曝光过的活动
	 */
	@ApiListField("campaign_ids")
	@ApiField("string")
	private List<String> campaignIds;

	/**
	 * mobile_sha_256标识用户唯一信息，通过用户手机号SHA256 哈希后获得
	 */
	@ApiField("mobile_sha_256")
	private String mobileSha256;

	/**
	 * 明确操作类型，指定本次请求是冻结或者是解冻操作
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 业务请求唯一标识，用于区别每次请求的不同，可以设置成用户的订单号，接口会用该值进行权益冻结和解冻
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 资源位信息确定商户投放场景，由摩斯同学配置并分配给调用方
	 */
	@ApiField("resource_id")
	private String resourceId;

	public List<String> getCampaignIds() {
		return this.campaignIds;
	}
	public void setCampaignIds(List<String> campaignIds) {
		this.campaignIds = campaignIds;
	}

	public String getMobileSha256() {
		return this.mobileSha256;
	}
	public void setMobileSha256(String mobileSha256) {
		this.mobileSha256 = mobileSha256;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResourceId() {
		return this.resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

}
