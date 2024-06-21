package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 初始化交互式风控产品
 *
 * @author auto create
 * @since 1.0, 2023-08-15 10:44:12
 */
public class AlipaySecurityProdInteractiveprodInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 1279967594579391699L;

	/**
	 * 业务id，标识唯一一次调用，全局唯一，可以是uuid
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务参数，JSON格式
	 */
	@ApiField("biz_request_params")
	private String bizRequestParams;

	/**
	 * isv方的客户的appId
当服务商自身是isv，代第三方客户调用风险咨询接口时，需要传入第三方客户的小程序appId
	 */
	@ApiField("customer_app_id")
	private String customerAppId;

	/**
	 * 是否走策略推荐，若为true，则由策略动态决策，默认为false
	 */
	@ApiField("need_consult")
	private Boolean needConsult;

	/**
	 * 用户（user_id）在应用（appId）下的唯一用户标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 场景id，格式为systemName_bizProduct_bizProdNode_accessChannel，标识系统-产品-产品节点-接入渠道
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 租户id，用以区分各商户，例如公司名称英文缩写
	 */
	@ApiField("tenant_id")
	private String tenantId;

	/**
	 * 用户id，用以标识单个用户，可以为用户支付宝账号
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizRequestParams() {
		return this.bizRequestParams;
	}
	public void setBizRequestParams(String bizRequestParams) {
		this.bizRequestParams = bizRequestParams;
	}

	public String getCustomerAppId() {
		return this.customerAppId;
	}
	public void setCustomerAppId(String customerAppId) {
		this.customerAppId = customerAppId;
	}

	public Boolean getNeedConsult() {
		return this.needConsult;
	}
	public void setNeedConsult(Boolean needConsult) {
		this.needConsult = needConsult;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
