package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 解除ISV门店与口碑门店的绑定关系
 *
 * @author auto create
 * @since 1.0, 2020-12-16 20:50:26
 */
public class KoubeiServindustryReservationShopUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 2552673875369599466L;

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
	 * 标识唯一一次请求的id
	 */
	@ApiField("request_id")
	private String requestId;

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

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
