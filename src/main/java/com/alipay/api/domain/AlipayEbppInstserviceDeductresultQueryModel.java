package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业代扣申请结果查询
 *
 * @author auto create
 * @since 1.0, 2022-05-09 20:32:17
 */
public class AlipayEbppInstserviceDeductresultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8887742191157486249L;

	/**
	 * 申请代扣时的流水号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
