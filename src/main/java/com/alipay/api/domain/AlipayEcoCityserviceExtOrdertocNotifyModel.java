package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 光华通用订单同步
 *
 * @author auto create
 * @since 1.0, 2022-06-30 11:28:59
 */
public class AlipayEcoCityserviceExtOrdertocNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 4519927659327893735L;

	/**
	 * 光华平台服务编码
	 */
	@ApiField("app_code")
	private String appCode;

	/**
	 * 扩展信息
ext_info Map<String,String> 
|__ 名称  类型 是否必填 最大长度 描述 示例
|__ good_info_list List<GoodsOrder> 是 / 商品信息列表 [{"goodsName":"芝芝莓莓","goodsId":"12345","quantity":1}], 
|__ goods_id String 是 128 商品Id S-101963 
|__ goods_name String 是 128 商品名称 站点加油 
|__ cover_pic_url String 否 256 商品图片 
|__ price String 否 128 商品价格 ?120.00 
|__ quantity int 否 / 商品数量 40 
|__ simple_desc String 是 128 短文案 请尽快预约上门取件时间 
|__ desc String 是 128 详细文案 宝贝需要寄送至服务点服务，请尽快完成预约 
|__ partner_name String 是 128 服务商家 杭州美立洁环保科技有限公司 
|__ appointment_time String / 128 预约时间 2022-04-24 15:20:00 
|__ address String / 128 上门地址 云台路xxx号 
|__ worker String / 128 服务人员 张三 
|__ temperature String / 128 体温 36.5 
|__ action String 是 128 行动点 查看详情 
|__ action_url String 是 1024 行动点链接 google.com 
|__ category String 是 128 商品类目 保洁收纳 
|__ parent_status String 是 128 父状态 待服务 
|__ payment_time Date 是 128 支付时间 2022-04-23 15:20:00
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 商品行列表
	 */
	@ApiField("goods_info_list")
	private String goodsInfoList;

	/**
	 * 行业类型
家服订单：7
	 */
	@ApiField("industry_type")
	private Long industryType;

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
	 * 订单状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 模板Id
请联系BD获取
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

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getGoodsInfoList() {
		return this.goodsInfoList;
	}
	public void setGoodsInfoList(String goodsInfoList) {
		this.goodsInfoList = goodsInfoList;
	}

	public Long getIndustryType() {
		return this.industryType;
	}
	public void setIndustryType(Long industryType) {
		this.industryType = industryType;
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
