package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 跨境游优惠券领用接口
 *
 * @author auto create
 * @since 1.0, 2019-08-15 16:28:24
 */
public class AlipayOverseasTravelCouponReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 3697985243593414721L;

	/**
	 * 多端统一渠道信息，与服务提供方协商分配，为空则默认取appId
	 */
	@ApiField("ch_info")
	private String chInfo;

	/**
	 * 跨境游发现平台优惠id
	 */
	@ApiField("promo_id")
	private String promoId;

	/**
	 * 店铺ID，当优惠券投放到多个店铺时，通过本参数得知通过哪一个店铺领取了该券
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 请求唯一id，只能是大小写字母及数字。不带业务含义，可以由uuid等随机生成，用于唯一标识一笔业务，方便与外部排查问题
	 */
	@ApiField("unique_id")
	private String uniqueId;

	/**
	 * 用户信息，领取优惠必填
	 */
	@ApiField("user_info")
	private OverseaUserInfo userInfo;

	public String getChInfo() {
		return this.chInfo;
	}
	public void setChInfo(String chInfo) {
		this.chInfo = chInfo;
	}

	public String getPromoId() {
		return this.promoId;
	}
	public void setPromoId(String promoId) {
		this.promoId = promoId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getUniqueId() {
		return this.uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public OverseaUserInfo getUserInfo() {
		return this.userInfo;
	}
	public void setUserInfo(OverseaUserInfo userInfo) {
		this.userInfo = userInfo;
	}

}
