package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付配套服务专户资金组成查询接口
 *
 * @author auto create
 * @since 1.0, 2022-12-30 14:43:50
 */
public class AlipayTradeAccountFundcompositionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1427888162979828737L;

	/**
	 * 用户的蚂蚁统一会员ID
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 用户支付宝UID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 服务对应的业务场景，由支付宝分配，详见:https://yuque.antfin-inc.com/docs/share/cc027290-8a2c-4469-b4b9-602bffd0e0e6?#
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 服务类型，描述用户签约的某一类服务，目前仅支持无限付产品，固定值：LARGE_INFINITE
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * 子业务场景，由支付宝配置，详见:https://yuque.antfin-inc.com/docs/share/cc027290-8a2c-4469-b4b9-602bffd0e0e6?#
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

}
