package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 市场风险平台风险因子计算
 *
 * @author auto create
 * @since 1.0, 2019-04-22 11:29:46
 */
public class AlipayAccountFinriskMarkriskDatafactorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3718156176146382684L;

	/**
	 * Json格式表示市场风险损益计算入参
	 */
	@ApiField("data_factor_build_req")
	private String dataFactorBuildReq;

	public String getDataFactorBuildReq() {
		return this.dataFactorBuildReq;
	}
	public void setDataFactorBuildReq(String dataFactorBuildReq) {
		this.dataFactorBuildReq = dataFactorBuildReq;
	}

}
