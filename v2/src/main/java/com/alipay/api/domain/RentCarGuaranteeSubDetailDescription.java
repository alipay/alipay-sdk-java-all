package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租车保障服务子信息
 *
 * @author auto create
 * @since 1.0, 2024-12-05 11:04:10
 */
public class RentCarGuaranteeSubDetailDescription extends AlipayObject {

	private static final long serialVersionUID = 3426635998421578139L;

	/**
	 * 描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 表格信息
	 */
	@ApiListField("table")
	@ApiField("rent_car_table_info")
	private List<RentCarTableInfo> table;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public List<RentCarTableInfo> getTable() {
		return this.table;
	}
	public void setTable(List<RentCarTableInfo> table) {
		this.table = table;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
