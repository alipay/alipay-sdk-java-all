package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 摩卡营销活动匿名人群查询
 *
 * @author auto create
 * @since 1.0, 2022-10-10 19:44:10
 */
public class AnttechMorseMarketingSrtaConsultModel extends AlipayObject {

	private static final long serialVersionUID = 5489156799488354441L;

	/**
	 * 多个手机号hash后的值，以为逗号分隔，通过手机号进行sha256加密后获取
	 */
	@ApiField("anonymous_mobile_sha_256_list")
	private String anonymousMobileSha256List;

	/**
	 * 目标用户一次加密密文信息，通过摩斯提供的sdk进行加密获得
	 */
	@ApiField("blind_mobile_sha_256")
	private String blindMobileSha256;

	/**
	 * 扩展字段
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 订单金额，用标识订单的金额，可以不传
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 资源位信息确定商户投放场景，由摩斯同学配置并分配给调用方
	 */
	@ApiField("resource_id")
	private String resourceId;

	public String getAnonymousMobileSha256List() {
		return this.anonymousMobileSha256List;
	}
	public void setAnonymousMobileSha256List(String anonymousMobileSha256List) {
		this.anonymousMobileSha256List = anonymousMobileSha256List;
	}

	public String getBlindMobileSha256() {
		return this.blindMobileSha256;
	}
	public void setBlindMobileSha256(String blindMobileSha256) {
		this.blindMobileSha256 = blindMobileSha256;
	}

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
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

}
