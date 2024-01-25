package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 充值营销
 *
 * @author auto create
 * @since 1.0, 2020-09-14 15:48:38
 */
public class RechargeDTO extends AlipayObject {

	private static final long serialVersionUID = 8867178523696397441L;

	/**
	 * 赠送金额，如果有阶梯规则，多个值用英文逗号分割，例如：10,20
	 */
	@ApiField("gift_amount")
	private String giftAmount;

	/**
	 * 赠送份数，如果有阶梯规则，多个值用英文逗号分割，例如：1,2
	 */
	@ApiField("gift_nums")
	private String giftNums;

	/**
	 * 赠送商品sku_id
	 */
	@ApiListField("gift_sku_id")
	@ApiField("string")
	private List<String> giftSkuId;

	/**
	 * 充值金额，必须是数字格式，支持两位小数。
如果有阶梯规则，多个值用英文逗号分割，例如：10,200
	 */
	@ApiField("recharge_amount")
	private String rechargeAmount;

	public String getGiftAmount() {
		return this.giftAmount;
	}
	public void setGiftAmount(String giftAmount) {
		this.giftAmount = giftAmount;
	}

	public String getGiftNums() {
		return this.giftNums;
	}
	public void setGiftNums(String giftNums) {
		this.giftNums = giftNums;
	}

	public List<String> getGiftSkuId() {
		return this.giftSkuId;
	}
	public void setGiftSkuId(List<String> giftSkuId) {
		this.giftSkuId = giftSkuId;
	}

	public String getRechargeAmount() {
		return this.rechargeAmount;
	}
	public void setRechargeAmount(String rechargeAmount) {
		this.rechargeAmount = rechargeAmount;
	}

}
