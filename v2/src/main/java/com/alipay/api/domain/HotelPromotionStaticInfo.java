package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 酒店优惠信息静态信息
 *
 * @author auto create
 * @since 1.0, 2024-05-21 19:36:20
 */
public class HotelPromotionStaticInfo extends AlipayObject {

	private static final long serialVersionUID = 4751563128272237516L;

	/**
	 * 酒店优惠活动副标题，名称的补充
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 酒店优惠活动名称
	 */
	@ApiField("tag")
	private String tag;

	/**
	 * 酒店促销活动类型，ota维度唯一
	 */
	@ApiField("type")
	private String type;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getTag() {
		return this.tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
