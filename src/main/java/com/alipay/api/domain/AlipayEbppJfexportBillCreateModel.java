package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建支付宝缴费订单
 *
 * @author auto create
 * @since 1.0, 2018-10-19 10:38:41
 */
public class AlipayEbppJfexportBillCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8188785146873278419L;

	/**
	 * 支付金额,单位为：RMB 元。
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 户号
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 业务类型英文名称 ，固定传JF，表示缴费
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 缓存的账单的key，每次查询机构账单时返回，在创建时需要透传回支付宝这边
	 */
	@ApiField("cache_key")
	private String cacheKey;

	/**
	 * 出账机构英文简称
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 拓展字段，json格式的key-value串，可以放返佣标识等信息
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 外部商户的业务流水号，需要保证唯一性和幂等性；并且，需要确保同一个外部商户的业务流水号只能使用同一个开放平台账户进行创建。
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 子业务类型英文名称 ，ELECTRIC-电费，WATER-水费，GAS-燃气费
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 选中的机构账单列表中单笔账单的uniq_id，标识创建哪一笔账单
	 */
	@ApiField("unique_id")
	private String uniqueId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

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

	public String getCacheKey() {
		return this.cacheKey;
	}
	public void setCacheKey(String cacheKey) {
		this.cacheKey = cacheKey;
	}

	public String getChargeInst() {
		return this.chargeInst;
	}
	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

	public String getExtendField() {
		return this.extendField;
	}
	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

	public String getUniqueId() {
		return this.uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

}
