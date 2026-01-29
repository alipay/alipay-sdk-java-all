package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码门店相关页面吱口令生成
 *
 * @author auto create
 * @since 1.0, 2025-12-19 14:07:41
 */
public class AlipayCommerceEcShopSharecodeGenerateModel extends AlipayObject {

	private static final long serialVersionUID = 7284876985461215657L;

	/**
	 * 员工id，可通过查询企业码员工详情获取
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 企业id，可通过查询入驻企业码企业详情获取
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 用户支付宝uid，可通过查询企业码员工详情获取
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 企业码商户相关页面对应编码，可选值： LIST-列表页； DETAIL-详情页
	 */
	@ApiField("page_code")
	private String pageCode;

	/**
	 * 企业码门店id，可通过查询企业码门店详情获取
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 费控使用规则id，可通过查询费用制度下使用规则详情获取
	 */
	@ApiField("standard_id")
	private String standardId;

	/**
	 * 二级场景码，可选值： REACH_SHOP-到店； REACH_SHOP_OIL-到店加油
	 */
	@ApiField("sub_scene")
	private String subScene;

	/**
	 * 用户uid，可通过查询企业码员工详情获取
	 */
	@ApiField("user_id")
	private String userId;

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPageCode() {
		return this.pageCode;
	}
	public void setPageCode(String pageCode) {
		this.pageCode = pageCode;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStandardId() {
		return this.standardId;
	}
	public void setStandardId(String standardId) {
		this.standardId = standardId;
	}

	public String getSubScene() {
		return this.subScene;
	}
	public void setSubScene(String subScene) {
		this.subScene = subScene;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
