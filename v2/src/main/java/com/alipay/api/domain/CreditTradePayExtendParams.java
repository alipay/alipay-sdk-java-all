package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 先采后付免密下单扩展参数
 *
 * @author auto create
 * @since 1.0, 2025-07-07 15:59:02
 */
public class CreditTradePayExtendParams extends AlipayObject {

	private static final long serialVersionUID = 7187294663584452467L;

	/**
	 * 标识信用支付阶段
	 */
	@ApiField("credit_trade_phase")
	private String creditTradePhase;

	/**
	 * 标识信用支付场景
	 */
	@ApiField("credit_trade_scene")
	private String creditTradeScene;

	/**
	 * 企业支付解决方案
	 */
	@ApiField("pay_solution")
	private String paySolution;

	/**
	 * 支付解决方案场景
	 */
	@ApiField("pay_solution_config")
	private String paySolutionConfig;

	public String getCreditTradePhase() {
		return this.creditTradePhase;
	}
	public void setCreditTradePhase(String creditTradePhase) {
		this.creditTradePhase = creditTradePhase;
	}

	public String getCreditTradeScene() {
		return this.creditTradeScene;
	}
	public void setCreditTradeScene(String creditTradeScene) {
		this.creditTradeScene = creditTradeScene;
	}

	public String getPaySolution() {
		return this.paySolution;
	}
	public void setPaySolution(String paySolution) {
		this.paySolution = paySolution;
	}

	public String getPaySolutionConfig() {
		return this.paySolutionConfig;
	}
	public void setPaySolutionConfig(String paySolutionConfig) {
		this.paySolutionConfig = paySolutionConfig;
	}

}
