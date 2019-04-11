package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 加入信用服务
 *
 * @author auto create
 * @since 1.0, 2019-01-04 16:46:18
 */
public class ZhimaCreditEpSceneAgreementUseModel extends AlipayObject {

	private static final long serialVersionUID = 1711472164629122277L;

	/**
	 * 业务时间，日期格式为 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 商户请求的唯一标志，64位长度的字母数字下划线组合。该标识作为对账的关键信息，商户要保证其唯一性。
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 条款编码
	 */
	@ApiField("provision_code")
	private String provisionCode;

	/**
	 * 评估订单号
	 */
	@ApiField("rating_order_no")
	private String ratingOrderNo;

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
