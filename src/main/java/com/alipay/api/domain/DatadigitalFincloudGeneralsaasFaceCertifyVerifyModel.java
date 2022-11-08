package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸核身服务开始认证
 *
 * @author auto create
 * @since 1.0, 2022-02-28 11:07:35
 */
public class DatadigitalFincloudGeneralsaasFaceCertifyVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 8611568169854358561L;

	/**
	 * 本次申请操作的唯一标识，由开放认证初始化接口调用后生成，后续的操作都需要用到
	 */
	@ApiField("certify_id")
	private String certifyId;

	public String getCertifyId() {
		return this.certifyId;
	}
	public void setCertifyId(String certifyId) {
		this.certifyId = certifyId;
	}

}
