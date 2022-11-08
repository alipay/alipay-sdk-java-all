package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 初始化交互式风控产品
 *
 * @author auto create
 * @since 1.0, 2022-04-07 19:37:26
 */
public class AlipaySecurityProdInteractiveprodInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 7842551988385982569L;

	/**
	 * 业务Id，全局唯一id，可以是uuid
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务参数，JSON格式
	 */
	@ApiField("biz_request_params")
	private String bizRequestParams;

	/**
	 * 是否需要推荐，若为false，需在biz_request_params中传递productList
	 */
	@ApiField("need_consult")
	private Boolean needConsult;

	/**
	 * 场景Id，格式为systemName_bizProduct_bizProdNode_accessChannel，标识系统-产品-产品节点-接入渠道
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 租户id
	 */
	@ApiField("tenant_id")
	private String tenantId;

	/**
	 * 蚂蚁统一会员ID
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

	public Boolean getNeedConsult() {
		return this.needConsult;
	}
	public void setNeedConsult(Boolean needConsult) {
		this.needConsult = needConsult;
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
