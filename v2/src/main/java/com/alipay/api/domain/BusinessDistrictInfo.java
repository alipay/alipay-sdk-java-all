package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈信息
 *
 * @author auto create
 * @since 1.0, 2025-02-11 14:59:22
 */
public class BusinessDistrictInfo extends AlipayObject {

	private static final long serialVersionUID = 2114695579729931471L;

	/**
	 * 是否可被绑定;值是false,unbindable_error_code和unbindable_error_msg会有对应不可绑定的错误code和错误信息
	 */
	@ApiField("bindable")
	private Boolean bindable;

	/**
	 * 商圈ID
	 */
	@ApiField("business_district_id")
	private String businessDistrictId;

	/**
	 * 商圈名称
	 */
	@ApiField("business_district_name")
	private String businessDistrictName;

	/**
	 * 不可绑定错误码
	 */
	@ApiField("unbindable_error_code")
	private String unbindableErrorCode;

	/**
	 * 不可绑定错误码描述
	 */
	@ApiField("unbindable_error_msg")
	private String unbindableErrorMsg;

	public Boolean getBindable() {
		return this.bindable;
	}
	public void setBindable(Boolean bindable) {
		this.bindable = bindable;
	}

	public String getBusinessDistrictId() {
		return this.businessDistrictId;
	}
	public void setBusinessDistrictId(String businessDistrictId) {
		this.businessDistrictId = businessDistrictId;
	}

	public String getBusinessDistrictName() {
		return this.businessDistrictName;
	}
	public void setBusinessDistrictName(String businessDistrictName) {
		this.businessDistrictName = businessDistrictName;
	}

	public String getUnbindableErrorCode() {
		return this.unbindableErrorCode;
	}
	public void setUnbindableErrorCode(String unbindableErrorCode) {
		this.unbindableErrorCode = unbindableErrorCode;
	}

	public String getUnbindableErrorMsg() {
		return this.unbindableErrorMsg;
	}
	public void setUnbindableErrorMsg(String unbindableErrorMsg) {
		this.unbindableErrorMsg = unbindableErrorMsg;
	}

}
