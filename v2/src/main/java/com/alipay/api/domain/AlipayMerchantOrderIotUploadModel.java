package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家开放结果页订单上报
 *
 * @author auto create
 * @since 1.0, 2023-07-19 19:24:50
 */
public class AlipayMerchantOrderIotUploadModel extends AlipayObject {

	private static final long serialVersionUID = 5687476764973834655L;

	/**
	 * 客户端接入结果页组件的abcp应用ID。另外要求该业务abcp_app_id需要和当前接口接入的appid归属为一个开发者pid
	 */
	@ApiField("abcp_app_id")
	private String abcpAppId;

	/**
	 * 交易实付金额，单位“分”；result_type非business_pay类型时必填
	 */
	@ApiField("actual_pay_amount")
	private Long actualPayAmount;

	/**
	 * 实际支付时间
	 */
	@ApiField("actual_pay_time")
	private Date actualPayTime;

	/**
	 * 复杂场景适配信息，result_type为business_pay类型时必填
	 */
	@ApiField("business_infos")
	private PaymentBusinessInfo businessInfos;

	/**
	 * 找零金额，单位“分”
	 */
	@ApiField("change_amount")
	private Long changeAmount;

	/**
	 * 核销结果页，核销类信息
	 */
	@ApiListField("custom_infos")
	@ApiField("custom_info")
	private List<CustomInfo> customInfos;

	/**
	 * 失败结果页信息提示内容
	 */
	@ApiField("fail_info")
	private String failInfo;

	/**
	 * 商家优惠金额，单位“分”，如果有多个优惠，请合并后填写总优惠；
	 */
	@ApiField("merchant_discount_amount")
	private Long merchantDiscountAmount;

	/**
	 * 订单原价，单位“分”
	 */
	@ApiField("origin_amount")
	private Long originAmount;

	/**
	 * 支付类结果，该字段则必填。支付类如果是组合支付，优先选用优先级高的支付渠道。(优先级alipay>wechat>others）。如：现金+支付宝支付，则传alipay
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/**
	 * 支付类结果页，该字段必填。字段代表支付来源，如刷脸支付，则传face，扫码支付，则传barcode，除此之外的则传others
	 */
	@ApiField("pay_source")
	private String paySource;

	/**
	 * 默认支付成功
success支付成功
fail 支付失败
	 */
	@ApiField("pay_status")
	private String payStatus;

	/**
	 * 结果页类型，非必填项，默认为支付类结果页。
	 */
	@ApiField("result_type")
	private String resultType;

	/**
	 * 业务来源，该字段由具体业务sop文档中分配。
	 */
	@ApiField("source")
	private String source;

	/**
	 * 客户端结果页组件上传的tradeNo保持一致,需保证业务唯一性
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAbcpAppId() {
		return this.abcpAppId;
	}
	public void setAbcpAppId(String abcpAppId) {
		this.abcpAppId = abcpAppId;
	}

	public Long getActualPayAmount() {
		return this.actualPayAmount;
	}
	public void setActualPayAmount(Long actualPayAmount) {
		this.actualPayAmount = actualPayAmount;
	}

	public Date getActualPayTime() {
		return this.actualPayTime;
	}
	public void setActualPayTime(Date actualPayTime) {
		this.actualPayTime = actualPayTime;
	}

	public PaymentBusinessInfo getBusinessInfos() {
		return this.businessInfos;
	}
	public void setBusinessInfos(PaymentBusinessInfo businessInfos) {
		this.businessInfos = businessInfos;
	}

	public Long getChangeAmount() {
		return this.changeAmount;
	}
	public void setChangeAmount(Long changeAmount) {
		this.changeAmount = changeAmount;
	}

	public List<CustomInfo> getCustomInfos() {
		return this.customInfos;
	}
	public void setCustomInfos(List<CustomInfo> customInfos) {
		this.customInfos = customInfos;
	}

	public String getFailInfo() {
		return this.failInfo;
	}
	public void setFailInfo(String failInfo) {
		this.failInfo = failInfo;
	}

	public Long getMerchantDiscountAmount() {
		return this.merchantDiscountAmount;
	}
	public void setMerchantDiscountAmount(Long merchantDiscountAmount) {
		this.merchantDiscountAmount = merchantDiscountAmount;
	}

	public Long getOriginAmount() {
		return this.originAmount;
	}
	public void setOriginAmount(Long originAmount) {
		this.originAmount = originAmount;
	}

	public String getPayChannel() {
		return this.payChannel;
	}
	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public String getPaySource() {
		return this.paySource;
	}
	public void setPaySource(String paySource) {
		this.paySource = paySource;
	}

	public String getPayStatus() {
		return this.payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getResultType() {
		return this.resultType;
	}
	public void setResultType(String resultType) {
		this.resultType = resultType;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
