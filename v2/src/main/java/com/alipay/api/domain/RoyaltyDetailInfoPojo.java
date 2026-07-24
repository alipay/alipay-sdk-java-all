package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分账明细信息。单独调用分账完结时，可以不传此参数。其他场景必传。 注意：商家分账场景下分账收入方 trans_in 只支持支付宝账户，不支持使用 cardAliasNo 卡编号。
 *
 * @author auto create
 * @since 1.0, 2026-07-10 17:47:54
 */
public class RoyaltyDetailInfoPojo extends AlipayObject {

	private static final long serialVersionUID = 2338463467721683499L;

	/**
	 * 分账的金额，单位为元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 分账信息中分账百分比。取值范围为大于0，少于或等于100的整数。
	 */
	@ApiField("amount_percentage")
	private Long amountPercentage;

	/**
	 * 分账描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 可选值：达人佣金、平台服务费、技术服务费、其他
	 */
	@ApiField("royalty_scene")
	private String royaltyScene;

	/**
	 * 分账类型.
	 */
	@ApiField("royalty_type")
	private String royaltyType;

	/**
	 * 收入方账户。如果收入方账户类型为userId，本参数为收入方的支付宝账号对应的支付宝唯一用户号，以2088开头的纯16位数字；如果收入方类型为cardAliasNo，本参数为收入方在支付宝绑定的卡编号；如果收入方类型为loginName，本参数为收入方的支付宝登录号；如果收入方类型为loginName，本参数为收入方的支付宝登录号；如果收入方类型为openId，本参数为收入方的支付宝openId信息；如果收入方类型为alipayWallet，本参数为收入方在支付宝绑定的场景钱包id
	 */
	@ApiField("trans_in")
	private String transIn;

	/**
	 * 分账转入方的支付宝userId
	 */
	@ApiField("trans_in_id")
	private String transInId;

	/**
	 * 分账收款方姓名，上送则进行姓名与支付宝账号的一致性校验，校验不一致则分账失败。不上送则不进行姓名校验
	 */
	@ApiField("trans_in_name")
	private String transInName;

	/**
	 * 收入方账户类型。
	 */
	@ApiField("trans_in_type")
	private String transInType;

	/**
	 * 支出方账户。如果支出方账户类型为userId，本参数为支出方的支付宝账号对应的支付宝唯一用户号，以2088开头的纯16位数字；如果支出方类型为loginName，本参数为支出方的支付宝登录号。 泛金融类商户分账时，该字段不要上送。
	 */
	@ApiField("trans_out")
	private String transOut;

	/**
	 * 支出方账户类型。
	 */
	@ApiField("trans_out_type")
	private String transOutType;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Long getAmountPercentage() {
		return this.amountPercentage;
	}
	public void setAmountPercentage(Long amountPercentage) {
		this.amountPercentage = amountPercentage;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getRoyaltyScene() {
		return this.royaltyScene;
	}
	public void setRoyaltyScene(String royaltyScene) {
		this.royaltyScene = royaltyScene;
	}

	public String getRoyaltyType() {
		return this.royaltyType;
	}
	public void setRoyaltyType(String royaltyType) {
		this.royaltyType = royaltyType;
	}

	public String getTransIn() {
		return this.transIn;
	}
	public void setTransIn(String transIn) {
		this.transIn = transIn;
	}

	public String getTransInId() {
		return this.transInId;
	}
	public void setTransInId(String transInId) {
		this.transInId = transInId;
	}

	public String getTransInName() {
		return this.transInName;
	}
	public void setTransInName(String transInName) {
		this.transInName = transInName;
	}

	public String getTransInType() {
		return this.transInType;
	}
	public void setTransInType(String transInType) {
		this.transInType = transInType;
	}

	public String getTransOut() {
		return this.transOut;
	}
	public void setTransOut(String transOut) {
		this.transOut = transOut;
	}

	public String getTransOutType() {
		return this.transOutType;
	}
	public void setTransOutType(String transOutType) {
		this.transOutType = transOutType;
	}

}
