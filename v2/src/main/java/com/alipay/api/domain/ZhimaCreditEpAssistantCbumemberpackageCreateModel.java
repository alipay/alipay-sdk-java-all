package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 1688接入企信助手会员包创建
 *
 * @author auto create
 * @since 1.0, 2026-07-29 11:27:48
 */
public class ZhimaCreditEpAssistantCbumemberpackageCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7522196142924161313L;

	/**
	 * 1688侧标识B端用户的唯一身份ID
	 */
	@ApiField("ali_id")
	private String aliId;

	/**
	 * 权益包指定生效时间非必填，默认不要填写，只有需要权益包不立即生效，在后续指定时间点生效的场景下需要传入。如果传入时间早于当前时间，则以当前时间进行生效。且指定的生效时间不得晚于当前时间一个月。
	 */
	@ApiField("begin_effect_time")
	private String beginEffectTime;

	/**
	 * 1688渠道以会员aliId作为公司唯一标识
	 */
	@ApiField("company_id")
	private String companyId;

	/**
	 * 合作伙伴侧购买使用当前的会员包的企业全称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 创建会员包是否参与营销活动，营销活动规则为季度会员包赠送15天，年度会员包赠送90天权益，活动默认开启，关闭需要显式传值false
	 */
	@ApiField("has_activity")
	private Boolean hasActivity;

	/**
	 * 订单编号，是客户在合作伙伴侧下单时的ID，在付费、续费、增购等一个客户可以有多个付费ID，一个ID描述一次购买行为。也是退权益的最小粒度
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 唯一键，幂等控制，同一个id不允许多次购买
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 企信会员产品码，由企信分配
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 企信会员产品包定制化配置.仅对product_sku为QX-ZTB-ASSISTANT-STANDARD和QX-TK-ASSISTANT-STANDARD 时生效
	 */
	@ApiField("product_config")
	private EpAssistantProductConfig productConfig;

	/**
	 * 企信会员产品sku，由企信分配
	 */
	@ApiField("product_sku")
	private String productSku;

	public String getAliId() {
		return this.aliId;
	}
	public void setAliId(String aliId) {
		this.aliId = aliId;
	}

	public String getBeginEffectTime() {
		return this.beginEffectTime;
	}
	public void setBeginEffectTime(String beginEffectTime) {
		this.beginEffectTime = beginEffectTime;
	}

	public String getCompanyId() {
		return this.companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Boolean getHasActivity() {
		return this.hasActivity;
	}
	public void setHasActivity(Boolean hasActivity) {
		this.hasActivity = hasActivity;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public EpAssistantProductConfig getProductConfig() {
		return this.productConfig;
	}
	public void setProductConfig(EpAssistantProductConfig productConfig) {
		this.productConfig = productConfig;
	}

	public String getProductSku() {
		return this.productSku;
	}
	public void setProductSku(String productSku) {
		this.productSku = productSku;
	}

}
