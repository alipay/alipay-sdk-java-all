package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserRiskPrediction;
import com.alipay.api.domain.WaitRepaymentOrderInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.advance.consult response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-21 18:52:48
 */
public class AlipayTradeAdvanceConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6723396877132123711L;

	/** 
	 * true 代表当前时间点，用户允许垫资
false 代表当前时间，用户不允许垫资
	 */
	@ApiField("refer_result")
	private Boolean referResult;

	/** 
	 * 用户被注销
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 返回用户不准入原因
	 */
	@ApiField("result_message")
	private String resultMessage;

	/** 
	 * 订单风险评估等级，在单笔订单风险预评估时返回。当基础风险校验通过时，可通过该值获取业务风险评估等级。取值：2-高风险；1-低风险。
	 */
	@ApiField("risk_level")
	private String riskLevel;

	/** 
	 * 用户风险预测结果，包括用户拒付风险等级、用户绑定手机号被二次放号风险等级。
	 */
	@ApiField("user_risk_prediction")
	private UserRiskPrediction userRiskPrediction;

	/** 
	 * 用户剩余的总待还金额，无论当前用户是否允许垫资，都会返回该属性。
	 */
	@ApiField("wait_repayment_amount")
	private String waitRepaymentAmount;

	/** 
	 * 用户总的未还的垫资笔数，无论用户是否允许垫资，都会返回该属性
	 */
	@ApiField("wait_repayment_order_count")
	private Long waitRepaymentOrderCount;

	/** 
	 * 待还订单列表，无论用户当前状态是否允许垫资，都会返回当前用户在商户下的待还订单信息
	 */
	@ApiListField("wait_repayment_order_infos")
	@ApiField("wait_repayment_order_info")
	private List<WaitRepaymentOrderInfo> waitRepaymentOrderInfos;

	public void setReferResult(Boolean referResult) {
		this.referResult = referResult;
	}
	public Boolean getReferResult( ) {
		return this.referResult;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	public String getResultMessage( ) {
		return this.resultMessage;
	}

	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}
	public String getRiskLevel( ) {
		return this.riskLevel;
	}

	public void setUserRiskPrediction(UserRiskPrediction userRiskPrediction) {
		this.userRiskPrediction = userRiskPrediction;
	}
	public UserRiskPrediction getUserRiskPrediction( ) {
		return this.userRiskPrediction;
	}

	public void setWaitRepaymentAmount(String waitRepaymentAmount) {
		this.waitRepaymentAmount = waitRepaymentAmount;
	}
	public String getWaitRepaymentAmount( ) {
		return this.waitRepaymentAmount;
	}

	public void setWaitRepaymentOrderCount(Long waitRepaymentOrderCount) {
		this.waitRepaymentOrderCount = waitRepaymentOrderCount;
	}
	public Long getWaitRepaymentOrderCount( ) {
		return this.waitRepaymentOrderCount;
	}

	public void setWaitRepaymentOrderInfos(List<WaitRepaymentOrderInfo> waitRepaymentOrderInfos) {
		this.waitRepaymentOrderInfos = waitRepaymentOrderInfos;
	}
	public List<WaitRepaymentOrderInfo> getWaitRepaymentOrderInfos( ) {
		return this.waitRepaymentOrderInfos;
	}

}
