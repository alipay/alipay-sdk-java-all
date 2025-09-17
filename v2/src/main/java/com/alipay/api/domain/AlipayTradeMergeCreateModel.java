package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 统一收单合并支付下单
 *
 * @author auto create
 * @since 1.0, 2025-08-05 12:58:21
 */
public class AlipayTradeMergeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4346173539363618938L;

	/**
	 * 2088102146225135	买家支付宝用户ID。 2088开头的16位纯数字，小程序场景下获取用户ID请参考：<a href="https://opendocs.alipay.com/mini/introduce/authcode" target="_blank">用户授权</a>。注：交易的买家与卖家不能相同。
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家支付宝用户唯一标识
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 小程序支付中，商户实际经营主体的小程序应用的appid，也即最终唤起收银台支付所在的小程序的应用id
	 */
	@ApiField("op_app_id")
	private String opAppId;

	/**
	 * 子订单详情
	 */
	@ApiListField("order_details")
	@ApiField("order_detail")
	private List<OrderDetail> orderDetails;

	/**
	 * 外部合并单号，必传
	 */
	@ApiField("out_merge_no")
	private String outMergeNo;

	/**
	 * 订单绝对超时时间。 格式为yyyy-MM-dd HH:mm:ss。 注： time_expire和timeout_express两者只需传入一个或者都不传，两者均传入时，优先使用time_expire。
	 */
	@ApiField("time_expire")
	private Date timeExpire;

	/**
	 * 合并支付订单相对超时时间。从商户合并预下单请求时间开始计算。 请求合并的所有订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。 默认值为15d。 注：time_expire和timeout_express两者只需传入一个或者都不传，两者均传入时，优先使用time_expire。
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}

	public String getOpAppId() {
		return this.opAppId;
	}
	public void setOpAppId(String opAppId) {
		this.opAppId = opAppId;
	}

	public List<OrderDetail> getOrderDetails() {
		return this.orderDetails;
	}
	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public String getOutMergeNo() {
		return this.outMergeNo;
	}
	public void setOutMergeNo(String outMergeNo) {
		this.outMergeNo = outMergeNo;
	}

	public Date getTimeExpire() {
		return this.timeExpire;
	}
	public void setTimeExpire(Date timeExpire) {
		this.timeExpire = timeExpire;
	}

	public String getTimeoutExpress() {
		return this.timeoutExpress;
	}
	public void setTimeoutExpress(String timeoutExpress) {
		this.timeoutExpress = timeoutExpress;
	}

}
