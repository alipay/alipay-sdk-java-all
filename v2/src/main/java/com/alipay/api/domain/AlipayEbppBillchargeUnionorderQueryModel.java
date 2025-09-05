package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 主订单查询
 *
 * @author auto create
 * @since 1.0, 2025-03-19 13:10:19
 */
public class AlipayEbppBillchargeUnionorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8561288786476161952L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部订单id
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 来源渠道
	 */
	@ApiField("source")
	private String source;

	/**
	 * 50链路单订单情况下的单个订单号
	 */
	@ApiField("sub_order_no")
	private String subOrderNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getSubOrderNo() {
		return this.subOrderNo;
	}
	public void setSubOrderNo(String subOrderNo) {
		this.subOrderNo = subOrderNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
