package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询生活记录详情
 *
 * @author auto create
 * @since 1.0, 2022-10-27 16:00:39
 */
public class ZhimaCustomerLiferecordBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5419369658715118272L;

	/**
	 * 支付宝userId的映射字段
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 根据外部业务号进行批量查询
	 */
	@ApiListField("out_biz_nos")
	@ApiField("string")
	private List<String> outBizNos;

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

	public List<String> getOutBizNos() {
		return this.outBizNos;
	}
	public void setOutBizNos(List<String> outBizNos) {
		this.outBizNos = outBizNos;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
