package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝红包-发放用户红包皮肤
 *
 * @author auto create
 * @since 1.0, 2022-12-06 17:34:14
 */
public class AlipayFundCouponTemplateUserCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1411613636177525558L;

	/**
	 * 业务场景，不同的业务场景对应不同的发放策略，加入前需和红包侧确定，现有枚举值:standard_template_grant，代表基本封面发放策略，业务侧先将要发放的红包封面模板和红包侧审核同步，当封面模板在红包侧生效后发放
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 封面兑换码，商家可以在商家平台创建封面时在发放设置中添加，添加后用户可凭该兑换码领取封面
	 */
	@ApiField("code")
	private String code;

	/**
	 * 蚂蚁统一会员ID，给哪个用户发放红包封面
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务订单号，和用户唯一标识一起构成全局唯一，标定一次请求，给一个用户发放一个红包封面实例。
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 销售产品码，商家和支付宝签约的产品码。改接口可传值如下：GIFT_TEMPLATE 标识红包封标准产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 红包封面模板id，要发放的红包封面对应的模板id，只有业务方相关的封面模板有权限发送，需和红包侧确认相关的id；商户自己制作的红包封面对应的封面模板ID可在商家平台中查询。
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 蚂蚁统一会员ID，给哪个用户发放红包封面
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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
