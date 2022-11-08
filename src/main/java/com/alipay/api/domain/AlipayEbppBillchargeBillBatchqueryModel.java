package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量查账单接口
 *
 * @author auto create
 * @since 1.0, 2022-11-08 09:58:26
 */
public class AlipayEbppBillchargeBillBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2435197487478821356L;

	/**
	 * 待查账的户号列表
	 */
	@ApiListField("billkey_list")
	@ApiField("bill_key_info")
	private List<BillKeyInfo> billkeyList;

	/**
	 * 来源渠道，由支付宝侧分配
	 */
	@ApiField("source")
	private String source;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public List<BillKeyInfo> getBillkeyList() {
		return this.billkeyList;
	}
	public void setBillkeyList(List<BillKeyInfo> billkeyList) {
		this.billkeyList = billkeyList;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
