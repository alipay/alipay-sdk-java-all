package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * BOSS返回的可选扩展属性映射，可为空；不作为实例选择标识
 *
 * @author auto create
 * @since 1.0, 2026-10-20 14:42:55
 */
public class SalesforceCouponInstanceAttributes extends AlipayObject {

	private static final long serialVersionUID = 8512154381221536845L;

	/**
	 * 云厂商，来自BOSS候选属性
	 */
	@ApiField("cloud_provider")
	private String cloudProvider;

	/**
	 * 商品编码，来自BOSS候选属性
	 */
	@ApiField("commodity_code")
	private String commodityCode;

	/**
	 * 实例层级，来自BOSS候选属性
	 */
	@ApiField("instance_level")
	private String instanceLevel;

	/**
	 * 外部实例ID，来自BOSS候选属性
	 */
	@ApiField("out_instance_id")
	private String outInstanceId;

	/**
	 * 官网UID，来自BOSS候选属性
	 */
	@ApiField("passport_id")
	private String passportId;

	/**
	 * 付费类型，来自BOSS候选属性
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * 关联实例ID，来自BOSS候选属性
	 */
	@ApiField("related_instance_id")
	private String relatedInstanceId;

	/**
	 * 售卖渠道，来自BOSS候选属性
	 */
	@ApiField("sale_channel")
	private String saleChannel;

	/**
	 * 实例状态，来自BOSS候选属性
	 */
	@ApiField("status")
	private String status;

	public String getCloudProvider() {
		return this.cloudProvider;
	}
	public void setCloudProvider(String cloudProvider) {
		this.cloudProvider = cloudProvider;
	}

	public String getCommodityCode() {
		return this.commodityCode;
	}
	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}

	public String getInstanceLevel() {
		return this.instanceLevel;
	}
	public void setInstanceLevel(String instanceLevel) {
		this.instanceLevel = instanceLevel;
	}

	public String getOutInstanceId() {
		return this.outInstanceId;
	}
	public void setOutInstanceId(String outInstanceId) {
		this.outInstanceId = outInstanceId;
	}

	public String getPassportId() {
		return this.passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

	public String getPayType() {
		return this.payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getRelatedInstanceId() {
		return this.relatedInstanceId;
	}
	public void setRelatedInstanceId(String relatedInstanceId) {
		this.relatedInstanceId = relatedInstanceId;
	}

	public String getSaleChannel() {
		return this.saleChannel;
	}
	public void setSaleChannel(String saleChannel) {
		this.saleChannel = saleChannel;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
