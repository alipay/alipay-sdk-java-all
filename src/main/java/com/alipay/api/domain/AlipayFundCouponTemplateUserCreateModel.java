package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝红包-发放用户红包皮肤
 *
 * @author auto create
 * @since 1.0, 2022-09-01 21:02:48
 */
public class AlipayFundCouponTemplateUserCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5578447934462888616L;

	/**
	 * 业务场景，不同的业务场景对应不同的发放策略，加入前需和红包侧确定，现有枚举值:standard_template_grant，代表基本皮肤发放策略，业务侧先将要发放的红包皮肤模板和红包侧审核同步，当皮肤模板在红包侧上线后发放
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 外部业务订单号，和user_id一起构成全局唯一，标定一次请求，给一个用户发放一个皮肤实例。
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 销售产品码，商家和支付宝签约的产品码。改接口可传值如下：GIFT_TEMPLATE 标识红包封标准产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 红包皮肤模板id，要发放的红包皮肤对应的模板id，只有业务方相关的皮肤模板有权限发送，需和红包侧确认相关的id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 蚂蚁统一会员ID，给哪个用户发放红包皮肤
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
