package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付收方应收账款查询
 *
 * @author auto create
 * @since 1.0, 2022-04-19 19:08:18
 */
public class MybankCreditLoantradePayeeReceivableBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3518846227681723412L;

	/**
	 * 业务场景，由网商端指定
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 查询订单ID列表，与其它过滤条件为且的关系
	 */
	@ApiListField("order_list")
	@ApiField("string")
	private List<String> orderList;

	/**
	 * 页数，为空表示全量查询
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 页面大小，为空表示全量查询
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 根据外部订单号查询，与其它过滤条件为且的关系
	 */
	@ApiListField("platform_order_list")
	@ApiField("string")
	private List<String> platformOrderList;

	/**
	 * 查询状态列表，入参为空表示全部查询
WAIT_CONFIRM：待确认
RECEIVABLE：已生效且存在未收金额 DUE_RECEIVED：已全额到期自动收款 FACTORING_RECEIVED：已全额提前收款 
UNVALID：失效
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
	 * 用户信息
	 */
	@ApiField("user_info")
	private CreditPayUserVO userInfo;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public List<String> getOrderList() {
		return this.orderList;
	}
	public void setOrderList(List<String> orderList) {
		this.orderList = orderList;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
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
