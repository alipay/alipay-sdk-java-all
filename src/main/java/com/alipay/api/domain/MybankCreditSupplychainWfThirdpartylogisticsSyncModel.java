package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * WF极速回款业务3PL数据同步
 *
 * @author auto create
 * @since 1.0, 2022-05-17 14:31:44
 */
public class MybankCreditSupplychainWfThirdpartylogisticsSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6555863192584787695L;

	/**
	 * WF站点的ipay user id，我们用做siteUserId
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 包含多个offerid对应的3PL数据
	 */
	@ApiListField("lending_data_list")
	@ApiField("lending_data_list")
	private List<LendingDataList> lendingDataList;

	/**
	 * 请求ID
	 */
	@ApiField("request_id")
	private String requestId;

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public List<LendingDataList> getLendingDataList() {
		return this.lendingDataList;
	}
	public void setLendingDataList(List<LendingDataList> lendingDataList) {
		this.lendingDataList = lendingDataList;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
