package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝用户联通开卡订单信息同步接口
 *
 * @author auto create
 * @since 1.0, 2017-08-03 10:23:33
 */
public class AlipayUserUnicomOrderInfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5819962259455228358L;

	/**
	 * 订单变更时间，返回自January 1, 1970, 00:00:00 GMT至订单变更时刻的毫秒数, java代码获取示例：new Date().getTime()
	 */
	@ApiField("gmt_order_change")
	private String gmtOrderChange;

	/**
	 * 用户在联通开卡创建的订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 订单变更类型，包括创建(ORDER_CREATE)、撤销(ORDER_CANCEL)、支付(ORDER_PAID)等
	 */
	@ApiField("order_operate_type")
	private String orderOperateType;

	/**
	 * 用户在创建开卡订单时选择的联通号码（11位，不带国家码）
	 */
	@ApiField("phone_no")
	private String phoneNo;

	/**
	 * 联通资费产品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 参数校验值
	 */
	@ApiField("sec_key")
	private String secKey;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getGmtOrderChange() {
		return this.gmtOrderChange;
	}
	public void setGmtOrderChange(String gmtOrderChange) {
		this.gmtOrderChange = gmtOrderChange;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderOperateType() {
		return this.orderOperateType;
	}
	public void setOrderOperateType(String orderOperateType) {
		this.orderOperateType = orderOperateType;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSecKey() {
		return this.secKey;
	}
	public void setSecKey(String secKey) {
		this.secKey = secKey;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
