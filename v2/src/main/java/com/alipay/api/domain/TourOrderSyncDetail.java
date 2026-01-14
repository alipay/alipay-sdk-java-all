package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-12-26 14:42:42
 */
public class TourOrderSyncDetail extends AlipayObject {

	private static final long serialVersionUID = 2691771214116486395L;

	/**
	 * 可核销总数。凭证可核销数量总和
	 */
	@ApiField("biz_source_num")
	private String bizSourceNum;

	/**
	 * 下单用户证件号。碰入园场景下，身份证和手机号二选一必填。
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型，身份证：IDENTITY_CARD。传入时需要传入证件号，不传默认填充身份证。
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 下单用户姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 订单金额，单位：元
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 订单详情信息。
例如订单的对应各状态时间
创建时间create_time,
退款时间refund_time,
出票时间delivered_time。
时间格式必须是yyyy-MM-dd HH:mm:SS格式。
	 */
	@ApiField("order_info")
	private String orderInfo;

	/**
	 * 订单状态。
TRANSACTION_SUCCESS --交易成功,
REFUNDED -- 已退款,
DELIVERED -- 已出票,
USED -- 已核销
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 项目id，由支付宝分配。碰入园场景必填（取值由配置线圈的BD获取），一码通场景无需填写。
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 凭证可用的场景类型，场景code（sceneCodes）为一码通（qrcode）时必须填写该参数，不传时默认为「免证登记」场景。
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 下单用户手机号。碰入园场景下，身份证和手机号二选一必填。
	 */
	@ApiField("tele_no")
	private String teleNo;

	/**
	 * null
	 */
	@ApiListField("tour_voucher_list")
	@ApiField("tour_voucher_detail")
	private List<TourVoucherDetail> tourVoucherList;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getBizSourceNum() {
		return this.bizSourceNum;
	}
	public void setBizSourceNum(String bizSourceNum) {
		this.bizSourceNum = bizSourceNum;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderInfo() {
		return this.orderInfo;
	}
	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

	public String getTeleNo() {
		return this.teleNo;
	}
	public void setTeleNo(String teleNo) {
		this.teleNo = teleNo;
	}

	public List<TourVoucherDetail> getTourVoucherList() {
		return this.tourVoucherList;
	}
	public void setTourVoucherList(List<TourVoucherDetail> tourVoucherList) {
		this.tourVoucherList = tourVoucherList;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
