package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 随机金额立减规则
 *
 * @author auto create
 * @since 1.0, 2023-06-07 09:56:15
 */
public class DtBankPreferenceRandomRule extends AlipayObject {

	private static final long serialVersionUID = 4581975447263147354L;

	/**
	 * 随机满减区间列表
	 */
	@ApiListField("range_info_list")
	@ApiField("dt_bank_random_range_info")
	private List<DtBankRandomRangeInfo> rangeInfoList;

	public List<DtBankRandomRangeInfo> getRangeInfoList() {
		return this.rangeInfoList;
	}
	public void setRangeInfoList(List<DtBankRandomRangeInfo> rangeInfoList) {
		this.rangeInfoList = rangeInfoList;
	}

}
