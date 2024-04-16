package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品数据删除
 *
 * @author auto create
 * @since 1.0, 2023-09-21 18:44:44
 */
public class TechriskInnovateMpcpromoDataDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2513112155948164629L;

	/**
	 * 商品列表ids
	 */
	@ApiListField("data_list")
	@ApiField("string")
	private List<String> dataList;

	/**
	 * 数据类型
	 */
	@ApiField("data_type")
	private String dataType;

	public List<String> getDataList() {
		return this.dataList;
	}
	public void setDataList(List<String> dataList) {
		this.dataList = dataList;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

}
