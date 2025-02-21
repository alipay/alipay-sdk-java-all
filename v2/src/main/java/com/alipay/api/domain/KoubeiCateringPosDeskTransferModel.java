package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 桌位排序
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:25:22
 */
public class KoubeiCateringPosDeskTransferModel extends AlipayObject {

	private static final long serialVersionUID = 5388314459962927699L;

	/**
	 * 餐区信息
	 */
	@ApiListField("sort_area")
	@ApiField("desk_area_entity")
	private List<DeskAreaEntity> sortArea;

	/**
	 * 桌位排序list
	 */
	@ApiListField("sort_desk")
	@ApiField("sort_desk_param")
	private List<SortDeskParam> sortDesk;

	public List<DeskAreaEntity> getSortArea() {
		return this.sortArea;
	}
	public void setSortArea(List<DeskAreaEntity> sortArea) {
		this.sortArea = sortArea;
	}

	public List<SortDeskParam> getSortDesk() {
		return this.sortDesk;
	}
	public void setSortDesk(List<SortDeskParam> sortDesk) {
		this.sortDesk = sortDesk;
	}

}
