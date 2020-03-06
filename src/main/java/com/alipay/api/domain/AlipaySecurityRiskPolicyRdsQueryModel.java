package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人机识别服务接口，检查这次行为是人还是机器操作的。
 *
 * @author auto create
 * @since 1.0, 2017-11-14 15:00:33
 */
public class AlipaySecurityRiskPolicyRdsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4611313224725499644L;

	/**
	 * 参数名称：RDS采集的行为数据；非唯一；参数作用：RDS系统通过行为数据做人机识别；如何获取：客户端集成RDS的SDK后自动会获取到该数据。
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
