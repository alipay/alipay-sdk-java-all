package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扩展参数
 *
 * @author auto create
 * @since 1.0, 2022-04-21 17:35:29
 */
public class PreOrderExtInfo extends AlipayObject {

	private static final long serialVersionUID = 2834757395532256463L;

	/**
	 * 品牌id
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 请求渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 单据属性,风控系统使用
	 */
	@ApiField("order_feature")
	private String orderFeature;

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getOrderFeature() {
		return this.orderFeature;
	}
	public void setOrderFeature(String orderFeature) {
		this.orderFeature = orderFeature;
	}

}
