package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 智能客服结算数据回传接口
 *
 * @author auto create
 * @since 1.0, 2022-04-21 09:46:54
 */
public class AlipayIserviceIssalarySettledataCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7723517967145398669L;

	/**
	 * 结算数据日期入参
	 */
	@ApiField("data_date")
	private String dataDate;

	/**
	 * 回传结算数据详情
	 */
	@ApiListField("settle_data")
	@ApiField("settle_data_detail")
	private List<SettleDataDetail> settleData;

	public String getDataDate() {
		return this.dataDate;
	}
	public void setDataDate(String dataDate) {
		this.dataDate = dataDate;
	}

	public List<SettleDataDetail> getSettleData() {
		return this.settleData;
	}
	public void setSettleData(List<SettleDataDetail> settleData) {
		this.settleData = settleData;
	}

}
