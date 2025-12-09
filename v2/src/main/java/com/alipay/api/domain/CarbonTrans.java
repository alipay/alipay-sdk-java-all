package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 森林碳账单数据
 *
 * @author auto create
 * @since 1.0, 2021-11-08 15:29:52
 */
public class CarbonTrans extends AlipayObject {

	private static final long serialVersionUID = 1315547323288293231L;

	/**
	 * 当前查询出来的碳账户总能量值（日，月）
	 */
	@ApiField("carbon_value")
	private String carbonValue;

	/**
	 * 查询出来的账单数据明细
	 */
	@ApiListField("detail_list")
	@ApiField("carbon_tran_detail")
	private List<CarbonTranDetail> detailList;

	/**
	 * 业务日期（日，月）
	 */
	@ApiField("trans_date")
	private String transDate;

	public String getCarbonValue() {
		return this.carbonValue;
	}
	public void setCarbonValue(String carbonValue) {
		this.carbonValue = carbonValue;
	}

	public List<CarbonTranDetail> getDetailList() {
		return this.detailList;
	}
	public void setDetailList(List<CarbonTranDetail> detailList) {
		this.detailList = detailList;
	}

	public String getTransDate() {
		return this.transDate;
	}
	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}

}
