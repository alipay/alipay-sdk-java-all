package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 加入信用服务
 *
 * @author auto create
 * @since 1.0, 2021-10-27 17:12:55
 */
public class ZhimaCreditEpSceneAgreementUseModel extends AlipayObject {

	private static final long serialVersionUID = 2425317945451629918L;

	/**
	 * 特定业务场景传输的扩展参数，以JSON形式传输。具体业务场景需要传入参数请参考<a href="https://docs.open.alipay.com/11270#s3">业务场景传输的扩展参数</a>
	 */
	@ApiField("biz_ext_param")
	private String bizExtParam;

	/**
	 * 业务时间，日期格式为 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 商户请求订单号，必须唯一。用于唯一标识商户的一笔业务请求。
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 条款编码。请参考<a href="https://docs.open.alipay.com/11270#s1">条款编码</a>
	 */
	@ApiField("provision_code")
	private String provisionCode;

	/**
	 * 评估订单号。用户完成信用评估的芝麻信用评估订单号，即为<a href="https://opendocs.alipay.com/apis/api_8/zhima.credit.ep.scene.rating.initialize">zhima.credit.ep.scene.rating.initialize</a>接口初始化后返回的 order_no，初始化后还需调用<a href="https://opendocs.alipay.com/apis/api_8/zhima.credit.ep.scene.rating.apply">zhima.credit.ep.scene.rating.apply</a>接口发起信用评估。
	 */
	@ApiField("rating_order_no")
	private String ratingOrderNo;

	public String getBizExtParam() {
		return this.bizExtParam;
	}
	public void setBizExtParam(String bizExtParam) {
		this.bizExtParam = bizExtParam;
	}

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getProvisionCode() {
		return this.provisionCode;
	}
	public void setProvisionCode(String provisionCode) {
		this.provisionCode = provisionCode;
	}

	public String getRatingOrderNo() {
		return this.ratingOrderNo;
	}
	public void setRatingOrderNo(String ratingOrderNo) {
		this.ratingOrderNo = ratingOrderNo;
	}

}
