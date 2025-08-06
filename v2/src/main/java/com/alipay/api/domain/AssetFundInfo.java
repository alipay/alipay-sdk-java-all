package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建模板的资金信息
 *
 * @author auto create
 * @since 1.0, 2021-04-25 20:15:24
 */
public class AssetFundInfo extends AlipayObject {

	private static final long serialVersionUID = 8423119633667496286L;

	/**
	 * 创建权益模板的金额，创建权益模板时需要指定实际金额，单元是元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 出资账号，创建权益模板时可以指定出资的账号，比如如果使用集分宝积分库出资，填入积分库id即1035，可以在pointmng上查询商家的积分库id。如果为空，则默认根据商家在云合约产品下的积分库出资
	 */
	@ApiField("fund_account")
	private String fundAccount;

	/**
	 * 出资账号类型，创建权益模板时需要指明账号的类型，由支付宝权益结算平台定义，比如POINT_LIB表示由集分宝积分库出资，其他值的获取请咨询相关开发同学。如果为空，则默认从集分宝积分库出资
	 */
	@ApiField("fund_type")
	private String fundType;

	/**
	 * 结算截止时间，表示权益模板进行结算的最终时间，可以是相对模板过期时间基础上增加的时间也可以是绝对时间，相对时间：2d表示相对模板过期增加2天，10h表示增加10个小时，5m表示增加5分钟，绝对时间的格式为： yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("settle_dead_line")
	private String settleDeadLine;

	/**
	 * 结算方式，表示这个模板进行结算时候的结算方式（实时结算、按天结算等等），“T1”表示按天结算，由支付宝权益结算平台定义
	 */
	@ApiField("settle_mode")
	private String settleMode;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getFundAccount() {
		return this.fundAccount;
	}
	public void setFundAccount(String fundAccount) {
		this.fundAccount = fundAccount;
	}

	public String getFundType() {
		return this.fundType;
	}
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

	public String getSettleDeadLine() {
		return this.settleDeadLine;
	}
	public void setSettleDeadLine(String settleDeadLine) {
		this.settleDeadLine = settleDeadLine;
	}

	public String getSettleMode() {
		return this.settleMode;
	}
	public void setSettleMode(String settleMode) {
		this.settleMode = settleMode;
	}

}
