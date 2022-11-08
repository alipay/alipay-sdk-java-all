package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 信用支付收方应收汇总查询
 *
 * @author auto create
 * @since 1.0, 2022-02-09 10:52:01
 */
public class MybankCreditLoantradePayeeReceivableQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3659416789758914481L;

	/**
	 * 业务场景，由网商端指定
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 是否针对应收咨询保理业务，为true的话耗时会较长
	 */
	@ApiField("need_factoring_consult")
	private Boolean needFactoringConsult;

	/**
	 * 根据网商订单号查询，与其它过滤条件为且的关系
	 */
	@ApiListField("order_list")
	@ApiField("string")
	private List<String> orderList;

	/**
	 * 根据平台方订单号查询，与其它过滤条件为且的关系。
	 */
	@ApiListField("platform_order_list")
	@ApiField("string")
	private List<String> platformOrderList;

	/**
	 * 查询状态列表，入参为空表示全部查询，与其它过滤条件为且的关系
	 */
	@ApiListField("status_list")
	@ApiField("string")
	private List<String> statusList;

	/**
	 * 子场景，可空
	 */
	@ApiField("sub_biz_scene")
	private String subBizScene;

	/**
	 * 用户信息--必选
	 */
	@ApiField("user_info")
	private CreditPayUserVO userInfo;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public Boolean getNeedFactoringConsult() {
		return this.needFactoringConsult;
	}
	public void setNeedFactoringConsult(Boolean needFactoringConsult) {
		this.needFactoringConsult = needFactoringConsult;
	}

	public List<String> getOrderList() {
		return this.orderList;
	}
	public void setOrderList(List<String> orderList) {
		this.orderList = orderList;
	}

	public List<String> getPlatformOrderList() {
		return this.platformOrderList;
	}
	public void setPlatformOrderList(List<String> platformOrderList) {
		this.platformOrderList = platformOrderList;
	}

	public List<String> getStatusList() {
		return this.statusList;
	}
	public void setStatusList(List<String> statusList) {
		this.statusList = statusList;
	}

	public String getSubBizScene() {
		return this.subBizScene;
	}
	public void setSubBizScene(String subBizScene) {
		this.subBizScene = subBizScene;
	}

	public CreditPayUserVO getUserInfo() {
		return this.userInfo;
	}
	public void setUserInfo(CreditPayUserVO userInfo) {
		this.userInfo = userInfo;
	}

}
