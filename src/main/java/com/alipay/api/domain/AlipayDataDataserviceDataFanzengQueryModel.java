package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 我在测试
 *
 * @author auto create
 * @since 1.0, 2018-11-26 16:04:05
 */
public class AlipayDataDataserviceDataFanzengQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1466621214814866684L;

	/**
	 * 西湖区文三路国际大厦
	 */
	@ApiListField("address")
	@ApiField("cicadamodel_address")
	private List<CicadamodelAddress> address;

	/**
	 * id
	 */
	@ApiListField("id")
	@ApiField("string")
	private List<String> id;

	public List<CicadamodelAddress> getAddress() {
		return this.address;
	}
	public void setAddress(List<CicadamodelAddress> address) {
		this.address = address;
	}

	public List<String> getId() {
		return this.id;
	}
	public void setId(List<String> id) {
		this.id = id;
	}

}
