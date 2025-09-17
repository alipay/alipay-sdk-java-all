package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 姓名生僻字判断
 *
 * @author auto create
 * @since 1.0, 2023-08-23 14:18:26
 */
public class AlipayUserCertifyRarenameDetectModel extends AlipayObject {

	private static final long serialVersionUID = 7884555881225817464L;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 主体id，打日志用，方便排查问题时定位日志。可传业务id、随机生成的uuid等。
	 */
	@ApiField("principal_id")
	private String principalId;

	/**
	 * 用于标识这笔请求的业务场景，业务可以根据实际场景自己定义取值，比如支付宝认证"alipay_certify"。
	 */
	@ApiField("scene")
	private String scene;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
