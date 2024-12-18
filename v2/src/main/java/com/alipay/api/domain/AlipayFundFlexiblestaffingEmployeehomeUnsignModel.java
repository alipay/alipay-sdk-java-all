package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 灵工卡解约
 *
 * @author auto create
 * @since 1.0, 2024-01-26 14:15:30
 */
public class AlipayFundFlexiblestaffingEmployeehomeUnsignModel extends AlipayObject {

	private static final long serialVersionUID = 5516859399426252193L;

	/**
	 * 业务场景码、固定值：EMPLOYEE_HOME_MANAGE
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 要解约的uid，
服务归属方的uid
	 */
	@ApiField("principal_open_id")
	private String principalOpenId;

	/**
	 * 要解约的uid，
服务归属方的uid
	 */
	@ApiField("principal_user_id")
	private String principalUserId;

	/**
	 * 业务产品码，固定值：FLEXIBLE_EMPLOYMENT_SERVICE
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 要解约的服务id，
依赖解约的服务类型，如果类型是RENT_SERVICE，则传服务id，类型是RENT_CONTRACT，则传协议id
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 解约的服务类型
RENT_SERVICE：租赁服务（服务和服务下所有生效协议都会被解除）
RENT_CONTRACT：租赁协议（仅协议被解除）
	 */
	@ApiField("terminate_type")
	private String terminateType;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getPrincipalOpenId() {
		return this.principalOpenId;
	}
	public void setPrincipalOpenId(String principalOpenId) {
		this.principalOpenId = principalOpenId;
	}

	public String getPrincipalUserId() {
		return this.principalUserId;
	}
	public void setPrincipalUserId(String principalUserId) {
		this.principalUserId = principalUserId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getTerminateType() {
		return this.terminateType;
	}
	public void setTerminateType(String terminateType) {
		this.terminateType = terminateType;
	}

}
