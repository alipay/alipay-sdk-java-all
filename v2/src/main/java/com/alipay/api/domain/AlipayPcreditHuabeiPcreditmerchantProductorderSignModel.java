package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 千牛花呗协议签约
 *
 * @author auto create
 * @since 1.0, 2020-11-17 17:38:31
 */
public class AlipayPcreditHuabeiPcreditmerchantProductorderSignModel extends AlipayObject {

	private static final long serialVersionUID = 5477528625246392173L;

	/**
	 * 主营类目
风控需要字段
	 */
	@ApiField("category")
	private String category;

	/**
	 * 到期类型:
 LONG_TERM_EFFECT 长期
SHORT_TERM_EFFECT 短期
	 */
	@ApiField("due_type")
	private String dueType;

	/**
	 * 来源应用
	 */
	@ApiField("from_app")
	private String fromApp;

	/**
	 * 预期失效日期 格式：yyyy-MM-dd HH:mm:ss
短期到期类型：必须传入失效时间
长期到期类型：忽略传入的失效时间
	 */
	@ApiField("inactive_datetime")
	private String inactiveDatetime;

	/**
	 * 行业
风控与合约中心需要场景字段
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 订购渠道
	 */
	@ApiField("ordered_channel")
	private String orderedChannel;

	/**
	 * 订购编码
	 */
	@ApiField("ordered_system_code")
	private String orderedSystemCode;

	/**
	 * 外部商户ID
	 */
	@ApiField("out_merchant_id")
	private String outMerchantId;

	/**
	 * 商家支付宝账号
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 销售产品码
	 */
	@ApiField("ps_code")
	private String psCode;

	/**
	 * 店铺名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 店铺类型：
个人店铺：personal 
企业店铺：ent
	 */
	@ApiField("shop_type")
	private String shopType;

	/**
	 * 签约场景：
千牛侧花呗签约场景：TAOBAO_TRADE
风控需要场景字段
	 */
	@ApiField("sign_scene")
	private String signScene;

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getDueType() {
		return this.dueType;
	}
	public void setDueType(String dueType) {
		this.dueType = dueType;
	}

	public String getFromApp() {
		return this.fromApp;
	}
	public void setFromApp(String fromApp) {
		this.fromApp = fromApp;
	}

	public String getInactiveDatetime() {
		return this.inactiveDatetime;
	}
	public void setInactiveDatetime(String inactiveDatetime) {
		this.inactiveDatetime = inactiveDatetime;
	}

	public String getIndustry() {
		return this.industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getOrderedChannel() {
		return this.orderedChannel;
	}
	public void setOrderedChannel(String orderedChannel) {
		this.orderedChannel = orderedChannel;
	}

	public String getOrderedSystemCode() {
		return this.orderedSystemCode;
	}
	public void setOrderedSystemCode(String orderedSystemCode) {
		this.orderedSystemCode = orderedSystemCode;
	}

	public String getOutMerchantId() {
		return this.outMerchantId;
	}
	public void setOutMerchantId(String outMerchantId) {
		this.outMerchantId = outMerchantId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPsCode() {
		return this.psCode;
	}
	public void setPsCode(String psCode) {
		this.psCode = psCode;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopType() {
		return this.shopType;
	}
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	public String getSignScene() {
		return this.signScene;
	}
	public void setSignScene(String signScene) {
		this.signScene = signScene;
	}

}
