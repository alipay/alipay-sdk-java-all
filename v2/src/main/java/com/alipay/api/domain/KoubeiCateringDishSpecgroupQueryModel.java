package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询菜品规格组信息
 *
 * @author auto create
 * @since 1.0, 2022-01-04 10:32:16
 */
public class KoubeiCateringDishSpecgroupQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1261479326687516214L;

	/**
	 * 规则标签明细的id，比如「特别热」的字典id，当传入时，也做为查询参数
	 */
	@ApiField("detail_spec_id")
	private String detailSpecId;

	/**
	 * 规格组的id，当传入时，也做为查询条件，只查询当前规格组下的明细
	 */
	@ApiField("group_spec_id")
	private String groupSpecId;

	public String getDetailSpecId() {
		return this.detailSpecId;
	}
	public void setDetailSpecId(String detailSpecId) {
		this.detailSpecId = detailSpecId;
	}

	public String getGroupSpecId() {
		return this.groupSpecId;
	}
	public void setGroupSpecId(String groupSpecId) {
		this.groupSpecId = groupSpecId;
	}

}
