package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OB业务校验验证码
 *
 * @author auto create
 * @since 1.0, 2021-12-03 10:46:02
 */
public class AnttechOceanbaseVerificationcodeVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 3275259314122143737L;

	/**
	 * 验证码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 验证完是否立刻失效该验证码
	 */
	@ApiField("invalid")
	private Boolean invalid;

	/**
	 * 用户通行证id
	 */
	@ApiField("passport_id")
	private String passportId;

	/**
	 * 场景码枚举：CLOUD_DELETE_CLUSTER多云删除集群
	 */
	@ApiField("scene")
	private String scene;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getInvalid() {
		return this.invalid;
	}
	public void setInvalid(Boolean invalid) {
		this.invalid = invalid;
	}

	public String getPassportId() {
		return this.passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
