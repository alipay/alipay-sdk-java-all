package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 付款方式列表，包括上述单独传递的付款方式。如果2种都传递，默认覆盖单独传递的付款方式。
 *
 * @author auto create
 * @since 1.0, 2018-06-20 10:37:58
 */
public class EcoCenRenthousepayTypeList extends AlipayObject {

	private static final long serialVersionUID = 3253114864845344989L;

	/**
	 * 集中式房源最小押金
	 */
	@ApiField("foregift_amount")
	private String foregiftAmount;

	/**
	 * 集中式最高价格，支持小数点后面2位。
	 */
	@ApiField("max_amount")
	private String maxAmount;

	/**
	 * 集中式房源最大押金
	 */
	@ApiField("max_deposit_amount")
	private String maxDepositAmount;

	/**
	 * 其它费用
	 */
	@ApiListField("other_amount")
	@ApiField("eco_renthouse_other_amount")
	private List<EcoRenthouseOtherAmount> otherAmount;

	/**
	 * 付款方式（1：付一，2：付二）
	 */
	@ApiField("pay_type")
	private Long payType;

	/**
	 * 租金
	 */
	@ApiField("room_amount")
	private String roomAmount;

	public String getForegiftAmount() {
		return this.foregiftAmount;
	}
	public void setForegiftAmount(String foregiftAmount) {
		this.foregiftAmount = foregiftAmount;
	}

	public String getMaxAmount() {
		return this.maxAmount;
	}
	public void setMaxAmount(String maxAmount) {
		this.maxAmount = maxAmount;
	}

	public String getMaxDepositAmount() {
		return this.maxDepositAmount;
	}
	public void setMaxDepositAmount(String maxDepositAmount) {
		this.maxDepositAmount = maxDepositAmount;
	}

	public List<EcoRenthouseOtherAmount> getOtherAmount() {
		return this.otherAmount;
	}
	public void setOtherAmount(List<EcoRenthouseOtherAmount> otherAmount) {
		this.otherAmount = otherAmount;
	}

	public Long getPayType() {
		return this.payType;
	}
	public void setPayType(Long payType) {
		this.payType = payType;
	}

	public String getRoomAmount() {
		return this.roomAmount;
	}
	public void setRoomAmount(String roomAmount) {
		this.roomAmount = roomAmount;
	}

}
