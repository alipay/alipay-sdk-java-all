package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 积分明细
 *
 * @author auto create
 * @since 1.0, 2024-12-02 21:49:54
 */
public class AlipayPointDetail extends AlipayObject {

	private static final long serialVersionUID = 8447396238288319657L;

	/**
	 * 回滚对应的订单分组
	 */
	@ApiField("biz_group_no")
	private String bizGroupNo;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 该条数据主键id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 流入流出类型
	 */
	@ApiField("in_out_type")
	private String inOutType;

	/**
	 * 积分订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 积分变更值
	 */
	@ApiField("point")
	private Long point;

	/**
	 * 标题
	 */
	@ApiField("trans_memo")
	private String transMemo;

	public String getBizGroupNo() {
		return this.bizGroupNo;
	}
	public void setBizGroupNo(String bizGroupNo) {
		this.bizGroupNo = bizGroupNo;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getInOutType() {
		return this.inOutType;
	}
	public void setInOutType(String inOutType) {
		this.inOutType = inOutType;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Long getPoint() {
		return this.point;
	}
	public void setPoint(Long point) {
		this.point = point;
	}

	public String getTransMemo() {
		return this.transMemo;
	}
	public void setTransMemo(String transMemo) {
		this.transMemo = transMemo;
	}

}
