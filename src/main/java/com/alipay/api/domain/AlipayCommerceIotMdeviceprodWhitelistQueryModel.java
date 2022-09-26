package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询IoT白名单配置信息
 *
 * @author auto create
 * @since 1.0, 2021-12-21 11:26:42
 */
public class AlipayCommerceIotMdeviceprodWhitelistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6484658741172857881L;

	/**
	 * 白名单所属应用的appID
	 */
	@ApiField("app_project_id")
	private String appProjectId;

	/**
	 * 白名单分组类型。
BIZ_TYPE：表示已IoT业务类型划分的用户白名单；
URL：表示已URL划分的用户白名单；
SERVICE_ID：表示已接口ID划分的用户白名单；
	 */
	@ApiField("group_type")
	private String groupType;

	/**
	 * 白名单分组值，与白名单分组类型相关。
白名单分组类型为IoT业务类型时，白名单分组值为对应的某个具体的业务类型；
白名单分组类型为URL时，白名单分组值为对应的具体的URL字符串；
白名单分组类型为服务ID时，白名单分组值为对应的具体的某个服务的ID；
	 */
	@ApiField("group_value")
	private String groupValue;

	/**
	 * 用户标识类型,表示用户ID的类型。
ALIPAY_USER: 支付宝PID;
	 */
	@ApiField("user_identify_type")
	private String userIdentifyType;

	/**
	 * 用于标识值，与user_identify_type相关，user_identify_type为ALIPAY_USER时，该值表示用户PID。
	 */
	@ApiField("user_identify_value")
	private String userIdentifyValue;

	public String getAppProjectId() {
		return this.appProjectId;
	}
	public void setAppProjectId(String appProjectId) {
		this.appProjectId = appProjectId;
	}

	public String getGroupType() {
		return this.groupType;
	}
	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}

	public String getGroupValue() {
		return this.groupValue;
	}
	public void setGroupValue(String groupValue) {
		this.groupValue = groupValue;
	}

	public String getUserIdentifyType() {
		return this.userIdentifyType;
	}
	public void setUserIdentifyType(String userIdentifyType) {
		this.userIdentifyType = userIdentifyType;
	}

	public String getUserIdentifyValue() {
		return this.userIdentifyValue;
	}
	public void setUserIdentifyValue(String userIdentifyValue) {
		this.userIdentifyValue = userIdentifyValue;
	}

}
