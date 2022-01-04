package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 绑定口碑预订门店
 *
 * @author auto create
 * @since 1.0, 2019-09-09 21:07:02
 */
public class KoubeiServindustryReservationShopBindModel extends AlipayObject {

	private static final long serialVersionUID = 1882855719937652135L;

	/**
	 * 口碑为第三方ISV分配的渠道标识，如K米的渠道为ISV_KMI
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 行业，如KTV，MASSAGE(足疗)等
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 商户在ISV创建的门店id
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 商户在口碑创建的门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getIndustry() {
		return this.industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getOutShopId() {
		return this.outShopId;
	}
	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
