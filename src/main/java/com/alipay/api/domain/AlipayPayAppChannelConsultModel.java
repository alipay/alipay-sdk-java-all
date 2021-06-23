package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付前置渠道咨询
 *
 * @author auto create
 * @since 1.0, 2021-05-21 15:52:52
 */
public class AlipayPayAppChannelConsultModel extends AlipayObject {

	private static final long serialVersionUID = 7681733285688687193L;

	/**
	 * 订单金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 业务标识
	 */
	@ApiField("biz_identity")
	private String bizIdentity;

	/**
	 * 业务订单列表
	 */
	@ApiListField("biz_order_list")
	@ApiField("biz_order_info")
	private List<BizOrderInfo> bizOrderList;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 全局扩展参数
	 */
	@ApiField("ext_params")
	private BizExtInfo extParams;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBizIdentity() {
		return this.bizIdentity;
	}
	public void setBizIdentity(String bizIdentity) {
		this.bizIdentity = bizIdentity;
	}

	public List<BizOrderInfo> getBizOrderList() {
		return this.bizOrderList;
	}
	public void setBizOrderList(List<BizOrderInfo> bizOrderList) {
		this.bizOrderList = bizOrderList;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public BizExtInfo getExtParams() {
		return this.extParams;
	}
	public void setExtParams(BizExtInfo extParams) {
		this.extParams = extParams;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
