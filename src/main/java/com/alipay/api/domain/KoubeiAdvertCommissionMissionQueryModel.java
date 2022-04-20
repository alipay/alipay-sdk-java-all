package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 标的分佣查询
 *
 * @author auto create
 * @since 1.0, 2022-04-15 10:00:13
 */
public class KoubeiAdvertCommissionMissionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2474144981724896556L;

	/**
	 * 主键ID
	 */
	@ApiListField("identify_list")
	@ApiField("string")
	private List<String> identifyList;

	/**
	 * 主键类型
activity_id：运营活动ID
voucher：商品ID
mission：分佣任务ID
	 */
	@ApiField("identify_type")
	private String identifyType;

	public List<String> getIdentifyList() {
		return this.identifyList;
	}
	public void setIdentifyList(List<String> identifyList) {
		this.identifyList = identifyList;
	}

	public String getIdentifyType() {
		return this.identifyType;
	}
	public void setIdentifyType(String identifyType) {
		this.identifyType = identifyType;
	}

}
