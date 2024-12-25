package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建话费订单并支付接口
 *
 * @author auto create
 * @since 1.0, 2024-05-13 14:22:50
 */
public class AlipayCommerceAcommunicationPhoneOrderPayModel extends AlipayObject {

	private static final long serialVersionUID = 6233469616793141867L;

	/**
	 * 话费面额
	 */
	@ApiField("face")
	private String face;

	/**
	 * 需要充值手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 外部订单号用于幂等处理，两次重复请求必须保证一致
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 价格上限。由于代扣模式感知不到选品过程，商家可以选择商品价格上限避免超出价格的商品
	 */
	@ApiField("price_ceiling")
	private String priceCeiling;

	/**
	 * 号卡代充正常情况下一个号码关联一个订单
	 */
	@ApiField("related_biz_no")
	private String relatedBizNo;

	/**
	 * 支付宝侧分配场景码，用于风控限制和商品查询
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 记录号卡套餐发生日期，同样一个号码正常情况下值会保持一致
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 号卡套餐总期数
	 */
	@ApiField("step_count")
	private Long stepCount;

	/**
	 * 当前号卡套餐为第10期
	 */
	@ApiField("step_number")
	private Long stepNumber;

	/**
	 * 订单渠道来源。用于统计同个商家不同渠道的订单
	 */
	@ApiField("sub_source")
	private String subSource;

	public String getFace() {
		return this.face;
	}
	public void setFace(String face) {
		this.face = face;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPriceCeiling() {
		return this.priceCeiling;
	}
	public void setPriceCeiling(String priceCeiling) {
		this.priceCeiling = priceCeiling;
	}

	public String getRelatedBizNo() {
		return this.relatedBizNo;
	}
	public void setRelatedBizNo(String relatedBizNo) {
		this.relatedBizNo = relatedBizNo;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Long getStepCount() {
		return this.stepCount;
	}
	public void setStepCount(Long stepCount) {
		this.stepCount = stepCount;
	}

	public Long getStepNumber() {
		return this.stepNumber;
	}
	public void setStepNumber(Long stepNumber) {
		this.stepNumber = stepNumber;
	}

	public String getSubSource() {
		return this.subSource;
	}
	public void setSubSource(String subSource) {
		this.subSource = subSource;
	}

}
