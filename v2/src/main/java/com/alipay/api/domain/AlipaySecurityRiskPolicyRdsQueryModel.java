package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人机识别服务接口，检查这次行为是人还是机器操作的。
 *
 * @author auto create
 * @since 1.0, 2022-11-23 14:08:13
 */
public class AlipaySecurityRiskPolicyRdsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3542581376941795185L;

	/**
	 * 具体需传递的参数请参考接入文档中的参数列表
https://yuque.antfin-inc.com/tecsec/rds/insertdoc
	 */
	@ApiField("rds_params")
	private String rdsParams;

	public String getRdsParams() {
		return this.rdsParams;
	}
	public void setRdsParams(String rdsParams) {
		this.rdsParams = rdsParams;
	}

}
