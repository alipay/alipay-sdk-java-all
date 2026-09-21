package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 最外层包裹对象
 *
 * @author auto create
 * @since 1.0, 2026-08-27 15:57:49
 */
public class ReverseContentData extends AlipayObject {

	private static final long serialVersionUID = 3558381252198732984L;

	/**
	 * null
	 */
	@ApiListField("record_list")
	@ApiField("record")
	private List<Record> recordList;

	public List<Record> getRecordList() {
		return this.recordList;
	}
	public void setRecordList(List<Record> recordList) {
		this.recordList = recordList;
	}

}
