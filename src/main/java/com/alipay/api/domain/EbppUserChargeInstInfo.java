package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活缴费用户的机构列表信息
 *
 * @author auto create
 * @since 1.0, 2020-10-30 16:13:56
 */
public class EbppUserChargeInstInfo extends AlipayObject {

	private static final long serialVersionUID = 8233996527548377868L;

	/**
	 * 业务类型缩写:
JF-缴费
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 出账机构缩写
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 出账机构全称
	 */
	@ApiField("charge_inst_name")
	private String chargeInstName;

	/**
	 * 子业务类型英文名称:
ELECTRIC-电力
GAS-燃气
WATER-水
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getChargeInst() {
		return this.chargeInst;
	}
	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

	public String getChargeInstName() {
		return this.chargeInstName;
	}
	public void setChargeInstName(String chargeInstName) {
		this.chargeInstName = chargeInstName;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

}
