package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户在采购完集分宝后可以通过此接口发放集分宝
 *
 * @author auto create
 * @since 1.0, 2024-07-04 17:00:53
 */
public class AlipayAssetPointOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8451722286185415225L;

	/**
	 * 向用户展示集分宝发放备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * isv提供的发放订单号，由数字和字母组成，最大长度为32位，需要保证每笔订单发放的唯一性，支付宝对该参数做唯一性校验。如果订单号已存在，支付宝将返回订单号已经存在的错误
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 发放集分宝时间
	 */
	@ApiField("order_time")
	private Date orderTime;

	/**
	 * 发放集分宝的数量
	 */
	@ApiField("point_count")
	private Long pointCount;

	/**
	 * 用户标识符，用于指定集分宝发放的用户，和user_symbol_type一起使用，确定一个唯一的支付宝用户
	 */
	@ApiField("user_symbol")
	private String userSymbol;

	/**
	 * 用户标识符类型，
现在支持ALIPAY_USER_ID:表示支付宝用户ID,
ALIPAY_LOGON_ID:表示支付宝登陆号,
TAOBAO_NICK:淘宝昵称
	 */
	@ApiField("user_symbol_type")
	private String userSymbolType;

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public Date getOrderTime() {
		return this.orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public Long getPointCount() {
		return this.pointCount;
	}
	public void setPointCount(Long pointCount) {
		this.pointCount = pointCount;
	}

	public String getUserSymbol() {
		return this.userSymbol;
	}
	public void setUserSymbol(String userSymbol) {
		this.userSymbol = userSymbol;
	}

	public String getUserSymbolType() {
		return this.userSymbolType;
	}
	public void setUserSymbolType(String userSymbolType) {
		this.userSymbolType = userSymbolType;
	}

}
