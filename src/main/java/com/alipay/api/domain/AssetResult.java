package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料生产订单处理结果
 *
 * @author auto create
 * @since 1.0, 2017-06-30 10:14:58
 */
public class AssetResult extends AlipayObject {

	private static final long serialVersionUID = 4293894321879999865L;

	/**
	 * 订单明细ID
	 */
	@ApiField("assign_item_id")
	private String assignItemId;

	/**
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误描述
	 */
	@ApiField("error_desc")
	private String errorDesc;

	/**
	 * 是否处理成功
	 */
	@ApiField("success")
	private Boolean success;

	public String getAssignItemId() {
		return this.assignItemId;
	}
	public void setAssignItemId(String assignItemId) {
		this.assignItemId = assignItemId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDesc() {
		return this.errorDesc;
	}
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
