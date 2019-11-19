package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单业务户号
 *
 * @author auto create
 * @since 1.0, 2017-08-21 17:20:20
 */
public class EbppBillKey extends AlipayObject {

	private static final long serialVersionUID = 5519172784895587944L;

	/**
	 * 户号
	 */
	@ApiField("bill_key")
	private String billKey;

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
	 * 脱敏的户主姓名
	 */
	@ApiField("owner_name")
	private String ownerName;

	/**
	 * 子业务类型英文名称:
ELECTRIC-电力
GAS-燃气
WATER-水
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	public String getBillKey() {
		return this.billKey;
	}
	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

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

	public String getOwnerName() {
		return this.ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

}
