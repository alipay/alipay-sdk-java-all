package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 绿色小票批量查询接口
 *
 * @author auto create
 * @since 1.0, 2022-10-31 19:47:08
 */
public class AlipayCommerceReceiptBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8369149417888324484L;

	/**
	 * 请求等级
normal 返回每个订单的能量g数，默认值。
detail 额外返回每个订单对应环保类行的能量g数，对应
energy_generated。
	 */
	@ApiField("level")
	private String level;

	/**
	 * 外部订单号列表，最多支持10个
	 */
	@ApiListField("out_biz_no_list")
	@ApiField("string")
	private List<String> outBizNoList;

	public String getLevel() {
		return this.level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

	public List<String> getOutBizNoList() {
		return this.outBizNoList;
	}
	public void setOutBizNoList(List<String> outBizNoList) {
		this.outBizNoList = outBizNoList;
	}

}
