package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景金融贷款利率基于LPR基准利率浮动信息查询接口
 *
 * @author auto create
 * @since 1.0, 2020-12-24 15:54:31
 */
public class MybankCreditSceneprodLprQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3234878882562638763L;

	/**
	 * 贷款方案上贷款年利率为16.2%，则查询基于LPR基准利率浮动数据时，参数为0.162
	 */
	@ApiField("loan_rate")
	private String loanRate;

	public String getLoanRate() {
		return this.loanRate;
	}
	public void setLoanRate(String loanRate) {
		this.loanRate = loanRate;
	}

}
