package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SignInBonusStrategy;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.playsignin.config.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-26 21:52:03
 */
public class AlipayMarketingCampaignPlaysigninConfigQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8556757377273732686L;

	/** 
	 * 用户领奖方式
	 */
	@ApiField("bonus_receive_type")
	private String bonusReceiveType;

	/** 
	 * 签到发奖策略类型
	 */
	@ApiField("bonus_send_strategy_type")
	private String bonusSendStrategyType;

	/** 
	 * 签到发奖策略内容
	 */
	@ApiListField("bonus_strategies")
	@ApiField("sign_in_bonus_strategy")
	private List<SignInBonusStrategy> bonusStrategies;

	/** 
	 * 是否需报名
	 */
	@ApiField("need_signup")
	private Boolean needSignup;

	/** 
	 * 领奖过期表达式
相对时间示例: RELATIVE_30_NATURALDAYS
绝对时间示例: ABSOLUTELY_20210825224510
	 */
	@ApiField("receive_time_expression")
	private String receiveTimeExpression;

	/** 
	 * 签到时间维度（日月周）
	 */
	@ApiField("signin_dimesion_type")
	private String signinDimesionType;

	/** 
	 * 签到次数上限（循环）
	 */
	@ApiField("signin_upper_num")
	private Long signinUpperNum;

	/** 
	 * 签到活动结束时间
	 */
	@ApiField("signup_end_time")
	private Date signupEndTime;

	/** 
	 * 签到开始时间
	 */
	@ApiField("signup_start_time")
	private Date signupStartTime;

	public void setBonusReceiveType(String bonusReceiveType) {
		this.bonusReceiveType = bonusReceiveType;
	}
	public String getBonusReceiveType( ) {
		return this.bonusReceiveType;
	}

	public void setBonusSendStrategyType(String bonusSendStrategyType) {
		this.bonusSendStrategyType = bonusSendStrategyType;
	}
	public String getBonusSendStrategyType( ) {
		return this.bonusSendStrategyType;
	}

	public void setBonusStrategies(List<SignInBonusStrategy> bonusStrategies) {
		this.bonusStrategies = bonusStrategies;
	}
	public List<SignInBonusStrategy> getBonusStrategies( ) {
		return this.bonusStrategies;
	}

	public void setNeedSignup(Boolean needSignup) {
		this.needSignup = needSignup;
	}
	public Boolean getNeedSignup( ) {
		return this.needSignup;
	}

	public void setReceiveTimeExpression(String receiveTimeExpression) {
		this.receiveTimeExpression = receiveTimeExpression;
	}
	public String getReceiveTimeExpression( ) {
		return this.receiveTimeExpression;
	}

	public void setSigninDimesionType(String signinDimesionType) {
		this.signinDimesionType = signinDimesionType;
	}
	public String getSigninDimesionType( ) {
		return this.signinDimesionType;
	}

	public void setSigninUpperNum(Long signinUpperNum) {
		this.signinUpperNum = signinUpperNum;
	}
	public Long getSigninUpperNum( ) {
		return this.signinUpperNum;
	}

	public void setSignupEndTime(Date signupEndTime) {
		this.signupEndTime = signupEndTime;
	}
	public Date getSignupEndTime( ) {
		return this.signupEndTime;
	}

	public void setSignupStartTime(Date signupStartTime) {
		this.signupStartTime = signupStartTime;
	}
	public Date getSignupStartTime( ) {
		return this.signupStartTime;
	}

}
