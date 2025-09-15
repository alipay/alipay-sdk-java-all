package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 姓名生僻字联想接口
 *
 * @author auto create
 * @since 1.0, 2023-08-23 14:19:57
 */
public class AlipayUserCertifyRarenameAssociateModel extends AlipayObject {

	private static final long serialVersionUID = 8443174939512948213L;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 主体id，打日志用于方便排查问题用，可传业务id，没业务id的可传一个随机生成的uuid。
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
