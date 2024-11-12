package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 洗车保养服务商品
 *
 * @author auto create
 * @since 1.0, 2017-04-12 11:49:05
 */
public class MaitainShopProduct extends AlipayObject {

	private static final long serialVersionUID = 7381798141461717239L;

	/**
	 * 销售价格（元），服务售卖价格，展示给用户。无优惠时的下单支付金额。
新增：必填； 修改：可空
	 */
	@ApiField("off_price")
	private String offPrice;

	/**
	 * 原始价格（元），服务商品原始价格，可以和销售价格相同。
新增：必填； 修改：可空
	 */
	@ApiField("orig_price")
	private String origPrice;

	/**
	 * ISV 优惠活动ID（由ISV自行生成，保证其唯一）
新增：可空； 修改：可空
(out_privilege_id、privilege_start_time、privilege_close_time、privilege_tags、privilege_price必须同时存在)
	 */
	@ApiField("out_privilege_id")
	private String outPrivilegeId;

	/**
	 * 外部门店编号。门店创建时上传的ISV自己的门店唯一标示
新增：必填； 修改：可空
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 优惠截止时间。格式"yyyy-MM-dd HH:mm:ss"
优惠有效时间，超过时间不再显示优惠价，下单使用销售价格。
新增：可空； 修改：可空
(out_privilege_id、privilege_start_time、privilege_close_time、privilege_tags、privilege_price必须同时存在)
	 */
	@ApiField("privilege_close_time")
	private String privilegeCloseTime;

	/**
	 * 优惠价格（元），ISV上传优惠价格，上传后立刻生效。有效期间为下单支付金额。
新增：可空； 修改：可空
(out_privilege_id、privilege_start_time、privilege_close_time、privilege_tags、privilege_price必须同时存在)
	 */
	@ApiField("privilege_price")
	private String privilegePrice;

	/**
	 * 优惠截止时间。格式"yyyy-MM-dd HH:mm:ss"
优惠有效时间，超过时间不再显示优惠价，下单使用销售价格。
新增：可空； 修改：可空
(out_privilege_id、privilege_start_time、privilege_close_time、privilege_tags、privilege_price必须同时存在)
	 */
	@ApiField("privilege_start_time")
	private String privilegeStartTime;

	/**
	 * 优惠标签，描述优惠的简要描述。门店详情页服务商品透出优惠标签。支持多个标签，多个逗号分隔。每个不超过10个字符。最多不超过10个标签。
新增：可空； 修改：可空
(out_privilege_id、privilege_start_time、privilege_close_time、privilege_tags、privilege_price必须同时存在)
	 */
	@ApiField("privilege_tags")
	private String privilegeTags;

	/**
	 * 产品描述，ISV对服务项的描述。在门店详情页服务产品名下透出描述。只允许对服务产品本身进行描述，不能透出ISV名称等敏感数据。
新增：必填； 修改：可空
	 */
	@ApiField("product_desc")
	private String productDesc;

	/**
	 * 产品名称，门店详情页展示的服务商品名称。（同一服务项可以配置5座普通洗车、5座SUV洗车）。
新增：必填； 修改：可空
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 车主平台服务类目编号。  
新增：必填； 修改：可空
洗车类：
4:普通洗车-5座
5:普通洗车-7座
6:精细洗车-5座
7:精细洗车-7座
保养类：
12:更换机油、机滤
4S保养类：
401001:更换机油(4S)  
401001:更换机油滤清器(4S)  
401001:更换油塞密封垫片(4S)
401001:更换空气滤清器(4S)  
401001:更换空调滤清器(4S)  
401001:更换燃油滤清器(4S)  
401001:更换制动液(4S)  
401001:更换火花塞(4S)  
401001:更换手动变速器油(4S)  
401001:更换自动变速箱油(4S)
401001:更换冷却液(4S)  
401001:更换转向油(4S)
401001:更换助力油(4S)
401001:发送机正时套件(4S)  
401001:碳罐(4S)  
401001:轮胎换位(4S)  
401001:离合器油(4S)  
401001:传动皮带套件(4S)  
401001:冷媒（4S） 
4S养护类：
402001:清洗节气门(4S)
402001:清洗喷油嘴(4S)
402001:清洗三元催化(4S)
402001:清洗进气道(4S)
402001:添加新车保护剂(4S)
402001:发动机润滑系统清洗(4S)
402001:发动机内部保护(4S)
	 */
	@ApiField("service_category_id")
	private Long serviceCategoryId;

	/**
	 * 服务商品状态（0：下线；1：上线）。下线后门店详情页内不透出。
新增：必填
	 */
	@ApiField("status")
	private String status;

	public String getOffPrice() {
		return this.offPrice;
	}
	public void setOffPrice(String offPrice) {
		this.offPrice = offPrice;
	}

	public String getOrigPrice() {
		return this.origPrice;
	}
	public void setOrigPrice(String origPrice) {
		this.origPrice = origPrice;
	}

	public String getOutPrivilegeId() {
		return this.outPrivilegeId;
	}
	public void setOutPrivilegeId(String outPrivilegeId) {
		this.outPrivilegeId = outPrivilegeId;
	}

	public String getOutShopId() {
		return this.outShopId;
	}
	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

	public String getPrivilegeCloseTime() {
		return this.privilegeCloseTime;
	}
	public void setPrivilegeCloseTime(String privilegeCloseTime) {
		this.privilegeCloseTime = privilegeCloseTime;
	}

	public String getPrivilegePrice() {
		return this.privilegePrice;
	}
	public void setPrivilegePrice(String privilegePrice) {
		this.privilegePrice = privilegePrice;
	}

	public String getPrivilegeStartTime() {
		return this.privilegeStartTime;
	}
	public void setPrivilegeStartTime(String privilegeStartTime) {
		this.privilegeStartTime = privilegeStartTime;
	}

	public String getPrivilegeTags() {
		return this.privilegeTags;
	}
	public void setPrivilegeTags(String privilegeTags) {
		this.privilegeTags = privilegeTags;
	}

	public String getProductDesc() {
		return this.productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Long getServiceCategoryId() {
		return this.serviceCategoryId;
	}
	public void setServiceCategoryId(Long serviceCategoryId) {
		this.serviceCategoryId = serviceCategoryId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
