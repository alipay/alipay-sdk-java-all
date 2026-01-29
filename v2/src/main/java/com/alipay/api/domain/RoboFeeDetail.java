package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 费用信息
 *
 * @author auto create
 * @since 1.0, 2025-12-03 11:42:20
 */
public class RoboFeeDetail extends AlipayObject {

	private static final long serialVersionUID = 3187886398119287199L;

	/**
	 * 费用金额 单位 分
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 费用描述信息
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 费用类型
101:起步费 
102:里程费 
103:时长费 
105:远途费
114:渠道优惠
115:一口价
116:过路费
117:低速时长费
	 */
	@ApiField("type")
	private Long type;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

}
