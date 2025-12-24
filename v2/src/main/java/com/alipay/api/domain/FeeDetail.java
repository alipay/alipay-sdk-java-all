package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 费用详情
 *
 * @author auto create
 * @since 1.0, 2025-12-18 15:47:11
 */
public class FeeDetail extends AlipayObject {

	private static final long serialVersionUID = 3756879393498937669L;

	/**
	 * 费用金额，单位：元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 费用描述信息
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 扩展信息
	 */
	@ApiListField("extend_info")
	@ApiField("robo_extend_info")
	private List<RoboExtendInfo> extendInfo;

	/**
	 * 费用类型
101:起步费 
102:里程费 
103:时长费 
105:远途费
114:渠道优惠
115:一口价
当type为1时：key有distance、duration；
当type为2时：key有distance；
当type为3时：key有duration；
当type为4时：key有distance；
当type为5时：没有key
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

	public List<RoboExtendInfo> getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(List<RoboExtendInfo> extendInfo) {
		this.extendInfo = extendInfo;
	}

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

}
