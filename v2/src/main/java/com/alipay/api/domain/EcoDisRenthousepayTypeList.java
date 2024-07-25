package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 付款方式列表，包括上述单独传递的付款方式。如果2种都传递，默认覆盖单独传递的付款方式。
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:48:52
 */
public class EcoDisRenthousepayTypeList extends AlipayObject {

	private static final long serialVersionUID = 4556485656966925744L;

	/**
	 * 押金
	 */
	@ApiField("foregift_amount")
	private String foregiftAmount;

	/**
	 * 可租期（1：1个月，3：三个月，6：半年，12：一年及以上）
	 */
	@ApiField("lease_term")
	private Long leaseTerm;

	/**
	 * 其他费用
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

	/**
	 * 服务费
	 */
	@ApiField("service_amount")
	private String serviceAmount;

	/**
	 * 服务费单位（m：月, y：年）
	 */
	@ApiField("service_type")
	private String serviceType;

	public String getForegiftAmount() {
		return this.foregiftAmount;
	}
	public void setForegiftAmount(String foregiftAmount) {
		this.foregiftAmount = foregiftAmount;
	}

	public Long getLeaseTerm() {
		return this.leaseTerm;
	}
	public void setLeaseTerm(Long leaseTerm) {
		this.leaseTerm = leaseTerm;
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

	public String getServiceAmount() {
		return this.serviceAmount;
	}
	public void setServiceAmount(String serviceAmount) {
		this.serviceAmount = serviceAmount;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

}
