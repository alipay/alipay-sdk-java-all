package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 诊断结果信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class DiagnoseResult extends AlipayObject {

	private static final long serialVersionUID = 2334157473622843914L;

	/**
	 * 提示文案业务参数,JSON对象形式返回，JSON的KEY包含tradeCycle，userRate，industryRate，repayRate调用方根据诊断CODE分别给出不同的诊断文案，例如：
TRADE_RATE	流失会员占比高	您当前${tradeCycle}(90)天未到店消费会员占总会员${userRate}(40%)，落后同行${industryRate}(60%)的商家。				
USER_COUNT	会员数量少	您当前店均会员量较少，落后同行${industryRate}(60%)的商家。
				
REPAY_RATE	复购率低	您当前${tradeCycle}(60)天会员回头率为${repayRate}(30%)，落后于同行${industryRate}(60%)的商家。
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 诊断结果CODE，目前有如下三个值
TRADE_RATE	流失会员占比高
USER_COUNT	会员数量少
REPAY_RATE	复购率低
	 */
	@ApiField("diagnose_code")
	private String diagnoseCode;

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public String getDiagnoseCode() {
		return this.diagnoseCode;
	}
	public void setDiagnoseCode(String diagnoseCode) {
		this.diagnoseCode = diagnoseCode;
	}

}
