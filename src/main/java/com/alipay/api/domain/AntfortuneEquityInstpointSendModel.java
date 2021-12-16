package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 财富开放机构积分发放接口
 *
 * @author auto create
 * @since 1.0, 2019-05-01 11:19:37
 */
public class AntfortuneEquityInstpointSendModel extends AlipayObject {

	private static final long serialVersionUID = 5477286434396968529L;

	/**
	 * 积分发放备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 比如某种业务标准外部订单号,比如交易外部订单号，代表商户端自己订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 本次发放的积分值，商户必须设置值指定本次发放给用户的具体积分值，取值范围[1,10000]
	 */
	@ApiField("point")
	private Long point;

	/**
	 * 积分预算模板号，商户在财富开放后台创建积分模板后获得
	 */
	@ApiField("template_no")
	private String templateNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Long getPoint() {
		return this.point;
	}
	public void setPoint(Long point) {
		this.point = point;
	}

	public String getTemplateNo() {
		return this.templateNo;
	}
	public void setTemplateNo(String templateNo) {
		this.templateNo = templateNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
