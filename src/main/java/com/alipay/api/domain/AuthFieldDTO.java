package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户信息申请记录DTO
 *
 * @author auto create
 * @since 1.0, 2020-09-21 17:21:30
 */
public class AuthFieldDTO extends AlipayObject {

	private static final long serialVersionUID = 3475997251546889617L;

	/**
	 * 接口英文名称
	 */
	@ApiField("api_name")
	private String apiName;

	/**
	 * 接口字段英文名称
	 */
	@ApiField("field_name")
	private String fieldName;

	/**
	 * 接口归属的功能code
	 */
	@ApiField("package_code")
	private String packageCode;

	/**
	 * 驳回原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * AUDIT 审核中，AGREE通过，REJECT驳回，INVALID无效（isv代申请场景)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 用户应用app_id
	 */
	@ApiField("user_app_id")
	private String userAppId;

	public String getApiName() {
		return this.apiName;
	}
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public String getFieldName() {
		return this.fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getPackageCode() {
		return this.packageCode;
	}
	public void setPackageCode(String packageCode) {
		this.packageCode = packageCode;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserAppId() {
		return this.userAppId;
	}
	public void setUserAppId(String userAppId) {
		this.userAppId = userAppId;
	}

}
