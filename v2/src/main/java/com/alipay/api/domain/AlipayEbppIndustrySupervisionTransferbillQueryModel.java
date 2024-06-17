package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 政务监管订单资金划拨账单查询
 *
 * @author auto create
 * @since 1.0, 2024-06-12 10:02:50
 */
public class AlipayEbppIndustrySupervisionTransferbillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5525245362596315313L;

	/**
	 * 用户uid
	 */
	@ApiField("alipay_uid")
	private String alipayUid;

	/**
	 * 业务场景名
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 用户uid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部商户订单
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

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

}
