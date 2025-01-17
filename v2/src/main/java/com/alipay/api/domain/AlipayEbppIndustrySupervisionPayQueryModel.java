package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金监管冻资支付单查询
 *
 * @author auto create
 * @since 1.0, 2024-06-11 16:36:10
 */
public class AlipayEbppIndustrySupervisionPayQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7478462277499996319L;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("alipay_uid")
	private String alipayUid;

	/**
	 * 业务场景：
● 购房冻资:HOUSE_PURCHASED
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部流水号，本次创建支付单的请求id，重复请求幂等返回
	 */
	@ApiField("out_flow_id")
	private String outFlowId;

	/**
	 * 外部订单号，本次发起支付关联的冻资单id
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	public String getAlipayUid() {
		return this.alipayUid;
	}
	public void setAlipayUid(String alipayUid) {
		this.alipayUid = alipayUid;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutFlowId() {
		return this.outFlowId;
	}
	public void setOutFlowId(String outFlowId) {
		this.outFlowId = outFlowId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

}
