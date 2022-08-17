package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝加油站油品信息查询接口
 *
 * @author auto create
 * @since 1.0, 2020-01-10 17:36:09
 */
public class AlipayCommerceTransportOilproductInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4651736817245725812L;

	/**
	 * 来源
	 */
	@ApiField("agent")
	private String agent;

	/**
	 * 扩展字段，json格式字符串
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 油站门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getAgent() {
		return this.agent;
	}
	public void setAgent(String agent) {
		this.agent = agent;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
