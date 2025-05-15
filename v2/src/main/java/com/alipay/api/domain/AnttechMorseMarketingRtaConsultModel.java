package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 摩卡营销活动非匿名人群查询
 *
 * @author auto create
 * @since 1.0, 2024-02-29 15:57:50
 */
public class AnttechMorseMarketingRtaConsultModel extends AlipayObject {

	private static final long serialVersionUID = 1126271164397682542L;

	/**
	 * 扩展字段，保留扩展配置字段
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * mobile_sha_256标识用户唯一信息，通过用户手机号SHA256 哈希后获得，openid和 mobile_sha256和uid三选一
	 */
	@ApiField("mobile_sha_256")
	private String mobileSha256;

	/**
	 * 支付宝用户的openid， openid和 mobile_sha256和uid三选一
	 */
	@ApiField("openid")
	private String openid;

	/**
	 * 订单金额，咨询时用于门槛值过滤，小于门槛值则不能投放，可以设置为空，表示不判断
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 资源位信息确定商户投放场景，由摩斯同学配置并分配给调用方
	 */
	@ApiField("resource_id")
	private String resourceId;

	/**
	 * 支付宝uid, openid和 mobile_sha256和uid三选一
	 */
	@ApiField("uid")
	private String uid;

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public String getMobileSha256() {
		return this.mobileSha256;
	}
	public void setMobileSha256(String mobileSha256) {
		this.mobileSha256 = mobileSha256;
	}

	public String getOpenid() {
		return this.openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getResourceId() {
		return this.resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
