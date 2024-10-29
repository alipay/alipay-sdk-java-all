package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务进度同步接口
 *
 * @author auto create
 * @since 1.0, 2023-06-09 18:13:19
 */
public class AlipayInsSceneInsserviceprodSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7335931815748823323L;

	/**
	 * 扩展信息，JSON字符串格式
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 当前节点名称
	 */
	@ApiField("cur_node")
	private String curNode;

	/**
	 * 订单编号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public String getCurNode() {
		return this.curNode;
	}
	public void setCurNode(String curNode) {
		this.curNode = curNode;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
