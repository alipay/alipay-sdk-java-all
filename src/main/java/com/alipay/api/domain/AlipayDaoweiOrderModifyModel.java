package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务订单修改接口
 *
 * @author auto create
 * @since 1.0, 2018-03-23 13:23:16
 */
public class AlipayDaoweiOrderModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7738396862415779624L;

	/**
	 * 服务地址，修改物流地址时填写的新服务地址：由第三方确认新的服务地址，最长不超过500字符
	 */
	@ApiField("address")
	private String address;

	/**
	 * 服务开始时间，修改服务开始时间时传递的开始服务时间，格式：yyyy-MM-dd HH:mm（到分）
	 */
	@ApiField("gmt_start")
	private String gmtStart;

	/**
	 * 备注信息，修改服务订单操作填写的备注信息，可以是修改的原因，不超过2000字符
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 订单修改类型，枚举值（AMOUNT、OTHER）如果是改金额的话，就传AMOUNT；如果是改开始时间或者物流地址的话，就传OTHER；
	 */
	@ApiField("modify_type")
	private String modifyType;

	/**
	 * 到位业务订单号，全局唯一，由32位数字组成，用户在到位下单时系统生成并消息同步给商家，商户只能查自己同步到的订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 订单原始金额，即修改前订单的原始金额，单位元，订单金额小于10w
	 */
	@ApiField("origin_amount")
	private String originAmount;

	/**
	 * 实际金额，即修改后的订单应收金额，单位为元，订单金额小于10w
	 */
	@ApiField("real_amount")
	private String realAmount;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getGmtStart() {
		return this.gmtStart;
	}
	public void setGmtStart(String gmtStart) {
		this.gmtStart = gmtStart;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getModifyType() {
		return this.modifyType;
	}
	public void setModifyType(String modifyType) {
		this.modifyType = modifyType;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOriginAmount() {
		return this.originAmount;
	}
	public void setOriginAmount(String originAmount) {
		this.originAmount = originAmount;
	}

	public String getRealAmount() {
		return this.realAmount;
	}
	public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}

}
