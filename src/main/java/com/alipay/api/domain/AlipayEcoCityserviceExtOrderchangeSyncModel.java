package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 光华订单同步
 *
 * @author auto create
 * @since 1.0, 2022-11-01 13:33:23
 */
public class AlipayEcoCityserviceExtOrderchangeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5244797998133361125L;

	/**
	 * 光华平台服务编码
	 */
	@ApiField("app_code")
	private String appCode;

	/**
	 * 城市编码，比如 110100
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 商品列表
	 */
	@ApiField("goods_info_list")
	private OrderGoodsInfo goodsInfoList;

	/**
	 * 行业类型 请联系BD获取
	 */
	@ApiField("industry_type")
	private Long industryType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单金额
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 订单创建时间
	 */
	@ApiField("order_create_time")
	private Date orderCreateTime;

	/**
	 * 订单修改时间
	 */
	@ApiField("order_update_time")
	private Date orderUpdateTime;

	/**
	 * 外部订单号，会用作幂等，幂等维度outerOrderNo+appId。注意防重。
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 实付金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 订单状态，具体枚举值联系BD获取
	 */
	@ApiField("status")
	private String status;

	/**
	 * 跳转地址
	 */
	@ApiField("target_url")
	private String targetUrl;

	/**
	 * 模板Id 请联系BD获取
	 */
	@ApiField("template_id")
	private Long templateId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAppCode() {
		return this.appCode;
	}
	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public OrderGoodsInfo getGoodsInfoList() {
		return this.goodsInfoList;
	}
	public void setGoodsInfoList(OrderGoodsInfo goodsInfoList) {
		this.goodsInfoList = goodsInfoList;
	}

	public Long getIndustryType() {
		return this.industryType;
	}
	public void setIndustryType(Long industryType) {
		this.industryType = industryType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Date getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public Date getOrderUpdateTime() {
		return this.orderUpdateTime;
	}
	public void setOrderUpdateTime(Date orderUpdateTime) {
		this.orderUpdateTime = orderUpdateTime;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTargetUrl() {
		return this.targetUrl;
	}
	public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
	}

	public Long getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
