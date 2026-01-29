package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 费用详情
 *
 * @author auto create
 * @since 1.0, 2025-12-26 21:36:17
 */
public class RoboDiscountInfo extends AlipayObject {

	private static final long serialVersionUID = 2424745827229832466L;

	/**
	 * 金额，单位：分
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 扩展信息
	 */
	@ApiListField("extend_info")
	@ApiField("robo_extend_info")
	private List<RoboExtendInfo> extendInfo;

	/**
	 * 唯一标识
	 */
	@ApiField("key")
	private String key;

	/**
	 * 费用类型
101:起步费 
102:里程费 
103:时长费 
105:远途费
114:渠道优惠
115:一口价
	 */
	@ApiField("type")
	private Long type;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public List<RoboExtendInfo> getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(List<RoboExtendInfo> extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

}
