package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 政务监管订单资金解冻
 *
 * @author auto create
 * @since 1.0, 2024-02-21 10:22:25
 */
public class AlipayEbppIndustrySupervisionOrderfundUnfreezeModel extends AlipayObject {

	private static final long serialVersionUID = 7747317237737952887L;

	/**
	 * 支付宝用户uid
	 */
	@ApiField("alipay_uid")
	private String alipayUid;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 支付宝用户openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 解冻请求流水号。
	 */
	@ApiField("out_flow_id")
	private String outFlowId;

	/**
	 * 外部订单号
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
