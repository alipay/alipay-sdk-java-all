package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OB业务发送验证码
 *
 * @author auto create
 * @since 1.0, 2021-12-03 10:45:47
 */
public class AnttechOceanbaseVerificationcodeSendModel extends AlipayObject {

	private static final long serialVersionUID = 1596248631322322839L;

	/**
	 * 用户通行证id
	 */
	@ApiField("passport_id")
	private String passportId;

	/**
	 * 场景码枚举：CLOUD_DELETE_CLUSTER多云删除集群。
	 */
	@ApiField("scene")
	private String scene;

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
