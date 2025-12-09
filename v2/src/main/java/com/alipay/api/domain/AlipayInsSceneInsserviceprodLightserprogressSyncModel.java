package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 简易模式增值服务进度同步接口
 *
 * @author auto create
 * @since 1.0, 2025-09-02 15:33:01
 */
public class AlipayInsSceneInsserviceprodLightserprogressSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4579538484257924934L;

	/**
	 * 扩展字段
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 用于在蚂蚁侧执行跳转逻辑
	 */
	@ApiField("inst_action_url")
	private String instActionUrl;

	/**
	 * 服务的一次使用订单编号
	 */
	@ApiField("inst_apply_order_no")
	private String instApplyOrderNo;

	/**
	 * 机构订单服务进度节点编码
	 */
	@ApiField("inst_node_code")
	private String instNodeCode;

	/**
	 * 机构保单号
	 */
	@ApiField("inst_policy_no")
	private String instPolicyNo;

	/**
	 * 用于区别不用的服务产品，此字段为机构在商家平台发布商品时填写的外部商品码。
	 */
	@ApiField("inst_prod_item_no")
	private String instProdItemNo;

	/**
	 * 订单的服务进度流程编号，用来表示一次订单中，某一个节点的编号。
	 */
	@ApiField("inst_progress_no")
	private String instProgressNo;

	/**
	 * 服务订单创建时间
	 */
	@ApiField("order_create_time")
	private Date orderCreateTime;

	/**
	 * 订单该进度节点的创建时间
	 */
	@ApiField("progress_create_time")
	private Date progressCreateTime;

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public String getInstActionUrl() {
		return this.instActionUrl;
	}
	public void setInstActionUrl(String instActionUrl) {
		this.instActionUrl = instActionUrl;
	}

	public String getInstApplyOrderNo() {
		return this.instApplyOrderNo;
	}
	public void setInstApplyOrderNo(String instApplyOrderNo) {
		this.instApplyOrderNo = instApplyOrderNo;
	}

	public String getInstNodeCode() {
		return this.instNodeCode;
	}
	public void setInstNodeCode(String instNodeCode) {
		this.instNodeCode = instNodeCode;
	}

	public String getInstPolicyNo() {
		return this.instPolicyNo;
	}
	public void setInstPolicyNo(String instPolicyNo) {
		this.instPolicyNo = instPolicyNo;
	}

	public String getInstProdItemNo() {
		return this.instProdItemNo;
	}
	public void setInstProdItemNo(String instProdItemNo) {
		this.instProdItemNo = instProdItemNo;
	}

	public String getInstProgressNo() {
		return this.instProgressNo;
	}
	public void setInstProgressNo(String instProgressNo) {
		this.instProgressNo = instProgressNo;
	}

	public Date getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public Date getProgressCreateTime() {
		return this.progressCreateTime;
	}
	public void setProgressCreateTime(Date progressCreateTime) {
		this.progressCreateTime = progressCreateTime;
	}

}
